import java.time.LocalDate;

public class Inscripcion {
    private LocalDate fecha;
    private String estado;
    private Estudiante estudiante;


    public Inscripcion(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.fecha = LocalDate.now();
        this.estado = estado;
    }
}
