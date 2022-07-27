 package DAO;

import javax.swing.JComboBox;
import Formato.Mensajes;

public class CargarCombos extends Conexion{
    
    public CargarCombos(){
        
    }
 
 //CRUD QUE CARGA LOS COMBOS
 //METODO QUE CARGA LOS NOMBRES DE LAS MARCAS EN UN COMBO
 public void CargarMarcasEnCombo(JComboBox combo){
     try{
         rs = st.executeQuery("SELECT nombre FROM marcas WHERE indicador ='S' ORDER BY 1");
         while(rs.next()){
             combo.addItem(rs.getString(1));
         }
     }catch(Exception ex){
         Mensajes.M1("ERROR no se puede cargar el COMBO MARCAS"+ex);
     }
 } 
 
 //METODO QUE CARGA LOS NOMBRES DE LOS PROVEEDORES EN UN COMBO
 public void CargarProveedoresEnCombo(JComboBox combo){
     try{
         rs = st.executeQuery("SELECT nombre FROM proveedores WHERE indicador='S' ORDER BY 1");
         while(rs.next()){
             combo.addItem(rs.getString(1));
         }
     }catch(Exception ex){
         Mensajes.M1("ERROR no se puede cargar el COMBO PROVEEDORES"+ex);
     }
 }
    
}
