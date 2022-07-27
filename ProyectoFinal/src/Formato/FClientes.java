package Formato;

import Modelo.MClientes;
import Vista.VClientes;

public class FClientes {
    
    public static void Presentacion(VClientes VC1){
        VC1.setTitle("Formulario Mantenimiento de Clientes");     
    }
    

    public static void LimpiarEntradas(VClientes VC1){
        VC1.txtIdcliente.setText("");
        VC1.txtDni.setText("");
        VC1.txtCodigo.setText("");
        VC1.txtNombre.setText("");
        VC1.txtTelefono.setText("");
        VC1.txtDireccion.setText("");
        VC1.txtDni.requestFocus();
    }
    
    public static MClientes LeerClientes(VClientes VC1){
        MClientes client = new MClientes();
        client.setDni(VC1.txtDni.getText());
        client.setCodigo(VC1.txtCodigo.getText());
        client.setNombre(VC1.txtNombre.getText());
        client.setTelefono(VC1.txtTelefono.getText());
        client.setDireccion(VC1.txtDireccion.getText());
        client.setIndicador("S");
        return client;
    }
    
    public static void Estado1(VClientes VC1){
        VC1.jbtnRegistrar.setEnabled(true);
        VC1.jbtnConsultar.setEnabled(true);
        VC1.jbtnActualizar.setEnabled(false);
        VC1.jbtnEliminar.setEnabled(false);
    }
    
    public static void Estado2(VClientes VC1){
        VC1.jbtnRegistrar.setEnabled(false);
        VC1.jbtnConsultar.setEnabled(true);
        VC1.jbtnActualizar.setEnabled(true);
        VC1.jbtnEliminar.setEnabled(true);
    }
    
}