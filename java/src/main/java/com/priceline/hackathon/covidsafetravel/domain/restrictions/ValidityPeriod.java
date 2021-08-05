/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;
import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValidityPeriod implements Serializable {

    private String delay;
    @JsonProperty("referenceDateType")
    private String referenceDateType;
    public void setDelay(String delay) {
         this.delay = delay;
     }
     public String getDelay() {
         return delay;
     }

    public void setReferenceDateType(String referenceDateType) {
         this.referenceDateType = referenceDateType;
     }
     public String getReferenceDateType() {
         return referenceDateType;
     }

}