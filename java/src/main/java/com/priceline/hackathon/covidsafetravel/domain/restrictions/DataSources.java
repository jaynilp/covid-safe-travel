/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;
import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataSources implements Serializable {

    @JsonProperty("covidDashboardLink")
    private String covidDashboardLink;
    @JsonProperty("governmentSiteLink")
    private String governmentSiteLink;
    public void setCovidDashboardLink(String covidDashboardLink) {
         this.covidDashboardLink = covidDashboardLink;
     }
     public String getCovidDashboardLink() {
         return covidDashboardLink;
     }

    public void setGovernmentSiteLink(String governmentSiteLink) {
         this.governmentSiteLink = governmentSiteLink;
     }
     public String getGovernmentSiteLink() {
         return governmentSiteLink;
     }

}