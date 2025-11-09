import java.util.ArrayList;
import javax.swing.JOptionPane;

// Clase que representa una rutina de ejercicios para un usuario
public class Rutina {
    private String nombreRutina;
    private ArrayList<Ejercicio> ejercicios;

    public Rutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
        this.ejercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        ejercicios.add(ejercicio);
    }

    public void mostrarRutina() {
        StringBuilder sb = new StringBuilder("Rutina: " + nombreRutina + "\n");
        for (Ejercicio e : ejercicios) {
            if (e instanceof EjercicioAvanzado) {
                EjercicioAvanzado ea = (EjercicioAvanzado) e;
                sb.append("• ").append(ea.getNombre())
                  .append(" | ").append(ea.getGrupoMuscular())
                  .append(" | Reps: ").append(ea.getRepeticiones())
                  .append(" | Dificultad: ").append(ea.getNivelDificultad())
                  .append("\n");
            } else {
                sb.append("• ").append(e.getNombre())
                  .append(" | ").append(e.getGrupoMuscular())
                  .append(" | Reps: ").append(e.getRepeticiones())
                  .append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}



