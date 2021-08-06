package com.priceline.hackathon.covidsafetravel.domain;

import com.priceline.hackathon.covidsafetravel.domain.restrictions.TravelRestrictionsResponseContainer;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CovidSafeContainer {

  private SurveyDetailsContainer surveyDetailsContainer;
  private TravelRestrictionsResponseContainer travelRestrictionsResponseContainer;
}
