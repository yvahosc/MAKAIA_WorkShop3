package co.com.WorkshopMAKAI;

public class Main {

    public static void main(String[] args) {

        //Creación objetos de las clases capitán, velero y yate
        Capitan capitan1 = new Capitan("Pedro", "Perez", "XSE123");
        Capitan capitan2 = new Capitan("Camila", "Cortes", "DCE256");

        Embarcacion yate1 = new Yate(capitan1, 2000, 2022,10, 8);
        Embarcacion yate2 = new Yate(capitan2, 8000, 2021,4, 2);
        Embarcacion velero1 = new Velero(capitan1, 2000, 2019,10, 8);
        Embarcacion velero2 = new Velero(capitan2, 7000, 2022,8, 1);


        //Creación sistema de alquiler
        SistemaAlquiler sistemaAlquiler = new SistemaAlquiler();

        //Mostrando embarcaciones en el sistema
        System.out.println("Mostrando embarcaciones en el sistema:");
        sistemaAlquiler.mostrarEmbarcacionesEnElSistema();
        System.out.println();

        //Agregando embarcaciones al sistema de alquiler
        System.out.println("Agregando embarcaciones al sistema de alquiler:");
        sistemaAlquiler.agregarEmbarcacion(yate1);
        sistemaAlquiler.agregarEmbarcacion(yate2);
        sistemaAlquiler.agregarEmbarcacion(velero1);
        System.out.println();

        //Mostrando embarcaciones en el sistema
        System.out.println("Mostrando embarcaciones en el sistema:");
        sistemaAlquiler.mostrarEmbarcacionesEnElSistema();
        System.out.println();

        //Agregando embarcación que ya está en el sistema de alquiler
        System.out.println("Agregando embarcación que ya está en el sistema " +
                "de alquiler:");
        sistemaAlquiler.agregarEmbarcacion(yate1);
        System.out.println();

        //Mostrando embarcaciones en el sistema
        System.out.println("Mostrando embarcaciones en el sistema:");
        sistemaAlquiler.mostrarEmbarcacionesEnElSistema();
        System.out.println();

        //Alquilando embarcación que no está en el sistema
        System.out.println("Alquilando embarcación que no está en el sistema:");
        sistemaAlquiler.alquilarEmbarcacion(velero2);
        System.out.println();

        //Mostrando embarcaciones en el sistema
        System.out.println("Mostrando embarcaciones en el sistema:");
        sistemaAlquiler.mostrarEmbarcacionesEnElSistema();
        System.out.println();

        //Intentando devolver una embarcación que no ha sido alquilada
        System.out.println("Intentando devolver una embarcación que no ha " +
                "sido alquilada:");
        sistemaAlquiler.devolverEmbarcacion(velero1);//Error
        System.out.println();

        //Mostrando embarcaciones en el sistema
        System.out.println("Mostrando embarcaciones en el sistema:");
        sistemaAlquiler.mostrarEmbarcacionesEnElSistema();
        System.out.println();

        //Alquilando embarcaciones disponibles
        System.out.println("Alquilando embarcaciones disponibles:");
        sistemaAlquiler.alquilarEmbarcacion(velero1);//Funciona
        sistemaAlquiler.alquilarEmbarcacion(yate1);//Funciona
        System.out.println();

        //Mostrando embarcaciones en el sistema
        System.out.println("Mostrando embarcaciones en el sistema:");
        sistemaAlquiler.mostrarEmbarcacionesEnElSistema();
        System.out.println();

        //Intentando vender embarcación no disponible
        System.out.println("Intentando vender embarcación no disponible:");
        sistemaAlquiler.venderEmbarcacion(yate1);
        System.out.println();

        //Mostrando embarcaciones en el sistema
        System.out.println("Mostrando embarcaciones en el sistema:");
        sistemaAlquiler.mostrarEmbarcacionesEnElSistema();
        System.out.println();

        //Intentando vender embarcación que no es posible vender - veleros
        System.out.println("Intentando vender embarcación que no es posible vender - veleros:");
        sistemaAlquiler.venderEmbarcacion(velero1);
        System.out.println();

        //Mostrando embarcaciones en el sistema
        System.out.println("Mostrando embarcaciones en el sistema:");
        sistemaAlquiler.mostrarEmbarcacionesEnElSistema();
        System.out.println();

        //Intentando vender embarcación disponible
        System.out.println("Intentando vender embarcación disponible:");
        sistemaAlquiler.venderEmbarcacion(yate2);
        System.out.println();

        //Mostrando embarcaciones en el sistema
        System.out.println("Mostrando embarcaciones en el sistema:");
        sistemaAlquiler.mostrarEmbarcacionesEnElSistema();
        System.out.println();

        //Agregando una embarcación más al sistema de alquiler
        System.out.println("Agregando una embarcación más al sistema de alquiler:");
        sistemaAlquiler.agregarEmbarcacion(velero2);
        System.out.println();

        //Mostrando embarcaciones en el sistema
        System.out.println("Mostrando embarcaciones en el sistema:");
        sistemaAlquiler.mostrarEmbarcacionesEnElSistema();
        System.out.println();

        //Devolviendo embarcación alquilada
        System.out.println("Devolviendo embarcación alquilada:");
        sistemaAlquiler.devolverEmbarcacion(velero1);
        System.out.println();

        //Mostrando embarcaciones en el sistema
        System.out.println("Mostrando embarcaciones en el sistema:");
        sistemaAlquiler.mostrarEmbarcacionesEnElSistema();
        System.out.println();
    }
}
