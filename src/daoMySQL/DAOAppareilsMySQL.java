/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import transfertObject.Appareil;
import dao.DAOAppareils;

/**
 *
 * @author E
 */
public class DAOAppareilsMySQL implements DAOAppareils {

    private static DAOAppareilsMySQL uniqueInstance = new DAOAppareilsMySQL();

    public static DAOAppareilsMySQL getInstance() {
        return uniqueInstance;
    }

    @Override
    public ArrayList<Appareil> selectAppareils() {
        ArrayList<Appareil> myList = new ArrayList<>();
        String req = "select * from appareils";
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (res.next()) {
                myList.add(new Appareil(res.getString("identApp"), res.getString("descrApp"),
                        res.getString("identLoc"), res.getInt("identCat"),
                        res.getInt("identEtat"), res.getDate("dateArrivee")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.exit(-1);
        }
        return myList;
    }
}
