 import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = null;
        boolean salir = false;

        while (!salir) {
            String menu = """
                === MENÚ PRINCIPAL ===
                1. Crear usuario
                2. Crear rutina
                3. Agregar ejercicio básico
                4. Agregar ejercicio avanzado
                5. Ver rutina
                6. Ver progreso
                7. Ver actividad GitHub
                8. Salir
                """;
            String opcion = JOptionPane.showInputDialog(menu);

            if (opcion == null) break;

            switch (opcion) {
                case "1":
                    String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
                    String objetivo = JOptionPane.showInputDialog("Ingrese su objetivo (bajar peso, ganar masa, etc):");
                    usuario = new Usuario(nombre, edad, objetivo);
                    JOptionPane.showMessageDialog(null, "Usuario creado con éxito.");
                    break;

                case "2":
                    if (usuario == null) {
                        JOptionPane.showMessageDialog(null, "Primero cree un usuario.");
                    } else {
                        String nomRutina = JOptionPane.showInputDialog("Nombre de la rutina:");
                        usuario.crearRutina(nomRutina);
                        JOptionPane.showMessageDialog(null, "Rutina creada correctamente.");
                    }
                    break;

                case "3":
                    if (usuario == null) {
                        JOptionPane.showMessageDialog(null, "Primero cree un usuario.");
                    } else {
                        String nomE = JOptionPane.showInputDialog("Nombre del ejercicio:");
                        String tipoE = JOptionPane.showInputDialog("Tipo de ejercicio:");
                        int durE = Integer.parseInt(JOptionPane.showInputDialog("Duración (minutos):"));
                        usuario.agregarEjercicio(new Ejercicio(nomE, tipoE, durE));
                        JOptionPane.showMessageDialog(null, "Ejercicio agregado a la rutina.");
                    }
                    break;

                case "4":
                    if (usuario == null) {
                        JOptionPane.showMessageDialog(null, "Primero cree un usuario.");
                    } else {
                        String nomEA = JOptionPane.showInputDialog("Nombre del ejercicio avanzado:");
                        String tipoEA = JOptionPane.showInputDialog("Tipo:");
                        int durEA = Integer.parseInt(JOptionPane.showInputDialog("Duración (minutos):"));
                        int difEA = Integer.parseInt(JOptionPane.showInputDialog("Nivel de dificultad (1-5):"));
                        String zona = JOptionPane.showInputDialog("Zona muscular trabajada:");
                        usuario.agregarEjercicio(new EjercicioAvanzado(nomEA, tipoEA, durEA, difEA, zona));
                        JOptionPane.showMessageDialog(null, "Ejercicio avanzado agregado.");
                    }
                    break;

                case "5":
                    if (usuario != null) {
                        JOptionPane.showMessageDialog(null, usuario.verRutina());
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe crear un usuario primero.");
                    }
                    break;

                case "6":
                    if (usuario != null) {
                        JOptionPane.showMessageDialog(null, usuario.progreso());
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe crear un usuario primero.");
                    }
                    break;

                case "7":
                    if (usuario != null) {
                        JOptionPane.showMessageDialog(null, usuario.verActividadGitHub());
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe crear un usuario primero.");
                    }
                    break;

                case "8":
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema. ¡Hasta luego!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}


