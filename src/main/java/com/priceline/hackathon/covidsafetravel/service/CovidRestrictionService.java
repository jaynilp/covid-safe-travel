package com.priceline.hackathon.covidsafetravel.service;

import com.priceline.hackathon.covidsafetravel.domain.CovidDataResponse;

public interface CovidRestrictionService {
  CovidDataResponse getCovidRestrictions(String countryCode, String cityCode);
}
