import java.util.List;
import java.util.ArrayList;

public class EventoUniversitario {
    public final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEvento;
    public List<Actividad> actividades;

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
//Revisar el contexto de este evento
    /*public double calcaularCostoEstimado (double precio){
        return precio = costoBase + cantidadEvento;
    }*/

    /*public void asignarSala (Sala sala){

    }*/

    public void crearActividad (int id, String titulo, int cupo){
        Actividad actividad1 = new Actividad(2154,"1ra actividad",60);
        this.actividades.add(actividad1);
    }

   public void mostarDatos (){
        System.out.println("Id: "+ id
                + "\nTitulo: " + titulo
                + "\nPrecio de ingreso: " + costoBase + "\n");
   }

    public static int getCantidadEvento() {
        return cantidadEvento;
    }

}
