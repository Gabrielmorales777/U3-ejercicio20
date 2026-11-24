public class ControlAforo {

    private final int capacidadMaxima;
    private int asistentesActuales;

    public ControlAforo(int capacidadMaxima) {
        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException("La capacidad máxima debe ser mayor a 0.");
        }
        this.capacidadMaxima = capacidadMaxima;
        this.asistentesActuales = 0;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getAsistentesActuales() {
        return asistentesActuales;
    }

    public int getLugaresDisponibles() {
        return capacidadMaxima - asistentesActuales;
    }

    public boolean estaCompleto() {
        return asistentesActuales == capacidadMaxima;
    }

    public boolean registrarIngreso() {
        if (asistentesActuales >= capacidadMaxima) {
            System.out.println("Ingreso rechazado: aforo completo (" + asistentesActuales + "/" + capacidadMaxima + ").");
            return false;
        }
        asistentesActuales++;
        System.out.println("Ingreso registrado. Asistentes: " + asistentesActuales + "/" + capacidadMaxima + ".");
        return true;
    }

    public boolean registrarSalida() {
        if (asistentesActuales == 0) {
            System.out.println("Salida rechazada: no hay asistentes dentro del evento.");
            return false;
        }
        asistentesActuales--;
        System.out.println("Salida registrada. Asistentes: " + asistentesActuales + "/" + capacidadMaxima + ".");
        return true;
    }

    public String obtenerEstado() {
        return "Aforo: " + asistentesActuales + "/" + capacidadMaxima
                + " | Lugares disponibles: " + getLugaresDisponibles()
                + " | " + (estaCompleto() ? "COMPLETO" : "Con lugar");
    }
}