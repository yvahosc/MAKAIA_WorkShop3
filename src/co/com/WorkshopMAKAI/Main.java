package co.com.WorkshopMAKAI;

public class Main {

    public static void main(String[] args) {

        //Creación objetos de las clases capitán, velero y yate
        Capitan capitan1 = new Capitan("Pedro", "Perez", "XSE123");
        Capitan capitan2 = new Capitan("Camila", "Cortes", "DCE256");

        Embarcacion yate1 = new Yate(capitan1, 2000, 2019,10, 8);
        Embarcacion yate2 = new Yate(capitan2, 8000, 2021,4, 2);
        Embarcacion velero1 = new Velero(capitan1, 2000, 2019,10, 8);
        Embarcacion velero2 = new Velero(capitan2, 7000, 2022,8, 1);


        //Creación sistema de alquiler
        SistemaAlquiler sistemaAlquiler = new SistemaAlquiler();

        //Agregando embarcaciones al sistema de alquiler
        sistemaAlquiler.agregarEmbarcacion(yate1);
        sistemaAlquiler.agregarEmbarcacion(yate2);
        sistemaAlquiler.agregarEmbarcacion(velero1);
        System.out.println("Alquilando velero que no está en el sistema");
        sistemaAlquiler.alquilarEmbarcacion(velero2);
        System.out.println("fhdjf");


        //Intentando devolver una embarcación que no ha sido alquilada
        sistemaAlquiler.devolverEmbarcacion(velero1);//Error

        //Alquilando el velero1
        sistemaAlquiler.alquilarEmbarcacion(velero1);//Funciona

        //Alquilando el yate1
        sistemaAlquiler.alquilarEmbarcacion(yate1);//Funciona

        //Intentando devolver una embarcación que no ha sido alquilada
        sistemaAlquiler.devolverEmbarcacion(yate1);//Error

        //vendiendo el velero1
        sistemaAlquiler.venderEmbarcacion(velero1);//Error

        //vendiendo el yate2
        sistemaAlquiler.venderEmbarcacion(yate2);

    }
}
