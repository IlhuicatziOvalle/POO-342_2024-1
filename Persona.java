//taller2.2.1//
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
/*taller 2.3.1
package Practica_290223;

class Persona{
    // Atributos demográficos
    private String nombre;
    protected int edad;
    private String comida; 
    private String altura;    
    private String genero;

    // Constructores (puedes tener varios según tus necesidades)
    public Persona(String nombre, int edad, String comida, String altura, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.comida = comida;
        this.altura = altura;
        this.genero = genero;
    }

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

    public String getComida() {  
        return comida;
    }

    public void setComida(String comida) {  
        this.comida = comida;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {  
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }

    // Métodos comer, dormir, tomarBaño
    public void comer(String comida) {
        System.out.println("Comiendo: " + comida);
    }

    public void dormir(int horas) {
        System.out.println("Durmiendo por " + horas + " horas");
    }

    public void tomarBaño(String tipo) {  
        System.out.println("Tomando un baño de tipo: " + tipo);
    }
}
public class Accesos {
    public static void main(String[] args) {
       
        Persona persona1 = new Persona("Maria", 30, "Ensalada", "1.65m", "Femenino");
        persona1.setGenero("femenino");
        persona1.comer("Sushi");
        persona1.dormir(8);
        persona1.tomarBaño("Caliente");  // Invocamos el método protegido
    }
} */

/*lab 2.2.1 
package Practica_010324;

class Persona{
    //Atributos
    private String nombre;
    private int edad;
    private String genero;
    private String direccion;
    private double altura;

    //Metodos set y get
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public String getGenero(){
        return genero;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public double getAltura(){
        return altura;
    }
    //Metodo para comer
    public void comer(String comida){
        System.out.println(nombre+" esta comiendo"+comida);
    }
    //Metodo para dormir
    public void dormir(int horas){
        System.out.println(nombre+" esta durmiendo durante"+horas+"horas");
    }
    //Metodo para ejercicio
    public void hacerEjercicio(String tipoEjercicio){
        System.out.println(nombre+" esta haciendo ejercicio de tipo"+tipoEjercicio);
    }
}

public class Metodos {
    public static void main(String[] args) {
        //crear objeto tipo persona
        Persona persona=new Persona();

        //Establecer atributos
        persona.setNombre("Juan");
        persona.setEdad(25);
        persona.setGenero("masculino");
        persona.setDireccion("Calle 123, Ciudad");
        persona.setAltura(1.75);

        //imprimir datos de la persona
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Género: " + persona.getGenero());
        System.out.println("Dirección: " + persona.getDireccion());
        System.out.println("Altura: " + persona.getAltura());

        // Llamar a los métodos
        persona.comer("Pizza");
        persona.dormir(8);
        persona.hacerEjercicio("Correr");
    }
} */

/*lab 2.1.1 
public class Estudiantes {
    private String nombre;
    private int edad;
    private double calificacion;

    // Métodos set y get para el atributo 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Métodos set y get para el atributo 'edad'
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    // Métodos set y get para el atributo 'calificacion'
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public static void main(String[] args) {
        // Crear objetos Estudiante
        Estudiantes estudiante1 = new Estudiantes();
        Estudiantes estudiante2 = new Estudiantes();
        Estudiantes estudiante3 = new Estudiantes();

        // Capturar datos mediante el método set
        estudiante1.setNombre("Juan");
        estudiante1.setEdad(20);
        estudiante1.setCalificacion(8.5);

        estudiante2.setNombre("María");
        estudiante2.setEdad(22);
        estudiante2.setCalificacion(9.0);

        estudiante3.setNombre("Pedro");
        estudiante3.setEdad(21);
        estudiante3.setCalificacion(7.8);

        // Desplegar datos con el método println y métodos get correspondientes
        System.out.println("Estudiante 1:");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Calificación: " + estudiante1.getCalificacion());
        System.out.println();

        System.out.println("Estudiante 2:");
        System.out.println("Nombre: " + estudiante2.getNombre());
        System.out.println("Edad: " + estudiante2.getEdad());
        System.out.println("Calificación: " + estudiante2.getCalificacion());
        System.out.println();

        System.out.println("Estudiante 3:");
        System.out.println("Nombre: " + estudiante3.getNombre());
        System.out.println("Edad: " + estudiante3.getEdad());
        System.out.println("Calificación: " + estudiante3.getCalificacion());
    }
}

class Estudiantes {
    private String nombre;
    private int edad;
    private double calificacion;

    public String setGetNombre(String nom) {
        nombre = nom;
        return nombre;
    }

    // Método setGet para el atributo 'edad'
    public int setGetEdad(int ed) {
        edad = ed;
        return edad;
    }

    // Método setGet para el atributo 'calificacion'
    public double setGetCalificacion(double calif) {
        calificacion = calif;
        return calificacion;
    }
}

public class Estudiantes2 {
    public static void main(String[] args) {
        // Crear objetos Estudiante
        Estudiantes est1 = new Estudiantes();
        Estudiantes est2 = new Estudiantes();
        Estudiantes est3 = new Estudiantes();

        // Desplegar datos utilizando setGet
        System.out.println("Estudiante 1:");
        System.out.println(est1.setGetNombre("Juan"));
        System.out.println(est1.setGetEdad(20));
        System.out.println(est1.setGetCalificacion(8.5));
        System.out.println();

        System.out.println("Estudiante 2:");
        System.out.println(est2.setGetNombre("Maria"));
        System.out.println(est2.setGetEdad(22));
        System.out.println(est2.setGetCalificacion(9.0));
        System.out.println();

        System.out.println("Estudiante 3:");
        System.out.println(est3.setGetNombre("Pedro"));
        System.out.println(est3.setGetEdad(21));
        System.out.println(est3.setGetCalificacion(7.8));
    }
}*/

