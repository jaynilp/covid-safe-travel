/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;
import java.io.Serializable;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Exit implements Serializable {

    private Date date;
    private String text;
    @JsonProperty("specialRequirements")
    private String specialRequirements;
    @JsonProperty("rulesLink")
    private String rulesLink;
    @JsonProperty("isBanned")
    private String isBanned;
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

    public void setSpecialRequirements(String specialRequirements) {
         this.specialRequirements = specialRequirements;
     }
     public String getSpecialRequirements() {
         return specialRequirements;
     }

    public void setRulesLink(String rulesLink) {
         this.rulesLink = rulesLink;
     }
     public String getRulesLink() {
         return rulesLink;
     }

    public void setIsBanned(String isBanned) {
         this.isBanned = isBanned;
     }
     public String getIsBanned() {
         return isBanned;
     }

}