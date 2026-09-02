public class App {
    public static void main(String[] args) {

        Estudiante Juan = new Estudiante("48714","Juan");
        Estudiante Marcelo = new Estudiante("50895","Marcelo");
        Estudiante Raul = new Estudiante("35982","Raul");

        EventoUniversitario feriaUniversitaria = new EventoUniversitario("25185dew4","Feria Universitaria",true,5000);

        Sala auditorio = new Sala(4852,"Auditorio");
        feriaUniversitaria.asignarSala(auditorio);


        feriaUniversitaria.crearActividad("Taller", 4565, "Taller de Matematicas", 120, null, true);
        feriaUniversitaria.crearActividad("Charla", 6959, "Charla de Ingles", 90, null, false);

        Actividad tallerMates = feriaUniversitaria.buscarActividadId(4565);
        Actividad charlaIngles = feriaUniversitaria.buscarActividadId(6959);

        tallerMates.inscribir(Juan);
        tallerMates.inscribir(Raul);
        charlaIngles.inscribir(Marcelo);

        EventoUniversitario segundaFeriauniversitaria = new EventoUniversitario(feriaUniversitaria);

        System.out.println("///////////////////////\n"+
                "Cantidad de Eventos: "+ EventoUniversitario.getCantidadEventos());

        feriaUniversitaria.mostarDatos();
        segundaFeriauniversitaria.mostarDatos();
    }
}