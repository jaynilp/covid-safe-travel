package com.priceline.hackathon.covidsafetravel.service;

import com.priceline.hackathon.covidsafetravel.domain.CovidDataResponse;
import com.priceline.hackathon.covidsafetravel.model.JsonRootBean;
import java.util.List;

public interface CacheConnector {

  List<JsonRootBean> multiGet(final List<String> keys);

  JsonRootBean get(final String key);

  JsonRootBean put(final String key, final JsonRootBean covidDataResponse);
}
