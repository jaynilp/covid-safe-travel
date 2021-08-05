/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import java.io.Serializable;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */


@JsonIgnoreProperties(ignoreUnknown = true)
public class Data implements Serializable {

    @JsonProperty("area")
    private Area area;
  @JsonProperty("summary")
    private String summary;
  @JsonProperty("diseaseRiskLevel")
    private String diseaseRiskLevel;
    @JsonProperty("diseaseInfection")
    private DiseaseInfection diseaseInfection;
    @JsonProperty("diseaseCases")
    private DiseaseCases diseaseCases;
    private String hotspots;
    @JsonProperty("dataSources")
    private DataSources dataSources;
    private List<AreaRestrictions> areaRestrictions;
    private AreaAccessRestriction areaAccessRestriction;
    @JsonProperty("areaPolicy")
    private AreaPolicy areaPolicy;
    @JsonProperty("relatedArea")
    private List<RelatedArea> relatedArea;
    @JsonProperty("areaVaccinated")
    private List<AreaVaccinated> areaVaccinated;
    private String type;
    public void setArea(Area area) {
         this.area = area;
     }
     public Area getArea() {
         return area;
     }

    public void setSummary(String summary) {
         this.summary = summary;
     }
     public String getSummary() {
         return summary;
     }

    public void setDiseaseRiskLevel(String diseaseRiskLevel) {
         this.diseaseRiskLevel = diseaseRiskLevel;
     }
     public String getDiseaseRiskLevel() {
         return diseaseRiskLevel;
     }

    public void setDiseaseInfection(DiseaseInfection diseaseInfection) {
         this.diseaseInfection = diseaseInfection;
     }
     public DiseaseInfection getDiseaseInfection() {
         return diseaseInfection;
     }

    public void setDiseaseCases(DiseaseCases diseaseCases) {
         this.diseaseCases = diseaseCases;
     }
     public DiseaseCases getDiseaseCases() {
         return diseaseCases;
     }

    public void setHotspots(String hotspots) {
         this.hotspots = hotspots;
     }
     public String getHotspots() {
         return hotspots;
     }

    public void setDataSources(DataSources datasources) {
         this.dataSources = datasources;
     }
     public DataSources getDataSources() {
         return dataSources;
     }

    public void setAreaRestrictions(List<AreaRestrictions> areaRestrictions) {
         this.areaRestrictions = areaRestrictions;
     }
     public List<AreaRestrictions> getAreaRestrictions() {
         return areaRestrictions;
     }

    public void setAreaAccessRestriction(AreaAccessRestriction areaAccessRestriction) {
         this.areaAccessRestriction = areaAccessRestriction;
     }
     public AreaAccessRestriction getAreaAccessRestriction() {
         return areaAccessRestriction;
     }

    public void setAreaPolicy(AreaPolicy AreaPolicy) {
         this.areaPolicy = AreaPolicy;
     }
     public AreaPolicy getAreaPolicy() {
         return areaPolicy;
     }

    public void setRelatedArea(List<RelatedArea> relatedArea) {
         this.relatedArea = relatedArea;
     }
     public List<RelatedArea> getRelatedArea() {
         return relatedArea;
     }

    public void setAreaVaccinated(List<AreaVaccinated> areaVaccinated) {
         this.areaVaccinated = areaVaccinated;
     }
     public List<AreaVaccinated> getAreaVaccinated() {
         return areaVaccinated;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

}