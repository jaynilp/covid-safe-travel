package com.priceline.hackathon.covidsafetravel.service;

import com.priceline.hackathon.covidsafetravel.domain.CovidDataResponse;
import org.springframework.stereotype.Service;

@Service
public class CovidRestrictionServiceImpl implements CovidRestrictionService {

  @Override
  public CovidDataResponse getCovidRestrictions(String countryCode, String cityCode) {
    // TODO call API
    return null;
  }
}
