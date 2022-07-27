package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.MProveedores;
import Formato.*;
import Vista.VProveedores;
import DAO.*;

public class CProveedores implements ActionListener {
            CRUDProveedores crudproveed;
            MProveedores modproveed;
            VProveedores vistproveed;
            public CProveedores (VProveedores VP1){
                vistproveed = VP1;
                vistproveed.jbtnRegistrarprov.addActionListener(this);
                vistproveed.jbtnConsultarprov.addActionListener(this);
                vistproveed.jbtnActualizarprov.addActionListener(this);
                vistproveed.jbtnEliminarprov.addActionListener(this);
                FProveedores.PresentacionProveedores(VP1);
                crudproveed = new CRUDProveedores();
                crudproveed.MostrarProveedoresEnTabla(vistproveed.jtblDatosprov,vistproveed.jlblRegistrosprov);
                vistproveed.setVisible(true);
                FProveedores.EstadoProveedores1(VP1);          
            }
            
            void ActualizarFormularioProveedores(){
            crudproveed =new CRUDProveedores();
            crudproveed.MostrarProveedoresEnTabla(vistproveed.jtblDatosprov,vistproveed.jlblRegistrosprov);
            FProveedores.EstadoProveedores1(vistproveed);
            FProveedores.LimpiarEntradasProveedores(vistproveed);
            } 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistproveed.jbtnRegistrarprov){
            modproveed = FProveedores.LeerProveedores(vistproveed);
            crudproveed =  new CRUDProveedores();
            crudproveed.InsertarRegistroProveedores(modproveed);
            ActualizarFormularioProveedores();            
        }
        if(e.getSource() == vistproveed.jbtnConsultarprov){
            int idproveed = Mensajes.M2("Ingrese el ID de la categoria a buscar");
            crudproveed = new CRUDProveedores();
            modproveed = crudproveed.ConsultarRegistroProveedores(idproveed);
            if(modproveed==null){
                Mensajes.M1("El ID "+idproveed+" no existe en la tabla proveedores.");
                FProveedores.EstadoProveedores1(vistproveed);
            }else{
                vistproveed.txtIdproveedor.setText(Integer.toString(modproveed.getIdproveedor()));
                vistproveed.txtRucprov.setText(modproveed.getRuc());
                vistproveed.txtCodigoprov.setText(modproveed.getCodigo());
                vistproveed.txtNombreprov.setText(modproveed.getNombre());
                vistproveed.txtTelefonoprov.setText(modproveed.getTelefono());
                vistproveed.txtDireccionprov.setText(modproveed.getDireccion());
                FProveedores.EstadoProveedores2(vistproveed);
            }            
        }
        if(e.getSource()== vistproveed.jbtnActualizarprov){
            modproveed = FProveedores.LeerProveedores(vistproveed);
            modproveed.setIdproveedor(Integer.parseInt(vistproveed.txtIdproveedor.getText()));
            crudproveed =  new CRUDProveedores();
            crudproveed.ActualizarRegistroProveedores(modproveed);
            ActualizarFormularioProveedores();
        }
        if(e.getSource() == vistproveed.jbtnEliminarprov){
            int respuesta = Mensajes.M3("Confirmar!!!!","¿Desea eliminar el registro?"); // si la respuesta es OK representa 0
            if(respuesta==0){
                int idproveed = Integer.parseInt(vistproveed.txtIdproveedor.getText());
                crudproveed =  new CRUDProveedores();
                crudproveed.InhabilitarRegistroProveedores(idproveed);
                ActualizarFormularioProveedores();
            }            
        }

    }
        
    
}
