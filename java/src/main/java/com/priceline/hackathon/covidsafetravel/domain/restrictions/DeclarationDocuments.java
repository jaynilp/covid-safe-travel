/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;
import java.io.Serializable;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeclarationDocuments implements Serializable {

    private Date date;
    private String text;
    @JsonProperty("documentRequired")
    private String documentRequired;
    @JsonProperty("travelDocumentationLink")
    private String travelDocumentationLink;
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

    public void setDocumentRequired(String documentRequired) {
         this.documentRequired = documentRequired;
     }
     public String getDocumentRequired() {
         return documentRequired;
     }

    public void setTravelDocumentationLink(String TravelDocumentationLink) {
         this.travelDocumentationLink = TravelDocumentationLink;
     }
     public String getTravelDocumentationLink() {
         return travelDocumentationLink;
     }

}