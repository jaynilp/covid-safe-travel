/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.model;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonProperty;

/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class JsonRootBean implements Serializable {

  @JsonProperty("meta")
    private Meta meta;
  @JsonProperty("data")
    private Data data;
    public void setMeta(Meta meta) {
         this.meta = meta;
     }
     public Meta getMeta() {
         return meta;
     }

    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }

}