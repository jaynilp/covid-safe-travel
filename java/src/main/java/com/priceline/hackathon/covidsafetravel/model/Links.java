/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.model;

import java.io.Serializable;

/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Links implements Serializable {

    private String self;
    public void setSelf(String self) {
         this.self = self;
     }
     public String getSelf() {
         return self;
     }

}