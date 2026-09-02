import java.util.List;
import java.util.ArrayList;

public class EventoUniversitario {
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;
    private List<Actividad> actividades;
    private Sala sala;


    public EventoUniversitario(String id, String titulo, boolean gratuito, double costoBase) {
        this.id = id;
        this.titulo = titulo;
        this.gratuito = gratuito;
        if(gratuito){
            this.costoBase = 0;
        }else this.costoBase = costoBase;
        cantidadEventos++;
        this.actividades = new ArrayList<>();

    }

    public EventoUniversitario (EventoUniversitario otroEvento){
        this.id = otroEvento.id + " 'Es una copia'";
        this.titulo = otroEvento.titulo;
        this.costoBase = otroEvento.costoBase;
        this.gratuito = otroEvento.gratuito;
        cantidadEventos++;
        this.actividades = new ArrayList<>();

    }

    public void crearActividad (int id, String titulo, int cupo){
            Actividad nuevaActividad = new Actividad(id, titulo, cupo);
            this.actividades.add(nuevaActividad);
    }

//Metodo para vincular estudiantes con las actividades creadas
    public Actividad buscarActividadId (int id){
        for(Actividad a : actividades){
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }

//No sa que pide calcular todavia
    /*public double calcaularCostoEstimado (double precio){

    }*/

    public void asignarSala (Sala sala){
        this.sala = sala;
    }


    public void mostarDatos() {
        System.out.println("===================================");
        System.out.println("Id: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Precio de ingreso: " + costoBase);

//Muestra la sala asignada
        if (sala != null) {
            System.out.println("Sala: " + sala.getNombre());
        } else {
            System.out.println("Sin sala asignada");
        }

//Muestra la actividad
        System.out.println("\nActividades:");
        for (Actividad a : actividades) {
            a.mostrarInscripcion();
        }
        System.out.println("===================================\n");
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }

}
