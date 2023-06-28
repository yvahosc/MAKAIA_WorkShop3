package co.com.WorkshopMAKAI;

public class SistemaAlquiler {

    public Embarcacion[] embarcaciones = new Embarcacion[10];
    private int cantidadDeEmbarcaciones = 0;

    public void agregarEmbarcacion(Embarcacion embarcacion){

        if (cantidadDeEmbarcaciones < 10){
            if(this.estaEmbarcacionEnElSistema(embarcacion) == false){
                for (int i = 0; i < embarcaciones.length; i++) {
                    if (embarcaciones[i] == null){
                        embarcaciones[i] = embarcacion;
                        cantidadDeEmbarcaciones++;
                        embarcacion.setDisponible(true);
                        System.out.println("La embarcación: " + embarcacion.toString()
                                + ", ha sido agregada exitosamente al sistema.");
                        break;
                    }
                }
            }else{
                System.out.println("Error. La embarcación: " + embarcacion.toString()
                        + ", ya existe en el sistema.");
            }
        } else{
            System.out.println("Error. No es posible agregar más " +
                    "embarcaciones.");
        }
    }

    public void alquilarEmbarcacion(Embarcacion embarcacion){
        if(this.estaEmbarcacionEnElSistema(embarcacion) == true){
            if (embarcacion.isDisponible() == true){
                embarcacion.setDisponible(false);
                System.out.println("Alquiler exitoso. Embarcación: " + embarcacion.toString());
                embarcacion.calcularMontoAlquiler();
            } else{
                System.out.println("Error. La embarcación" + embarcacion.toString()
                        + ", no está disponible.");
            }
        }else{
            this.mensajeEmbarcacionNoEstaEnelSistema(embarcacion);
        }
    }

    public void devolverEmbarcacion(Embarcacion embarcacion){
        if(this.estaEmbarcacionEnElSistema(embarcacion) == true){
            if (embarcacion.isDisponible() == false){
                embarcacion.setDisponible(true);
                System.out.println("La embarcación: " + embarcacion.toString() +
                        ", ingresó nuevamente al sistema y está disponible " +
                        "para ser alquilada nuevamente.");
            } else{
                System.out.println("Error la embarcación "+ embarcacion.toString()
                        + ", no ha sido alquilada.");
            }
        }else{
            this.mensajeEmbarcacionNoEstaEnelSistema(embarcacion);
        }
    }

    public void venderEmbarcacion(Embarcacion embarcacion){

        if(this.estaEmbarcacionEnElSistema(embarcacion)){
            if(embarcacion.isDisponible() && embarcacion.isVendible())
            {
                for (int i = 0; i < embarcaciones.length; i++) {
                    if (embarcaciones[i] == embarcacion){
                        embarcaciones[i] = null;
                        cantidadDeEmbarcaciones--;
                        embarcacion.setDisponible(false);
                        break;
                    }
                }
                System.out.println("La embarcación: " + embarcacion.toString() +
                        ", fue vendida exitosamente.");
            }else{
                System.out.println("Error. La embarcación: " + embarcacion.toString()
                        + ", no puede ser vendida.");
            }
        }else{
            this.mensajeEmbarcacionNoEstaEnelSistema(embarcacion);
        }
    }

    public void mostrarEmbarcacionesEnElSistema(){
        boolean embarcacionesVacio = true;

        System.out.println("Embarcaciones:");
        for (int i = 0; i < embarcaciones.length; i++) {
            if(embarcaciones[i] != null){
                System.out.println(embarcaciones[i].toString());
                embarcacionesVacio = false;
            }
        }
        if(embarcacionesVacio){
            System.out.println("No hay embarcaciones en el sistema.");
        }
    }

    public boolean estaEmbarcacionEnElSistema(Embarcacion embarcacion){
        boolean estaEmbarcacion = false;
        for (int i = 0; i < embarcaciones.length; i++) {
            if (embarcaciones[i] == embarcacion){
                estaEmbarcacion = true;
            }
        }
        return estaEmbarcacion;
    }

    public void mensajeEmbarcacionNoEstaEnelSistema(Embarcacion embarcacion){
        System.out.println("Error. La embarcación: " + embarcacion.toString()
                + ", no existe en el sistema.");
    }
}
