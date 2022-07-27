package DAO;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import Formato.Mensajes;
import Formato.ManejadorTablas;
import Modelo.MUsuarios;

public class CRUDUsuarios extends Conexion{

    public CRUDUsuarios() {
        
    }
    
    public void MostrarUsuariosEnTabla(JTable tabla,JLabel etiqueta){
        String titulos[]={"ID","Codigo","Nombres","Correo","Contraseña"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        int numeracion = 0;    
        try{
            rs = st.executeQuery("SELECT idusuario,codigo,nombre,correo,contraseña,indicador FROM usuarios WHERE indicador = 'S'");
            while(rs.next()){
                numeracion++;
                MUsuarios MUsuar = new MUsuarios();
                MUsuar.setIdusuario(rs.getInt(1));
                MUsuar.setCodigo(rs.getString(2));
                MUsuar.setNombre(rs.getString(3));
                MUsuar.setCorreo(rs.getString(4));
                MUsuar.setContraseña(rs.getString(5));
                modelo.addRow(MUsuar.RegistroUsuarios());
            }
            
            etiqueta.setText("NUMERO DE USUARIOS REGISTRADOS: " +numeracion);
           
            ManejadorTablas.FormatoTablaUsuarios(tabla);

            conexion.close();
            
            }catch(Exception ex){
            Mensajes.M1("ERROR no se pueden mostrar los registros de la tabla Usuarios"+ex);
        }        
    }
    public void InsertarRegistroUsuarios(MUsuarios MUsuar){
        try{
        ps = conexion.prepareStatement("INSERT INTO usuarios (codigo,nombre,correo,contraseña,indicador) VALUES (?,?,?,?,'S');");
        ps.setString(1,MUsuar.getCodigo());
        ps.setString(2,MUsuar.getNombre());
        ps.setString(3,MUsuar.getCorreo());
        ps.setString(4,MUsuar.getContraseña());
        ps.executeUpdate();
        Mensajes.M1("Datos registrados correctamente");  
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede insertar el registro"+ex);
    } 
}        

    public MUsuarios ValidarUsuarios(int idusuar){
        MUsuarios MUsuar = null;       
        try{
        rs = st.executeQuery("SELECT codigo,contraseña FROM usuarios WHERE codigo = '" + MUsuar.getCodigo()+ "' and contraseña= '" + MUsuar.getContraseña()+ "'");
        if(rs.next()){           
            MUsuar =  new MUsuarios();
            MUsuar.setCodigo(rs.getString(1));
            MUsuar.setContraseña(rs.getString(2));       
        }        
    }catch(Exception ex){
        Mensajes.M1("ERROR NO SE PUEDE VALIDAR EL USUARIO"+ex);
    }
    return MUsuar;
}
    public MUsuarios ConsultarRegistroUsuarios(int idusuar){
        MUsuarios MUsuar = null;       
        try{
        rs = st.executeQuery("SELECT idusuario,codigo,nombre,correo,contraseña,indicador FROM usuarios WHERE indicador='S' AND idusuario="+idusuar);
        if(rs.next()){           
            MUsuar =  new MUsuarios();
            MUsuar.setIdusuario(rs.getInt(1));
            MUsuar.setCodigo(rs.getString(2));
            MUsuar.setNombre(rs.getString(3));
            MUsuar.setCorreo(rs.getString(4));
            MUsuar.setContraseña(rs.getString(5));
            MUsuar.setIndicador(rs.getString(6));        
        }        
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede encontrar el registro en Usuarios"+ex);
    }
    return MUsuar;
}
    public void ActualizarRegistroUsuarios(MUsuarios MUsuar){
    try{
        ps = conexion.prepareStatement("UPDATE usuarios SET codigo = ? , nombre = ? , correo = ? , contraseña = ? WHERE idusuario=?");
        ps.setString(1,MUsuar.getCodigo());
        ps.setString(2,MUsuar.getNombre());
        ps.setString(3,MUsuar.getCorreo());
        ps.setString(4,MUsuar.getContraseña());
        ps.setInt(5,MUsuar.getIdusuario());
        ps.executeUpdate();
        ps.close();
        Mensajes.M1("Datos actualizados correctamente");
    }catch(Exception ex){
    Mensajes.M1("ERROR no se puede actualizar el registro Usuarios"+ex);
    }
}
    public void InhabilitarRegistroUsuarios(int idusuar){
    try{
        ps=conexion.prepareStatement("UPDATE usuarios SET indicador = 'F' WHERE idusuario=?");                              
        ps.setInt(1,idusuar);
        ps.executeUpdate();
        ps.close();
        Mensajes.M1("Datos eliminado de la tabla");
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede inhabilitar el registro de marcas"+ex);
    }
}

}
    
 