/*taller 2.4.1b
package PracticaT_290324;

// Clase CuerpoHumano
class CuerpoHumano {
// Clase Corazon
    class Corazon {
        private String tamaño;
        private int ritmoCardiaco;
        private boolean sano;

        public String getTamaño() {
            return tamaño;
        }

        public void setTamaño(String tamaño) {
            this.tamaño = tamaño;
        }

        public int getRitmoCardiaco() {
            return ritmoCardiaco;
        }

        public void setRitmoCardiaco(int ritmoCardiaco) {
            this.ritmoCardiaco = ritmoCardiaco;
        }

        public boolean isSano() {
            return sano;
        }

        public void setSano(boolean sano) {
            this.sano = sano;
        }
    }

    // Clase Pulmon
    class Pulmon {
        private String lado;
        private double capacidad;
        private boolean funcionando;

        public String getLado() {
            return lado;
        }

        public void setLado(String lado) {
            this.lado = lado;
        }

        public double getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(double capacidad) {
            this.capacidad = capacidad;
        }

        public boolean isFuncionando() {
            return funcionando;
        }

        public void setFuncionando(boolean funcionando) {
            this.funcionando = funcionando;
        }
    }

    // Clase Higado
    class Higado {
        private double peso;
        private String color;
        private boolean funcionando;

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFuncionando() {
            return funcionando;
        }

        public void setFuncionando(boolean funcionando) {
            this.funcionando = funcionando;
        }
    }

    // Clase Apendice
    class Apendice {
        private double tamaño;
        private boolean inflamado;
        private boolean sano;

        public double getTamaño() {
            return tamaño;
        }

        public void setTamaño(double tamaño) {
            this.tamaño = tamaño;
        }

        public boolean isInflamado() {
            return inflamado;
        }

        public void setInflamado(boolean inflamado) {
            this.inflamado = inflamado;
        }

        public boolean isSano() {
            return sano;
        }

        public void setSano(boolean sano) {
            this.sano = sano;
        }
    }
}

// Clase principal para probar
public class Main01 {
    public static void main(String[] args) {
        // Crear un cuerpo humano y sus partes
        CuerpoHumano ch = new CuerpoHumano();
        CuerpoHumano.Corazon cors= ch.new Corazon();
        CuerpoHumano.Pulmon pulms= ch.new Pulmon();
        CuerpoHumano.Higado higo= ch.new Higado();
        CuerpoHumano.Apendice apd= ch.new Apendice();
        

        cors.getTamaño();
        cors.getRitmoCardiaco();
        cors.isSano();
        cors.setTamaño("Grande");
        cors.setRitmoCardiaco(70);
        cors.setSano(true);

        pulms.getCapacidad();
        pulms.isFuncionando();
        pulms.getLado();
        pulms.setCapacidad(100);
        pulms.setFuncionando(true);
        pulms.setLado("Izquierdo");

        higo.getColor();
        higo.isFuncionando();
        higo.getPeso();
        higo.setColor("cafe");
        higo.setFuncionando(true);
        higo.setPeso(80);

        apd.isInflamado();
        apd.isSano();
        apd.getTamaño();
        apd.setInflamado(true);
        apd.setSano(true);
        apd.setTamaño(90);



        // Imprimir valores
        System.out.println("Información del corazón:");
        System.out.println("Tamaño: " + cors.getTamaño());
        System.out.println("Ritmo Cardiaco: " + cors.getRitmoCardiaco());
        System.out.println("¿Sano?: " + cors.isSano());

        System.out.println("\nInformación del Pulmon:");
        System.out.println("Capacidad: " + pulms.getCapacidad());
        System.out.println("¿Esta funcionando?: " + pulms.isFuncionando());
        System.out.println("Lado del pulmon: " + pulms.getLado());

        System.out.println("\nInformación del Higado:");
        System.out.println("Color: " + higo.getColor());
        System.out.println("¿Esta funcionando?: " + higo.isFuncionando());
        System.out.println("Peso: " + higo.getPeso());

        System.out.println("\nInformación del Apendice:");
        System.out.println("Tamaño: " + apd.getTamaño());
        System.out.println("¿Esta inflamado?: " + apd.isInflamado());
        System.out.println("¿Sano?: " + apd.isSano());
    }
}
        
package PracticaT_290324;

class Bicicleta{
// Definición de la clase Rueda
    class Rueda {
        private int diametro;
        private String tipo;
        private String material;

        // Getters y setters
        public int getDiametro() {
            return diametro;
        }
        public void setDiametro(int diametro) {
            this.diametro = diametro;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
    }   

    // Definición de la clase Cuadro
    class Cuadro {
        private String material;
        private String color;
        private int tamaño;
    
        // Getters y setters
        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getTamaño() {
            return tamaño;
        }

        public void setTamaño(int tamaño) {
            this.tamaño = tamaño;
        }
    }
}


public class Main02 {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        Bicicleta.Rueda rue= bici.new Rueda();
        Bicicleta.Cuadro cud= bici.new Cuadro();

        rue.getDiametro();
        rue.getMaterial();
        rue.getTipo();
        rue.setDiametro(90);;
        rue.setMaterial("Hierro");
        rue.setTipo("Montaña");

        cud.getMaterial();
        cud.getColor();
        cud.getTamaño();
        cud.setMaterial("Hierro");
        cud.setColor("Amarilla");
        cud.setTamaño(200);


        // Imprimir valores de atributos
        System.out.println("\nInformacion de la Rueda:");
        System.out.println("Diametro: " + rue.getDiametro());
        System.out.println("Material: " + rue.getMaterial());
        System.out.println("Tipo: " + rue.getTipo());

        System.out.println("\nInformación del Cuadro:");
        System.out.println("Material: " + cud.getMaterial());
        System.out.println("Color: " + cud.getColor());
        System.out.println("Tamaño: " + cud.getTamaño());
    }
}*/

