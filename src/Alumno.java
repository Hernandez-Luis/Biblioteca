public class Alumno {
    private String  nombreAlumno;
    private String apellidoAlumno;
    private int edadAlumno;
    private String semestreAlumno;
    private String matricula;
    private String carrera;
    private int cantLibro;

    public Alumno(String nombreAlumno, String apellidoAlumno, int edadAlumno, String semestreAlumno, String matricula, String carrera,int cantLibro) {
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.edadAlumno = edadAlumno;
        this.semestreAlumno = semestreAlumno;
        this.matricula = matricula;
        this.carrera = carrera;
        this.cantLibro = cantLibro;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public int getEdadAlumno() {
        return edadAlumno;
    }

    public String getSemestreAlumno() {
        return semestreAlumno;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getCantLibro(){
        return cantLibro;
    }

    public void setCantLibro(int cantLibro) {
        this.cantLibro = cantLibro;
    }
}
