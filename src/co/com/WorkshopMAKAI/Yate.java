package co.com.WorkshopMAKAI;

public class Yate extends Embarcacion{

    private int cantidadDeCamarotes;
    private boolean lujoso;

    public Yate(Capitan capitan, double precioBase, int anhoFabricacion,
                double eslora, int cantidadDeCamarotes) {
        super(capitan, precioBase, anhoFabricacion, eslora);
        this.cantidadDeCamarotes = cantidadDeCamarotes;
        super.setVendible(true);
        if(cantidadDeCamarotes > 7){
            this.lujoso = true;
        } else{
            this.lujoso = false;
        }
    }

    @Override
    public String toString() {
        return "Yate: " + super.toString() +
                ", cantidad de camarotes: " + cantidadDeCamarotes +
                ", lujoso: " + lujoso;
    }
}
