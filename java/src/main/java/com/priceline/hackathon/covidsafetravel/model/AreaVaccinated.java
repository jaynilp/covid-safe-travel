/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.model;
import java.io.Serializable;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */

@JsonIgnoreProperties(ignoreUnknown = true)
public class AreaVaccinated implements Serializable {

    private Date date;
    @JsonProperty("vaccinationDoseStatus")
    private String vaccinationDoseStatus;
    private double percentage;
    public void setDate(Date date) {
         this.date = date;
     }
     public Date getDate() {
         return date;
     }

    public void setVaccinationDoseStatus(String vaccinationDoseStatus) {
         this.vaccinationDoseStatus = vaccinationDoseStatus;
     }
     public String getVaccinationDoseStatus() {
         return vaccinationDoseStatus;
     }

    public void setPercentage(double percentage) {
         this.percentage = percentage;
     }
     public double getPercentage() {
         return percentage;
     }

}