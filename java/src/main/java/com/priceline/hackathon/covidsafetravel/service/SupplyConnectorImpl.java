package com.priceline.hackathon.covidsafetravel.service;

import static com.priceline.hackathon.covidsafetravel.util.Constants.*;

import com.priceline.hackathon.covidsafetravel.config.ConnectionConfig.WebClientWrapper;
import com.priceline.hackathon.covidsafetravel.config.SupplyConfig;
import com.priceline.hackathon.covidsafetravel.domain.auth.AuthResponseContainer;
import com.priceline.hackathon.covidsafetravel.domain.restrictions.TravelRestrictionsResponseContainer;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class SupplyConnectorImpl implements SupplyConnector{

  private static final String CLIENT_ID = "client_id";
  private static final String CLIENT_SECRET = "client_secret";
  private static final String GRANT_TYPE = "grant_type";

  private final WebClientWrapper webClientWrapper;
  private final SupplyConfig supplyConfig;

  @Autowired
  public SupplyConnectorImpl(@Qualifier("webClients") WebClientWrapper webClientWrapper,
      SupplyConfig supplyConfig) {
    this.webClientWrapper = webClientWrapper;
    this.supplyConfig = supplyConfig;
  }

  private Mono<AuthResponseContainer> auth() {
    return webClientWrapper
        .getClient(AUTH)
        .post()
        .body(
            BodyInserters.fromFormData(CLIENT_ID, supplyConfig.getAuth().getClientId())
                .with(CLIENT_SECRET, supplyConfig.getAuth().getClientSecret())
                .with(GRANT_TYPE, supplyConfig.getAuth().getGrantType()))
        .retrieve()
        .bodyToMono(AuthResponseContainer.class);
  }

  public String getAccessToken(){
    try{
      return Objects.requireNonNull(auth().block()).getAccessToken();
    }catch (Exception e){
      log.error("Exception while getting access token: {}" , e.getMessage());
    }
    return null;
  }

  public Mono<TravelRestrictionsResponseContainer> getTravelRestrictions(String county,String city){
    AuthResponseContainer authResponse = auth().block();
    String path = supplyConfig.getTravelRestrictions();
    String queryParameters = city==null? "?countryCode="+county:"?countryCode="+county+"&cityCode="+city;

    return webClientWrapper
        .getClient(WEB)
        .get()
        .uri(path + queryParameters)
        .header(AUTHORIZATION,
            authResponse.getTokenType() + " " + authResponse.getAccessToken())
        .retrieve()
        .bodyToMono(TravelRestrictionsResponseContainer.class)
        .log();

  }
}