/*lab2.4.1b

package Practica_290324;

// Clase CuerpoHumano
class CuerpoHumano {
    Corazon cors=new Corazon();
    Pulmon pulms=new Pulmon();
    Higado higo=new Higado();
    Apendice apd=new Apendice();


// Clase Corazon
    class Corazon {
        private String tamaño;
        private int ritmoCardiaco;
        private boolean sano;

        public String getTamaño() {
            return tamaño;
        }

        public void setTamaño(String tamaño) {
            this.tamaño = tamaño;
        }

        public int getRitmoCardiaco() {
            return ritmoCardiaco;
        }

        public void setRitmoCardiaco(int ritmoCardiaco) {
            this.ritmoCardiaco = ritmoCardiaco;
        }

        public boolean isSano() {
            return sano;
        }

        public void setSano(boolean sano) {
            this.sano = sano;
        }
    }

    // Clase Pulmon
    class Pulmon {
        private String lado;
        private double capacidad;
        private boolean funcionando;

        public String getLado() {
            return lado;
        }

        public void setLado(String lado) {
            this.lado = lado;
        }

        public double getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(double capacidad) {
            this.capacidad = capacidad;
        }

        public boolean isFuncionando() {
            return funcionando;
        }

        public void setFuncionando(boolean funcionando) {
            this.funcionando = funcionando;
        }
    }

    // Clase Higado
    class Higado {
        private double peso;
        private String color;
        private boolean funcionando;

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFuncionando() {
            return funcionando;
        }

        public void setFuncionando(boolean funcionando) {
            this.funcionando = funcionando;
        }
    }

    // Clase Apendice
    class Apendice {
        private double tamaño;
        private boolean inflamado;
        private boolean sano;

        public double getTamaño() {
            return tamaño;
        }

        public void setTamaño(double tamaño) {
            this.tamaño = tamaño;
        }

        public boolean isInflamado() {
            return inflamado;
        }

        public void setInflamado(boolean inflamado) {
            this.inflamado = inflamado;
        }

        public boolean isSano() {
            return sano;
        }

        public void setSano(boolean sano) {
            this.sano = sano;
        }
    }
}

// Clase principal para probar
public class MiProg01 {
    public static void main(String[] args) {
        // Crear un cuerpo humano y sus partes
        CuerpoHumano cuerpoH = new CuerpoHumano();

        cuerpoH.cors.setTamaño("Grande");
        cuerpoH.cors.setRitmoCardiaco(70);
        cuerpoH.cors.setSano(true);

       
        cuerpoH.pulms.setCapacidad(100);
        cuerpoH.pulms.setFuncionando(true);
        cuerpoH.pulms.setLado("Izquierdo");

        cuerpoH.higo.setColor("cafe");
        cuerpoH.higo.setFuncionando(true);
        cuerpoH.higo.setPeso(80);


        cuerpoH.apd.setInflamado(true);
        cuerpoH.apd.setSano(true);
        cuerpoH.apd.setTamaño(90);



        // Imprimir valores
        System.out.println("Información del corazón:");
        System.out.println("Tamaño: " + cuerpoH.cors.getTamaño());
        System.out.println("Ritmo Cardiaco: " + cuerpoH.cors.getRitmoCardiaco());
        System.out.println("¿Sano?: " + cuerpoH.cors.isSano());

        System.out.println("\nInformación del Pulmon:");
        System.out.println("Capacidad: " + cuerpoH.pulms.getCapacidad());
        System.out.println("¿Esta funcionando?: " + cuerpoH.pulms.isFuncionando());
        System.out.println("Lado del pulmon: " + cuerpoH.pulms.getLado());

        System.out.println("\nInformación del Higado:");
        System.out.println("Color: " + cuerpoH.higo.getColor());
        System.out.println("¿Esta funcionando?: " + cuerpoH.higo.isFuncionando());
        System.out.println("Peso: " + cuerpoH.higo.getPeso());

        System.out.println("\nInformación del Apendice:");
        System.out.println("Tamaño: " + cuerpoH.apd.getTamaño());
        System.out.println("¿Esta inflamado?: " + cuerpoH.apd.isInflamado());
        System.out.println("¿Sano?: " + cuerpoH.apd.isSano());
    }
}

package Practica_290324;

class Bicicleta{
    Rueda rue=new Rueda();
    Cuadro cud=new Cuadro();

// Definición de la clase Rueda
    class Rueda {
        private int diametro;
        private String tipo;
        private String material;

        // Getters y setters
        public int getDiametro() {
            return diametro;
        }
        public void setDiametro(int diametro) {
            this.diametro = diametro;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
    }   

    // Definición de la clase Cuadro
    class Cuadro {
        private String material;
        private String color;
        private int tamaño;
    
        // Getters y setters
        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getTamaño() {
            return tamaño;
        }

        public void setTamaño(int tamaño) {
            this.tamaño = tamaño;
        }
    }
}


public class MiProg02 {
    public static void main(String[] args) {
        Bicicleta bicy = new Bicicleta();
        
      
        bicy.rue.setDiametro(90);;
        bicy.rue.setMaterial("Hierro");
        bicy.rue.setTipo("Montaña");

     
        bicy.cud.setMaterial("Hierro");
        bicy.cud.setColor("Amarilla");
        bicy.cud.setTamaño(200);


        // Imprimir valores de atributos
        System.out.println("\nInformacion de la Rueda:");
        System.out.println("Diametro: " + bicy.rue.getDiametro());
        System.out.println("Material: " + bicy.rue.getMaterial());
        System.out.println("Tipo: " + bicy.rue.getTipo());

        System.out.println("\nInformación del Cuadro:");
        System.out.println("Material: " + bicy.cud.getMaterial());
        System.out.println("Color: " + bicy.cud.getColor());
        System.out.println("Tamaño: " + bicy.cud.getTamaño());
    }
}*/

