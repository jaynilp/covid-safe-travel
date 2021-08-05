package com.priceline.hackathon.covidsafetravel.service;

import com.priceline.hackathon.covidsafetravel.domain.CovidDataResponse;
import com.priceline.hackathon.covidsafetravel.domain.restrictions.TravelRestrictionsResponseContainer;
import java.util.List;

public interface CacheConnector {

  List<TravelRestrictionsResponseContainer> multiGet(final List<String> keys);

  TravelRestrictionsResponseContainer get(final String key);

  TravelRestrictionsResponseContainer put(final String key, final TravelRestrictionsResponseContainer covidDataResponse);
}
