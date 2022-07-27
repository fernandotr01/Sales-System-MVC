package Formato;

import Modelo.MProveedores;
import Vista.VProveedores;

public class FProveedores {
    
    public static void PresentacionProveedores(VProveedores VP1){
        VP1.setTitle("Formulario Mantenimiento de Proveedores");     
    }
    public static void LimpiarEntradasProveedores(VProveedores VP1){
        VP1.txtIdproveedor.setText("");
        VP1.txtRucprov.setText("");
        VP1.txtCodigoprov.setText("");
        VP1.txtNombreprov.setText("");
        VP1.txtTelefonoprov.setText("");
        VP1.txtDireccionprov.setText("");
        VP1.txtRucprov.requestFocus();
    }
    
    public static MProveedores LeerProveedores(VProveedores VP1){
        MProveedores proveed = new MProveedores();
        proveed.setRuc(VP1.txtRucprov.getText());
        proveed.setCodigo(VP1.txtCodigoprov.getText());
        proveed.setNombre(VP1.txtNombreprov.getText());
        proveed.setTelefono(VP1.txtTelefonoprov.getText());
        proveed.setDireccion(VP1.txtDireccionprov.getText());
        proveed.setIndicador("S");
        return proveed;
    }
    
    public static void EstadoProveedores1(VProveedores VP1){
        VP1.jbtnRegistrarprov.setEnabled(true);
        VP1.jbtnConsultarprov.setEnabled(true);
        VP1.jbtnActualizarprov.setEnabled(false);
        VP1.jbtnEliminarprov.setEnabled(false);
    }
    
    public static void EstadoProveedores2(VProveedores VP1){
        VP1.jbtnRegistrarprov.setEnabled(false);
        VP1.jbtnConsultarprov.setEnabled(true);
        VP1.jbtnActualizarprov.setEnabled(true);
        VP1.jbtnEliminarprov.setEnabled(true);
    }
   
}
