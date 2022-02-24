
package tugas_progdas6_mrasyidridho;

import java.util.Scanner;
public class TUGAS_PROGDAS6_MRASYIDR {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      int nilai;
       System.out.println("Masukkan Nilai=");    
       nilai= input.nextInt();
     
        if (nilai>=90){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat A");
            if(nilai==100){
                System.out.println("sempurna");
            }
        }else if (nilai>=80){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat B");
            if(nilai >=89){
                System.out.println("sedikit lagi dapat nilai A");
            }
        }
        else if (nilai>=75){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat C");
            nilai= input.nextInt();
        }
        else if (nilai>=70){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat D");
            nilai= input.nextInt();
        }
        else {
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat E");
            System.out.println("tidak lulus");
            
    }
    }
}
        