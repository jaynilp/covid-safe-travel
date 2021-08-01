package com.priceline.hackathon.covidsafetravel.service;

import com.priceline.hackathon.covidsafetravel.domain.CovidDataResponse;
import java.util.List;

public interface CacheConnector {

  List<CovidDataResponse> multiGet(final List<String> keys);

  CovidDataResponse get(final String key);

  CovidDataResponse put(final String key, final CovidDataResponse covidDataResponse);
}
