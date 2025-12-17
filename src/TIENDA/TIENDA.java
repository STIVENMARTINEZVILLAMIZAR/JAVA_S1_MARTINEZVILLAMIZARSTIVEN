package TIENDA;

/**
 * @author STIVEN MARTINEZ VILLAMIZAR
 */
import java.util.Scanner;

public class TIENDA {

    public static void main(String[] args) {
        // Definimos credencia de usuario
        String nombre_User = "zeven";
        String clave_user = "1416";
        int opciones_menu = 0;
        String detalle="";
        int total =0;

        System.out.println("""
                ****************************
                        ¡BIENVENIDOS!
                 1. EMPEZAR
                *****************************
                """);

        int opcion_empezar = new Scanner(System.in).nextInt();

        if (opcion_empezar == 1) {
            System.out.println("ingrese el numero de cuenta");
            String numero_cuenta = new Scanner(System.in).nextLine();

            numero_cuenta = new Scanner(System.in).nextLine();

        }
        System.out.println("ingrese la contraseña");
        String clave_cuenta = new Scanner(System.in).nextLine();

        clave_cuenta = new Scanner(System.in).nextLine();

    
 
    
        System.out.println("""
                           ***********************************
                                      BIENVENIDOS SURTIYA
                                  
                           CATALOGO
                                1. ASEO
                                2. TECNOLOGIA
                                3. HOGAR
                                4. HERRAMIENTAS
                                5. ROPA
                                6. Salir
                           ***********************************
                           """);

        opciones_menu = new Scanner(System.in).nextInt();
        while (opciones_menu < 1 || opciones_menu > 6) {
            System.out.println("colocastes una opcion no valida");

            opciones_menu = new Scanner(System.in).nextInt();
        }

        switch (opciones_menu) {
            case 1:
                total = total - 57000;
                     detalle += "******************/n"
                        + "Producto: Detergente/n"
                        + "Producto: Trapero/n"
                        + "Producto: Escoba/n"
                        + "producto: Limpido/n";
                break;

            case 2:
                total = total - 100000;
                     detalle += "******************/n"
                        + "Producto: Computador/n"
                        + "Producto: Impresora/n"
                        + "Producto: Televisor/n"
                        + "producto: Telefonos/n" ;          
                break;

            case 3:
                total = total - 1000000;
                     detalle += "******************/n"
                        + "Producto: Lavadora/n"
                        + "Producto: Nevera/n"
                        + "Producto: Televisor/n"
                        + "producto: Telefono Fijo/n";        
                break;

            case 4:
                total = total - 1500000;
                     detalle += "******************/n"
                        + "Producto: Martillo/n"
                        + "Producto: Pulidora/n"
                        + "Producto: Hidrolavadora/n"
                        + "producto: Pistola Remaches/n"; 
                             
                break;
            case 5:
                total = total - 500000;
                     detalle += "******************/n"
                        + "Producto: Blusa/n"
                        + "Producto: Camiseta/n"
                        + "Producto: Short/n"
                        + "producto: Body/n";
                break;

            case 6:

        }

    }
}
