package posttest6pbo;


import java.util.*;
import java.io.*;

public class Main {
    static MenuAdmin admin1 = new MenuAdmin("admin","1");
    static ArrayList<Ikan> ikan = MenuAdmin.ikan();
    static ArrayList<Krustasea> krustasea = MenuAdmin.krustasea();
    static ArrayList<Karang> karang = MenuAdmin.karang();
    static ArrayList<Kerang> kerang = MenuAdmin.kerang();

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
    public static void main(String[]args) throws IOException, InterruptedException{
        
        while (true){
            
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("========================");
            System.out.println("|    SELAMAT DATANG    |");
            System.out.println("========================");
            System.out.println("|1| Admin              |");
            System.out.println("|2| User               |");
            System.out.println("|3| Exit               |");
            System.out.println("========================");
            System.out.print("Masukkan Pilihan Anda : ");
            int pilih = Integer.parseInt(br.readLine());
            System.out.println("========================");
            if(pilih==1){
                loginadmin();
            }else if(pilih==2){
                user();
            }else if(pilih==3){
               System.exit(0);
            }else{
                System.out.println("Lihat Pilihan Baik-Baik !!!");
            }
        }
    }
public static void loginadmin()throws IOException{
    System.out.println("===========================");
    System.out.println("|       Login Admin       |");
    System.out.println("===========================");
    boolean login = false;
    do {
        System.out.print("Masukkan Username  : ");
        String username = br.readLine();
        System.out.print("Masukkan Pasword   : ");
        String password = br.readLine();
        if (username.equals(admin1.getUsername()) && password.equals(admin1.getPassword())){
            login = true;
            admin1.main();
        }else {
            System.out.println("Salah");
            
                break;
            }
        
    }while(!login);
    
}

public static void user() throws IOException{
    while(true){
 
    System.out.println("=============================");
    System.out.println("|       Data Biota      |");
    System.out.println("=============================");
    System.out.println("1. Data ikan  ");
    System.out.println("2. Data krustasea");
    System.out.println("3. Data kerang");
    System.out.println("4. Data karang");
    System.out.println("5. EXIT");
    System.out.println("=============================");
    System.out.print("Masukkan Pilihan Anda : ");
    int pilih= Integer.parseInt(br.readLine());
    System.out.println("=============================");
    if(pilih==1){
        if(ikan.isEmpty()){
            System.out.print("    ||| Data Kosong |||     ");
            br.readLine();
        }else {
            ikan.get(0).readBiota("data biota");
            for (int i = 0; i<ikan.size(); i++){
            System.out.println ("Data ke -"+(i+1));
            ikan.get(i).readBiota();
        }
        }berhenti();

    }else if(pilih == 2) {
        if(krustasea.isEmpty()){
            System.out.print("    ||| Data Kosong |||     ");
            br.readLine();
        }else {for (int i = 0; i<krustasea.size(); i++){
            System.out.println ("Data ke -"+(i+1));
            krustasea.get(i).Tampil();
            }berhenti();
            
        }
    
    }else if(pilih == 3) {
        if(kerang.isEmpty()){
            System.out.print("    ||| Data Kosong |||     ");
            br.readLine();
        }else {for (int i = 0; i<kerang.size(); i++){
            System.out.println ("Data ke -"+(i+1));
            kerang.get(i).Tampil();
            }berhenti();
            
        }
    
    }else if(pilih == 4) {
        if(karang.isEmpty()){
            System.out.print("    ||| Data Kosong |||     ");
            br.readLine();
        }else {for (int i = 0; i<karang.size(); i++){
            System.out.println ("Data ke -"+(i+1));
            karang.get(i).Tampil();
            }berhenti();
            
        }
    
    }
    else if(pilih==5){
        return;
    }
    else{
        System.out.println("Lihat Pilihan Baik-Baik !!!");
    }
}          
}
public static void berhenti() throws IOException{
    System.out.println("Tekan Enter Untuk Melanjutkan");
    br.readLine();
}
}