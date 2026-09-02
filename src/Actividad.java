import java.util.ArrayList;
import java.util.List;

public class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int CUPO_MINIMO = 1;
    private List<Inscripcion> inscripciones;


    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<>();
    }


    public Inscripcion inscribir (Estudiante estudiante){
        if(inscripciones.size() >= cupoMaximo) {
            return null;
        }
        Inscripcion nuevaInscripcion = new Inscripcion(estudiante);
        this.inscripciones.add(nuevaInscripcion);
        return nuevaInscripcion;
    }

    public void mostrarInscripcion(){
        System.out.println("-----------------------------------");
        System.out.println("Id de la actividad: " + id);
        System.out.println("Nombre: " + titulo);
        System.out.println("Cupo maximo: " + cupoMaximo);
        System.out.println("Cupo minimo: " + CUPO_MINIMO);

        System.out.println("Inscripciones:");
        for (Inscripcion i : inscripciones) {
            i.mostrarDatosAlumno(); // ← cada inscripción también se muestra a sí misma
        }
    }

    public int getId() {
        return id;
    }
}
