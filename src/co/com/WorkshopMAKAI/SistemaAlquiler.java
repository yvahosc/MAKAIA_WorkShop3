package co.com.WorkshopMAKAI;

public class SistemaAlquiler {

    public Embarcacion[] embarcaciones = new Embarcacion[10];
    private int cantidadDeEmbarcaciones = 0;

    // [  null  |  yate2   |   velero1   |   null  |   null  | null   |
    // null   |   null  |   null  |  null   ] - cantidadDeEmbarcaciones = 2
    // agregarEmbarcacion(Yate3)
    // [  null  |  yate2   |   Yate3   |   null  |   null  | null   |
    // null   |   null  |   null  |  null   ] - cantidadDeEmbarcaciones = 3
    public void agregarEmbarcacion(Embarcacion embarcacion){
        if (cantidadDeEmbarcaciones < 10){
            embarcaciones[cantidadDeEmbarcaciones] = embarcacion;
            cantidadDeEmbarcaciones++;
        } else{
            System.out.println("No es posible agregara más embarcaciones.");
        }
        embarcacion.setDisponible(true);
    }

    public void alquilarEmbarcacion(Embarcacion embarcacion){
        if (embarcacion.isDisponible() == true){
            embarcacion.setDisponible(false);
            System.out.println("Alquiler exitoso. Embarcación: " + embarcacion.toString());
            embarcacion.calcularMontoAlquiler();
        } else{
            System.out.println("La embarcación no está disponible.");
        }
    }

    public void devolverEmbarcacion(Embarcacion embarcacion){
        if (embarcacion.isDisponible() == false){
            embarcacion.setDisponible(true);
            System.out.println("La embarcación: " + embarcacion.toString() +
                    " ingresó nuevamente al sistema y está disponible para " +
                    "ser alquilada nuevamente.");
        } else{
            System.out.println("Error la embarcación no ha sido prestada.");
        }
    }
    // [  yate1  |  yate2   |   velero1   |   null  |   null  | null   |
    // null   |   null  |   null  |  null   ] - cantidadDeEmbarcaciones = 3
    // embarcaciones[0] = null;
    // [  null  |  yate2   |   velero1   |   null  |   null  | null   |
    // null   |   null  |   null  |  null   ] - cantidadDeEmbarcaciones = 2
    public void venderEmbarcacion(Embarcacion embarcacion){
        // if(embarcacion.getClass() == Yate.class){
        //
        // }else{
        //
        //}

        if (embarcacion.isDisponible() == true){
            if(embarcacion.isVendible() == true){
                embarcacion.setDisponible(false);
                System.out.println("La embarcación: " + embarcacion.toString() +
                        " fue vendida exitosamente.");
            }else{
                System.out.println("Error. La embarcación no puede ser vendida.");
            }
        } else{
            System.out.println("La embarcación no está disponible.");
        }
    }
}
