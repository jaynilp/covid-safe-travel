/* Copyright 2021 freecodeformat.com */
package com.priceline.hackathon.covidsafetravel.domain.restrictions;
import java.io.Serializable;
import java.util.Date;

/* Time: 2021-08-05 13:31:23 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class DiseaseCases implements Serializable {

    private Date date;
    private int deaths;
    private int confirmed;
    public void setDate(Date date) {
         this.date = date;
     }
     public Date getDate() {
         return date;
     }

    public void setDeaths(int deaths) {
         this.deaths = deaths;
     }
     public int getDeaths() {
         return deaths;
     }

    public void setConfirmed(int confirmed) {
         this.confirmed = confirmed;
     }
     public int getConfirmed() {
         return confirmed;
     }

}