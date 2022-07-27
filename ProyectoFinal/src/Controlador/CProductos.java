package Controlador;

import Formato.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.MProductos;
import Vista.*;
import DAO.*;
import javax.swing.JLabel;
import javax.swing.JTable;

public class CProductos implements ActionListener {
            CRUDProductos crudproduct;
            MProductos modproduct;
            VProductos vistproduct;
            int idprod;
            public CProductos (VProductos VPR1){
                vistproduct = VPR1;
                vistproduct.btnRegistrarproducto.addActionListener(this);
                vistproduct.btnConsultaproducto.addActionListener(this);
                vistproduct.btnActualizarproducto.addActionListener(this);
                vistproduct.btnEliminarproducto.addActionListener(this);
                FProductos.PresentacionProductos(VPR1);
                crudproduct =new CRUDProductos ();
                crudproduct.MostrarProductosEnTabla(vistproduct.jtblDatosproducto,vistproduct.jlblRegistrosproducto);
                vistproduct.setVisible(true);
                FProductos.ActualizarForma(VPR1);          
            }
            
            void ActualizarFormularioProductos(){
            crudproduct = new CRUDProductos();
            crudproduct.MostrarProductosEnTabla(vistproduct.jtblDatosproducto,vistproduct.jlblRegistrosproducto);
            FProductos.EstadoProductos1(vistproduct);
            FProductos.LimpiarEntradasProductos(vistproduct);
            }
            
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistproduct.btnRegistrarproducto){
            modproduct = FProductos.LeerProductos(vistproduct);
            crudproduct = new CRUDProductos();
            crudproduct.InsertarRegistroProductos(modproduct);
            ActualizarFormularioProductos();            
        }
        if (e.getSource() == vistproduct.btnConsultaproducto){
            idprod = Mensajes.M2("Ingrese el id del producto a buscar: ");
            crudproduct = new CRUDProductos();
            modproduct = crudproduct.ConsultarRegistroProductos(idprod);
            
            if (modproduct==null) {
                Mensajes.M1("El id "+idprod+" no existe en el registro productos");
            }else {
                vistproduct.txtIdproducto.setText(Integer.toString(modproduct.getIdproducto()));
                vistproduct.txtCodigoproducto.setText(modproduct.getCodigo());              
                vistproduct.jcbxMarcas.setSelectedItem(modproduct.getIdmarca());
                vistproduct.txtCaracteristicaproducto.setText(modproduct.getCaracteristicas());
                vistproduct.jcbxProveedor.setSelectedItem(modproduct.getIdproveedor());
                vistproduct.txtStockprducto.setText(modproduct.getStock());
                vistproduct.txtPrecioproducto.setText(String.valueOf(modproduct.getPrecio()));
                FProductos.EstadoProductos2(vistproduct);     
            }               
        }
        
        if(e.getSource()== vistproduct.btnActualizarproducto){
            modproduct = FProductos.LeerProductos(vistproduct);
            modproduct.setIdproducto(Integer.parseInt(vistproduct.txtIdproducto.getText()));
            crudproduct =  new CRUDProductos();
            crudproduct.ActualizarRegistroProductos(modproduct);
            ActualizarFormularioProductos();
        }
        if(e.getSource() == vistproduct.btnEliminarproducto){
            int respuesta = Mensajes.M3("Confirmar!!!!","¿Desea eliminar el registro?"); // si la respuesta es OK representa 0
            if(respuesta==0){
                int idproduct = Integer.parseInt(vistproduct.txtIdproducto.getText());
                crudproduct =  new CRUDProductos();
                crudproduct.InhabilitarRegistroProductos(idproduct);
                ActualizarFormularioProductos();
            }            
        }

    }

   
 }
        
    

      
 