import java.util.Random;
public class HeadsorTails {
   public static void main(String[] args) {
      Random random = new Random();
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
      
   }
}
 