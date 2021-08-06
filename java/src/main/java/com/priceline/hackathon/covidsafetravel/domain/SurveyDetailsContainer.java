package com.priceline.hackathon.covidsafetravel.domain;

import com.priceline.hackathon.covidsafetravel.entity.CovidSurvey;
import java.util.List;
import lombok.Data;

@Data
public class SurveyDetailsContainer {
  private List<CovidSurvey> surveyList;
  private int percentRecommend;

  public SurveyDetailsContainer(List<CovidSurvey> surveyList)
  {
    this.surveyList=surveyList;
    this.percentRecommend=getPercentRecommend();
  }

  public int getPercentRecommend() {
    return (int)(((double)surveyList.stream().filter(CovidSurvey::isRecommend).count()/(double)surveyList.size())*100);
  }
}
