/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;

import java.sql.Date;

/**
 *
 * @author E
 */
public class Panne {

    public Panne(int identPanne, Date datePanne, String descr, String socRepar, String bonCom, Date dateRet, double prixRepar, String fact, String identApp) {
        this.identPanne = identPanne;
        this.datePanne = datePanne;
        this.descr = descr;
        this.socRepar = socRepar;
        this.bonCom = bonCom;
        this.dateRet = dateRet;
        this.prixRepar = prixRepar;
        this.fact = fact;
        this.identApp = identApp;
    }



    public int getIdentPanne() {
        return identPanne;
    }

    public Date getDatePanne() {
        return datePanne;
    }

    public String getDescr() {
        return descr;
    }

    public String getSocRepar() {
        return socRepar;
    }

    public Date getDateRet() {
        return dateRet;
    }

    public double getPrixRepar() {
        return prixRepar;
    }

    public String getFact() {
        return fact;
    }

    public String getIdentApp() {
        return identApp;
    }

    public void setIdentPanne(int identPanne) {
        this.identPanne = identPanne;
    }

    public void setDatePanne(Date datePanne) {
        this.datePanne = datePanne;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public void setSocRepar(String socRepar) {
        this.socRepar = socRepar;
    }

    public void setDateRet(Date dateRet) {
        this.dateRet = dateRet;
    }

    public void setBonCom(String bonCom) {
        this.bonCom = bonCom;
    }

    public String getBonCom() {
        return bonCom;
    }

    public void setPrixRepar(double prixRepar) {
        this.prixRepar = prixRepar;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public void setIdentApp(String identApp) {
        this.identApp = identApp;
    }

    @Override
    public String toString() {
        return identPanne + " " + datePanne + " " + descr + " " + socRepar + " " + dateRet + " " + prixRepar + " " + fact + " " + identApp;
    }
    
    
private int identPanne;
private Date datePanne;
private String descr;
private String socRepar;
private String bonCom;
private Date dateRet;
private double prixRepar;
private String fact;
private String identApp;
}
