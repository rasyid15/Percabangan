 
package tugas_percabangan_mrasyidridho;

import java.util.Scanner;
public class TUGAS_PERCABANGAN_MRASYIDRIDHO {
static Scanner input= new Scanner(System.in);

    public static void main(String[] args) {
       int nilai;
       nilai= input.nextInt();
      
       
        System.out.println("================");
        System.out.println("RAPOR SEDERHANA");
        System.out.println("================");
       
       if(nilai <=100 && nilai>=0){
        if (nilai>=90){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat A");
        }
        else if (nilai>=80){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat B");
        }
        else if (nilai>=70){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat C");
        }
        else if (nilai>=60){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat D");
        }
        else if (nilai>=0){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat E");
        } 
       }
        else{System.out.println("nilai tidak dikenal");}    
       
    }
}
 
