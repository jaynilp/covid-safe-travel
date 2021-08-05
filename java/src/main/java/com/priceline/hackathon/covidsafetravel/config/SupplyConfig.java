package com.priceline.hackathon.covidsafetravel.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "supply-config")
@Component
public class SupplyConfig {

  private AuthConfig auth;
  private String baseUrl;

  private String travelRestrictions;

  @Data
  public static class AuthConfig {
    private String url;
    private String clientId;
    private String clientSecret;
    private String grantType;
  }
}
