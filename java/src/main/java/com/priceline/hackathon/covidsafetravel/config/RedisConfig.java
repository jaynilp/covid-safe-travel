package com.priceline.hackathon.covidsafetravel.config;

import com.priceline.hackathon.covidsafetravel.domain.CovidDataResponse;
import com.priceline.hackathon.covidsafetravel.domain.restrictions.TravelRestrictionsResponseContainer;
import io.lettuce.core.ClientOptions;
import io.lettuce.core.TimeoutOptions;
import io.lettuce.core.resource.ClientResources;
import java.time.Duration;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@Import({MemoryStoreConfig.class})
public class RedisConfig {

  private final MemoryStoreConfig memoryStoreConfig;

  public RedisConfig(final MemoryStoreConfig memoryStoreConfig) {
    this.memoryStoreConfig = memoryStoreConfig;
  }

  @Bean
  public RedisStandaloneConfiguration redisStandaloneConfiguration() {
    String memStoreHost = memoryStoreConfig.getHost();
    int memStorePort = memoryStoreConfig.getPort();
    return new RedisStandaloneConfiguration(memStoreHost, memStorePort);
  }

  @Bean
  public ClientOptions clientOptions() {
    return ClientOptions.builder()
        .disconnectedBehavior(ClientOptions.DisconnectedBehavior.REJECT_COMMANDS)
        .cancelCommandsOnReconnectFailure(true)
        .timeoutOptions(TimeoutOptions.enabled(Duration.ofMinutes(1)))
        .autoReconnect(true)
        .build();
  }

  @Bean
  public ClientResources clientResources() {
    return ClientResources.builder().build();
  }

  @Bean
  LettucePoolingClientConfiguration lettucePoolConfig(
      final ClientOptions options, final ClientResources clientResources) {
    return LettucePoolingClientConfiguration.builder()
        .poolConfig(new GenericObjectPoolConfig())
        .clientOptions(options)
        .clientResources(clientResources)
        .build();
  }

  @Bean
  public RedisConnectionFactory connectionFactory(
      final RedisStandaloneConfiguration redisStandaloneConfiguration,
      final LettucePoolingClientConfiguration lettucePoolConfig) {
    return new LettuceConnectionFactory(redisStandaloneConfiguration, lettucePoolConfig);
  }

  @Bean
  public RedisOperations<String, TravelRestrictionsResponseContainer> redisOperations(
      final RedisConnectionFactory connectionFactory) {

    RedisTemplate<String, TravelRestrictionsResponseContainer> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(connectionFactory);
    redisTemplate.setDefaultSerializer(new GenericJackson2JsonRedisSerializer());
    redisTemplate.setKeySerializer(new StringRedisSerializer());
    redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
    redisTemplate.setHashKeySerializer(new StringRedisSerializer());
    redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
    return redisTemplate;
  }




}
