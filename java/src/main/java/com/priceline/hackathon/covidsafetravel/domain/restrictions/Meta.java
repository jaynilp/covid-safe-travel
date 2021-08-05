/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta implements Serializable {

  @JsonProperty("links")
    private Links links;
    public void setLinks(Links links) {
         this.links = links;
     }
     public Links getLinks() {
         return links;
     }

}