/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import transfertObject.Appareil;

/**
 *
 * @author E
 */
public class TableModelAppareils extends AbstractTableModel {

    public TableModelAppareils(ArrayList<Appareil> myList) {
        this.myList = myList;
    }

    @Override
    public int getRowCount() {
        return myList.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Appareil myApp = myList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return myApp.getIdentApp();
            case 1:
                return myApp.getDescrApp();
            case 2:
                return myApp.getIdentCat();
            case 3:
                return myApp.getIdentEtat();
            case 4:
                return myApp.getIdentLoc();
            case 5:
                return myApp.getDateArrivBE();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }
    private ArrayList<Appareil> myList;
    private String [] columnName = {"Ident","Descr","Cat","Etat","Local","Date arr"};
}
