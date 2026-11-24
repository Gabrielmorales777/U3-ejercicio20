public class Main {

    public static void main(String[] args) {

        ControlAforo evento = new ControlAforo(5);

        System.out.println("=== Estado inicial ===");
        System.out.println(evento.obtenerEstado());

        System.out.println("\n=== Ingresos masivos (8 personas para 5 lugares) ===");
        int admitidos = 0;
        int rechazados = 0;
        for (int persona = 1; persona <= 8; persona++) {
            System.out.print("Persona " + persona + ": ");
            if (evento.registrarIngreso()) {
                admitidos++;
            } else {
                rechazados++;
            }
        }
        System.out.println("Admitidos: " + admitidos + " | Rechazados: " + rechazados);
        System.out.println(evento.obtenerEstado());

        System.out.println("\n=== Salidas e ingreso posterior ===");
        evento.registrarSalida();
        evento.registrarSalida();
        evento.registrarIngreso();
        System.out.println(evento.obtenerEstado());

        System.out.println("\n=== Salidas que superan a los presentes ===");
        for (int salida = 1; salida <= 6; salida++) {
            evento.registrarSalida();
        }

        System.out.println("\n=== Estado final ===");
        System.out.println(evento.obtenerEstado());
        System.out.println("Asistentes consultados con getter: " + evento.getAsistentesActuales());
    }
}