package com.priceline.hackathon.covidsafetravel.service;

import com.priceline.hackathon.covidsafetravel.domain.CovidDataResponse;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CacheConnectorImpl implements CacheConnector {

  private final RedisOperations<String, CovidDataResponse> redisOperations;

  @Autowired
  public CacheConnectorImpl(final RedisOperations<String, CovidDataResponse> redisOperations) {
    this.redisOperations = redisOperations;
  }

  @Override
  public CovidDataResponse get(final String key) {
    CovidDataResponse covidDataResponse = null;
    try {
      covidDataResponse = redisOperations.opsForValue().get(key);
    } catch (Exception e) {

      log.error("Exception occurred while fetching covid data : {} : {} ", key, e);
    }
    return covidDataResponse;
  }

  @Override
  public CovidDataResponse put(final String key, final CovidDataResponse covidDataResponse) {
    try {
      redisOperations.opsForValue().set(key, covidDataResponse);
    } catch (Exception e) {
      log.error("Exception occurred while saving covid data : {} : {} ", key, e);
    }
    return covidDataResponse;
  }

  @Override
  public List<CovidDataResponse> multiGet(final List<String> keys) {
    List<CovidDataResponse> covidDataResponseList = null;
    try {
      covidDataResponseList = redisOperations.opsForValue().multiGet(keys);
    } catch (Exception e) {

      log.error("Exception occurred while fetching covid data : {} : {} ", keys, e);
    }
    return covidDataResponseList;
  }
}
