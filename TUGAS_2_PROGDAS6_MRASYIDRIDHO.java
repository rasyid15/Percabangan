
package tugas_progdas6_mrasyidridho; 
import java.util.Scanner;

   public class TUGAS_2_PROGDAS6_MRASYIDRIDHO {
   public static void main(String[] args) {
       String huruf;
     Scanner input = new Scanner(System.in);
     
     
        System.out.println("Masukan Huruf(KAPITAL)");
        huruf = input.next();
        
        System.out.println("=======================================");
        switch(huruf){
            case "A":
                System.out.println("Predikat nilai A: Sangat baik");
            break;
            case "B":
                System.out.println("Predikat nilai B: Baik");
            break;
            case "C":
                System.out.println("Predikat nilai C: Cukup");
             break;
            case "D":
                System.out.println("Predikat nilai D: Kurang");
            break;
            case "E":
                System.out.println("Predikat nilai E: Sangat Kurang");
            break;
        }
        System.out.println("=======================================");  

        
    }}
  

    

        