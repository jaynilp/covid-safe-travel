package com.priceline.hackathon.covidsafetravel.repository;

import com.priceline.hackathon.covidsafetravel.entity.CovidSurvey;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CovidSurveyRespository extends CrudRepository<CovidSurvey, Long> {
  List<CovidSurvey> findCovidSurveysBySourceOrderByDateDesc(String source);

  List<CovidSurvey> findCovidSurveysByDestinationOrderByDateDesc(String destination);

  List<CovidSurvey> findAll();

  CovidSurvey save(CovidSurvey covidSurvey);
}
