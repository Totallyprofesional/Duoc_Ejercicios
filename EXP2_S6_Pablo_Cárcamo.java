import java.util.Scanner;
 
public class EXP2_S6_Pablo_Cárcamo {  
     
    static int precio = 18000;
    static int asientos = 5;
    
    public static void main(String[] args) {

    // Iniciar variables 
    boolean[] fila1 = new boolean [asientos];                   
    boolean reservado = false;
    int otra = 1; 
    int opcion = 0;   
    int seguir = 0;
    int cantidad = 0, asiento = 0;  
    int edad = 0, total = 0, boleta = 0;
    
    Scanner sc = new Scanner(System.in);
        
        // Menú principal 
        while (otra == 1){   
                System.out.println("");
                System.out.println("Bienvenido. Elija una opción: ");
                System.out.println("");
                System.out.println("1)Reserva y compra de entradas");
                System.out.println("2)Modificar venta");
                System.out.println("3)Salir");
                System.out.println("");
         
                opcion = sc.nextInt();
        
                while (opcion < 1 || opcion > 5) {
                    System.out.println("Por favor ingrese un valor válido: ");    
                    opcion = sc.nextInt();   
                }              
                
                // Compra de entradas  
                if (opcion == 1){                          
                    System.out.println("Ingrese el numero de entradas que desea reservar: ");
                    System.out.println("");
                    cantidad = sc.nextInt();   
                                 
                   //Mapa del teatro                  
                    System.out.println(""); 
                    System.out.println("Mapa del teatro");
                    System.out.println("");         
                    System.out.print("fila 1:");
                    
                    for (int i = 0; i < fila1.length; i++) {
                        if(fila1[i]){
                            System.out.print("[X]");
                        }else{
                            System.out.print("[O]");
                        } 
                    }  
                    
                    //Seleccion de asiento           
                    System.out.println("");  
                    System.out.println("Seleccione asiento (1-5)");
                    asiento = sc.nextInt();     
                        
                    if (cantidad >= 2){
                    for (int i = 1; i < cantidad; i++){                        
                        System.out.println("");  
                        System.out.println("Seleccione asiento (1-5)");
                        asiento = sc.nextInt(); 
                        }
                    }

                    // Asientos reservados y ocupados                  
                    reservado = false;                       
                    if(fila1[asiento -1] == false){
                        fila1[asiento -1] = true; 
                        reservado = true;
                    }                    
             
                    if (reservado == true){
                        System.out.println("Asiento reservado");
                        asiento++;
                    }else if(reservado == false){     
                        System.out.println("Asiento ocupado");
                        break;
                    }
                    
                    // Precios  
                        System.out.println("");
                        System.out.println("Desea seguir a compra de entrada?: ");
                        System.out.println(""); 
                        System.out.println("1)Si");  
                        System.out.println("2)No");  
                        seguir = sc.nextInt();
                    
                    // Compra, edad y descuentos          
                    if (seguir == 1){
                        System.out.println("");
                        System.out.println("Ingrese edad:");
                        edad = sc.nextInt();
                                            
                        double estudiante = precio * 0.10;
                        double AdultoMayor = precio * 0.15;
                        
                        if (edad < 18) {                           
                            precio = (int)(precio - estudiante);
                            System.out.println("Descuento estudiante -10%");
                            
                        }else if (edad >= 60) {                    
                            precio = (int)(precio - AdultoMayor);
                            System.out.println("Descuento adulto mayor -15%");
                        } 
                    
                        if (cantidad >= 2){ 
                            for (int i = 1; i < cantidad; i++){                        
                                System.out.println("");
                                System.out.println("Ingrese edad:");
                                edad = sc.nextInt();
                            
                                if (edad < 18) {
                                    precio = (int)(precio - estudiante);
                                    System.out.println("Descuento estudiante -10%");                          
                                }else if (edad >= 60) {
                                    precio = (int)(precio - AdultoMayor);
                                    System.out.println("Descuento adulto mayor -15%");
                                }
                            }
                        }    
                                             
                        // Total    
                        total = cantidad * precio;
                        System.out.println("");
                        System.out.println("Cantidad: "+ cantidad);          
                        System.out.println("Total a pagar: $" + total);      
                        
                        // Imprimir boleta
                        System.out.println("");
                        System.out.println("Desea imprimir boleta?: ");  
                        System.out.println("1) Sí");
                        System.out.println("2) No");
                        System.out.println("");                
                        boleta = sc.nextInt();
                         
                        if (boleta == 1){
                            System.out.println("");
                            System.out.println("------------------------");
                            
                            if (edad < 18){
                                System.out.println("Entrada estudiante");  
                            }else if(edad >= 60){
                                System.out.println("Entrada adulto mayor"); 
                            }else{ 
                                System.out.println("Entrada general");  
                            }      
                            
                            System.out.println("Cantidad: " + cantidad);  
                            System.out.println("Asiento: " + asiento);                                   
                            System.out.println("Total: " + total);  
                            System.out.println("------------------------");
                            
                        }else if (boleta == 2){
                            System.out.println("Sin boleta");
                        }
                        
                    }else if (seguir == 2){
                        break; 
                    }                  
  
                // Modificar entradas
                } else if (opcion == 2){   
                    
                    System.out.println(""); 
                    System.out.println("Mapa del teatro");
                    System.out.println("");         
                    System.out.print("fila 1:");
                    
                    for (int i = 0; i < fila1.length; i++) {
                        if(fila1[i]){
                            System.out.print("[X]");
                        }else{
                            System.out.print("[O]");
                        } 
                    }                   
                    
                    //Borrar entradas       
                    System.out.println("");  
                    System.out.println("Seleccione asiento (1-5)");
                    int BorrarAsiento = sc.nextInt();     
                                             
                    reservado = true;                       
                    if(fila1[BorrarAsiento -1] == true){
                        fila1[BorrarAsiento -1] = false; 
                        reservado = false;
                    }                    
             
                    if (reservado == false){
                        System.out.println(""); 
                        System.out.println("Asiento liberado");
                        
                        for (int i = 0; i < fila1.length; i++) {
                            if(fila1[i]){
                                System.out.print("[X]");
                            }else{
                                System.out.print("[O]");
                            }  
                        } 
                        System.out.println("");         
                    }
                    
                }else if (opcion == 3){                 
                    System.out.println("Fin del programa."); 
                    System.exit(0);                     
                }    
                
                    // Loop de compra   
                    System.out.println("");
                    System.out.println("¿Desea comprar otra entrada?");
                    System.out.println("1) Sí");
                    System.out.println("2) No");
                    System.out.println("");                
                    otra = sc.nextInt();
                        
                    while (otra < 1 || otra > 2) {
                        System.out.println("Por favor ingrese una opción: ");
                        otra = sc.nextInt();               
                    } 
                    if (otra == 2){
                    break;
                    }       
           }        sc.close();    
    }               
}

  
       
  
 
   
