package co.com.WorkshopMAKAI;

public class Velero extends Embarcacion{

    private int cantidadDeMastiles;

    public Velero(Capitan capitan, double precioBase, int anhoFabricacion,
                  double eslora, int cantidadDeMastiles) {
        super(capitan, precioBase, anhoFabricacion, eslora);
        this.cantidadDeMastiles = cantidadDeMastiles;
    }
}
