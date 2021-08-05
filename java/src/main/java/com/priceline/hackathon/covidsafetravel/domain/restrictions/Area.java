/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;
import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Area implements Serializable {

    @JsonProperty("name")
    private String name;
    @JsonProperty("iataCode")
    private String iataCode;
    @JsonProperty("areaType")
    private String areaType;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setIataCode(String iatacode) {
         this.iataCode = iatacode;
     }
     public String getIataCode() {
         return iataCode;
     }

    public void setAreatype(String areatype) {
         this.areaType = areatype;
     }
     public String getAreaType() {
         return areaType;
     }

}