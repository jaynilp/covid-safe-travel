/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.model;
import java.io.Serializable;
import java.util.List;

/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class RelatedArea implements Serializable {

    private List<String> methods;
    private String rel;
    public void setMethods(List<String> methods) {
         this.methods = methods;
     }
     public List<String> getMethods() {
         return methods;
     }

    public void setRel(String rel) {
         this.rel = rel;
     }
     public String getRel() {
         return rel;
     }

}