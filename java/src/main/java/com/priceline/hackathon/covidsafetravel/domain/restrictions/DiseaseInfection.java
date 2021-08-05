/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;
import java.io.Serializable;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiseaseInfection implements Serializable {

    private Date date;
    private String level;
    private double rate;
    @JsonProperty("infectionMapLink")
    private String infectionMapLink;
    public void setDate(Date date) {
         this.date = date;
     }
     public Date getDate() {
         return date;
     }

    public void setLevel(String level) {
         this.level = level;
     }
     public String getLevel() {
         return level;
     }

    public void setRate(double rate) {
         this.rate = rate;
     }
     public double getRate() {
         return rate;
     }

    public void setInfectionMapLink(String infectionMapLink) {
         this.infectionMapLink = infectionMapLink;
     }
     public String getInfectionMapLink() {
         return infectionMapLink;
     }

}