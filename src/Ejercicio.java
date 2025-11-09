public class Ejercicio {
    protected String nombre;
    protected String tipo; // cardio, fuerza, etc.
    protected int duracion; // en minutos

    public Ejercicio(String nombre, String tipo, int duracion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String mostrarInfo() {
        return "Ejercicio: " + nombre + "\nTipo: " + tipo + "\nDuración: " + duracion + " minutos";
    }
}


