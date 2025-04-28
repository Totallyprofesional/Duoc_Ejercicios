import java.util.Scanner;
import java.util.ArrayList;

public class Exp3_S7_Pablo_Cárcamo {
     
// Variables 
static int general = 18000, vip = 30000, platea = 15000, palco = 20000;
static int ubicación = 0, precio = 0, descuento = 0;

static boolean[] asientosGeneral = new boolean [10];  
static boolean[] asientosVip = new boolean [10];   
static boolean[] asientosPlatea = new boolean [10]; 
static boolean[] asientosPalco = new boolean [10]; 

static ArrayList<String> info = new ArrayList<>();
static String porcentaje = (""); 
static String tipoEntrada = ("");
static int precioEntrada = 0;
static int totalVentas = 0; 
static int totalEntradas = 0; 

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int opción = 0;

        // Menú principal 
        do {
            System.out.println("\n Bienvenido al Teatro Moro. Elija una opción: ");
            System.out.println("");
            System.out.println("1)Venta de entradas");
            System.out.println("2)Resumen de ventas");
            System.out.println("3)Ingresos totales");
            System.out.println("4)Salir");
        
            opción = sc.nextInt();
                 
            // Opciones 
            switch (opción) {   
                case 1:
                    VentaEntradas(sc);
                    UbicaciónEntradas(sc);
                    DescuentoEdad(sc);  
                    Boleta();
                    break;
                case 2:       
                    System.out.println("\n Resumen de ventas: ");   
                    System.out.println(info);  
                    break;
                case 3:    
                    IngresosTotales();
                    break;
                case 4:        
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Por favor ingrese una opción");
                    break;
            }           
            
        }   while (opción != 4); 
            sc.close();
    }     
    
    // Venta de entradas
    public static void VentaEntradas(Scanner sc) { 
        
        do {
        System.out.println("\n Elegir ubicación: ");
        System.out.println("\n 1)General \n 2)VIP \n 3)Platea \n 4)Palco");
        ubicación = sc.nextInt();
         
            switch (ubicación){  
                case 1:    
                    precio = general;
                    System.out.println("\n Precio general: $" + general); 
                    info.add("Entrada General"); 
                    tipoEntrada = ("General");
                    precioEntrada = general;
                    break;
                case 2:           
                    precio = vip;
                    System.out.println("\n Precio VIP: $" + vip); 
                    info.add("Entrada Vip");
                    tipoEntrada = ("Vip");
                    precioEntrada = vip;
                    break;
                case 3:    
                    precio = platea;
                    System.out.println("\n Precio platea: $" + platea); 
                    info.add("Entrada Platea");
                    tipoEntrada = ("Platea");
                    precioEntrada = platea;
                    break;
                case 4:  
                    precio = palco;
                    System.out.println("\n Precio palco: $" + palco); 
                    info.add("Entrada Palco");
                    tipoEntrada = ("Palco");
                    precioEntrada = palco;
                    break;
                default:
                    System.out.println("\n Por favor ingrese una ubicación");
                    break;
            }
            
        }   while (ubicación < 1 || ubicación > 4);     
    }  
    
    // Ubicación de entradas
    public static void UbicaciónEntradas(Scanner sc){   
           
    // Mapa asientos   
    boolean reservado = false; 
    int asiento = 0;
        
        boolean[] fila = new boolean [0]; 

        switch (ubicación){  
            case 1:      
                fila = asientosGeneral;            
                break;
            case 2:      
                fila = asientosVip;              
                break;
            case 3:      
                fila = asientosPlatea;            
                break;
            case 4:      
                fila = asientosPalco;             
                break;
        }     
        
        // Selección de asientos
        
        do {
            System.out.println("\n Mapa del teatro: ");
            for (int i = 0; i < fila.length; i++) {
                if(fila[i]){
                System.out.print("[X]");
                }else{
                    System.out.print("[O]"); 
                }   System.out.print("");
           }
       
            System.out.println("\n Seleccione asiento (1-10)");      
            asiento = sc.nextInt(); 
        
            if (fila[asiento -1] == false){         
                fila[asiento -1] = true;         
                reservado = true;      
            }
        
            if (reservado == true){
                System.out.println("\n Asiento reservado!");
                asiento++;
                break;
            }else if(reservado == false){
                System.out.println("\n Asiento ocupado!"); 
            } 
        }   while (reservado == false);
    }
     
    // Edad y descuentos
    public static void DescuentoEdad(Scanner sc){
        System.out.println("\n Ingrese edad: ");
        int edad = sc.nextInt();
        
        if (edad >= 18 && edad < 60){  
            System.out.println("\n Precio normal");      
            porcentaje = ("0%");
             
        }else if (edad < 18){ 
            descuento = (int)(precio * 0.10);
            precio = (precio - (descuento));
            porcentaje = ("10%");
            System.out.println("\n Precio estudiante: $" + precio);
            
        }else if (edad >= 60){
            descuento = (int)(precio * 0.15);
            precio = (precio - (descuento ));
            porcentaje = ("15%");
            System.out.println("\n Precio adulto mayor: $" + precio);
 
        }else{
            System.out.println("Por favor ingrese un valor válido");
        }      
        
            // Sumar informacion de ventas totales
            info.add("\n Total: " + precio);
            info.add("Descuento aplicado: " + descuento);   
            totalVentas += precio;
            totalEntradas ++;
    }
     
    //Boleta de venta
    public static void Boleta(){ 
        System.out.println("");
        System.out.println("------------------------------------");   
        System.out.println("            Teatro Moro             ");   
        System.out.println("------------------------------------"); 
        System.out.println("Ubicación: " + tipoEntrada);  
        System.out.println("Costo base: " + precioEntrada);  
        System.out.println("Descuento aplicado: -$" + porcentaje);
        System.out.println("Costo final: " + precio);
        System.out.println("------------------------------------");   
        System.out.println("Gracias por su vistia al Teatro Moro");      
        System.out.println("------------------------------------"); 
    }
      
    //Ingresos totales
    public static void IngresosTotales(){
        
        System.out.println("\n Total de entradas vendidas: ");
        System.out.println(totalEntradas);
        System.out.println("\n Ingreso total de ventas: ");
        System.out.println("$" + totalVentas);
    }
    
}      
       

    
    
 

  
       
  
 
   
