 import javax.swing.JOptionPane;

// Clase principal que ejecuta todo el programa Fidness
public class Main {
    public static void main(String[] args) {
        Usuario usuario = null;
        Rutina rutina = null;

        int opcion;
        do {
            String menu = """
                💪 Bienvenido a Fidness - Tu asistente de gimnasio

                1️⃣ Registrar usuario
                2️⃣ Crear rutina
                3️⃣ Agregar ejercicio a rutina
                4️⃣ Mostrar información del usuario
                5️⃣ Mostrar rutina completa
                6️⃣ Salir
                """;

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del usuario:"));
                    String objetivo = JOptionPane.showInputDialog("Ingrese el objetivo del usuario (bajar grasa, ganar masa, etc.):");
                    usuario = new Usuario(nombre, edad, objetivo);
                    JOptionPane.showMessageDialog(null, "✅ Usuario registrado correctamente.");
                    break;

                case 2:
                    if (usuario == null) {
                        JOptionPane.showMessageDialog(null, "Primero debe registrar un usuario.");
                    } else {
                        String nombreRutina = JOptionPane.showInputDialog("Ingrese el nombre de la rutina:");
                        rutina = new Rutina(nombreRutina);
                        usuario.asignarRutina(rutina);
                        JOptionPane.showMessageDialog(null, "🏋️ Rutina creada y asignada al usuario.");
                    }
                    break;

                case 3:
                    if (rutina == null) {
                        JOptionPane.showMessageDialog(null, "Debe crear una rutina primero.");
                    } else {
                        String nombreEj = JOptionPane.showInputDialog("Nombre del ejercicio:");
                        String grupo = JOptionPane.showInputDialog("Grupo muscular trabajado:");
                        int rep = Integer.parseInt(JOptionPane.showInputDialog("Número de repeticiones:"));
                        int tipo = Integer.parseInt(JOptionPane.showInputDialog("1️⃣ Ejercicio normal\n2️⃣ Ejercicio avanzado"));

                        if (tipo == 2) {
                            String nivel = JOptionPane.showInputDialog("Nivel de dificultad (Bajo, Medio, Alto):");
                            rutina.agregarEjercicio(new EjercicioAvanzado(nombreEj, grupo, rep, nivel));
                        } else {
                            rutina.agregarEjercicio(new Ejercicio(nombreEj, grupo, rep));
                        }
                        JOptionPane.showMessageDialog(null, "💪 Ejercicio agregado a la rutina.");
                    }
                    break;

                case 4:
                    if (usuario == null) {
                        JOptionPane.showMessageDialog(null, "Debe registrar un usuario primero.");
                    } else {
                        usuario.mostrarInfo();
                    }
                    break;

                case 5:
                    if (usuario == null) {
                        JOptionPane.showMessageDialog(null, "Debe registrar un usuario primero.");
                    } else {
                        usuario.mostrarRutina();
                    }
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "👋 Gracias por usar Fidness. ¡Hasta la próxima!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "❌ Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 6);
    }
}



