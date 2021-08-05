package com.priceline.hackathon.covidsafetravel.config;

import static com.priceline.hackathon.covidsafetravel.util.Constants.*;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

@Slf4j
@Configuration
@Import({SupplyConfig.class})
public class ConnectionConfig {

  private final SupplyConfig supplyConfig;
  private final HttpClient httpClient;

  public ConnectionConfig(
      SupplyConfig connectionConfig) {
    this.supplyConfig = connectionConfig;
    this.httpClient = HttpClient.create();
  }

  @Bean("webClients")
  public WebClientWrapper getWebClients() {
    WebClient authClient = getAuthWebClient();
    WebClient webClient = getWebClient();

    return new WebClientWrapper(authClient, webClient);
  }

  public WebClient getAuthWebClient() {

    String authUrl = supplyConfig.getAuth().getUrl();
    return WebClient.builder()
        .baseUrl(authUrl)
        .clientConnector(new ReactorClientHttpConnector(httpClient))
        .defaultHeader(HttpHeaders.USER_AGENT, HEADER_VALUE_USER_AGENT)
        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)
        .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
        .build();
  }

  public WebClient getWebClient() {

    String baseUrl = supplyConfig.getBaseUrl();
    return WebClient.builder()
        .baseUrl(baseUrl)
        .clientConnector(new ReactorClientHttpConnector(httpClient))
        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
        .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
        .defaultHeader(HttpHeaders.ACCEPT_LANGUAGE, HEADER_VALUE_ACCEPT_LANGUAGE)
        .defaultHeader(HttpHeaders.USER_AGENT, HEADER_VALUE_USER_AGENT)
        .build();
  }

  @AllArgsConstructor
  public static class WebClientWrapper {

    private final WebClient authClient;
    private final WebClient webClient;

    public WebClient getClient(final String clientType) {
      return clientType.equalsIgnoreCase("AUTH") ? authClient : webClient;
    }
  }
}
