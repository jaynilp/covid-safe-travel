/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Entry implements Serializable {

    private Date date;
    private String text;
    private String ban;
    @JsonProperty("throughDate")
    private String throughDate;
    private String rules;
    @JsonProperty("bannedArea")
    private List<BannedArea> bannedArea;
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

    public void setBan(String ban) {
         this.ban = ban;
     }
     public String getBan() {
         return ban;
     }

    public void setThroughDate(String throughDate) {
         this.throughDate = throughDate;
     }
     public String getThroughDate() {
         return throughDate;
     }

    public void setRules(String rules) {
         this.rules = rules;
     }
     public String getRules() {
         return rules;
     }

    public void setBannedArea(List<BannedArea> bannedArea) {
         this.bannedArea = bannedArea;
     }
     public List<BannedArea> getBannedArea() {
         return bannedArea;
     }

}