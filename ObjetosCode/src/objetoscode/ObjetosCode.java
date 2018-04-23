
package objetoscode;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Trainer
 */
  

/*===========================================
=            Control del sistema            =
===========================================*/

class ControlSistema{
    public void opciones(){ 
       System.out.println("Seleccione opción:");
        Scanner escriba=new Scanner(System.in);  
        System.out.println("1. Calcular Perímetro de un cuadrado:");
        System.out.println("2. Calcular Area de un cuadrado:");       
        System.out.println("3. Calcular Volúmen de un cubo:"); 
        System.out.println("4. Calcular Perímetro de un cubo:");         
        System.out.println("5. Salir"); 

   
        int opcion = escriba.nextInt();
        
        
        switch (opcion) {
        case 1:            
            System.out.println("Ingrese la medida de un lado:"); 
            
            Cuadrado p = new Cuadrado();
            p.perimetro();                                    
          break;

        case 2:
            // Le pasas el valor de elPokemon para ser usado dentro de alimentacion.
            System.out.println("Ingrese la medida de un lado:");   
            Cuadrado a = new Cuadrado();
            a.area();
          break;
            
        case 3:
            // Le pasas el valor de elPokemon para ser usado dentro de alimentacion.
            System.out.println("Ingrese la medida de la aristas");   
            Cubo cb = new Cubo();
            cb.calcularVolumen();
           break;
            
        case 4:
            // Le pasas el valor de elPokemon para ser usado dentro de alimentacion.
            System.out.println("Ingrese la medida un lado");   
            Cubo cp = new Cubo();
            cp.calcularPerimetro();
            break;     
            
       case 5:
            // Le pasas el valor de elPokemon para ser usado dentro de alimentacion.            
            System.exit(0);               
       default:
            // Le pasas el valor de elPokemon para ser usado dentro de alimentacion.
            System.out.println("Error de seleccion");              
            break;            
            
            
    }

    }
}

/*=====  End of Control del sistema  ======*/






/*===========================================
=            Clase cuadrado            =
===========================================*/

class Cuadrado{

    public Cuadrado() {
    }
    
    Scanner escriba=new Scanner(System.in);    
    int medida = escriba.nextInt();
    
