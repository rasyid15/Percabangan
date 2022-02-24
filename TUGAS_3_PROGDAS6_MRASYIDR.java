
package tugas_progdas6_mrasyidridho;

import java.util.Scanner;
public class TUGAS_3_PROGDAS6_MRASYIDR {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    
        int nilai;
        
        if (nilai){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat A");
            nilai= input.nextInt();
            if(nilai==100){
                System.out.println("sempurna");
            }
        }
        else if (nilai){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat B");
            nilai= input.nextInt();
            if(nilai >=89){
                System.out.println("sedikit lagi dapat nilai A");
            }
        }
        else if (nilai){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat C");
            nilai= input.nextInt();
        }
        else if (nilai){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat D");
            nilai= input.nextInt();
        }
        else {
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat E");
            nilai= input.nextInt();
            if (nilai){
                System.out.println("tidak lulus");
            }
    }
    }
}
        