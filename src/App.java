public class App {
    public static void main(String[] args) {

        Estudiante juan = new Estudiante("48525","Juan");
        EventoUniversitario tallerPreparacionFinales = new EventoUniversitario("12532ded54", "Taller de preparacion de finales", true, 5000);
        Actividad metodoCornell = new Actividad(5156,"Ayuda Metodo Cornel",90);

        //tallerPreparacionFinales.mostarDatos();
        //tallerPreparacionFinales.crearActividad(25155,"Primer Actividad",150);


        Sala salonPrincipal = new Sala(2515,"Salon Principal");
        tallerPreparacionFinales.asignarSala(salonPrincipal);
        tallerPreparacionFinales.mostrarSala();

        EventoUniversitario charlaDeDecano = new EventoUniversitario("1512565def5", "Charla del decano", false, 1500);
        charlaDeDecano.mostarDatos();


        EventoUniversitario copiaDelTaller = new EventoUniversitario(tallerPreparacionFinales);
        copiaDelTaller.mostarDatos();
        copiaDelTaller.asignarSala(salonPrincipal);
        copiaDelTaller.mostrarSala();


        System.out.println("Cantidad de eventos disponible: "+ EventoUniversitario.getCantidadEventos());

        Estudiante primerEstudiante = new Estudiante("49818", "Milovan");


    }
}