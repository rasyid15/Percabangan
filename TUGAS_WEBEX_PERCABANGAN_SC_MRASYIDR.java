package tugas_progdas6_mrasyidridho;
import java.util.Scanner;
public class TUGAS_WEBEX_PERCABANGAN_SC_MRASYIDR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Jurusan;
        int ranking;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        System.out.println("Jurusan");
        Jurusan = input.next();
        System.out.println("Ranking");
        ranking = input.nextInt();
        
        switch(Jurusan){
            case "RPL":
            if(ranking==1){
            System.out.println("Selamat Anda Mendapatkan Laptop core I7");
            }else if(ranking==2){
            System.out.println("Selamat Anda Mendapatkan Laptop Core I5");
            }else if(ranking==3){
            System.out.println("Selamat Anda Mendapatkan Laptop Core I3");
            }
            break;
            
            case "Math":
            if(ranking==1){
            System.out.println("Selamat Anda Mendapatkan VideoCam Professional");
            }else if(ranking==2){
            System.out.println("Selamat Anda Mendapatkan VideoCam Prosumer");
            }else if(ranking==3){
            System.out.println("Selamat Anda Mendapatkan PhotoCam");
            }
            break;
            }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    } 
            
      
        
    }

    
    
    

