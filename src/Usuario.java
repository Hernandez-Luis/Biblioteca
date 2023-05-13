public class Usuario {
    private int numeroUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private int edadUsuario;
    private String direccionUsuario;
    private int telefono;
    private String correo;
    private String tipo;

    public Usuario(int numeroUsuario, String nombreUsuario, String apellidoUsuario, int edadUsuario, String direccionUsuario, int telefono, String correo,String tipo) {
        this.numeroUsuario = numeroUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.edadUsuario = edadUsuario;
        this.direccionUsuario = direccionUsuario;
        this.telefono = telefono;
        this.correo = correo;
        this.tipo = tipo;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public int getEdadUsuario() {
        return edadUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
    public String getTipo(){
        return tipo;
    }
}
