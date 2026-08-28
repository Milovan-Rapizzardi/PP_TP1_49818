public class EventoUniversitario {
    public final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEvento;

    public EventoUniversitario(String id, String titulo, boolean gratuito, double costoBase) {
        this.id = id;
        this.titulo = titulo;
        this.gratuito = gratuito;
        if(gratuito){
            this.costoBase = 0;
        }else this.costoBase = costoBase;
        cantidadEvento++;
    }

    public EventoUniversitario (EventoUniversitario otroEvento){
        this.id = otroEvento.id + " 'Es una copia'";
        this.titulo = otroEvento.titulo;
        this.costoBase = otroEvento.costoBase;
        this.gratuito = otroEvento.gratuito;
        cantidadEvento++;
    }
//Revisar el contexto de este evento
    /*public double calcaularCostoEstimado (double precio){
        return precio = costoBase + cantidadEvento;
    }*/

    /*public void asignarSala (Sala sala){

    }*/

    public void crearActividad (int id, String titulo, int cupo){
 //Agregar funcionalidad
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
