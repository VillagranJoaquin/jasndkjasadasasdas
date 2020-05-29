
package almacen;

import java.util.Scanner;


public class Almacen {

    private static int ventas;

   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Ingrese el nombre del Cliente");        
         String nombre=sc.nextLine();
         System.out.println("Ingrese Telefono");
         int telefono=sc.nextInt();
         System.out.println("Ingrese Cantidad de Ventas");
         int cantidadVentas=sc.nextInt();
         Cliente c =new Cliente(nombre,telefono,ventas);
         
          for (int i = 0; i < cantidadVentas; i++) {
            System.out.println("Ingrese la cantidad de productos vendidos");
            int cantidad = sc.nextInt();
            System.out.println("Ingrese el importe total:");
            int importeTotal = sc.nextInt();
            System.out.println("Ingrese el saldo adeudado:");
            int saldoDeuda = sc.nextInt();

            Ventas v = new Ventas(cantidad, importeTotal, saldoDeuda);
            c.agregarVenta(v);
        }

        System.out.println("El promedio general del importe de todas las ventas: " + c.PromImporte());

        System.out.println("Sumatoria total de la deuda:" + c.sumTotal());

        System.out.println("Ingrese el importe que desea comparar:");
        double importeTotal = sc.nextDouble();
        int cantidad = c.VentasSuperior(importeTotal);
        System.out.println("La cantidad de ventas superior a ese importe es: " + cantidad);
    }
    
}
