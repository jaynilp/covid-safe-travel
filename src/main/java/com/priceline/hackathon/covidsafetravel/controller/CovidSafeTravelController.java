package com.priceline.hackathon.covidsafetravel.controller;

import com.priceline.hackathon.covidsafetravel.domain.CovidDataResponse;
import com.priceline.hackathon.covidsafetravel.service.CacheConnector;
import com.priceline.hackathon.covidsafetravel.service.CovidRestrictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidSafeTravelController {

  private final CacheConnector cacheConnector;
  private final CovidRestrictionService covidRestrictionService;

  @Autowired
  public CovidSafeTravelController(
      CacheConnector cacheConnector, CovidRestrictionService covidRestrictionService) {
    this.cacheConnector = cacheConnector;
    this.covidRestrictionService = covidRestrictionService;
  }

  @GetMapping(value = "/covidDetails", produces = "application/json")
  @ResponseBody
  public CovidDataResponse getCovidData(
      @RequestParam String countryCode, @RequestParam String cityCode) {

    String key = String.format("%s_%s", countryCode, cityCode);
    CovidDataResponse covidDataResponse = cacheConnector.get(key);

    if (null == covidDataResponse) {
      covidDataResponse = covidRestrictionService.getCovidRestrictions(countryCode, cityCode);
    }

    return covidDataResponse;
  }
}
