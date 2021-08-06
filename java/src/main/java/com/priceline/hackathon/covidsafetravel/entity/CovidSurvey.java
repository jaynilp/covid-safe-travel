package com.priceline.hackathon.covidsafetravel.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "COVID_SURVEY")
public class CovidSurvey {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  String name;

  String source;

  String destination;

  @Column(name = "CREATED_DATE")
  @Temporal(TemporalType.DATE)
  Date date;

  String covidReview;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getDate() {
    return date.toString();
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getCovidReview() {
    return covidReview;
  }

  public void setCovidReview(String covidReview) {
    this.covidReview = covidReview;
  }
}
