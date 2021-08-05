/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class TracingApplication implements Serializable {

    private Date date;
    private String text;
    @JsonProperty("isRequired")
    private String isRequired;
    @JsonProperty("iosUrl")
    private List<String> iosUrl;
    @JsonProperty("androidUrl")
    private List<String> androidUrl;
    public void setDate(Date date) {
         this.date = date;
     }
     public Date getDate() {
         return date;
     }

    public void setText(String text) {
         this.text = text;
     }
     public String getText() {
         return text;
     }

    public void setIsRequired(String isRequired) {
         this.isRequired = isRequired;
     }
     public String getIsRequired() {
         return isRequired;
     }

    public void setIosUrl(List<String> iosUrl) {
         this.iosUrl = iosUrl;
     }
     public List<String> getIosUrl() {
         return iosUrl;
     }

    public void setAndroidUrl(List<String> androidUrl) {
         this.androidUrl = androidUrl;
     }
     public List<String> getAndroidUrl() {
         return androidUrl;
     }

}