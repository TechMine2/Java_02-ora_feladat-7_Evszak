package javaapp_02_honap;

import java.util.Scanner;

public class JavaApp_02_Honap {

    public static void main(String[] args) {
        System.out.println("Írja be, hogy hanyadik hónapot írunk.");
        Scanner sc = new Scanner(System.in);
        int honap = sc.nextInt();
        
        switch(honap){
            case 1: System.out.println("Január"); break;   
            case 2: System.out.println("Február"); break;
            case 3: System.out.println("Március"); break;
            case 4: System.out.println("Árpilis"); break;
            case 5: System.out.println("Május"); break;
            case 6: System.out.println("Június"); break;
            case 7: System.out.println("Július"); break;
            case 8: System.out.println("Augusztus"); break;
            case 9: System.out.println("Szeptember"); break;
            case 10: System.out.println("Október"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Nincs ilyen hónap!");
        
        }
        
    }
    
}
