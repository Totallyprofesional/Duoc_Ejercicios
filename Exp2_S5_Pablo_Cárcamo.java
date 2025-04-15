import java.util.Scanner;
  
public class Exp2_S5_Pablo_Carcamo {  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Iniciar variables 
        boolean[] fila1 = new boolean [7]; 
        boolean[] fila2 = new boolean [7]; 
        boolean[] fila3 = new boolean [7]; 
        boolean[] fila4 = new boolean [7]; 
        boolean[] fila5 = new boolean [7]; 
        boolean[] fila6 = new boolean [7]; 
        boolean[] fila7 = new boolean [7]; 
        boolean[] fila8 = new boolean [7];                                                  
        
        int otra = 1; 
        int opcion = 0;   
        int fila, cantidad = 0, asiento = 0;        
        int Vip = 40000, General = 18000, Palco = 13000, Platea = 30000;   
        int edad, descuento, precio = 0, total = 0;
        
        // Menú principal 
        while (otra == 1) {
                       
            System.out.println("Bienvenido");
            System.out.println("Elija una opción");
            System.out.println("");
            System.out.println("1) Venta de entradas");
            System.out.println("2) Salir");
            System.out.println("");
            
            opcion = sc.nextInt();
            System.out.println("");
            
            while (opcion < 1 || opcion > 2){
            System.out.println("Por favor ingrese un valor: ");    
            opcion = sc.nextInt();         
            }
                
            // Venta de entradas 
            if (opcion == 1){                          
                System.out.println("Ingrese el numero de entradas que desea comprar");
                cantidad = sc.nextInt();    
                                 
                //Asientos por fila                  
                while(asiento < cantidad){                                            
                                               
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
                        System.out.println("");
          
                    System.out.print("fila 2:");
                    for (int i = 0; i < fila2.length; i++) {
                        if(fila2[i]){
                        System.out.print("[X]");
                        }else{
                        System.out.print("[O]");
                        } 
                    }
                        System.out.println("");
          
                    System.out.print("fila 3:");
                    for (int i = 0; i < fila3.length; i++) {
                        if(fila3[i]){
                        System.out.print("[X]");
                        }else{
                        System.out.print("[O]");
                        } 
                    }
                        System.out.println("");
     
                    System.out.print("fila 4:");
                    for (int i = 0; i < fila4.length; i++) {
                        if(fila4[i]){
                        System.out.print("[X]");
                        }else{
                        System.out.print("[O]");
                        } 
                    }
                        System.out.println("");
          
                    System.out.print("fila 5:");
                    for (int i = 0; i < fila5.length; i++) {
                        if(fila5[i]){
                        System.out.print("[X]");
                        }else{
                        System.out.print("[O]");
                        }  
                    }
                        System.out.println("");
                        
                    System.out.print("fila 6:");
                    for (int i = 0; i < fila6.length; i++) {
                        if(fila6[i]){
                        System.out.print("[X]");
                        }else{
                        System.out.print("[O]");
                        }  
                    }
                        System.out.println("");
                       
                    System.out.print("fila 7:");
                    for (int i = 0; i < fila7.length; i++) {
                        if(fila7[i]){
                        System.out.print("[X]");
                        }else{
                        System.out.print("[O]");
                        }  
                    }
                         System.out.println("");
                        
                    System.out.print("fila 8:");
                    for (int i = 0; i < fila8.length; i++) {
                        if(fila8[i]){
                        System.out.print("[X]");
                        }else{
                        System.out.print("[O]");
                        }  
                   }
                        System.out.println("");    
                                     
                        System.out.println("");  
                        System.out.println("Selecione fila (1-8)");
                        fila = sc.nextInt();
                        
                        System.out.println("");  
                        System.out.println("Selecione asiento (1-7)");
                        asiento = sc.nextInt();     
                        
                        if (cantidad >= 2){
                            for (int i = 1; i < cantidad; i++){ 
                            System.out.println("");  
                            System.out.println("Selecione fila (1-8)");                       
                            fila = sc.nextInt();
                        
                            System.out.println("");  
                            System.out.println("Selecione asiento (1-7)");
                            asiento = sc.nextInt(); 
                            }
                        }
                    
                        // Asientos ocupados
                        boolean reservado = false;
                        
                        if(fila == 1){ 
                            if(fila1[asiento -1] == false){
                            fila1[asiento -1] = true;
                            reservado = true;
                            }                       
                        }else if(fila == 2){
                            if(fila2[asiento -1] == false){
                            fila2[asiento -1] = true;
                            reservado = true;
                            }
                        }else if(fila == 3){
                            if(fila3[asiento -1] == false){
                            fila3[asiento -1] = true;
                            reservado = true;
                            }
                        }else if(fila == 4){
                            if(fila4[asiento -1] == false){
                            fila4[asiento -1] = true;
                            reservado = true;
                            }
                        }else if(fila == 5){
                            if(fila5[asiento -1] == false){
                            fila5[asiento -1] = true;
                            reservado = true;
                            }
                        }else if(fila == 6){
                            if(fila6[asiento -1] == false){
                            fila6[asiento -1] = true;
                            reservado = true;
                            }
                        }else if(fila == 7){
                            if(fila7[asiento -1] == false){
                            fila7[asiento -1] = true;
                            reservado = true;
                            }
                        }else if(fila == 8){
                            if(fila8[asiento -1] == false){
                            fila8[asiento -1] = true;
                            reservado = true;   
                            }
                        }else{
                        System.out.println("Por favor ingrese un valor");
                        }
          
                        if (reservado == true){
                        System.out.println("Asiento reservado");
                        asiento++;
                        }else{
                        System.out.println("Este asiento está ocupado");
                        }                      
                }
                
                    // Precios                                             
                    if (asiento >= 1 && asiento <= 10){ 
                    precio = Vip * cantidad;
                    System.out.println("Vip: $" + precio);
                    
                    } else if (asiento >= 11 && asiento <= 30){
                    precio = General * cantidad;
                    System.out.println("General: $" + precio);
                    
                    } else if (asiento >= 31 && asiento <= 40){
                    precio = Palco * cantidad; 
                    System.out.println("Palco: $" + precio);
                    
                    } else if (asiento >= 41 && asiento <= 56){
                    precio = Platea * cantidad;
                    System.out.println("Platea: $" + precio);
                    } 
 
                    // Edad y descuentos                   
                    System.out.println("");
                    System.out.println("Ingrese edad:");
                    edad = sc.nextInt();
                    
                    double estudiante = precio * 0.10;
                    double AdultoMayor = precio * 0.15;

                    if (edad < 18) {
                        precio = (int)(precio - estudiante);
                        System.out.println("Descuento estudiante -10%");
                    } else if (edad >= 60) {
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
                            
                            } else if (edad >= 60) {
                            precio = (int)(precio - AdultoMayor);
                            System.out.println("Descuento adulto mayor -15%");
                            }
                        }
                    }   
                                    
                    descuento = precio;
                    
                    // Total                         
                    total = cantidad * descuento;
                    System.out.println("");
                    System.out.println("Cantidad: "+ cantidad);          
                    System.out.println("Total a pagar: $" + total); 
                   
                } else if (opcion == 2){                  
                    System.out.println("Fin del programa.");
                    break;
                }    
                        
            // Loop de compra  
                System.out.println("");
                System.out.println("¿Desea comprar otra entrada?");
                System.out.println("1) Sí");
                System.out.println("2) No");
                System.out.println("");                
                otra = sc.nextInt();
                System.out.println("");
                
                if (otra == 2 ) {
                System.out.println("Muchas gracias por su compra.");
            }  
                while (otra < 1 || otra > 2) {
                System.out.println("Por favor ingrese una opción: ");
                otra = sc.nextInt();
            }            
        }   sc.close();      
    }  
}     