/*lab 2.4.1
package Practica_190324;

//Clase CuerpoHumano
class CuerpoHumano {
    Corazon cors=new Corazon();
    Pulmon pulms=new Pulmon();
    Higado higo=new Higado();;
    Apendice apd=new Apendice();
}


// Clase Corazon
class Corazon {
    private int ritmoCardiaco;
    private String tipoSangre;
    private boolean palpitacionesIrregulares;


    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }


    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }
    public String getTipoSangre() {
        return tipoSangre;
    }


    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


    public boolean hasPalpitacionesIrregulares() {
        return palpitacionesIrregulares;
    }


    public void setPalpitacionesIrregulares(boolean palpitacionesIrregulares) {
        this.palpitacionesIrregulares = palpitacionesIrregulares;
    }
}


// Clase Pulmon
class Pulmon {
    private String lado;
    private double capacidad;
    private boolean tos;


    public String getLado() {
        return lado;
    }


    public void setLado(String lado) {
        this.lado = lado;
    }


    public double getCapacidad() {
        return capacidad;
    }


    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    public boolean hasTos() {
        return tos;
    }


    public void setTos(boolean tos) {
        this.tos = tos;
    }
}


// Clase Higado
class Higado {
    private double peso;
    private String color;
    private boolean metabolismoAcelerado;


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }
    public boolean hasMetabolismoAcelerado() {
        return metabolismoAcelerado;
    }


    public void setMetabolismoAcelerado(boolean metabolismoAcelerado) {
        this.metabolismoAcelerado = metabolismoAcelerado;
    }
}


// Clase Apendice
class Apendice {
    private double tamaño;
    private boolean inflamado;
    private boolean sano;


    public double getTamaño() {
        return tamaño;
    }


    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }


    public boolean isInflamado() {
        return inflamado;
    }


    public void setInflamado(boolean inflamado) {
        this.inflamado = inflamado;
    }


    public boolean isSano() {
        return sano;
    }


    public void setSano(boolean sano) {
        this.sano = sano;
    }
}


// Clase principal para probar
public class Main {
    public static void main(String[] args) {
        // Crear un cuerpo humano y sus partes
        CuerpoHumano cuerpo = new CuerpoHumano();


        cuerpo.cors.setPalpitacionesIrregulares(true);
        cuerpo.cors.setRitmoCardiaco(52);
        cuerpo.cors.setTipoSangre("A");


        cuerpo.pulms.setCapacidad(10.2);
        cuerpo.pulms.setLado("Derecho");
        cuerpo.pulms.setTos(true);
   
        cuerpo.higo.setColor("Cafe");
        cuerpo.higo.setMetabolismoAcelerado(true);
        cuerpo.higo.setPeso(52.2);


        cuerpo.apd.setInflamado(true);
        cuerpo.apd.setSano(true);
        cuerpo.apd.setTamaño(22.1);
       
        // Acceder a los atributos de cada órgano y sus respectivos métodos get
        // Corazón
        System.out.println("Corazón:");
        System.out.println("Ritmo Cardiaco: " + cuerpo.cors.getRitmoCardiaco());
        System.out.println("Tipo de Sangre: " + cuerpo.cors.getTipoSangre());
        System.out.println("Palpitaciones Irregulares: " + cuerpo.cors.hasPalpitacionesIrregulares());
        System.out.println();


        // Pulmones
        System.out.println("Pulmones:");
        System.out.println("Lado: " + cuerpo.pulms.getLado());
        System.out.println("Capacidad: " + cuerpo.pulms.getCapacidad());
        System.out.println("Tos: " + cuerpo.pulms.hasTos());
        System.out.println();


        // Hígado
        System.out.println("Hígado:");
        System.out.println("Peso: " + cuerpo.higo.getPeso());
        System.out.println("Color: " + cuerpo.higo.getColor());
        System.out.println("Metabolismo Acelerado: " + cuerpo.higo.hasMetabolismoAcelerado());
        System.out.println();


        // Apendice
        System.out.println("Apendice:");
        System.out.println("Tamaño: " + cuerpo.apd.getTamaño());
        System.out.println("Inflamado: " + cuerpo.apd.isInflamado());
        System.out.println("Sano: " + cuerpo.apd.isSano());
    }
}
       
  package Practica_190324;



class Bicicleta{
    Rueda ruedaD = new Rueda();
    Rueda ruedaT = new Rueda();
    Cuadro cud=new Cuadro();
}


// Definición de la clase Rueda
class Rueda {
    private int diametro;
    private String tipo;
    private String marca; // New attribute
    private boolean inflada; // New attribute
   


    // Getters y setters
    public int getDiametro() {
        return diametro;
    }
    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public boolean isInflada() {
        return inflada;
    }


    public void setInflada(boolean inflada) {
        this.inflada = inflada;
    }


}


// Definición de la clase Cuadro
class Cuadro {
   
    private String color;
    private int tamaño;
    private String material; // New attribute
    private String tipoSuspension; // New attribute
   
    // Getters y setter
    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getTamaño() {
        return tamaño;
    }


    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    }


    public String getTipoSuspension() {
        return tipoSuspension;
    }


    public void setTipoSuspension(String tipoSuspension) {
        this.tipoSuspension = tipoSuspension;
    }
}






public class Main1 {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        bici.ruedaD.setDiametro(90);
        bici.ruedaD.setTipo("Montaña");
        bici.ruedaD.setMarca("MarcaX");
        bici.ruedaD.setInflada(true);


        bici.ruedaT.setDiametro(90);
        bici.ruedaT.setTipo("Montaña");
        bici.ruedaT.setMarca("MarcaX");
        bici.ruedaT.setInflada(true);


        bici.cud.setColor("Amarilla");
        bici.cud.setTamaño(200);
        bici.cud.setMaterial("Aluminio");
        bici.cud.setTipoSuspension("Delantera");


        // Imprimir valores de atributos
        System.out.println("\nInformacion de la Rueda Delantera:");
        System.out.println("Diametro: " + bici.ruedaD.getDiametro()+"cm");
        System.out.println("Tipo: " + bici.ruedaD.getTipo());
        System.out.println("Marca: " + bici.ruedaD.getMarca());
        System.out.println("Inflada: " + bici.ruedaD.isInflada());


        System.out.println("\nInformacion de la Rueda Trasera:");
        System.out.println("Diametro: " + bici.ruedaT.getDiametro()+"cm");
        System.out.println("Tipo: " + bici.ruedaT.getTipo());
        System.out.println("Marca: " + bici.ruedaT.getMarca());
        System.out.println("Inflada: " + bici.ruedaT.isInflada());


        System.out.println("\nInformación del Cuadro:");
        System.out.println("Color: " + bici.cud.getColor());
        System.out.println("Tamaño: " + bici.cud.getTamaño()+"cm");
        System.out.println("Material: " + bici.cud.getMaterial());
        System.out.println("Tipo de Suspensión: " + bici.cud.getTipoSuspension());
    }
} */

