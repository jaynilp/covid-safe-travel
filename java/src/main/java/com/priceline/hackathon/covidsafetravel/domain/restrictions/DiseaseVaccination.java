/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class DiseaseVaccination implements Serializable {

    private Date date;
    private String text;
    @JsonProperty("isRequired")
    private String isRequired;
    @JsonProperty("referenceLink")
    private String referenceLink;
    @JsonProperty("acceptedCertificates")
    private List<String> acceptedCertificates;
    @JsonProperty("qualifiedVaccines")
    private List<String> qualifiedVaccines;
    private String policy;
    private String exemptions;
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

    public void setIsRequired(String IsRequired) {
         this.isRequired = IsRequired;
     }
     public String getIsRequired() {
         return isRequired;
     }

    public void setReferenceLink(String referenceLink) {
         this.referenceLink = referenceLink;
     }
     public String getReferenceLink() {
         return referenceLink;
     }

    public void setAcceptedCertificates(List<String> acceptedCertificates) {
         this.acceptedCertificates = acceptedCertificates;
     }
     public List<String> getAcceptedCertificates() {
         return acceptedCertificates;
     }

    public void setQualifiedVaccines(List<String> qualifiedVaccines) {
         this.qualifiedVaccines = qualifiedVaccines;
     }
     public List<String> getQualifiedVaccines() {
         return qualifiedVaccines;
     }

    public void setPolicy(String policy) {
         this.policy = policy;
     }
     public String getPolicy() {
         return policy;
     }

    public void setExemptions(String exemptions) {
         this.exemptions = exemptions;
     }
     public String getExemptions() {
         return exemptions;
     }

}