package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.MMarcas;
import Formato.*;
import Vista.VMarcas;
import DAO.*;

public class CMarcas implements ActionListener {
        CRUDMarcas crudmarc;
        MMarcas modmarc;
        VMarcas vistmarc;
        public CMarcas(VMarcas VM1){
            vistmarc = VM1;
            vistmarc.btnRegistrarmarca.addActionListener(this);
            vistmarc.btnConsultarmarca.addActionListener(this);
            vistmarc.btnActualizarmarca.addActionListener(this);
            vistmarc.btnEliminarmarca.addActionListener(this);
            FMarcas.PresentacionMarcas(VM1);
            crudmarc = new CRUDMarcas();
            crudmarc.MostrarMarcasEnTabla(vistmarc.jtblDatosmarca,vistmarc.jlblRegistrosmarca);
            vistmarc.setVisible(true);
            FMarcas.EstadoMarcas1(VM1);          
        }
        
        void ActualizarFormularioMarcas(){
        crudmarc =new CRUDMarcas();
        crudmarc.MostrarMarcasEnTabla(vistmarc.jtblDatosmarca,vistmarc.jlblRegistrosmarca);
        FMarcas.EstadoMarcas1(vistmarc);
        FMarcas.LimpiarEntradasMarcas(vistmarc);
        }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistmarc.btnRegistrarmarca){
            modmarc = FMarcas.LeerMarcas(vistmarc);
            crudmarc =  new CRUDMarcas();
            crudmarc.InsertarRegistroMarcas(modmarc);
            ActualizarFormularioMarcas();            
        }
        if(e.getSource() == vistmarc.btnConsultarmarca){
            int idmarc = Mensajes.M2("Ingrese el ID de la categoria a buscar");
            crudmarc= new CRUDMarcas();
            modmarc = crudmarc.ConsultarRegistroMarcas(idmarc);
            if(modmarc==null){
                Mensajes.M1("El ID "+idmarc+" no existe en la tabla marcas.");
                FMarcas.EstadoMarcas1(vistmarc);
            }else{
                vistmarc.txtIdmarca.setText(Integer.toString(modmarc.getIdmarca()));
                vistmarc.txtCodigomarca.setText(modmarc.getCodigo());
                vistmarc.txtNombremarca.setText(modmarc.getNombre());
                vistmarc.txtDescripcionmarca.setText(modmarc.getDescripcion());
                FMarcas.EstadoMarcas2(vistmarc);
            }            
        }
        if(e.getSource()== vistmarc.btnActualizarmarca){
            modmarc = FMarcas.LeerMarcas(vistmarc);
            modmarc.setIdmarca(Integer.parseInt(vistmarc.txtIdmarca.getText()));
            crudmarc=  new CRUDMarcas();
            crudmarc.ActualizarRegistroMarcas(modmarc);
            ActualizarFormularioMarcas();
        }
        if(e.getSource() == vistmarc.btnEliminarmarca){
            int respuesta = Mensajes.M3("Confirmar!!!!","¿Desea eliminar el registro?"); // si la respuesta es OK representa 0
            if(respuesta==0){
                int idmarc = Integer.parseInt(vistmarc.txtIdmarca.getText());
                crudmarc =  new CRUDMarcas();
                crudmarc.InhabilitarRegistroMarcas(idmarc);
                ActualizarFormularioMarcas();
            }            
        }
       
    }
    
}
