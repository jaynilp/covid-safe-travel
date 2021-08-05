/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.model;
import java.io.Serializable;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class DiseaseTesting implements Serializable {

    private Date date;
    private String text;
    @JsonProperty("isRequired")
    private String isRequired;
    private String when;
    private String requirement;
    private String rules;
    @JsonProperty("testType")
    private String testType;
    @JsonProperty("minimumAge")
    private int minimumAge;
    @JsonProperty("validityPeriod")
    private ValidityPeriod validityPeriod;
    public void setDate(Date date) {
         this.date = date;
     }
     public Date getDate() {
         return date;
     }

    public void setText(String text) {
         this.text = text;
     }
     public String getText() {
         return text;
     }

    public void setIsRequired(String isRequired) {
         this.isRequired = isRequired;
     }
     public String getIsRequired() {
         return isRequired;
     }

    public void setWhen(String when) {
         this.when = when;
     }
     public String getWhen() {
         return when;
     }

    public void setRequirement(String requirement) {
         this.requirement = requirement;
     }
     public String getRequirement() {
         return requirement;
     }

    public void setRules(String rules) {
         this.rules = rules;
     }
     public String getRules() {
         return rules;
     }

    public void setTestType(String testType) {
         this.testType = testType;
     }
     public String getTestType() {
         return testType;
     }

    public void setMinimumAge(int minimumAge) {
         this.minimumAge = minimumAge;
     }
     public int getMinimumAge() {
         return minimumAge;
     }

    public void setValidityPeriod(ValidityPeriod validityPeriod) {
         this.validityPeriod = validityPeriod;
     }
     public ValidityPeriod getValidityPeriod() {
         return validityPeriod;
     }

}