/*lab3.1.1
package Practica_180524;

// Clase Producto (clase padre)
class Producto {
    private String nombre;
    private double precio;
    private String descripcion;

    public Producto(String nombre, double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Descripción: " + descripcion);
    }
}

////Clase Comestible (clase hija)
class Comestible extends Producto {
    private String fechaCaducidad;

    public Comestible(String nombre, double precio, String descripcion, String fechaCaducidad) {
        super(nombre, precio, descripcion);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
    }
}

// Clase Herramienta (clase hija)
class Herramienta extends Producto {
    private String material;

    public Herramienta(String nombre, double precio, String descripcion, String material) {
        super(nombre, precio, descripcion);
        this.material = material;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Material: " + material);
    }
}

// Clase ArticuloDeOficina (clase hija)
class ArticuloDeOficina extends Producto {
    private String tipo;

    public ArticuloDeOficina(String nombre, double precio, String descripcion, String tipo) {
        super(nombre, precio, descripcion);
        this.tipo = tipo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
    }
}

// Clase principal para probar las clases Producto, Comestible, Herramienta y ArticuloDeOficina
public class Main {
    public static void main(String[] args) {
        Comestible manzana = new Comestible("Manzana", 1.5, "Manzana roja", "15/05/2024");
        Herramienta martillo = new Herramienta("Martillo", 15.0, "Martillo de carpintero", "Acero");
        ArticuloDeOficina lapiz = new ArticuloDeOficina("Lápiz", 0.5, "Lápiz HB", "Escritura");

        System.out.println("Información de la manzana:");
        manzana.mostrarInformacion();
        System.out.println("\nInformación del martillo:");
        martillo.mostrarInformacion();
        System.out.println("\nInformación del lápiz:");
        lapiz.mostrarInformacion();
    }
} */

