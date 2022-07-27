package Formato;

import Modelo.MVentas;
import Vista.VVentas;
import Modelo.MClientes;

public class FVentas {
    public static void PresentacionMarcas(VVentas VV1){
        VV1.setTitle("Formulario Mantemiento de Ventas");     
    }
    
        public static void LimpiarEntradas(VVentas VV1){
        VV1.txtDnicliente.setText("");
        VV1.txtCodigocliente.setText("");
        VV1.txtNombrecliente.setText("");
        VV1.txtTelefonocliente.setText("");
        VV1.txtDireccioncliente.setText("");
        VV1.txtDnicliente.requestFocus();
    }
    
    public static MClientes LeerClientes(VVentas VV1){
        MClientes client = new MClientes();
        client.setDni(VV1.txtDnicliente.getText());
        client.setCodigo(VV1.txtCodigocliente.getText());
        client.setNombre(VV1.txtNombrecliente.getText());
        client.setTelefono(VV1.txtTelefonocliente.getText());
        client.setDireccion(VV1.txtDireccioncliente.getText());
        client.setIndicador("S");
        return client;
    }
   
}