    public void perimetro(){
         
          
    if(medida>=0){
        int perimetro = medida*4;
        System.out.println("El perimetro es: " + perimetro+"\n");  
       
            System.out.println("¿Continuar con el programa? DA=Si con el dato anterior, ND=Si con nuevo dato   N=No, detener el programa "); 
            Scanner option=new Scanner(System.in);  
            String pregunta =option.nextLine();
                //Para un nuevo dato
               if(pregunta.equals("ND")){               
                   ControlSistema cs = new ControlSistema();
                   cs.opciones();                              
                //Para salir del programa
               }else if(pregunta.equals("N")){
                   System.exit(0);
                //En cualquiera menos de las 2
               }else{
                   //Imprime el valor anterior al usuario
                    System.out.println("El dato anterior es : " + medida + " ¿Que opción elige para calcular?");
                    //Guardalo en una variable
                    int datoAnterior=medida;
                    
                        System.out.println("Seleccione opción para usar el dato anterior en una operación:");
                        //Scanner escriba=new Scanner(System.in);  
                        System.out.println("1. Calcular Perímetro de un cuadrado:");
                        System.out.println("2. Calcular Area de un cuadrado:");  
                        System.out.println("3. Calcular Volumen de un cubo:");
                        System.out.println("4. Calcular Perimetro de un cubo:");
                        System.out.println("5. Voler a pedir nuevo dato:");

                        int opcion = escriba.nextInt();
                        switch (opcion) {
                            case 1:
                                int p=datoAnterior*4;
                                System.out.println("Permimetro con el dato anterior es: " + p);
                             break;
                             
                             case 2:
                                int a=(int) Math.pow(datoAnterior,2);
                                System.out.println("Area usando con el dato anterior es: " + a);
                             break;
                             
                            case 3:
                                int cu=datoAnterior*datoAnterior*datoAnterior;
                                System.out.println("Volumen usando con el dato anterior es: " + cu);
                             break;
                             
                             case 4:                                
                                System.out.println("Lo siento, puede que no sea posible calcular el perimetro de un cubo");
                             break;
                             
                             case 5:                                
                                ControlSistema cs = new ControlSistema();
                                cs.opciones(); 
                             break;
                            
                            default:                            
                            System.out.println("Error de seleccion");              
                            break;            


            }
               
          }
         
           
    }else{
        System.out.println("Error");
    }
    
    
 }
 
 
 public void area(){                     
    if(medida>=0){
        int area = (int) Math.pow(medida,2);
        System.out.println("El area es:"+area+"\n");   
        System.out.println("¿Continuar con el programa? DA=Si con el dato anterior, ND=Si con nuevo dato   N=No, detener el programa "); 
            Scanner option=new Scanner(System.in);  
            String pregunta =option.nextLine();
                //Para un nuevo dato
               if(pregunta.equals("ND")){               
                   ControlSistema cs = new ControlSistema();
                   cs.opciones();                              
                //Para salir del programa
               }else if(pregunta.equals("N")){
                   System.exit(0);
                //En cualquiera menos de las 2
               }else{
                   //Imprime el valor anterior al usuario
                    System.out.println("El dato anterior es : " + medida + " ¿Que opción elige para calcular?");
                    //Guardalo en una variable
                    int datoAnterior=medida;
                    
                        System.out.println("Seleccione opción para usar el dato anterior en una operación:");
                        //Scanner escriba=new Scanner(System.in);  
                        System.out.println("1. Calcular Perímetro de un cuadrado:");
                        System.out.println("2. Calcular Area de un cuadrado:");  
                        System.out.println("3. Calcular Volumen de un cubo:");
                        System.out.println("4. Calcular Perimetro de un cubo:");
                        System.out.println("5. Voler a pedir nuevo dato:");

                        int opcion = escriba.nextInt();
                        switch (opcion) {
                            case 1:
                                int p=datoAnterior*4;
                                System.out.println("Permimetro con el dato anterior es: " + p);
                             break;
                             
                             case 2:
                                int a=(int) Math.pow(datoAnterior,2);
                                System.out.println("Area usando con el dato anterior es: " + a);
                             break;
                             
                            case 3:
                                int cu=datoAnterior*datoAnterior*datoAnterior;
                                System.out.println("Volumen usando con el dato anterior es: " + cu);
                             break;
                             
                             case 4:                                
                                System.out.println("Lo siento, puede que no sea posible calcular el perimetro de un cubo");
                             break;
                             
                             case 5:                                
                                ControlSistema cs = new ControlSistema();
                                cs.opciones(); 
                             break;
                            
                            default:                            
                            System.out.println("Error de seleccion");              
                            break;            


            }
               
          }
        
      }else{
        System.out.println("Error");
    }
   }
   
}

/*=====  End of Clase cuadrado  ======*/





