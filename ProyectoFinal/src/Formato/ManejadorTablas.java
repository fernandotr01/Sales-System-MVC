package Formato;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class ManejadorTablas {
    
    //Metodo que especifica un ancho de las columnas de tabla    
    public static void AnchoColumnas(JTable t, int numcolumna,int ancho) {
        TableColumn column;
        column = t.getColumnModel().getColumn(numcolumna);
        column.setPreferredWidth(ancho);       
    }
    
    //metodo que justifica los datos de una columna
   public static void JustificarCelda(JTable t,int numcolumna){
       DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
       modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
       t.getColumnModel().getColumn(numcolumna).setCellRenderer(modelocentrar);       
   }
   
   //metodo que la da formato a la JTable del tabla Categorias
   public static void FormatoTablaClientes(JTable tabla){
       AnchoColumnas(tabla,0,105);
       JustificarCelda(tabla,0);
       AnchoColumnas(tabla,1,200);
       JustificarCelda(tabla,1);
       AnchoColumnas(tabla,2,250);
       JustificarCelda(tabla,2);
       AnchoColumnas(tabla,3,450); 
       JustificarCelda(tabla,3);
       AnchoColumnas(tabla,4,300);
       JustificarCelda(tabla,4);
       AnchoColumnas(tabla,5,350);
       JustificarCelda(tabla,5);      
   }
   
   public static void FormatoTablaProveedores(JTable tabla){
       AnchoColumnas(tabla,0,125);
       JustificarCelda(tabla,0);
       AnchoColumnas(tabla,1,325);
       JustificarCelda(tabla,1);
       AnchoColumnas(tabla,2,250);
       JustificarCelda(tabla,2);
       AnchoColumnas(tabla,3,525); 
       JustificarCelda(tabla,3);
       AnchoColumnas(tabla,4,350);
       JustificarCelda(tabla,4);
       AnchoColumnas(tabla,5,700);
       JustificarCelda(tabla,5);      
   }  
   
    public static void FormatoTablaUsuarios(JTable tabla){
       AnchoColumnas(tabla,0,150);
       JustificarCelda(tabla,0);
       AnchoColumnas(tabla,1,150);
       JustificarCelda(tabla,1);
       AnchoColumnas(tabla,2,300);
       JustificarCelda(tabla,2);
       AnchoColumnas(tabla,3,500); 
       JustificarCelda(tabla,3); 
       AnchoColumnas(tabla,4,200); 
       JustificarCelda(tabla,4);        
    }
    
    public static void FormatoTablaMarcas(JTable tabla){
       AnchoColumnas(tabla,0,150);
       JustificarCelda(tabla,0);
       AnchoColumnas(tabla,1,150);
       JustificarCelda(tabla,1);
       AnchoColumnas(tabla,2,300);
       JustificarCelda(tabla,2);
       AnchoColumnas(tabla,3,450); 
       JustificarCelda(tabla,3);   
   }
    public static void FormatoTablaProductos(JTable tabla){
       AnchoColumnas(tabla,0,100);
       JustificarCelda(tabla,0);
       AnchoColumnas(tabla,1,200);
       JustificarCelda(tabla,1);
       AnchoColumnas(tabla,2,200);
       JustificarCelda(tabla,2);
       AnchoColumnas(tabla,3,300); 
       JustificarCelda(tabla,3); 
       AnchoColumnas(tabla,4,250);
       JustificarCelda(tabla,4);
       AnchoColumnas(tabla,5,125);
       JustificarCelda(tabla,5);
       AnchoColumnas(tabla,6,150);
       JustificarCelda(tabla,6); 
   }
   
}