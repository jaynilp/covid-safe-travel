package com.priceline.hackathon.covidsafetravel.controller;

import com.priceline.hackathon.covidsafetravel.domain.SurveyDetailsContainer;
import com.priceline.hackathon.covidsafetravel.entity.CovidSurvey;
import com.priceline.hackathon.covidsafetravel.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyController {

  private static long dataId = 100l;

  @Autowired SurveyService surveyService;

  /*@GetMapping(value = "/covidSurvey", produces = "application/json")
  @ResponseBody
  public SurveyDetailsContainer getCovidSurvey(@RequestParam String source) {

    SurveyDetailsContainer covidSurveyForSource = surveyService.getCovidSurveyForSource(source);

    return covidSurveyForSource;
  }*/

  @GetMapping(value = "/covidSurveyForDestination", produces = "application/json")
  @ResponseBody
  public SurveyDetailsContainer getCovidSurvey(@RequestParam String destination) {

    SurveyDetailsContainer covidSurveyForSource =
        surveyService.getCovidSurveyForSource(destination);

    return covidSurveyForSource;
  }

  @GetMapping(value = "/covidSurvey", produces = "application/json")
  @ResponseBody
  public SurveyDetailsContainer getCovidSurvey() {

    return surveyService.getCovidSurveyDetails();
  }

  @PostMapping(value = "/covidSurvey", produces = "application/json")
  @ResponseBody
  public CovidSurvey createCovidSurvey(@RequestBody CovidSurvey covidSurvey) {
    covidSurvey.setId(dataId ++);
    return surveyService.addCovidSurvey(covidSurvey);
  }
}
