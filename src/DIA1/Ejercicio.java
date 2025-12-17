/*
Se requiere calcular las horas extras devengadas por 1 empleado, en un dia, tomar en cuenta lo siguiente, si el empleado gana mas de 2 SMLV cada hora extra que se 
encuentre en la primera quincena y, no sea fin de semana se paga al 1% del salario devengado, si es fin de semana al 2% si en caso dado es la segunda quicena, se pagan 
por igual fines de semanas o no a 3%. Si en caso dado el empleado gana menos de 2 SMLV, entonces infomarles que aun no esta disponible dicho modulo para su estirpe. 

 */
package DIA1;

/**
 *
 * @author STIVEN MARTINEZ VILLAMIZAR
 */


import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el salario base del empleado");
        double salario_emp = scanner.nextDouble();
        
        System.out.println("Ingresa el número de la semana");
        int semana = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Ingresa el día de la semana (numero)");
        int dia = scanner.nextInt();
        
        System.out.println("Ingresa las horas extra trabajadas: ");
        int horasExt = scanner.nextInt();
        
        scanner.close();
if (semana == 1) {
            if (salario_emp == 2000000) {
                if (dia != 6 && dia != 7) {
                    double valorPorHora = salario_emp * 0.01;
                    double aumentoSalario = valorPorHora * horasExt;
                    salario_emp = salario_emp + aumentoSalario;
                } else {
                    if (dia == 6 || dia == 7) {
                        double valorPorHora = salario_emp * 0.02;
                        double aumentoSalario = valorPorHora * horasExt;
                        salario_emp = salario_emp + aumentoSalario;
                    }
                }
            } else {
                if (salario_emp < 2000000) {
                    System.out.println("Lo sentimos. No eres apto para cobrar horas extra");
                }
            }

        } else {
            if (semana == 2) {
                if (salario_emp == 2000000) {
                        double valorPorHora = salario_emp * 0.02;
                        double aumentoSalario = valorPorHora * horasExt;
                        salario_emp = salario_emp + aumentoSalario;
                } else {
                    if (salario_emp < 2000000) {
                        System.out.println("Lo sentimos. No eres apto para cobrar horas extra");
                    }
                }
            }
        }
        System.out.println("Tu salario total es: %s".formatted(salario_emp));

    }

} 
