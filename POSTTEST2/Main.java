package POSTTEST1;
import java.util.*; 
import java.io.*;

public class Main {


    static ArrayList<Biota> biota = new ArrayList<Biota>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException, InterruptedException {
        
        
        while (true) {
            System.out.println("\n");
            System.out.println("|--------------------------------------------------------|");
            System.out.println("|      SELAMAT DATANG DI DATA BIOTA LAUT INDONESIA       |");
            System.out.println("|                                                        |");
            System.out.println("|              1. Daftar Biota Baru                      |");
            System.out.println("|              2. Lihat Biota terdaftar                  |");
            System.out.println("|              3. Ubah data Biota                        |");
            System.out.println("|              4. Hapus Biota Terdaftar                  |");
            System.out.println("|              5. Keluar dari program                    |");
            System.out.println("|                                                        |");
            System.out.println("|--------------------------------------------------------|");
            System.out.println("");
            
            System.out.print("Masukan Pilihan Anda  : ");
            int pilihan = Integer.parseInt(br.readLine());
            if (pilihan == 1) {
                createBiota();
            } else if (pilihan == 2){
                readBiota();
            } else if (pilihan == 3){
                updateBiota();
            } else if (pilihan == 4){
                deleteBiota();
            } else if (pilihan == 5){
                System.out.println("\n TERIMA KASIH !\n");
                System.exit(0);
            } else {
                System.out.println("Pilihan Anda Tidak Tersedia");
            }

        }

            

    }
        
    public static void createBiota() throws IOException{
        System.out.println("\n");
        System.out.println("        __________________________________");
        System.out.println("        |                                |");
        System.out.println("        |  MENDAFTARKAN BIOTA LAUT BARU  |");
        System.out.println("        |________________________________|\n");

        System.out.print("Masukan Nama Ilmiah / Latin Biota     : ");
        String addnamailmiah = br.readLine();
        System.out.print("Masukan Nama umum Biota               : ");
        String addnamaumum = br.readLine();
        System.out.print("Masukan Status dari Biota             : ");
        String addstatus = br.readLine();
        System.out.print("Masukan Kedalaman Biota (Meter)       : ");
        double addkedalaman = Double.parseDouble(br.readLine());
        System.out.print("Masukan daerah penemuan dari Biota    : ");
        String adddaerah = br.readLine();
        System.out.print("Masukan tahun ditemukannya Biota      : ");
        int addtahun = Integer.parseInt(br.readLine());
        Biota biotaBaru = new Biota(addnamailmiah, addnamaumum, addstatus, addkedalaman, adddaerah, addtahun); 
        biota.add(biotaBaru);
        biotaBaru.registrasi();
    }

    public static void readBiota() throws IOException{
        System.out.println("\n");
        System.out.println("        _____________________________________");
        System.out.println("        |                                   |");
        System.out.println("        |      DATA BIOTA LAUT TERDAFTAR    |");
        System.out.println("        |___________________________________|\n");

        for (int i = 0; i < biota.size(); i++) {
            System.out.println("        ( Biota ke " + (i+1) + " : " + biota.get(i).getNamaumum() + " )");
            System.out.println("       ----------------------");
            System.out.println("Nama Ilmiah/Latin Biota Laut        : " + biota.get(i).getNamailmiah());
            System.out.println("Nama umum Biota Laut                : " + biota.get(i).getNamaumum());
            System.out.println("Status Biota Laut                   : " + biota.get(i).getStatus());
            System.out.println("Kedalaman Laut Biota Laut (Meter)   : " + biota.get(i).getKedalaman());
            System.out.println("Daerah Ditemukan Biota Laut         : " + biota.get(i).getDaerah());
            System.out.println("Tahun ditemukan Biota Laut          : " + biota.get(i).getTahun());
            System.out.print("\n");
        }
    }
    
    public static void updateBiota() throws IOException{

        readBiota();

        System.out.println("\n");
        System.out.println("        __________________________________________");
        System.out.println("        |                                        |");
        System.out.println("        |      UBAH DATA BIOTA LAUT TERDAFTAR    |");
        System.out.println("        |________________________________________|\n");
        System.out.print("Ubah Data Biota ke -");
        int index = Integer.parseInt(br.readLine());

        if(index -1 >= biota.size()){
            System.out.println("DATA TIDAK ADA !");
            return;
        }

        System.out.print("Masukan Nama Ilmiah / Latin Biota     : ");
        String setnamailmiah = br.readLine();
        System.out.print("Masukan Nama umum Biota               : ");
        String setnamaumum = br.readLine();
        System.out.print("Masukan Status dari Biota             : ");
        String setstatus= br.readLine();
        System.out.print("Masukan Kedalaman Biota               : ");
        double setkedalaman = Double.parseDouble(br.readLine());
        System.out.print("Masukan daerah penemuan dari Biota    : ");
        String setdaerah= br.readLine();
        System.out.print("Masukan tahun ditemukannya Biota      : ");
        int settahun = Integer.parseInt(br.readLine());

        biota.get(index-1).setNamailmiah(setnamailmiah);
        biota.get(index-1).setNamaumum(setnamaumum); 
        biota.get(index-1).setStatus(setstatus);
        biota.get(index-1).setKedalaman(setkedalaman);  
        biota.get(index-1).setDaerah(setdaerah);  
        biota.get(index-1).setTahun(settahun); 

        biota.get(index-1).terupdate();
    }

    public static void deleteBiota() throws IOException{
        readBiota();
        System.out.println("\n");
        System.out.println("        _________________________________");
        System.out.println("        |                               |");
        System.out.println("        |     HAPUS DATA BIOTA LAUT     |");
        System.out.println("        |_______________________________|\n");
        System.out.print("Hapus Data Biota ke- ");
        int index = Integer.parseInt(br.readLine());

        if(index -1 >= biota.size()){
            System.out.println("DATA TIDAK ADA !");
            return;
        }

        biota.remove(index-1);

        System.out.println(" DATA BERHASIL TERHAPUS !");
    }

    
}