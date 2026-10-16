
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Cine cine = new Cine("CinePlus", 90098001, "Armenia, Quindío");

        int opcion = 0;

        while (opcion != 9) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                ================ CINEPLUS ================
                1. Registrar película
                2. Registrar cliente
                3. Registrar operario
                4. Programar función cinematográfica
                5. Realizar venta de boletas
                6. Calcular valor total de una venta
                7. Calcular porcentaje de ocupación de una función
                8. Buscar películas disponibles
                9. Revisar ingresos generados por funciones
                10. Ver detalle de boletas de un cliente
                11. Salir
                Seleccione una opción:
                """));

            if (opcion == 1) {
                int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el código de la película:"));
                String titulo = JOptionPane.showInputDialog(null, "Ingrese el título de la película:");
                int duracion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la duración en minutos:"));
                String generoStr = JOptionPane.showInputDialog(null, """
                    Ingrese el género de la película:
                    ACCION
                    COMEDIA
                    DRAMA
                    TERROR
                    ANIMACION
                    """);
                GENERO generoEnum = GENERO.valueOf(generoStr.toUpperCase().trim());
                String clasificacion = JOptionPane.showInputDialog(null, "Ingrese la clasificación por edad:");

                Pelicula pelicula = new Pelicula (codigo,titulo,duracion, generoEnum,clasificacion);
                boolean exito = cine.registrarPelicula(pelicula);

                if (exito) {
                    JOptionPane.showMessageDialog(null, "Película registrada exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Ya existe una película con ese código.");
                }

            } else if (opcion == 2) {
                int documento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el documento de identidad:"));
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre completo del cliente:");
                String correo = JOptionPane.showInputDialog(null, "Ingrese el correo electrónico:");
                String telefono = JOptionPane.showInputDialog(null, "Ingrese el número de teléfono:");
                int codigoAfiliacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de afiliación:"));
                double Descuento = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el porcentaje de descuento (0 a 100):"));

                Cliente cliente = new Cliente(documento, nombre, correo, telefono, codigoAfiliacion, Descuento);
                boolean exito = cine.registrarCliente(cliente);

                if (exito) {
                    JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Ya existe un cliente con ese documento.");
                }

            } else if (opcion == 3) {
                int documento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el documento del operario:"));
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre completo del operario:");
                String correo = JOptionPane.showInputDialog(null, "Ingrese el correo electrónico:");
                String telefono = JOptionPane.showInputDialog(null, "Ingrese el número de teléfono:");
                int codigoEmpleado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de empleado:"));
                String fechaContratacion = JOptionPane.showInputDialog(null, "Ingrese la fecha de contratación (AAAA-MM-DD):");
                double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario básico:"));

                Operario operario = new Operario(documento, nombre, correo, telefono, codigoEmpleado, fechaContratacion, salario);
                boolean exito = cine.registrarOperario(operario);

                if (exito) {
                    JOptionPane.showMessageDialog(null, "Operario registrado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Ya existe un operario con ese documento.");
                }

            } else if (opcion == 4) {
                int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la película:"));
                Pelicula pelicula = cine.buscarPelicula(codigo);

                if (pelicula != null) {
                    int codFuncion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la función:"));
                    String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha de presentación (AAAA-MM-DD):");
                    String hora = JOptionPane.showInputDialog(null, "Ingrese la hora de inicio (HH:mm):");
                    double precioBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio base de la boleta:"));

                    int codigoSala = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la sala:"));
                    String nombreSala = JOptionPane.showInputDialog(null, "Ingrese el nombre de la sala:");
                    int capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la capacidad máxima:"));
                    String tipoSalaStr = JOptionPane.showInputDialog(null, """
                        Ingrese el tipo de sala:
                        TRADICIONAL
                        VIP
                        TRES_D
                        """);
                    TIPOSALA tipoSala = TIPOSALA.valueOf(tipoSalaStr.toUpperCase().trim());
                    Sala sala = new Sala(codigoSala, nombreSala, capacidad,tipoSala);
                    Funcion funcion = new Funcion(codFuncion, fecha, hora, precioBase);

                    boolean exito = cine.programarFuncion(funcion);
                    if (exito) {
                        JOptionPane.showMessageDialog(null, "Función programada exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Código duplicado o conflicto de horario en la sala.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La película especificada no existe.");
                }

            } else if (opcion == 5) {
                int documento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el documento del cliente:"));
                Cliente cliente = cine.buscarCliente(documento);

                if (cliente != null) {
                    int documentoOperario = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el documento del operario:"));
                    Operario operario = cine.buscarOperario(documentoOperario);

                    if (operario != null) {
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la venta:"));
                        String fechaVenta = JOptionPane.showInputDialog(null, "Ingrese la fecha de realización:");
                        int valorTotal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor total de la venta:"));

                        Venta venta = new Venta(codigo,fechaVenta,valorTotal);
                        boolean exito = cine.realizarVenta(venta);

                        if (exito) {
                            JOptionPane.showMessageDialog(null, "Venta registrada exitosamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: Ya existe una venta con ese código.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El operario no se encuentra registrado.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El cliente no se encuentra registrado.");
                }

            } else if (opcion == 6) {
                int codVenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la venta:"));
                double total = cine.calcularValorTotalVenta(codVenta);
                JOptionPane.showMessageDialog(null, "El valor total de la venta " + codVenta + " es: $" + total);

            } else if (opcion == 7) {
                int codFuncion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la función:"));
                double ocupacion = cine.calcularPorcentajeOcupacionFuncion(codFuncion);
                JOptionPane.showMessageDialog(null, "Porcentaje de ocupación de la función " + codFuncion + ": " + ocupacion + "%");

            } else if (opcion == 8) {
                int codPelicula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la película:"));
                Pelicula pelicula = cine.buscarPelicula(codPelicula);

                if (pelicula != null) {
                    JOptionPane.showMessageDialog(null, "Película disponible:\n\n" + pelicula.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Pelicula no disponible");
                }

            } else if (opcion == 9) {
                double totalIngresos = cine.calcularIngresosTotalesFunciones();
                JOptionPane.showMessageDialog(null,
                        "El total de ingresos generados por todas las funciones es: $" + totalIngresos);

            } else if (opcion == 10) {
                int docCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el documento de identidad del cliente:"));
                Cliente cliente = cine.buscarCliente(docCliente);

                if (cliente != null) {
                    String detalle = cine.obtenerDetalleBoletasCliente(docCliente);
                    JOptionPane.showMessageDialog(null, detalle);
                } else {
                    JOptionPane.showMessageDialog(null, "El cliente no se encuentra registrado.");
                }

            } else if (opcion == 11) {
                JOptionPane.showMessageDialog(null, "Saliendo del sistema CinePlus.");

            } else {
                JOptionPane.showMessageDialog(null, "La opción seleccionada no es válida.");
            }
        }
    }
}
