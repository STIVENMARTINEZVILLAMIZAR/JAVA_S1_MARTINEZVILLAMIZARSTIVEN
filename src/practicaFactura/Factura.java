/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaFactura;

/**
 *
 * @author camper
 */
public class Factura {
    
    static void validacion(int valorminimo, int valormaximo, String mensaje){
        boolean validar= false;
        int op=0;
        do
         
       {
            try{
                System.out.println("mensaje");
               op= new Scanner(source:System.in).nextInt();
                while(op< valorminimo || op > valormaximo) {
                       System.out.println("opcion no valida, usuario intenete de nuevo");
                       op= new Scanner(source: System.in).nextInt();
                }
                validar=true;
                
            }catch (Exception e){
                System.out.println("Error, solo se admiten numeros");
            }
        }
        while(validar ==false);
        return op;
    }
    
    public static void main(String[] args) {
        for(int=i=0; i <4; i++) {
        System.out.println("Mesa" + (i + 1));
        System.out.println("¿Esta mesa se ordeno platillos?/n1=SI/n2=NO");
        
    }
    }
    
}
