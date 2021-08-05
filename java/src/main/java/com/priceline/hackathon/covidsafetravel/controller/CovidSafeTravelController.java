package com.priceline.hackathon.covidsafetravel.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.priceline.hackathon.covidsafetravel.domain.CovidDataResponse;
import com.priceline.hackathon.covidsafetravel.domain.restrictions.TravelRestrictionsResponseContainer;
import com.priceline.hackathon.covidsafetravel.service.CacheConnectorImpl;
import com.priceline.hackathon.covidsafetravel.service.SupplyConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class CovidSafeTravelController {

  @Autowired
  CacheConnectorImpl cacheConnector;
  @Autowired
  private SupplyConnector supplyConnector;

  @GetMapping(value = "/covidDetails", produces = "application/json")
  @ResponseBody
  public Mono<TravelRestrictionsResponseContainer> getCovidData(@RequestParam String country, @RequestParam(required = false)String city) {

    String key = city==null?country:country+"-"+city;

    TravelRestrictionsResponseContainer travelRestrictionsResponseContainer = cacheConnector.get(key);

      return travelRestrictionsResponseContainer==null?getTravelRestrictions(country, city)
          .map(
              (travelRestrictionsResponseContainer1 ->
                  cacheConnector.put(key, travelRestrictionsResponseContainer1))):Mono.just(travelRestrictionsResponseContainer);

  }

  /*Using This Endpoint we can set Jsons in Redis Cache*/
  @PostMapping(value = "/setJson", produces = "application/json",consumes = "application/json")
  @ResponseBody
  public TravelRestrictionsResponseContainer setData(@RequestParam String key,@RequestBody TravelRestrictionsResponseContainer body) {

    cacheConnector.put(key, body);
    TravelRestrictionsResponseContainer object = cacheConnector.get(key);
    return object;
  }

  @GetMapping(value = "/travelRestrictions")
  @ResponseBody
  public Mono<TravelRestrictionsResponseContainer> getTravelRestrictions(@RequestParam String country , @RequestParam String city) {

    System.out.println("Testing application");
    Mono<TravelRestrictionsResponseContainer> travelRestrictions = supplyConnector
        .getTravelRestrictions(country,city);
    ObjectMapper mapper = new ObjectMapper();
    try {
      System.out.println(
          mapper.writeValueAsString(travelRestrictions.block()));
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return travelRestrictions;

  }
  
}
