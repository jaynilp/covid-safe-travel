package com.priceline.hackathon.covidsafetravel.service;

import com.priceline.hackathon.covidsafetravel.domain.CovidDataResponse;
import com.priceline.hackathon.covidsafetravel.domain.restrictions.TravelRestrictionsResponseContainer;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CacheConnectorImpl implements CacheConnector {

  @Autowired
  private final RedisOperations<String, TravelRestrictionsResponseContainer> redisOperations;


  @Autowired
  public CacheConnectorImpl(final RedisOperations<String, TravelRestrictionsResponseContainer> redisOperations) {
    this.redisOperations = redisOperations;
  }

  @Override
  public TravelRestrictionsResponseContainer get(final String key) {
    TravelRestrictionsResponseContainer covidDataResponse = null;
    try {
      covidDataResponse = (redisOperations.opsForValue().get(key));
    } catch (Exception e) {

      log.error("Exception occurred while fetching covid data : {} : {} ", key, e);
    }
    return covidDataResponse;
  }

  @Override
  public TravelRestrictionsResponseContainer put(final String key, final TravelRestrictionsResponseContainer covidDataResponse) {
    try {
      redisOperations.opsForValue().set(key, covidDataResponse);
    } catch (Exception e) {
      log.error("Exception occurred while saving covid data : {} : {} ", key, e);
    }
    return covidDataResponse;
  }

  @Override
  public List<TravelRestrictionsResponseContainer> multiGet(final List<String> keys) {
    List<TravelRestrictionsResponseContainer> covidDataResponseList = null;
    try {
      covidDataResponseList = redisOperations.opsForValue().multiGet(keys);
    } catch (Exception e) {

      log.error("Exception occurred while fetching covid data : {} : {} ", keys, e);
    }
    return covidDataResponseList;
  }
}
