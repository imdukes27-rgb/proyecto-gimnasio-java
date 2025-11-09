import javax.swing.JOptionPane;

// Clase que representa un usuario del gimnasio
public class Usuario {
    private String nombre;
    private int edad;
    private String objetivo;
    private Rutina rutina;

    public Usuario(String nombre, int edad, String objetivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.objetivo = objetivo;
        this.rutina = null;
    }

    public void asignarRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public void mostrarInfo() {
        String info = "Nombre: " + nombre +
                      "\nEdad: " + edad +
                      "\nObjetivo: " + objetivo;
        JOptionPane.showMessageDialog(null, info);
    }

    public void mostrarRutina() {
        if (rutina != null) {
            rutina.mostrarRutina();
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no tiene una rutina asignada.");
        }
    }
}



