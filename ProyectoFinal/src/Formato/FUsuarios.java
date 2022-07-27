package Formato;

import Modelo.MUsuarios;
import Vista.VUsuarios;

public class FUsuarios {
       public static void PresentacionUsuarios(VUsuarios VU1){
        VU1.setTitle("Formulario Mantenimiento de Usuarios");     
    }
    public static void LimpiarEntradasUsuarios(VUsuarios VU1){
        VU1.txtIdusuario.setText("");
        VU1.txtCodigousuario.setText("");
        VU1.txtNombreusuario.setText("");
        VU1.txtCorreousuario.setText("");
        VU1.txtContraseñausuario.setText("");
        VU1.txtCodigousuario.requestFocus();
    }
    public static MUsuarios LeerUsuarios(VUsuarios VU1){
        MUsuarios usuar = new MUsuarios();
        usuar.setCodigo(VU1.txtCodigousuario.getText());
        usuar.setNombre(VU1.txtNombreusuario.getText());
        usuar.setCorreo(VU1.txtCorreousuario.getText());
        usuar.setContraseña(VU1.txtContraseñausuario.getText());
        usuar.setIndicador("S");
        return usuar;
    }
    public static void EstadoUsuarios1(VUsuarios VU1){
        VU1.btnRegistrarusuario.setEnabled(true);
        VU1.btnConsultarusuario.setEnabled(true);
        VU1.btnActualizarusuario.setEnabled(false);
        VU1.btnEliminarusuario.setEnabled(false);
    }
    
    public static void EstadoUsuarios2(VUsuarios VU1){
        VU1.btnRegistrarusuario.setEnabled(false);
        VU1.btnConsultarusuario.setEnabled(true);
        VU1.btnActualizarusuario.setEnabled(true);
        VU1.btnEliminarusuario.setEnabled(true);
    }
       
    
}
