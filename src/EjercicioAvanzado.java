// Clase que hereda de Ejercicio e incluye nivel de dificultad
public class EjercicioAvanzado extends Ejercicio {
    private String nivelDificultad;

    public EjercicioAvanzado(String nombre, String grupoMuscular, int repeticiones, String nivelDificultad) {
        super(nombre, grupoMuscular, repeticiones);
        this.nivelDificultad = nivelDificultad;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Ejercicio Avanzado: " + nombre + 
            " | Grupo muscular: " + grupoMuscular + 
            " | Repeticiones: " + repeticiones + 
            " | Dificultad: " + nivelDificultad);
    }
}



