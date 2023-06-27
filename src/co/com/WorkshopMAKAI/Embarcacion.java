package co.com.WorkshopMAKAI;

public abstract class Embarcacion {

    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anhoFabricacion;
    private double eslora;
    private boolean disponible;
    private boolean vendible;

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
        this.disponible = false;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isVendible() {
        return vendible;
    }

    public void setVendible(boolean vendible) {
        this.vendible = vendible;
    }

    public void calcularMontoAlquiler(){
        System.out.println("El monto a pagar por el alquiler de la " +
                "embarcación es: $" + (precioBase + valorAdicional) + ".");
    }

    @Override
    public String toString() {
        return "Capitán: [" + capitan.toString() +
                "], año de fabricación: " + anhoFabricacion +
                ", eslora: " + eslora +
                ", disponible: " + disponible +
                ", vendible: " + vendible;
    }
}
