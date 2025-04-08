
import java.util.Scanner;

public class Teatro4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inicio loop de compra 

        int otra = 1; 

        // Menú principal
        
        while (otra == 1) {
            System.out.println("Bienvenido");
            System.out.println("Elija una opción");
            System.out.println("1) Comprar entrada");
            System.out.println("2) Salir");
            System.out.println();

            int opcion = sc.nextInt();

            while (opcion < 1 || opcion > 2) {
                System.out.println("Por favor ingrese un valor: ");
                opcion = sc.nextInt();
            }
                // Ubicación
                
                if (opcion == 1){
                    System.out.println("Ubicación:");
                    System.out.println("1) VIP");
                    System.out.println("2) Platea");
                    System.out.println("3) Palco");
                    System.out.println("Elija ubicación:");
                    int ubicacion = sc.nextInt();

                    while (ubicacion < 1 || ubicacion > 3) {
                        System.out.println("Por favor ingrese un valor");
                        ubicacion = sc.nextInt();
                    }
                    
                    // Edad

                    int Vip = 30000;
                    int Platea = 18000;
                    int Palco = 13000;

                    System.out.println("Ingrese edad:");
                    int edad = sc.nextInt();
                    int precio = 0;

                    if (ubicacion == 1) {
                        precio = Vip;
                        System.out.println("VIP: $" + Vip);
                    } else if (ubicacion == 2) {
                        precio = Platea;
                        System.out.println("Platea: $" + Platea);
                    } else if (ubicacion == 3) {
                        precio = Palco;
                        System.out.println("Palco: $" + Palco);
                    }
                    
                    double estudiante = precio * 0.10;
                    double AdultoMayor = precio * 0.15;

                    if (edad < 18) {
                        precio = (int)(precio - estudiante);
                        System.out.println("Descuento estudiante -10%");
                    } else if (edad >= 60) {
                        precio = (int)(precio - AdultoMayor);
                        System.out.println("Descuento adulto mayor -15%");
                    }

                    System.out.println("Total a pagar: $" + precio);
                    
                }else if (opcion ==2 ){
                    System.out.println("Fin del programa.");
                    break;
            }
            
            // Loop de compra
            
                System.out.println("¿Desea comprar otra entrada?");
                System.out.println("1) Sí");
                System.out.println("2) No");;
                otra = sc.nextInt();
                
                if (otra == 2 || otra != 1) {
                System.out.println("Muchas gracias por su compra.");
            }
                
                while (otra < 1 || otra > 2) {
                System.out.println("Por favor ingrese una opción: ");
                otra = sc.nextInt();
            }
            
        }   sc.close();
    }
}
