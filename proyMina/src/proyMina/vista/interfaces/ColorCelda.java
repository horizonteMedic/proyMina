/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyMina.vista.interfaces;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;



/**
 *
 * @author josue
 */
class ColorCelda extends DefaultTableCellRenderer
 { @Override 
 public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column ) 
 { setEnabled(table == null || table.isEnabled()); 
 
 // see question above 
 {if(column==6 || column==3)
 //////aca indico que me pinte de color verde todas //las filas en la cual la ultima columna tiene valor 0. 
 setBackground(Color.green); 
 else setBackground(null); } 
 super.getTableCellRendererComponent(table, value, selected, focused, row, column); return this; 
 } 
 }

    

