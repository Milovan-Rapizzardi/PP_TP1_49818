public class App {
    public static void main(String[] args) {

        Estudiante Juan = new Estudiante("48714","Juan");
        Estudiante Marcelo = new Estudiante("50895","Marcelo");
        Estudiante Raul = new Estudiante("35982","Raul");

//Evento de feria de estudio, posee 2 actividades.

        EventoUniversitario feriaUniversitaria = new EventoUniversitario("25185dew4","Feria Universitaria",true,5000);

        Sala auditorio = new Sala(4852,"Auditorio");
        feriaUniversitaria.asignarSala(auditorio);

        feriaUniversitaria.crearActividad(4565,"Taller de Matematicas",120);
        feriaUniversitaria.crearActividad(6959,"Taller de Ingles",90);

        Actividad tallerMates = feriaUniversitaria.buscarActividadId(4565);
        Actividad tallerIngles = feriaUniversitaria.buscarActividadId(6959);

        tallerMates.inscribir(Juan);
        tallerMates.inscribir(Raul);
        tallerIngles.inscribir(Marcelo);

//Constructor de copia y cantidad de eventos
        EventoUniversitario segundaFeriauniversitaria = new EventoUniversitario(feriaUniversitaria);

        System.out.println("///////////////////////\n"+
                "Cantidad de Eventos: "+ EventoUniversitario.getCantidadEventos());

//Mostrar resumen

        feriaUniversitaria.mostarDatos();
        segundaFeriauniversitaria.mostarDatos();


    }
}