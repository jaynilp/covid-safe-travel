package com.priceline.hackathon.covidsafetravel.domain;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class CovidDataResponse implements Serializable {

  String country;
  String entryRestriction;
  String testingRules;
  String decDoc;
  List<String> bannedCountries;
  List<String> referenceLink;



}