/*==================================
=            Clase cubo            =
==================================*/


 class Cubo extends Cuadrado{

    public Cubo() {
    }
    
    public void calcularVolumen(){         
    System.out.println("Ingrese la medida de la arista");          
    if(medida>=0){
        int volumen = (int) Math.pow(medida,3);
        System.out.println("El volumen es:"+volumen+"\n"); 
        
        System.out.println("¿Continuar con el programa? DA=Si con el dato anterior, ND=Si con nuevo dato   N=No, detener el programa "); 
            Scanner option=new Scanner(System.in);  
            String pregunta =option.nextLine();
                //Para un nuevo dato
               if(pregunta.equals("ND")){               
                   ControlSistema cs = new ControlSistema();
                   cs.opciones();                              
                //Para salir del programa
               }else if(pregunta.equals("N")){
                   System.exit(0);
                //En cualquiera menos de las 2
               }else{
                   //Imprime el valor anterior al usuario
                    System.out.println("El dato anterior es : " + medida + " ¿Que opción elige para calcular?");
                    //Guardalo en una variable
                    int datoAnterior=medida;
                    
                        System.out.println("Seleccione opción para usar el dato anterior en una operación:");
                        //Scanner escriba=new Scanner(System.in);  
                        System.out.println("1. Calcular Perímetro de un cuadrado:");
                        System.out.println("2. Calcular Area de un cuadrado:");  
                        System.out.println("3. Calcular Volumen de un cubo:");
                        System.out.println("4. Calcular Perimetro de un cubo:");
                        System.out.println("5. Voler a pedir nuevo dato:");

                        int opcion = escriba.nextInt();
                        switch (opcion) {
                            case 1:
                                int p=datoAnterior*4;
                                System.out.println("Permimetro con el dato anterior es: " + p);
                             break;
                             
                             case 2:
                                int a=(int) Math.pow(datoAnterior,2);
                                System.out.println("Area usando con el dato anterior es: " + a);
                             break;
                             
                            case 3:
                                int cu=datoAnterior*datoAnterior*datoAnterior;
                                System.out.println("Volumen usando con el dato anterior es: " + cu);
                             break;
                             
                             case 4:                                
                                System.out.println("Lo siento, puede que no sea posible calcular el perimetro de un cubo");
                             break;
                             
                             case 5:                                
                                ControlSistema cs = new ControlSistema();
                                cs.opciones(); 
                             break;
                            
                            default:                            
                            System.out.println("Error de seleccion");              
                            break;            


            }
               
          }
        
    }else{
        System.out.println("Error");
    }
   }
 
    
    
  public void calcularPerimetro(){         
    System.out.println("Ingrese la medida de un lado");          
    if(medida>=0){        
        System.out.println("Lo siento, puede que no sea posible calcular el perimetro de un cubo"+"\n");   
        System.out.println("¿Continuar con el programa? DA=Si con el dato anterior, ND=Si con nuevo dato   N=No, detener el programa "); 
            Scanner option=new Scanner(System.in);  
            String pregunta =option.nextLine();
                //Para un nuevo dato
               if(pregunta.equals("ND")){               
                   ControlSistema cs = new ControlSistema();
                   cs.opciones();                              
                //Para salir del programa
               }else if(pregunta.equals("N")){
                   System.exit(0);
                //En cualquiera menos de las 2
               }else{
                   //Imprime el valor anterior al usuario
                    System.out.println("El dato anterior es : " + medida + " ¿Que opción elige para calcular?");
                    //Guardalo en una variable
                    int datoAnterior=medida;
                    
                        System.out.println("Seleccione opción para usar el dato anterior en una operación:");
                        //Scanner escriba=new Scanner(System.in);  
                        System.out.println("1. Calcular Perímetro de un cuadrado:");
                        System.out.println("2. Calcular Area de un cuadrado:");  
                        System.out.println("3. Calcular Volumen de un cubo:");
                        System.out.println("4. Calcular Perimetro de un cubo:");
                        System.out.println("5. Voler a pedir nuevo dato:");

                        int opcion = escriba.nextInt();
                        switch (opcion) {
                            case 1:
                                int p=datoAnterior*4;
                                System.out.println("Permimetro con el dato anterior es: " + p);
                             break;
                             
                             case 2:
                                int a=(int) Math.pow(datoAnterior,2);
                                System.out.println("Area usando con el dato anterior es: " + a);
                             break;
                             
                            case 3:
                                int cu=datoAnterior*datoAnterior*datoAnterior;
                                System.out.println("Volumen usando con el dato anterior es: " + cu);
                             break;
                             
                             case 4:                                
                                System.out.println("Lo siento, puede que no sea posible calcular el perimetro de un cubo");
                             break;
                             
                             case 5:                                
                                ControlSistema cs = new ControlSistema();
                                cs.opciones(); 
                             break;
                            
                            default:                            
                            System.out.println("Error de seleccion");              
                            break;            


            }
               
          }
        
    }else{
        System.out.println("Error");
    }
   }
    
}

/*=====  End of Clase cubo  ======*/

    
public class ObjetosCode {

    
    public static void main(String[] args) {
        ControlSistema cs = new ControlSistema();
        cs.opciones();
        
                       
        
    }
    
}
