import java.util.ArrayList;

public class Rutina {
    private String nombreRutina;
    private ArrayList<Ejercicio> ejercicios;

    public Rutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
        this.ejercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio e) {
        ejercicios.add(e);
    }

    public String mostrarRutina() {
        if (ejercicios.isEmpty()) {
            return "La rutina no tiene ejercicios aún.";
        }
        StringBuilder sb = new StringBuilder("Rutina: " + nombreRutina + "\n");
        for (Ejercicio e : ejercicios) {
            sb.append("--------------------\n").append(e.mostrarInfo()).append("\n");
        }
        return sb.toString();
    }

    public int calcularDuracionTotal() {
        int total = 0;
        for (Ejercicio e : ejercicios) {
            total += e.getDuracion();
        }
        return total;
    }

    public int cantidadEjercicios() {
        return ejercicios.size();
    }
}


