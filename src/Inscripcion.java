import java.time.LocalDate;

public class Inscripcion {
    private LocalDate fecha;
    private String estado;
    private Estudiante estudiante;


    public Inscripcion(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.fecha = LocalDate.now();
        this.estado = "ACTIVO";
    }

    public void mostrarDatosAlumno(){
        System.out.println("Estudiante: " + estudiante.getNombre()
                + " - Fecha: " + fecha
                + " - Estado: " + estado);
    }
}
