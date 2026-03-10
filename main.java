public class main{
    public static void main(String[]args){
        PedirDatos pd = new PedirDatos();


        System.out.println("SISTEMA DE VEHICULOS");
        System.out.println("1---Crear un auto");
        System.out.println("2---Crear un camion");
        System.out.println("Mostrar total de vehiculos");

        int opcion = pd.pedirEntero("Elija una opcion");

        switch (opcion) {
            case 1:
            System.out.println("Datos del auto");
            String marca = pd.pedirCadna("Marca: ");
            String modelo = pd.pedirCadna("Modelo: ");
            int anio = pd.pedirEntero("Anio: ");
            double Precio = pd.pedirDecimal("Precio: $");
            int numeroPuerta = pd.pedirEntero("Puertas: ");
            String tipoCombustible = pd.pedirCadna("Combustible: ");

            Auto a = new Auto(marca,modelo,anio,precio,numeroPuerta,tipoCombustible);
            a.mostrarInfo();
            a.encender();
            a.tocarClaxon();
            break;

            case 2:
                 System.out.println("Datos del camion");
            String marca = pd.pedirCadna("Marca: ");
            String modelo = pd.pedirCadna("Modelo: ");
            int anio = pd.pedirEntero("Anio: ");
            double Precio = pd.pedirDecimal("Precio: $");
            int capacidadCarga = pd.pedirEntero("Capacidad: ");
            int numeroEjes = pd.pedirEntero("Ejes: ");

            Camion a = new Camion(marca,modelo,anio,precio,capacidadCarga,numeroEjes);
            a.mostrarInfo();
            a.encender();
            a.cargarMercancia();
            break;

            case 3:
                  System.out.println("Total de vehiculos: "+ Vehiculo.totalVehiculos);
                break;

            default:
                System.out.println("opcion invalida");
                break;
        }
     }


}
