package com.priceline.hackathon.covidsafetravel.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.priceline.hackathon.covidsafetravel.domain.CovidDataResponse;
import com.priceline.hackathon.covidsafetravel.model.JsonRootBean;
import com.priceline.hackathon.covidsafetravel.service.CacheConnectorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidSafeTravelController {

  @Autowired
  CacheConnectorImpl cacheConnector;

  @GetMapping(value = "/covidDetails", produces = "application/json")
  @ResponseBody
  public CovidDataResponse getCovidData(@RequestParam String country, @RequestParam String city) {

    cacheConnector.get(country);
    System.out.println(cacheConnector.get(country));
    return null;
  }

  /*Using This Endpoint we can set Jsons in Redis Cache*/
  @PostMapping(value = "/setJson", produces = "application/json",consumes = "application/json")
  @ResponseBody
  public JsonRootBean setData(@RequestParam String key,@RequestBody JsonRootBean body) {

    cacheConnector.put(key, body);
    JsonRootBean object = cacheConnector.get(key);
    return object;
  }
  }
