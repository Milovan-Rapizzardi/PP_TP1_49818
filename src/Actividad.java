public class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int CUPO_MINIMO = 5;

    /*public Incripcion (Estudiante estudiante){

    }*/

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
    }

    public void mostrarInscripcion(){
        System.out.println("Id de la actividad: "+ id
        +  "\nNombre: "+ titulo
        + "\nCupo maximo: "+ cupoMaximo
        +"\nCupo minimo: "+ CUPO_MINIMO);
    }


}