/*lab 3.3
package Practica3_180524;

// Interfaz para comportamientos de conducción
interface Conducible {
    void acelerar(int velocidad);
    void girarIzquierda();
    void girarDerecha();
}

// Interfaz para comportamientos de entretenimiento
interface Entretenible {
    void encenderRadio();
    void apagarRadio();
    void cambiarEstacion(int estacion);
}

// Clase abstracta para vehículos
abstract class Vehiculo {
    // Método común a todos los vehículos
    public void arrancar() {
        System.out.println("El vehículo ha arrancado.");
    }

    // Método común a todos los vehículos
    public void detenerse() {
        System.out.println("El vehículo se ha detenido.");
    }

    // Método abstracto para girar
    abstract void girar();

    // Otros métodos comunes a todos los vehículos
}

// Clase concreta que representa un automóvil
class Automovil extends Vehiculo implements Conducible, Entretenible {
    @Override
    public void acelerar(int velocidad) {
        System.out.println("El automóvil acelera a " + velocidad + " km/h.");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("El automóvil gira a la izquierda.");
    }

    @Override
    public void girarDerecha() {
        System.out.println("El automóvil gira a la derecha.");
    }

    @Override
    void girar() {
        // Implementación específica para girar un automóvil
        System.out.println("El automóvil gira.");
    }

    @Override
    public void encenderRadio() {
        System.out.println("La radio del automóvil está encendida.");
    }

    @Override
    public void apagarRadio() {
        System.out.println("La radio del automóvil está apagada.");
    }

    @Override
    public void cambiarEstacion(int estacion) {
        System.out.println("Cambiando a la estación de radio " + estacion + ".");
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Automovil
        Automovil miAutomovil = new Automovil();

        // Llamar a los métodos de Automovil
        miAutomovil.arrancar();
        miAutomovil.acelerar(100);
        miAutomovil.girarIzquierda();
        miAutomovil.girarDerecha();
        miAutomovil.encenderRadio();
        miAutomovil.cambiarEstacion(101);
        miAutomovil.apagarRadio();
        miAutomovil.detenerse();
    }
} */

