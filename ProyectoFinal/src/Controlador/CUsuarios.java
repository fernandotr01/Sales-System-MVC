package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.MUsuarios;
import Formato.*;
import Vista.VUsuarios;
import DAO.*;

public class CUsuarios implements ActionListener{
        CRUDUsuarios crudusuar;
        MUsuarios modusuar;
        VUsuarios vistusuar;
        public CUsuarios(VUsuarios VU1){
            vistusuar = VU1;
            vistusuar.btnRegistrarusuario.addActionListener(this);
            vistusuar.btnConsultarusuario.addActionListener(this);
            vistusuar.btnActualizarusuario.addActionListener(this);
            vistusuar.btnEliminarusuario.addActionListener(this);
            FUsuarios.PresentacionUsuarios(VU1);
            crudusuar = new CRUDUsuarios();
            crudusuar.MostrarUsuariosEnTabla(vistusuar.jtblDatosusuario,vistusuar.jlblRegistrosusuarios);
            vistusuar.setVisible(true);
            FUsuarios.EstadoUsuarios1(VU1);          
        }
        
        void ActualizarFormularioUsuarios(){
        crudusuar = new CRUDUsuarios();
        crudusuar.MostrarUsuariosEnTabla(vistusuar.jtblDatosusuario,vistusuar.jlblRegistrosusuarios);
        FUsuarios.EstadoUsuarios1(vistusuar);
        FUsuarios.LimpiarEntradasUsuarios(vistusuar);
        }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistusuar.btnRegistrarusuario){
            modusuar = FUsuarios.LeerUsuarios(vistusuar);
            crudusuar =  new CRUDUsuarios();
            crudusuar.InsertarRegistroUsuarios(modusuar);
            ActualizarFormularioUsuarios();            
        }
        if(e.getSource() == vistusuar.btnConsultarusuario){
            int idusuar = Mensajes.M2("Ingrese el ID de la categoria a buscar");
            crudusuar= new CRUDUsuarios();
            modusuar = crudusuar.ConsultarRegistroUsuarios(idusuar);
            if(modusuar==null){
                Mensajes.M1("El ID "+idusuar+" no existe en la tabla Usuarios.");
                FUsuarios.EstadoUsuarios1(vistusuar);
            }else{
                vistusuar.txtIdusuario.setText(Integer.toString(modusuar.getIdusuario()));
                vistusuar.txtCodigousuario.setText(modusuar.getCodigo());
                vistusuar.txtNombreusuario.setText(modusuar.getNombre());
                vistusuar.txtCorreousuario.setText(modusuar.getCorreo());
                vistusuar.txtContraseñausuario.setText(modusuar.getContraseña());
                FUsuarios.EstadoUsuarios2(vistusuar);
            }            
        }
        if(e.getSource()== vistusuar.btnActualizarusuario){
            modusuar = FUsuarios.LeerUsuarios(vistusuar);
            modusuar.setIdusuario(Integer.parseInt(vistusuar.txtIdusuario.getText()));
            crudusuar =  new CRUDUsuarios();
            crudusuar.ActualizarRegistroUsuarios(modusuar);
            ActualizarFormularioUsuarios();
        }
        if(e.getSource() == vistusuar.btnEliminarusuario){
            int respuesta = Mensajes.M3("Confirmar!!!!","¿Desea eliminar el registro?"); // si la respuesta es OK representa 0
            if(respuesta==0){
                int idusuar = Integer.parseInt(vistusuar.txtIdusuario.getText());
                crudusuar =  new CRUDUsuarios();
                crudusuar.InhabilitarRegistroUsuarios(idusuar);
                ActualizarFormularioUsuarios();
            }            
        }
       
    }
    
}