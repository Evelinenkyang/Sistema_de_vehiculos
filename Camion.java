public class Camion extends Vehiculo{
    protected int capacidadCarga;
    protected int numeroEjes;

    public Camion(String marca, String modelo, int anio, double precio, int capacidadCarga, int numeroEjes);{

        super(marca,modelo,anio,precio);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }
    public void cargarMercancia(){
        System.out.println("El camion "+ getMarca() +" esta cargando mercancia");
    }
    public void mostrarCapacidad(){
        System.out.println("Capacidad de carga: "+ capacidadCarga +" toneladas");
    }
}

