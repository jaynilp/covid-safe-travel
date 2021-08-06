package com.priceline.hackathon.covidsafetravel.domain;

import com.priceline.hackathon.covidsafetravel.entity.CovidSurvey;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SurveyDetailsContainer {
  private List<CovidSurvey> surveyList;
}
