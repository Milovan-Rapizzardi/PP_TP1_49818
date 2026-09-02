import java.util.List;
import java.util.ArrayList;

public class EventoUniversitario {
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEvento;
    private List<Actividad> actividades;
    private Sala sala;


    public EventoUniversitario(String id, String titulo, boolean gratuito, double costoBase) {
        this.id = id;
        this.titulo = titulo;
        this.gratuito = gratuito;
        if(gratuito){
            this.costoBase = 0;
        }else this.costoBase = costoBase;
        cantidadEvento++;
        this.actividades = new ArrayList<>();

    }

    public EventoUniversitario (EventoUniversitario otroEvento){
        this.id = otroEvento.id + " 'Es una copia'";
        this.titulo = otroEvento.titulo;
        this.costoBase = otroEvento.costoBase;
        this.gratuito = otroEvento.gratuito;
        cantidadEvento++;
        this.actividades = new ArrayList<>();

    }

    public void crearActividad (int id, String titulo, int cupo){
        Actividad nuevaActividad = new Actividad(id, titulo, cupo);
        this.actividades.add(nuevaActividad);

    }

//No sa que pide calcular todavia
    /*public double calcaularCostoEstimado (double precio){

    }*/

    public void asignarSala (Sala sala){
        this.sala = sala;
    }



   public void mostarDatos (){
        System.out.println("Id: "+ id
                + "\nTitulo: " + titulo
                + "\nPrecio de ingreso: " + costoBase+"\n");

   }

   public void mostrarSala(){
       System.out.println("Sala del evento: " + sala.getNombre()+
               "\n-----------------------------------\n" );
   }

    public static int getCantidadEventos() {
        return cantidadEvento;
    }

}
