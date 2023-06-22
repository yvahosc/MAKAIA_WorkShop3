package co.com.WorkshopMAKAI;

public class Yate extends Embarcacion{

    private int cantidadDeCamarotes;

    public Yate(Capitan capitan, double precioBase, int anhoFabricacion,
                double eslora, int cantidadDeCamarotes) {
        super(capitan, precioBase, anhoFabricacion, eslora);
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }
}
