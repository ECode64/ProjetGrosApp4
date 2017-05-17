/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import daoMySQL.ConnexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import transfertObject.Panne;

/**
 *
 * @author E
 */
public class DAOPanneMySQL {

    public ArrayList<Panne> selectPanne() {
        ArrayList<Panne> myList = new ArrayList<>();
        String req = "SELECT * FROM pannes";
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (res.next()) {
                myList.add(new Panne(res.getInt("identPanne"), res.getDate("datePanne"),
                        res.getString("descrPanne"), res.getString("societeRepar"),
                        res.getString("bonCom"), res.getDate("dateRetour"),
                        res.getDouble("prixRepar"), res.getString("facture"), res.getString("identApp")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.exit(-1);
        }
        return myList;
    }
}
