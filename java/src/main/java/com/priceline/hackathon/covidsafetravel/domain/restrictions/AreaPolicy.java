/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;
import java.io.Serializable;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AreaPolicy implements Serializable {

    private Date date;
    private String text;
    private String status;
    @JsonProperty("startDate")
    private Date startDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("referenceLink")
    private String referenceLink;
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

    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setStartDate(Date startDate) {
         this.startDate = startDate;
     }
     public Date getStartDate() {
         return startDate;
     }

    public void setEndDate(String endDate) {
         this.endDate = endDate;
     }
     public String getEndDate() {
         return endDate;
     }

    public void setReferenceLink(String referenceLink) {
         this.referenceLink = referenceLink;
     }
     public String getReferenceLink() {
         return referenceLink;
     }

}