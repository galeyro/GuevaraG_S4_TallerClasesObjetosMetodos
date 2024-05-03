import java.util.Date;

/*
Estudiante: Galo Guevara
Materia: Programación 2
Deber: S4: Taller de clases, objetos y métodos

Descripción:
    Generar una aplicación en java que permita el ingreso de datos de un empleado:
        *Cedula, nombre, genero, fecha de nacimiento, informacion de residencia
        *Salario
        *Fecha de ingreso

    La aplicación debe permitir:
        *Modificar salario
        *Calcular edad
        *Calcular prestaciones (antiguedad * salario/12)
 */
public class Main{
    public static void main(String[] args){
        Date fecha_nacimiento = new Date("13/08/2000");//aqui define fecha de nacimiento
        Date fecha_ingreso = new Date("25/10/2018"); //aqui define fecha de ingreso

        Empleado emp1 = new Empleado("1003373105", "Galo Guevara", 'M', fecha_nacimiento, fecha_ingreso);
        emp1.getResidencia().setCiudad("Ibarra");
        emp1.getResidencia().setDireccion("Av. Atahualpa y Juana Otavalipa");
        System.out.println("Cédula: "+emp1.getCedula());
        System.out.println("Nombre: "+emp1.getNombre());
        System.out.println("Género: "+emp1.getGenero());
        System.out.println("Ciudad de residencia: "+ emp1.getResidencia().getCiudad());
        System.out.println("Dirección de residencia: "+emp1.getResidencia().getDireccion());
        System.out.println("------------------------------");

        //1. Modificar salario de empleado
        System.out.println("\nEl sueldo actual es: "+emp1.getSalario());
        emp1.setSalario(750.25);
        System.out.println("El nuevo sueldo del empleado es: "+emp1.getSalario());

        //2. Calcular la edad
        System.out.println("\nLa edad del empleado es: "+emp1.CalcularEdad());
        System.out.printf("\n");

        //3. Calcular prestaciones
        emp1.CalcularPrestaciones();
    }
}