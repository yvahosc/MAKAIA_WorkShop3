package co.com.WorkshopMAKAI;

public class Capitan {
    private String nombre;
    private String apellido;
    private String matriculaDeNavegacion;

    public Capitan(String nombre, String apellido, String matriculaDeNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaDeNavegacion = matriculaDeNavegacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", apellido: " + apellido +
                ", matricula de navegación: " + matriculaDeNavegacion;
    }
}