/*lab4.1.1
package Practica_210524;

// Clase base Vehículo
class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Starting engine of the vehicle");
    }

    public void stopEngine() {
        System.out.println("Stopping engine of the vehicle");
    }

    public double getFuelEfficiency() {
        return 0.0; // Base implementation
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

// Subclase Coche
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine of the car");
    }

    @Override
    public double getFuelEfficiency() {
        return 15.0; // km/l for a typical car
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Subclase Motocicleta
class Motorcycle extends Vehicle {
    String handlebarType;

    public Motorcycle(String brand, String model, int year, String handlebarType) {
        super(brand, model, year);
        this.handlebarType = handlebarType;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine of the motorcycle");
    }

    @Override
    public double getFuelEfficiency() {
        return 40.0; // km/l for a typical motorcycle
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Handlebar Type: " + handlebarType);
    }
}

// Subclase Camión
class Truck extends Vehicle {
    double loadCapacity;

    public Truck(String brand, String model, int year, double loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine of the truck");
    }

    @Override
    public double getFuelEfficiency() {
        return 8.0; // km/l for a typical truck
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Prueba del Polimorfismo
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle myVehicle;

        myVehicle = new Car("Toyota", "Corolla", 2020, 4);
        myVehicle.startEngine(); // Outputs "Starting engine of the car"
        System.out.println("Fuel efficiency: " + myVehicle.getFuelEfficiency()); // Outputs 15.0
        myVehicle.displayInfo(); // Displays brand, model, year, number of doors

        myVehicle = new Motorcycle("Honda", "CBR", 2021, "Sport");
        myVehicle.startEngine(); // Outputs "Starting engine of the motorcycle"
        System.out.println("Fuel efficiency: " + myVehicle.getFuelEfficiency()); // Outputs 40.0
        myVehicle.displayInfo(); // Displays brand, model, year, handlebar type

        myVehicle = new Truck("Volvo", "FH16", 2019, 18);
        myVehicle.startEngine(); // Outputs "Starting engine of the truck"
        System.out.println("Fuel efficiency: " + myVehicle.getFuelEfficiency()); // Outputs 8.0
        myVehicle.displayInfo(); // Displays brand, model, year, load capacity
    }
}*/

/*lab4.2.1
package Practica_230524;

import java.util.ArrayList;
import java.util.List;

// Clase Reservation
class Reservation {
    private int reservationId;
    private Room room;
    private Customer customer;
    private String checkInDate;
    private String checkOutDate;

    public Reservation(int reservationId, Room room, Customer customer, String checkInDate, String checkOutDate) {
        this.reservationId = reservationId;
        this.room = room;
        this.customer = customer;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void confirmReservation() {
        System.out.println("Reservation confirmed for " + customer.getName() + " in room " + room.getRoomNumber());
    }

    public void cancelReservation() {
        System.out.println("Reservation cancelled for " + customer.getName() + " in room " + room.getRoomNumber());
    }

    public void modifyReservation(String newCheckInDate, String newCheckOutDate) {
        this.checkInDate = newCheckInDate;
        this.checkOutDate = newCheckOutDate;
        System.out.println("Reservation dates modified for " + customer.getName());
    }
}

// Clase Room
class Room {
    private int roomNumber;
    private String type;
    private boolean isAvailable;

    public Room(int roomNumber, String type, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isAvailable = isAvailable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

// Clase Customer
class Customer {
    private int customerId;
    private String name;
    private String contactInfo;

    public Customer(int customerId, String name, String contactInfo) {
        this.customerId = customerId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}

// Clase Hotel
class Hotel {
    private String name;
    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel(String name, List<Room> rooms) {
        this.name = name;
        this.rooms = rooms;
        this.reservations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void addReservation(Reservation reservation) {
        if (reservation.getRoom().isAvailable()) {
            reservations.add(reservation);
            reservation.getRoom().setAvailable(false);
            reservation.confirmReservation();
        } else {
            System.out.println("Room " + reservation.getRoom().getRoomNumber() + " is not available.");
        }
    }

    public void cancelReservation(Reservation reservation) {
        reservations.remove(reservation);
        reservation.getRoom().setAvailable(true);
        reservation.cancelReservation();
    }

    public void listReservations() {
        for (Reservation reservation : reservations) {
            System.out.println("Reservation ID: " + reservation.getReservationId() + ", Customer: " + reservation.getCustomer().getName());
        }
    }
}

// Clase de prueba
public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(101, "Single", true);
        Room room2 = new Room(102, "Double", true);
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);

        Hotel hotel = new Hotel("Hotel California", rooms);

        Customer customer1 = new Customer(1, "John Doe", "john@example.com");
        Reservation reservation1 = new Reservation(1, room1, customer1, "2024-06-01", "2024-06-05");

        hotel.addReservation(reservation1); // Confirm reservation

        hotel.listReservations(); // List all reservations

        hotel.cancelReservation(reservation1); // Cancel reservation

        hotel.listReservations(); // List all reservations again
    }
}*/

