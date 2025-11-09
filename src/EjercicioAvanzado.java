public class EjercicioAvanzado extends Ejercicio {
    private int nivelDificultad; // 1 a 5
    private String zonaMuscular;

    public EjercicioAvanzado(String nombre, String tipo, int duracion, int nivelDificultad, String zonaMuscular) {
        super(nombre, tipo, duracion);
        this.nivelDificultad = nivelDificultad;
        this.zonaMuscular = zonaMuscular;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public String getZonaMuscular() {
        return zonaMuscular;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + "\nNivel de dificultad: " + nivelDificultad + 
               "\nZona muscular: " + zonaMuscular;
    }
}


