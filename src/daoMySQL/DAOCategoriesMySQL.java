/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import transfertObject.Categorie;
import dao.DAOCategories;

/**
 *
 * @author E
 */
public class DAOCategoriesMySQL implements DAOCategories {

    private static DAOCategoriesMySQL uniqueInstance = new DAOCategoriesMySQL();

    public static DAOCategoriesMySQL getInstance() {
        return uniqueInstance;
    }

    @Override
    public ArrayList<Categorie> selectCategories() {
        ArrayList<Categorie> myList = new ArrayList<>();
        String req = "SELECT * FROM categories";
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (res.next()) {
                myList.add(new Categorie(res.getInt("identCat"), res.getString("DenomCat")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.exit(-1);
        }
        return myList;
    }
}
