
package tp;

import java.util.Scanner;

public class Atividade {
    
    Scanner objScanner = new Scanner (System.in);
    
    /*ATRIBUTOS*/
    
    int numero;
   //int numero2;
    int resultado = 0;
    


public void NumerosInt (){
    
    /*TESTE 1 
        while(numero >= 0)
        System.out.println("O NÚMERO DIGITADO É: " + numero);
       */
       
       
       /*TESTE 3 */
         System.out.println("DIGITE UM NÚMERO INTEIRO POSITIVO: ");
         numero = objScanner.nextInt();
         // resultado = resultado + numero;
         // System.out.println("\n" + "NÚMERO DIGITADO FOI: " + numero);
         
            
          do {
            System.out.println("\n" + "DIGITE UM NÚMERO POSITIVO OU NEGATIVO PARA QUE OS POSITIVOS SE SOMEM: ");
            
           // resultado = resultado + numero;
            //System.out.println("\n" + "NÚMERO DIGITADO FOI: " + numero);
            resultado = resultado + numero;
            numero = objScanner.nextInt();
            }while(numero >= 0);
        //  numero = -numero - (-numero);
          
          
          System.out.println("A SOMA É: " + resultado);
    
}
          
           /*TESTE 2 
          if (numero2 < 0){
              resultado = numero + numero;
              System.out.println("SOMA É: " + resultado);
         }*/
    }        
