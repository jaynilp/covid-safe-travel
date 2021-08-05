package com.priceline.hackathon.covidsafetravel.domain.auth;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

@Data
public class AuthResponseContainer {

  @JsonProperty("type")
  private String type;
  @JsonProperty("username")
  private String username;
  @JsonProperty("application_name")
  private String applicationName;
  @JsonProperty("client_id")
  private String clientId;
  @JsonProperty("token_type")
  private String tokenType;
  @JsonProperty("access_token")
  private String accessToken;
  @JsonProperty("expires_in")
  private Integer expiresIn;
  @JsonProperty("state")
  private String state;
  @JsonProperty("scope")
  private String scope;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
