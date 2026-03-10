public class Vehiculo{
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    public static int totalVehiculos = 0;

    public Vehiculo(){
        totalVehiculos++;

    }
    public Vehiculo(String marca,String modelo, int anio,double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio=anio;
        this.precio = precio;
        totalVehiculos++;
    }

    public void mostrarInfo(){
        System.out.println("Marca: "+ marca +",Modelo: "+ modelo +",Anio:" + anio +",Precio: $"+ precio);
    }
    public void encender(){
        System.out.println("El vehiculo "+ marca +" ha sido encendido");
    }
    public void aplicarDescuento(){
        System.out.println("Se ha aplicado un descuento del 10%. Nuevo precio: $"+ precio);
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
     public void setPrecio(double precio){
        this.precio = precio;
    }
     public String getMarca(){
        return marca;
    }
     public String getModelo(){
        return modelo;
    }
     public int getAnio(){
        return anio;
    }
     public double getPrecio(){
        return precio;
    }








}