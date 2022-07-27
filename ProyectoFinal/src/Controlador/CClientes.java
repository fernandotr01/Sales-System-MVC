package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.MClientes;
import Formato.*;
import Vista.VClientes;
import DAO.*;

public class CClientes implements ActionListener {
        CRUDClientes crudclient;
        MClientes modclient;
        VClientes vistclient;
        public CClientes(VClientes VC1){
            vistclient = VC1;
            vistclient.jbtnRegistrar.addActionListener(this);
            vistclient.jbtnConsultar.addActionListener(this);
            vistclient.jbtnActualizar.addActionListener(this);
            vistclient.jbtnEliminar.addActionListener(this);
            FClientes.Presentacion(VC1);
            crudclient =new CRUDClientes();
            crudclient.MostrarClientesEnTabla(vistclient.jtblDatos,vistclient.jlblRegistros);
            vistclient.setVisible(true);
            FClientes.Estado1(VC1);          
        }
        
        void ActualizarFormulario(){
        crudclient =new CRUDClientes();
        crudclient.MostrarClientesEnTabla(vistclient.jtblDatos,vistclient.jlblRegistros);
        FClientes.Estado1(vistclient);
        FClientes.LimpiarEntradas(vistclient);
        }   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistclient.jbtnRegistrar){
            modclient = FClientes.LeerClientes(vistclient);
            crudclient =  new CRUDClientes();
            crudclient.InsertarRegistroClientes(modclient);
            ActualizarFormulario();            
        }
        if(e.getSource() == vistclient.jbtnConsultar){
            int dniclient = Mensajes.M2("Ingrese el DNI del cliente a buscar");
            crudclient = new CRUDClientes();
            modclient = crudclient.ConsultarRegistroClientes(dniclient);
            if(modclient==null){
                Mensajes.M1("El DNI "+dniclient+" no existe en la tabla clientes.");
                FClientes.Estado1(vistclient);
            }else{
                vistclient.txtIdcliente.setText(Integer.toString(modclient.getIdcliente()));
                vistclient.txtDni.setText(modclient.getDni());
                vistclient.txtNombre.setText(modclient.getNombre());
                vistclient.txtCodigo.setText(modclient.getCodigo());
                vistclient.txtTelefono.setText(modclient.getTelefono());
                vistclient.txtDireccion.setText(modclient.getDireccion());
                FClientes.Estado2(vistclient);
            }            
        }
        if(e.getSource()== vistclient.jbtnActualizar){
            modclient = FClientes.LeerClientes(vistclient);
            modclient.setIdcliente(Integer.parseInt(vistclient.txtIdcliente.getText()));
            crudclient =  new CRUDClientes();
            crudclient.ActualizarRegistroClientes(modclient);
            ActualizarFormulario();
        }
        if(e.getSource() == vistclient.jbtnEliminar){
            int respuesta = Mensajes.M3("Confirmar!!!!","¿Desea eliminar el registro?"); // si la respuesta es OK representa 0
            if(respuesta==0){
                int idclient = Integer.parseInt(vistclient.txtIdcliente.getText());
                crudclient =  new CRUDClientes();
                crudclient.InhabilitarRegistroClientes(idclient);
                ActualizarFormulario();
            }            
        }

    }

}
