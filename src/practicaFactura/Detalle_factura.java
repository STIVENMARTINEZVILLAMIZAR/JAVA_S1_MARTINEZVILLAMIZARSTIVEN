/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaFactura;

/**
 *
 * @author STIVEN MARTINEZ VILLAMIZAR
 */
public class Detalle_factura {

    String cedula;
    String nombre;
    String Apellido;
    String Productos;
    int Dia;
    double Total;

    public Detalle_factura(String ceduula, String nombre, String Apellido, String Productos, int Dia, double Total) {
        this.cedula = ceduula;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Productos = Productos;
        this.Dia = Dia;
        this.Total = Total;
    }

    double CalcularTotal() {
        double total_aux = 0;
        if (Productos.split(regex {
            
        }: ",").length == 1
        
            ){
          total = Double.parseDouble(s:Productos
        );
    }else{
                    for (int i = 0; i < Productos.split(regex {
                        
                    }: ",").length;
                    i++
                    
                        ){
             total_aux += DOuble.parseDouble(Productos.split(regex));",")[i
                ]);
            }
    }
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getProductos() {
        return Productos;
    }

    public int getDia() {
        return Dia;
    }

    public double getTotal() {
        return Total;
    }

}
