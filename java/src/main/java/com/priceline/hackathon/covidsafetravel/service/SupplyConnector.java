package com.priceline.hackathon.covidsafetravel.service;

import com.priceline.hackathon.covidsafetravel.domain.restrictions.TravelRestrictionsResponseContainer;
import reactor.core.publisher.Mono;

public interface SupplyConnector {

  String getAccessToken();

  Mono<TravelRestrictionsResponseContainer> getTravelRestrictions(String country, String city);
}
