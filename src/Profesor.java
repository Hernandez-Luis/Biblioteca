public class Profesor {
private String  nombreProfesor;
private String apellidoProfesor;
private int edadProfesor;
private String instituto;
private String areaAdscripcion;
private int cantLibro;
private String nombreLibro;

    public Profesor(String nombreProfesor, String apellidoProfesor, int edadProfesor, String instituto, String areaAdscripcion,int cantLibro,String nombreLibro) {
        this.nombreProfesor = nombreProfesor;
        this.apellidoProfesor = apellidoProfesor;
        this.edadProfesor = edadProfesor;
        this.instituto = instituto;
        this.areaAdscripcion = areaAdscripcion;
        this.cantLibro = cantLibro;
        this.nombreLibro = nombreLibro;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public String getApellidoProfesor() {
        return apellidoProfesor;
    }

    public int getEdadProfesor() {
        return edadProfesor;
    }

    public String getInstituto() {
        return instituto;
    }

    public String getAreaAdscripcion() {
        return areaAdscripcion;
    }

    public int getCantLibro(){
        return cantLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setCantLibro(int cantLibro) {
        this.cantLibro = cantLibro;
    }
}
