package DAO;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import Formato.Mensajes;
import Formato.ManejadorTablas;
import Modelo.MProductos;

public class CRUDProductos extends Conexion{

    public CRUDProductos() {
        
    }
    
    public void MostrarProductosEnTabla(JTable tabla,JLabel etiqueta){
        String titulos[]={"ID","Codigo","Marca","Caracteristica","Proveedor","Stock","Precio"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        int numeracion = 0;    
        try{
            rs = st.executeQuery("SELECT idproducto,codigo,idmarca,caracteristicas,idproveedor,stock,precio,indicador FROM productos WHERE indicador = 'S'");
            while(rs.next()){
                numeracion++;
                MProductos MProduct = new MProductos();
                MProduct.setIdproducto(rs.getInt(1));
                MProduct.setCodigo(rs.getString(2));
                MProduct.setIdmarca(rs.getInt(3)); 
                MProduct.setCaracteristicas(rs.getString(4));
                MProduct.setIdproveedor(rs.getInt(5));  
                MProduct.setStock(rs.getString(6));
                MProduct.setPrecio(rs.getDouble(7));
                MProduct.setIndicador(rs.getString(8));
                modelo.addRow(MProduct.RegistroProductos(numeracion));
            }
            
            etiqueta.setText("Número de registros : " +numeracion);
            ManejadorTablas.FormatoTablaProductos(tabla);
            conexion.close();

            }catch(Exception ex){
       
            Mensajes.M1("ERROR NO SE PUEDEN MOSTRAR LOS REGISTROS DE LA TABLA PRODUCTOS"+ex);
        }        
    }
    
    public void InsertarRegistroProductos(MProductos MProduct){
        try{
        ps = conexion.prepareStatement("INSERT INTO productos (codigo,idMarca,caracteristicas,idProveedor,stock,precio,indicador)"+" VALUES (?,?,?,?,?,?,'S');");
        ps.setString(1,MProduct.getCodigo());
        ps.setInt(2,MProduct.getIdmarca());  
        ps.setString(3,MProduct.getCaracteristicas());
        ps.setInt(4,MProduct.getIdproveedor()); 
        ps.setString(5,MProduct.getStock());
        ps.setDouble(6,MProduct.getPrecio());
        ps.executeUpdate();
        ps.close();
        Mensajes.M1("Datos registrados correctamente");  
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede insertar el producto"+ex);
    }   
} 
    public MProductos ConsultarRegistroProductos(int idproduct){
        MProductos MProduct = null;       
        try{
        rs = st.executeQuery("SELECT idproducto,codigo,idmarca,caracteristicas,idproveedor,stock,precio,indicador FROM productos WHERE indicador='S' AND idproducto="+idproduct);
        if(rs.next()){  
            MProduct =  new MProductos();        
            MProduct.setIdproducto(rs.getInt(1));
            MProduct.setCodigo(rs.getString(2));
            MProduct.setIdmarca(rs.getInt(3));
            MProduct.setCaracteristicas(rs.getString(4));
            MProduct.setIdproveedor(rs.getInt(5));
            MProduct.setStock(rs.getString(6)); 
            MProduct.setPrecio(rs.getDouble(7));
            MProduct.setIndicador(rs.getString(8)); 
        }        
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede encontrar el registro en Productos"+ex);
    }
    return MProduct;    
}
    public void ActualizarRegistroProductos(MProductos MProduct){
    try{
        ps = conexion.prepareStatement("UPDATE productos SET codigo = ? , caracteristicas = ? , stock = ?, precio = ? WHERE idproducto=?");
        ps.setString(1,MProduct.getCodigo());
        ps.setString(2,MProduct.getCaracteristicas());
        ps.setString(3,MProduct.getStock());
        ps.setDouble(4,MProduct.getPrecio()); // DECIMAL BD NO STRING DUDA
        ps.setInt(5,MProduct.getIdproducto());
        ps.executeUpdate();
        ps.close();
        Mensajes.M1("Datos actualizados correctamente");
    }catch(Exception ex){
    Mensajes.M1("ERROR no se puede actualizar el registro categorias "+ex);
    }
}
    
    public void InhabilitarRegistroProductos(int idproduct){
    try{
        ps=conexion.prepareStatement("UPDATE productos SET indicador = 'F' WHERE idproducto=?");                              
        ps.setInt(1,idproduct);
        ps.executeUpdate();
        ps.close();
        Mensajes.M1("Datos eliminado de la tabla");
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede inhabilitar el registro de productos"+ex);
    }
}
 
}
