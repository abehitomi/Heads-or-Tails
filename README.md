# Heads-or-Tails
import java.util.Random;
import java.util.Scanner;
public class HeadsorTails {
   public static void main(String[] args) {
      System.out.println("Who are you?");
      Scanner scan = new Scanner(System.in);
      String name = scan.next();
      Random random = new Random();
      System.out.println("Hello,"+name+"!");
      //int randomValue = random.nextInt(2);
      System.out.println("Tossing a coin...");
      int Hcount = 0;
      int Tcount = 0;
      for(int i=1;i<=3;i++ ){
      int randomValue = random.nextInt(2);
      if(randomValue == 0){
         Hcount++;
         System.out.println("Round "+ i +": Heads");  
      }
      else{
         Tcount++;
         System.out.println("Round "+ i +": Tails");
      }
   }
   System.out.println("heads:"+Hcount+"Tails:"+Tcount);
   if(Tcount < Hcount){
      System.out.println("You won");
   }else{
      System.out.println("You lose");
   }
   }
}
