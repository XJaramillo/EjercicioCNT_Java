/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnt;
/**
 *
 * @author hp
 */
public class CNT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total;
        int valor_pagar;
        int minutos = 10;
        boolean domingo = true;
        boolean matutino = false;
      
        
        
        if(minutos <=5){
            valor_pagar =  minutos*1;
            
        }else if(minutos <=8){
            valor_pagar =  minutos*(8/10);
        
        }else if(minutos <=10){
            valor_pagar =  minutos*(7/10);
            
        }else{
            valor_pagar =  minutos*(5/10);
        }
        if(domingo == true){
            total = valor_pagar*(valor_pagar*3/100);
            System.out.println("El total a pagar es:"+total);
        }else if(matutino == true){
            total = valor_pagar*(valor_pagar*15/100);
            System.out.println("El total a pagar es:"+total);
        }else{
            total = valor_pagar*(valor_pagar*10/100);
            System.out.println("El total a pagar es:"+total);
        }
        
    }
    
}
