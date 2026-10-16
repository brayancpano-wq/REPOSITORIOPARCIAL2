
import java.util.ArrayList;
import java.util.List;

    public class Cine {

        private String nombre;
        private int nit;
        private String direccion;

        private List<Sala> listCineSala;
        private List<Pelicula> listCinePelicula;
        private List<Cliente> listCineCliente;
        private List<Operario> listCineOperario;
        private List<Funcion> listCineFuncion;
        private List<Boleta> listCineBoleta;
        private List<Venta> listCineVenta;

        public Cine(String nombre, int nit, String direccion) {
            this.nombre = nombre;
            this.nit = nit;
            this.direccion = direccion;

            this.listCineSala = new ArrayList<>();
            this.listCinePelicula = new ArrayList<>();
            this.listCineCliente = new ArrayList<>();
            this.listCineOperario = new ArrayList<>();
            this.listCineFuncion = new ArrayList<>();
            this.listCineBoleta = new ArrayList<>();
            this.listCineVenta = new ArrayList<>();
        }


        // Registrar y buscar peliculas

        public boolean registrarPelicula(Pelicula nuevaPelicula) {
            if (buscarPelicula(nuevaPelicula.getCodigo()) != null) {
                return false;
            }
            return listCinePelicula.add(nuevaPelicula);
        }

        public Pelicula buscarPelicula(int codigo) {
            for (Pelicula p : listCinePelicula) {
                if (p.getCodigo()== codigo) {
                    return p;
                }
            }
            return null;
        }


        // Registrar y buscar clientes

        public boolean registrarCliente(Cliente nuevoCliente) {
            if (buscarCliente(nuevoCliente.getDocumento()) != null) {
                return false;
            }
            return listCineCliente.add(nuevoCliente);
        }

        public Cliente buscarCliente(int documento) {
            for (Cliente c : listCineCliente) {
                if (c.getDocumento()==documento) {
                    return c;
                }
            }
            return null;
        }


        // Registrar y buscar operarios

        public boolean registrarOperario(Operario nuevoOperario) {
            if (buscarOperario(nuevoOperario.getDocumento()) != null) {
                return false;
            }
            return listCineOperario.add(nuevoOperario);
        }

        public Operario buscarOperario(int documento) {
            for (Operario o : listCineOperario) {
                if (o.getDocumento()==documento) {
                    return o;
                }
            }
            return null;
        }


        // Programar y buscar funciones

        public boolean programarFuncion(Funcion nuevaFuncion) {
            if (buscarFuncion(nuevaFuncion.getCodigo()) != null) {
                return false; // Código duplicado
            }

            for (Funcion f : listCineFuncion) {
                if (f.getSala().getCodigo()==(nuevaFuncion.getSala().getCodigo()) &&
                        f.getFecha().equalsIgnoreCase(nuevaFuncion.getFecha())) {

                    if (f.getHoraInicio().equalsIgnoreCase(nuevaFuncion.getHoraInicio())) {
                        return false;
                    }
                }
            }
            return listCineFuncion.add(nuevaFuncion);
        }

        public Funcion buscarFuncion(int codigo) {
            for (Funcion f : listCineFuncion) {
                if (f.getCodigo()==codigo) {
                    return f;
                }
            }
            return null;
        }


        // Realizar y buscar ventas

        public boolean realizarVenta(Venta nuevaVenta) {
            if (buscarVenta(nuevaVenta.getCodigo()) != null) {
                return false;
            }
            return listCineVenta.add(nuevaVenta);
        }

        public Venta buscarVenta(int codigo) {
            for (Venta v : listCineVenta) {
                if (v.getCodigo()== codigo) {
                    return v;
                }
            }
            return null;
        }


        // Calcular valor total de una venta

        public double calcularValorTotalVenta(int codigo) {
            Venta venta = buscarVenta(codigo);
            if (venta != null) {
                return venta.calcularValorTotal();
            }
            return 0.0;
        }


        // Calcular porcentaje de ocupacion

        public double calcularPorcentajeOcupacionFuncion(int codigo) {
            Funcion funcion = buscarFuncion(codigo);
            if (funcion != null) {
                return funcion.calcularPorcentajeOcupacion();
            }
            return 0.0;
        }


        // Calcula la suma total de ingresos generados por todas las funciones cinematográficas.

        public double calcularIngresosTotalesFunciones() {
            double totalIngresos = 0.0;

            for (Funcion funcion : listCineFuncion) {
                // Opción A: Si la clase Funcion calcula sus ingresos basados en su precio y boletas vendidas
                totalIngresos += funcion.calcularIngresos();

                // Opción B (alternativa): Si la clase Funcion expone el total directamente
                // totalIngresos += funcion.getPrecioBase() * funcion.getListCineBoleta().size();
            }

            return totalIngresos;
        }

        public String obtenerDetalleBoletasCliente(int documento) {
            String detalle = "";

            if (listCineVenta.isEmpty()) {
                return "No hay ventas registradas en el sistema.";
            }

            for (Venta venta : listCineVenta) {
                detalle += "========== VENTA #" + venta.getCodigo() + " ==========\n"
                        + "Fecha de Venta: " + venta.getFechaRealizacion() + "\n"
                        + "Monto Total: $" + venta.getValorTotal() + "\n\n";
            }

            return detalle;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getNit() {
            return nit;
        }

        public void setNit(int nit) {
            this.nit = nit;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public List<Sala> getListCineSala() {
            return listCineSala;
        }

        public void setListCineSala(List<Sala> listCineSala) {
            this.listCineSala = listCineSala;
        }

        public List<Pelicula> getListCinePelicula() {
            return listCinePelicula;
        }

        public void setListCinePelicula(List<Pelicula> listCinePelicula) {
            this.listCinePelicula = listCinePelicula;
        }

        public List<Cliente> getListCineCliente() {
            return listCineCliente;
        }

        public void setListCineCliente(List<Cliente> listCineCliente) {
            this.listCineCliente = listCineCliente;
        }

        public List<Operario> getListCineOperario() {
            return listCineOperario;
        }

        public void setListCineOperario(List<Operario> listCineOperario) {
            this.listCineOperario = listCineOperario;
        }

        public List<Funcion> getListCineFuncion() {
            return listCineFuncion;
        }

        public void setListCineFuncion(List<Funcion> listCineFuncion) {
            this.listCineFuncion = listCineFuncion;
        }

        public List<Boleta> getListCineBoleta() {
            return listCineBoleta;
        }

        public void setListCineBoleta(List<Boleta> listCineBoleta) {
            this.listCineBoleta = listCineBoleta;
        }

        public List<Venta> getLisCineVenta() {
            return listCineVenta;
        }

        public void setLisCineVenta(List<Venta> lisCineVenta) {
            this.listCineVenta = lisCineVenta;
        }

        @Override
        public String toString() {
            return "Cine{" +
                    "nombre='" + nombre + '\'' +
                    ", nit='" + nit + '\'' +
                    ", direccion='" + direccion + '\'' +
                    ", listCineSala=" + listCineSala +
                    ", listCinePelicula=" + listCinePelicula +
                    ", listCineCliente=" + listCineCliente +
                    ", listCineOperario=" + listCineOperario +
                    ", listCineFuncion=" + listCineFuncion +
                    ", listCineBoleta=" + listCineBoleta +
                    ", listCineVenta=" + listCineVenta +
                    '}';
        }
    }

