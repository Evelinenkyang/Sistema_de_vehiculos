public class Auto extends Vehiculo{
    protected int numeroPuertas;
    protected String tipoCombustible;

    public Auto(String marca, String modelo, int anio, double precio, int numeroPuertas,String tipoCombustible){
        super(marca,modelo,anio,precio);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }
     public void tocarClaxon(){
        System.out.println("El auto "+getMarca()+ " toca el claxon: PIP PIPPPP");
     }
      public void mosttrarPuertas(){
        System.out.println("Numero de puertas:  "+ numeroPuertas);
     }
}