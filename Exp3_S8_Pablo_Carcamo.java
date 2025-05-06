import java.util.Scanner;
import java.util.ArrayList;

public class Exp3_S8_Pablo_Carcamo  {
     
// Variables          
static int general = 18000, vip = 30000, platea = 15000, palco = 20000;
static int ubicación = 0, asiento = 0, precio = 0, descuento = 0, edad = 0;

// Filas de entradas
static boolean reservado = false; 
static boolean[] fila = new boolean [0]; 
static boolean[] asientosGeneral = new boolean [10];  
static boolean[] asientosVip = new boolean [10];   
static boolean[] asientosPlatea = new boolean [10];  
static boolean[] asientosPalco = new boolean [10];   

// Variables para información & boleta
static ArrayList<String> info = new ArrayList<>(); 
static String tipoEntrada = ("");

static int precioEntrada = 0;
static int totalVentas = 0;  
static int idnum = 2505000;

static ArrayList<Double> ListaDescuentos = new ArrayList<>();
static double porcentaje1 = 0.10; 
static double porcentaje2 = 0.15; 

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
            System.out.println("4)Modificar datos");
            System.out.println("5)Salir");
            opción = sc.nextInt();
     
            switch (opción) {   
                case 1:
                    VentaEntradas(sc);
                    Filas(sc);
                    SelecciónAsiento(sc);
                    EdadDescuento(sc);  
                    InformaciónVentas();
                    Boleta();
                    break;
                case 2:       
                    ResumenVentas();
                    break;
                case 3:    
                    System.out.println("\n Ingreso total de ventas: ");
                    System.out.println("$" + totalVentas); 
                    break;
                case 4:                        
                    ModificarDatos(sc);
                    break;
                case 5:        
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Por favor ingrese una opción");
                    break;
            }              
        }   while (opción != 5);  
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
                    info.add("\n Entrada General"); 
                    tipoEntrada = ("General");
                    precioEntrada = general;
                    break;
                case 2:           
                    precio = vip;
                    System.out.println("\n Precio VIP: $" + vip); 
                    info.add("\n Entrada Vip");
                    tipoEntrada = ("Vip");
                    precioEntrada = vip;
                    break;
                case 3:    
                    precio = platea;
                    System.out.println("\n Precio platea: $" + platea); 
                    info.add("\n Entrada Platea");
                    tipoEntrada = ("Platea"); 
                    precioEntrada = platea;
                    break;
                case 4:  
                    precio = palco;
                    System.out.println("\n Precio palco: $" + palco); 
                    info.add("\n Entrada Palco");
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
    public static void Filas(Scanner sc){     
        
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
    }
    
    // Selección de asientos
    public static void SelecciónAsiento(Scanner sc){   
        
        do {
            System.out.println("\n Fila seleccionada: ");
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
    public static void EdadDescuento(Scanner sc){     
        System.out.println("\n Ingrese edad: ");
        edad = sc.nextInt()
                ;
        if (edad >= 18 && edad < 60){  
            System.out.println("\n Precio normal");      
            
        }else if (edad < 18){ 
            descuento = (int)(precio * porcentaje1);
            precio = (precio - (descuento));
        
            System.out.println("\n Precio estudiante: $" + precio);
            
        }else if (edad >= 60){
            descuento = (int)(precio * porcentaje2);
            precio = (precio - (descuento ));
              
            System.out.println("\n Precio adulto mayor: $" + precio);
 
        }else{
            System.out.println("Por favor ingrese un valor válido");
        } 
    }
    
    // Informacion de ventas totales
    public static void InformaciónVentas(){ 
        
        info.add("\n Total: " + precio);
        info.add("Descuento aplicado: " + descuento);   
        totalVentas += precio;     
        
        //Id (Número de venta) 
        info.add("Id: " + idnum ++);
    } 
     
    //Boleta de venta
    public static void Boleta(){       
        System.out.println("");
        System.out.println("------------------------------------");   
        System.out.println("            Teatro Moro             ");   
        System.out.println("------------------------------------"); 
        System.out.println("Ubicación: " + tipoEntrada);  
        System.out.println("Costo base: " + precioEntrada);  
        System.out.println("Edad cliente: " + edad);
        System.out.println("Descuento aplicado: -$" + descuento);
        System.out.println("Costo final: " + precio);
        System.out.println("Id: " + idnum);
        System.out.println("------------------------------------");   
        System.out.println("Gracias por su vistia al Teatro Moro");      
        System.out.println("------------------------------------"); 
    }
    
    //Resumen de ventas
    public static void ResumenVentas(){           
        System.out.println("\n Resumen de ventas: ");   
        System.out.println(info);  
    }  
  
    // Modificar datos
    public static void ModificarDatos(Scanner sc){  
        
        int mod = 0;
        do{
            System.out.println("\n Elija una opción: "); 
            System.out.println("");
            System.out.println("1)Modificar descuentos");
            System.out.println("2)Modificar entradas");    
            System.out.println("3)Volver");
            mod = sc.nextInt();
            
                switch(mod){
                    case 1:
                        ModificarDescuentos(sc);
                        break;
                    case 2:
                        ModificarEntradas(sc);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Por favor ingrese una opción");
                        break;
                }
        } while (mod != 3);  
    }
     
    //Modificar descuentos
    public static void ModificarDescuentos(Scanner sc){  
        int cambiar = 0;
        
        ListaDescuentos.add(porcentaje1);
        ListaDescuentos.add(porcentaje2);
        System.out.println("\n Lista de descuentos");      
        System.out.println(ListaDescuentos);
        System.out.println("");
        
        do{
        System.out.println("Elija una opción: "); 
        System.out.println("1)Cambiar descuento estudiantes"); 
        System.out.println("2)Cambiar descuento adulto mayor");        
        System.out.println("3)Volver"); 
        cambiar = sc.nextInt();

            switch(cambiar){
                case 1: 
                    System.out.println("\n Ingrese porcentaje"); 
                    porcentaje1 = sc.nextDouble() / 100;
                    break;
                case 2: 
                    System.out.println("\n Ingrese porcentaje"); 
                    porcentaje2 = sc.nextDouble() / 100;
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\n Ingrese una opción"); 
                    break;
            }    
            break; 
        } while (cambiar != 3);
    }
    
    // Modificar entradas    
    public static void ModificarEntradas(Scanner sc){ 
        
        System.out.println("\n Elegir ubicación: ");
        System.out.println("\n 1)General \n 2)VIP \n 3)Platea \n 4)Palco");
        ubicación = sc.nextInt();
        Filas(sc);

        System.out.println("\n Fila seleccionada: ");
        for (int i = 0; i < fila.length; i++) {
            if(fila[i]){
                System.out.print("[X]");
            }else{
                System.out.print("[O]"); 
            }   System.out.print("");
        }
       
        System.out.println("\n Seleccione asiento (1-10)");      
        asiento = sc.nextInt(); 
         
        if (fila[asiento -1] == true){         
            fila[asiento -1] = false;         
            reservado = false;      
        }
        
        if (reservado == false){
            System.out.println("\n Asiento eliminado!");
            asiento--;
        } 
    }         
 
} 

       
