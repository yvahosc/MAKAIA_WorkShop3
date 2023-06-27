package co.com.WorkshopMAKAI;

public class Velero extends Embarcacion{

    private int cantidadDeMastiles;
    private boolean grande;

    public Velero(Capitan capitan, double precioBase, int anhoFabricacion,
                  double eslora, int cantidadDeMastiles) {
        super(capitan, precioBase, anhoFabricacion, eslora);
        this.cantidadDeMastiles = cantidadDeMastiles;
        super.setVendible(false);
        if(cantidadDeMastiles > 4){
            this.grande = true;
        }else{
            this.grande = false;
        }
    }

    @Override
    public String toString() {
        return "Velero: " + super.toString() +
                ", cantidad de mástiles: " + cantidadDeMastiles +
                ", grande: " + grande + ".\n";
    }
}
