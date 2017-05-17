/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;

/**
 *
 * @author E
 */
public class Categorie {

    public Categorie(int IdenCat, String DenomCat) {
        this.IdenCat = IdenCat;
        this.DenomCat = DenomCat;
    }

    public int getNum() {
        return IdenCat;
    }

    public String getNom() {
        return DenomCat;
    }

    public void setNum(int num) {
        this.IdenCat = num;
    }

    public void setNom(String nom) {
        this.DenomCat = nom;
    }

    @Override
    public String toString() {
        return IdenCat + " " + DenomCat;
    }

    private int IdenCat;
    private String DenomCat;
}