/*lab5.2.1
package Practica_290524;
import java.util.concurrent.locks.ReentrantLock;

class Event {
    private int availableTickets;
    private ReentrantLock lock;

    public Event(int totalTickets) {
        this.availableTickets = totalTickets;
        this.lock = new ReentrantLock();
    }

    public boolean bookTickets(int ticketsToBook) {
        lock.lock();
        try {
            if (ticketsToBook > availableTickets) {
                return false; // No hay suficientes entradas disponibles
            }
            availableTickets -= ticketsToBook;
            System.out.println(Thread.currentThread().getName() + " reservó " + ticketsToBook + " entradas.");
            return true; // Reserva exitosa
        } finally {
            lock.unlock();
        }
    }
}

class User extends Thread {
    private Event event;
    private int ticketsToBook;

    public User(Event event, int ticketsToBook) {
        this.event = event;
        this.ticketsToBook = ticketsToBook;
    }

    public void run() {
        boolean success = event.bookTickets(ticketsToBook);
        if (!success) {
            System.out.println(Thread.currentThread().getName() + " no pudo reservar las entradas.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Event event = new Event(100); // Total de 100 entradas disponibles
        int numberOfUsers = 5;

        for (int i = 0; i < numberOfUsers; i++) {
            User user = new User(event, 3); // Cada usuario intenta reservar 3 entradas
            user.start();
        }
    }
}*/

/*lab 4.1.1
package Practica2_290324;

// Definición de la interfaz Vehiculo
interface Vehiculo {
    void arrancar();
    void detener();
    void getInfo();
}

// Clase abstracta VehiculoTerrestre que implementa la interfaz Vehiculo
abstract class VehiculoTerrestre implements Vehiculo {
    abstract void conducir();
}

// Clase Carro que extiende de VehiculoTerrestre
class Carro extends VehiculoTerrestre {
    @Override
    public void arrancar() {
        System.out.println("El carro arranca.");
    }

    @Override
    public void detener() {
        System.out.println("El carro se detiene.");
    }

    @Override
    public void getInfo() {
        System.out.println("Este es un carro.");
    }

    @Override
    void conducir() {
        System.out.println("El carro está en movimiento.");
    }
}

// Clase abstracta VehiculoAereo que implementa la interfaz Vehiculo
abstract class VehiculoAereo implements Vehiculo {
    abstract void volar();
}

// Clase Avion que extiende de VehiculoAereo
class Avion extends VehiculoAereo {
    @Override
    public void arrancar() {
        System.out.println("El avión arranca los motores.");
    }

    @Override
    public void detener() {
        System.out.println("El avión apaga los motores.");
    }

    @Override
    public void getInfo() {
        System.out.println("Este es un avión.");
    }

    @Override
    void volar() {
        System.out.println("El avión está en vuelo.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo Vehiculo
        Vehiculo carro = new Carro();
        Vehiculo avion = new Avion();

        // Polimorfismo en acción
        carro.arrancar();
        carro.detener();
        carro.getInfo();

        avion.arrancar();
        avion.detener();
        avion.getInfo();

        // Llamada a métodos específicos de las subclases
        ((Carro) carro).conducir();
        ((Avion) avion).volar();
    }
} */