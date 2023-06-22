package co.com.WorkshopMAKAI;

public abstract class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anhoFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, int anhoFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.anhoFabricacion = anhoFabricacion;
        this.eslora = eslora;
        if(anhoFabricacion > 2020){
            this.valorAdicional = 20000;
        } else{
            this.valorAdicional = 0;
        }
    }

    public void calcularMontoAlquiler(){
        System.out.println("El monto a pagar por el alquiler de la " +
                "embarcación es: $" + (precioBase + valorAdicional) + ".");
    }
}
