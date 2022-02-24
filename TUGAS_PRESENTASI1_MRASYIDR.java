
package tugas_progdas6_mrasyidridho;
import java.util.Scanner;
public class TUGAS_PRESENTASI1_MRASYIDR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi1, sisi2, sisi3;
        System.out.println("===========================");
        System.out.println("Sisi 1");
        sisi1 = input.nextInt();
        System.out.println("Sisi 2");
        sisi2 = input.nextInt();
        System.out.println("Sisi 3");
        sisi3 = input.nextInt();
        
        if (sisi1==sisi2 && sisi2==sisi3){
            System.out.println("Segitiga Sama Sisi");
        }else if (sisi1==sisi2){
            System.out.println("Segitiga Sama Kaki");
        }else {System.out.println("Segitiga Sembarang");
        }
        System.out.println("=========================");
    }
    }
        
        
        
    

