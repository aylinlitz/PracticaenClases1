package ec.edu.espoch.practica;

public class Practica {

    public static void main(String[] args) 
    {
        Estudiantes estudianteUno = new Estudiantes();
        estudianteUno.nombre = "Aylin";
        estudianteUno.identificacion = 2100;
        estudianteUno.calificacion = 7;
        System.out.println("nombre:" + estudianteUno.nombre);
        System.out.println("identificacion:" + estudianteUno.identificacion);
        System.out.println("calificacion:" + estudianteUno.calificacion);
        
        Estudiantes estudianteDos = new Estudiantes();
        estudianteDos.nombre = "Estefania";
        estudianteDos.identificacion = 2111;
        estudianteDos.calificacion = 9;
        System.out.println("nombre:" + estudianteDos.nombre);
        System.out.println("identificacion:" + estudianteDos.identificacion);
        System.out.println("calificacion:" + estudianteDos.calificacion);
        
    }
   
}
