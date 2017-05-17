/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import transfertObject.Panne;

/**
 *
 * @author E
 */
public class TableModelPanne extends AbstractTableModel {

    public TableModelPanne(ArrayList<Panne> myList) {
        this.myList = myList;
    }

    
    @Override
    public int getRowCount() {
        return myList.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Panne myPanne = myList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return myPanne.getIdentPanne();
            case 1:
                return myPanne.getDatePanne();
            case 2:
                return myPanne.getDescr();
            case 3:
                return myPanne.getSocRepar();
            case 4:
                return myPanne.getBonCom();
            case 5:
                return myPanne.getDateRet();
            case 6:
                return myPanne.getPrixRepar();
            case 7:
                return myPanne.getFact();
            case 8:
                return myPanne.getIdentApp();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }
    
    ArrayList<Panne> myList;
    private String [] columnName = {"Ident Panne","Date panne","Descr panne",
        "Sociète rep","Bon commande","Date retour","Prix Repar","Facture","Ident app"};
}
