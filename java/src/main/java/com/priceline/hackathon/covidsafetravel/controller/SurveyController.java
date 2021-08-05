package com.priceline.hackathon.covidsafetravel.controller;

import com.priceline.hackathon.covidsafetravel.entity.CovidSurvey;
import com.priceline.hackathon.covidsafetravel.service.SurveyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyController {

  @Autowired SurveyService surveyService;

  @GetMapping(value = "/covidSurvey", produces = "application/json")
  @ResponseBody
  public List<CovidSurvey> getCovidSurvey(@RequestParam String source) {

    List<CovidSurvey> covidSurveyForSource = surveyService.getCovidSurveyForSource(source);

    return covidSurveyForSource;
  }
}
