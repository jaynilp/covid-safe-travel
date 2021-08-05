package com.priceline.hackathon.covidsafetravel.service;

import com.priceline.hackathon.covidsafetravel.entity.CovidSurvey;
import com.priceline.hackathon.covidsafetravel.repository.CovidSurveyRespository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyService {

  @Autowired CovidSurveyRespository covidSurveyRespository;

  public List<CovidSurvey> getCovidSurveyForSource(String source) {
    List<CovidSurvey> covidSurveysBySourceEqualsOrderByDateDesc =
        covidSurveyRespository.findCovidSurveysBySourceOrderByDateDesc(source);

    return covidSurveysBySourceEqualsOrderByDateDesc;
  }
}
