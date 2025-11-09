public class Usuario {
    private String nombre;
    private int edad;
    private String objetivo; // perder peso, ganar masa, mantener forma
    private Rutina rutinaPersonal;
    private int commits; // simulación GitHub
    private int pulls;   // simulación GitHub

    public Usuario(String nombre, int edad, String objetivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.objetivo = objetivo;
        this.commits = 0;
        this.pulls = 0;
    }

    public void crearRutina(String nombreRutina) {
        rutinaPersonal = new Rutina(nombreRutina);
        registrarCommit("Creación de rutina: " + nombreRutina);
    }

    public void agregarEjercicio(Ejercicio e) {
        if (rutinaPersonal != null) {
            rutinaPersonal.agregarEjercicio(e);
            registrarCommit("Ejercicio agregado: " + e.getNombre());
        }
    }

    public String verRutina() {
        if (rutinaPersonal == null) {
            return "No se ha creado una rutina.";
        }
        registrarCommit("Visualización de rutina");
        return rutinaPersonal.mostrarRutina();
    }

    public String progreso() {
        if (rutinaPersonal == null) {
            return "Crea una rutina para comenzar tu progreso.";
        }
        int total = rutinaPersonal.calcularDuracionTotal();
        registrarCommit("Consulta de progreso");
        return "Has completado " + rutinaPersonal.cantidadEjercicios() + " ejercicios.\nDuración total: " + total + " minutos.";
    }

    // Simulación de GitHub
    public void registrarCommit(String mensaje) {
        commits++;
        if (commits % 3 == 0) { // cada 3 commits = 1 pull
            pulls++;
        }
    }

    public String verActividadGitHub() {
        return "Commits realizados: " + commits + "\nPulls realizados: " + pulls;
    }
}


