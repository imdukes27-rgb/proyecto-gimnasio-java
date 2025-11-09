// Clase base que representa un ejercicio general en el gimnasio
public class Ejercicio {
    protected String nombre;
    protected String grupoMuscular;
    protected int repeticiones;

    public Ejercicio(String nombre, String grupoMuscular, int repeticiones) {
        this.nombre = nombre;
        this.grupoMuscular = grupoMuscular;
        this.repeticiones = repeticiones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void mostrarInfo() {
        System.out.println("Ejercicio: " + nombre + " | Grupo muscular: " + grupoMuscular + " | Repeticiones: " + repeticiones);
    }
}




