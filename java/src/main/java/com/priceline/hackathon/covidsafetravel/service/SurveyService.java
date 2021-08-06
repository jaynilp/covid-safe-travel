package com.priceline.hackathon.covidsafetravel.service;

import com.priceline.hackathon.covidsafetravel.domain.SurveyDetailsContainer;
import com.priceline.hackathon.covidsafetravel.entity.CovidSurvey;
import com.priceline.hackathon.covidsafetravel.repository.CovidSurveyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyService {

  @Autowired CovidSurveyRepository covidSurveyRespository;

  public SurveyDetailsContainer getCovidSurveyForSource(String source) {
    List<CovidSurvey> covidSurveysBySourceEqualsOrderByDateDesc =
        covidSurveyRespository.findCovidSurveysBySourceOrderByDateDesc(source);

    return new SurveyDetailsContainer(covidSurveysBySourceEqualsOrderByDateDesc);
  }

  public SurveyDetailsContainer getCovidSurveyForDestination(String destination) {
    List<CovidSurvey> covidSurveysByDestinationOrderByDateDesc =
        covidSurveyRespository.findCovidSurveysByDestinationOrderByDateDesc(destination);

    return new SurveyDetailsContainer(covidSurveysByDestinationOrderByDateDesc);
  }

  public SurveyDetailsContainer getCovidSurveyDetails() {
    List<CovidSurvey> listOfCovidSurveys = covidSurveyRespository.findAll();

    return new SurveyDetailsContainer(listOfCovidSurveys);
  }

  public CovidSurvey addCovidSurvey(CovidSurvey covidSurvey) {
    CovidSurvey savedCovidSurvey = covidSurveyRespository.save(covidSurvey);

    return savedCovidSurvey;
  }
}
