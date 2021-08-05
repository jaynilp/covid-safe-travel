/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;
import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */

@JsonIgnoreProperties(ignoreUnknown = true)
public class BannedArea implements Serializable {

    @JsonProperty("iataCode")
    private String iataCode;
    @JsonProperty("areaType")
    private String areaType;
    public void setIataCode(String iataCode) {
         this.iataCode = iataCode;
     }
     public String getIataCode() {
         return iataCode;
     }

    public void setAreatype(String areaType) {
         this.areaType = areaType;
     }
     public String getAreaType() {
         return areaType;
     }

}