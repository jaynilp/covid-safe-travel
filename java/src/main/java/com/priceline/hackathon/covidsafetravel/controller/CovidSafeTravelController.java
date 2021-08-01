package com.priceline.hackathon.covidsafetravel.controller;

import com.priceline.hackathon.covidsafetravel.domain.CovidDataResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidSafeTravelController {

  @GetMapping(value = "/covidDetails", produces = "application/json")
  @ResponseBody
  public CovidDataResponse getCovidData(@RequestParam String country, @RequestParam String city) {

    return null;
  }
}
