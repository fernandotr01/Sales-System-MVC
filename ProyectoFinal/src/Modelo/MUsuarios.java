package Modelo;

public class MUsuarios {
    
    private int idusuario;
    private String codigo;
    private String nombre;
    private String correo;
    private String contraseña;
    private String indicador;

    public MUsuarios() {
        this.codigo = "";
        this.contraseña = "";
        
    }
    
    public Object[] RegistroUsuarios(){
        Object[] fila =  {idusuario,codigo,nombre,correo,contraseña};
        return fila;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }
    
}
