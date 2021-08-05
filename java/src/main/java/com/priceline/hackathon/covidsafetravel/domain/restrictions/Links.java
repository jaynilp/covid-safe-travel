/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links implements Serializable {

    private String self;
    public void setSelf(String self) {
         this.self = self;
     }
     public String getSelf() {
         return self;
     }

}