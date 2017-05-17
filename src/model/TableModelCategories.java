/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import transfertObject.Categorie;

/**
 *
 * @author E
 */
public class TableModelCategories extends AbstractTableModel {

    public TableModelCategories(ArrayList<Categorie> myList) {
        this.myList = myList;
    }

    @Override
    public int getRowCount() {
        return myList.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Categorie myApp = myList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return myApp.getNum();
            case 1:
                return myApp.getNom();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }
    private ArrayList<Categorie> myList;
    private String[] columnName = {"Num", "Nom"};

}
