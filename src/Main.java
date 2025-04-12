import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); /*Defino clase para capturar valores por teclado*/
        String nombreEmpleado , documentoEmpleado  = "";
        double salarioBruto =0 ,  salarioNetoCreate=0 , valorHora=0 , cantidadHoras= 0;
        double deduccionSalud , deduccionPension=0 , horasExtra=0 , valorHorasExtra=0 ,bonificacionExtra=0 , fondoSolidarioPensional=0 , valorRetencionFuente=0 , auxilioTransporte=0 , salarioMinimo = 0;

        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = sc.nextLine();

        System.out.println("Ingrese el documento del empleado: ");
        documentoEmpleado = sc.nextLine();
        System.out.println("Ingrese el valor de la hora: ");
        valorHora = sc.nextDouble();
        System.out.println ("Ingrese la cantidad de horas trabajadas: ");
        cantidadHoras = sc.nextDouble();
        System.out.println("Ingrese el valor del salario mínimo actual: ");
        salarioMinimo = sc.nextDouble();

        if(cantidadHoras > 24){
            System.out.println("Se le puede pagar al empleado ");
            salarioBruto = valorHora * cantidadHoras;
            System.out.println("El salario bruto del empleado: " + nombreEmpleado + " es $" + salarioBruto);
            deduccionPension = salarioBruto * 0.04;
            deduccionSalud = salarioBruto * 0.04;
            System.out.println("La deducción por salud es: "+ deduccionSalud);
            System.out.println("La deducción por pensión es: " + deduccionPension);
            System.out.println ("El auxilio de transporte es: " + auxilioTransporte);
            System.out.println("La bonificación es: " + bonificacionExtra);
            System.out.println ("El pago por horas extra es: " + valorHorasExtra);
            System.out.println("El salario neto es: " + (salarioBruto - deduccionSalud - deduccionPension + auxilioTransporte + bonificacionExtra + valorHorasExtra));

            if(salarioBruto <= (salarioMinimo*2)){
                auxilioTransporte = 200000;
                bonificacionExtra = salarioBruto * 0.1;

            } else {
                auxilioTransporte = 0;
            }
            if(cantidadHoras > 96){
                horasExtra = cantidadHoras - 96;
                valorHorasExtra = (valorHora*0.25) * horasExtra;

            }
            System.out.println ("Detalle de pago: " + nombreEmpleado);



        } else{
            System.out.print("Le faltan " + (24 - cantidadHoras) + "horas de trabajo");

        }

    }
}