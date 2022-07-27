package Formato;

import Modelo.MProductos;
import Vista.VProductos;
import DAO.*;


public class FProductos {
    
    public static void PresentacionProductos(VProductos VPR1){
        VPR1.setTitle("Formulario Mantenimiento de Productos");     
    }
    
    //METODO QUE ACTUALIZA EL FORMULARIO
    public static void ActualizarForma(VProductos VPR1){     
        //CARGANDO LOS COMBOS DE MARCAS & PROVEEDORES
        CargarCombos cc = new CargarCombos();
        cc.CargarMarcasEnCombo(VPR1.jcbxMarcas);
        cc.CargarProveedoresEnCombo(VPR1.jcbxProveedor);           
    }
    
    public static void LimpiarEntradasProductos(VProductos VPR1){
        VPR1.txtIdproducto.setText("");
        VPR1.txtCodigoproducto.setText("");
        VPR1.jcbxMarcas.setSelectedIndex(0);
        VPR1.txtCaracteristicaproducto.setText("");
        VPR1.jcbxProveedor.setSelectedIndex(0);
        VPR1.txtStockprducto.setText("");
        VPR1.txtPrecioproducto.setText("");
        VPR1.txtCodigoproducto.requestFocus();
    }
    
    public static MProductos LeerProductos(VProductos VPR1){
        MProductos product = new MProductos();
        product.setCodigo(VPR1.txtCodigoproducto.getText());
        product.setCaracteristicas(VPR1.txtCaracteristicaproducto.getText());
        product.setStock(VPR1.txtStockprducto.getText());
        product.setPrecio(Double.parseDouble(VPR1.txtPrecioproducto.getText()));
        
        //RECUPERANDO LOS IDS DE MARCAS Y PROVEEDOR 
        RecuperarIds ri = new RecuperarIds();
        product.setIdmarca(ri.RecuperarIdMarcas(VPR1.jcbxMarcas.getSelectedItem().toString()));
        product.setIdproveedor(ri.RecuperarIdProveedor(VPR1.jcbxProveedor.getSelectedItem().toString()));
        product.setIndicador("S");
        return product;
    }
    
    public static void EstadoProductos1(VProductos VPR1){
        VPR1.btnRegistrarproducto.setEnabled(true);
        VPR1.btnConsultaproducto.setEnabled(true);
        VPR1.btnActualizarproducto.setEnabled(false);
        VPR1.btnEliminarproducto.setEnabled(false);
    }
    
    public static void EstadoProductos2(VProductos VPR1){
        VPR1.btnRegistrarproducto.setEnabled(false);
        VPR1.btnConsultaproducto.setEnabled(true);
        VPR1.btnActualizarproducto.setEnabled(true);
        VPR1.btnEliminarproducto.setEnabled(true);
    }
    
}
