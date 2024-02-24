package Practica_230224;

public class Persona {
    // Atributos demográficos
    private String nombre;
    private int edad;
    private String genero;
    private String direccion;
    private double altura;

    // Métodos set y get para cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método estático comer
    public static void comer(String comida) {
        System.out.println("Comiendo " + comida);
    }

    // Métodos no estáticos dormir y hacerEjercicio
    public void dormir(int horas) {
        System.out.println("Durmiendo durante " + horas + " horas");
    }

    public void hacerEjercicio(String tipoEjercicio) {
        System.out.println("Haciendo ejercicio de tipo " + tipoEjercicio);
    }

    // Ejemplos de invocación
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona1 = new Persona();

        // Configurar atributos usando métodos set
        persona1.setNombre("Juan");
        persona1.setEdad(25);
        persona1.setGenero("Masculino");
        persona1.setDireccion("Calle Principal 123");
        persona1.setAltura(1.75);

        // Invocar método estático comer
        Persona.comer("pizza");

        // Invocar métodos no estáticos dormir y hacerEjercicio
        persona1.dormir(8);
        persona1.hacerEjercicio("correr");
    }
}