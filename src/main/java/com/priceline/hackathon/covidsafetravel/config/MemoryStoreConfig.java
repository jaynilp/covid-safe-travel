package com.priceline.hackathon.covidsafetravel.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "memorystore")
public class MemoryStoreConfig {

  private String host;
  private int port;
}
