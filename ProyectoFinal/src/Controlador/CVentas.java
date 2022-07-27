package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Formato.*;
import Vista.*;
import DAO.*;

public class CVentas implements ActionListener{
        CRUDClientes crudclient;
        MClientes modclient;
        VVentas vistvent;
        public CVentas(VVentas VV1){
            vistvent = VV1;
            vistvent.btnBuscarcliente.addActionListener(this);
            FVentas.LeerClientes(VV1);;         
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistvent.btnBuscarcliente){
            int dniclient = Mensajes.M2("Ingrese el DNI del CLIENTE a buscar");
            crudclient = new CRUDClientes();
            modclient = crudclient.ConsultarRegistroClientes(dniclient);
            if(modclient==null){
                Mensajes.M1("El ID "+dniclient+" no existe en la tabla clientes.");
            }else{
                vistvent.txtDnicliente.setText(modclient.getDni());
                vistvent.txtNombrecliente.setText(modclient.getNombre());
                vistvent.txtCodigocliente.setText(modclient.getCodigo());
                vistvent.txtTelefonocliente.setText(modclient.getTelefono());
                vistvent.txtDireccioncliente.setText(modclient.getDireccion());
            }
        }
    }

}
