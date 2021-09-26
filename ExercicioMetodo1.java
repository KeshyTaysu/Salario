package exerciciometodo1;

input java.util.Scanner;

import java.util.Scanner;

public class ExercicioMetodo1 {
    
   
     
    public static void main(String[] args) {
        
        System.out.println("Salario Inicial");
        
            Scanner input = new Scanner (System.in);
        
             double salarioinicial= input.nextDouble();
              
             double aumento = (salarioinicial*15.3)/100;
      
             double salariofinal = salarioinicial+aumento;
             
             System.out.println("Seu salário esse mês é " + salariofinal+".");
    }
    
}
