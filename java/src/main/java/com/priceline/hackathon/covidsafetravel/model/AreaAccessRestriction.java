/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.model;
import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AreaAccessRestriction implements Serializable {

    private Transportation transportation;
    @JsonProperty("declarationDocuments")
    private DeclarationDocuments declarationDocuments;
    private Entry entry;
    @JsonProperty("diseaseTesting")
    private DiseaseTesting diseaseTesting;
    @JsonProperty("tracingApplication")
    private TracingApplication tracingApplication;
    private Mask mask;
    private Exit exit;
    @JsonProperty("diseaseVaccination")
    private DiseaseVaccination diseaseVaccination;
    public void setTransportation(Transportation transportation) {
         this.transportation = transportation;
     }
     public Transportation getTransportation() {
         return transportation;
     }

    public void setDeclarationDocuments(DeclarationDocuments declarationDocuments) {
         this.declarationDocuments = declarationDocuments;
     }
     public DeclarationDocuments getDeclarationDocuments() {
         return declarationDocuments;
     }

    public void setEntry(Entry entry) {
         this.entry = entry;
     }
     public Entry getEntry() {
         return entry;
     }

    public void setDiseaseTesting(DiseaseTesting diseasetesting) {
         this.diseaseTesting = diseasetesting;
     }
     public DiseaseTesting getDiseaseTesting() {
         return diseaseTesting;
     }

    public void setTracingApplication(TracingApplication tracingapplication) {
         this.tracingApplication = tracingapplication;
     }
     public TracingApplication getTracingApplication() {
         return tracingApplication;
     }

    public void setMask(Mask mask) {
         this.mask = mask;
     }
     public Mask getMask() {
         return mask;
     }

    public void setExit(Exit exit) {
         this.exit = exit;
     }
     public Exit getExit() {
         return exit;
     }


    public void setDiseaseVaccination(DiseaseVaccination diseaseVaccination) {
         this.diseaseVaccination = diseaseVaccination;
     }
     public DiseaseVaccination getDiseaseVaccination() {
         return diseaseVaccination;
     }

}