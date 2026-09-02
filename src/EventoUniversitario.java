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

    public void crearActividad (String tipo, int id, String titulo, int cupo, String disertante, boolean requiereNotebook){
            Actividad nuevaActividad;

        if (tipo.equalsIgnoreCase("Charla")) {
            nuevaActividad = new Charla(id, titulo, cupo, disertante);
        } else if (tipo.equalsIgnoreCase("Taller")) {
            nuevaActividad = new Taller(id, titulo, cupo, requiereNotebook);
        } else {
            System.out.println("Tipo de actividad no válido: " + tipo);
            return;
        }
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

    public double calcularCostoEstimado() {
        if (this.gratuito) {
            return 0;
        }

        double costoActividades = 0;
        for (Actividad a : actividades) {
            costoActividades += a.calcularCostoMateriales();
        }

        return (this.costoBase + costoActividades) * 1.21;
    }

    public void asignarSala (Sala sala){
        this.sala = sala;
    }


    public void mostarDatos() {
        System.out.println("===================================");
        System.out.println("Id: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Precio de ingreso: " + costoBase);
        System.out.println("Costo estimado: $" + calcularCostoEstimado());

        if (sala != null) {
            System.out.println("Sala: " + sala.getNombre());
        } else {
            System.out.println("Sala: (sin asignar)");
        }

        System.out.println("\nActividades:");
        for (Actividad a : actividades) {
            a.mostrarIdentificacion();
            a.mostrarInscripcion();
        }
        System.out.println("===================================\n");
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }

}
