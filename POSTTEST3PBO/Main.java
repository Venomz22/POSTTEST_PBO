package POSTTEST3PBO;

import java.util.*;
import java.io.*;

public class Main {


    static ArrayList<Ikan> ikan = new ArrayList<Ikan>();
    static ArrayList<Krustasea> krustasea = new ArrayList<Krustasea>();
    static ArrayList<Kerang> kerang = new ArrayList<Kerang>();
    static ArrayList<Karang> karang = new ArrayList<Karang>();

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
        System.out.println("                Mau tambah apa ?");
        System.out.println("                  1. Ikan");
        System.out.println("                  2. Krustasea");
        System.out.println("                  3. Kerang");
        System.out.println("                  4. Terumbu Karang\n");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("\nMasukan Nama Ilmiah Ikan             : ");
                String addilmiahikan = br.readLine();
                System.out.print("Masukan Nama umum Ikan               : ");
                String addnamaikan = br.readLine();
                System.out.print("Masukan Warna dari Ikan              : ");
                String addwarnaikan = br.readLine();
                System.out.print("Masukan Kecepatan Berenang Ikan      : ");
                int addkecepatanikan = Integer.parseInt(br.readLine());
                System.out.print("Masukan Status dari Ikan             : ");
                String addstatusikan = br.readLine();
                System.out.print("Apakah Aman untuk Dikonsumsi         : ");
                String addkonsumsiikan = br.readLine();
                System.out.print("Masukan Kedalaman Ikan (Meter)       : ");
                double addkedalamanikan = Double.parseDouble(br.readLine());
                System.out.print("Masukan daerah penemuan dari Ikan    : ");
                String adddaerahikan = br.readLine();
                System.out.print("Masukan tahun ditemukannya Ikan      : ");
                int addtahunikan = Integer.parseInt(br.readLine());
                Ikan ikanBaru = new Ikan(addilmiahikan, addnamaikan, addwarnaikan, addkecepatanikan, addstatusikan, addkonsumsiikan, addkedalamanikan, adddaerahikan, addtahunikan); 
                ikan.add(ikanBaru);
                ikanBaru.registrasi();
            break;

            case 2:
                System.out.print("Masukan Nama Ilmiah krustasea             : ");
                String addilmiahkrustasea = br.readLine();
                System.out.print("Masukan Nama umum krustasea               : ");
                String addnamakrustasea = br.readLine();
                System.out.print("Masukan Status dari krustasea             : ");
                String addstatuskrustasea = br.readLine();
                System.out.print("Apakah Bisa Dikonsumsi                    : ");
                String addkonsumsikrustasea = br.readLine();
                System.out.print("Masukan Kedalaman krustasea (Meter)       : ");
                double addkedalamankrustasea = Double.parseDouble(br.readLine());
                System.out.print("Masukan daerah penemuan dari krustasea    : ");
                String adddaerahkrustasea = br.readLine();
                System.out.print("Masukan tahun ditemukannya krustasea      : ");
                int addtahunkrustasea = Integer.parseInt(br.readLine());
                System.out.print("Masukan jumlah kaki krustasea             : ");
                int addjumlahkaki = Integer.parseInt(br.readLine());
                System.out.print("Masukan tahun ditemukannya krustasea      : ");
                int addharga = Integer.parseInt(br.readLine());
                Krustasea krustaseaBaru = new Krustasea(addilmiahkrustasea, addnamakrustasea, addstatuskrustasea, addkonsumsikrustasea, addkedalamankrustasea, adddaerahkrustasea, addtahunkrustasea, addjumlahkaki, addharga); 
                krustasea.add(krustaseaBaru);
                krustaseaBaru.registrasi();
            break;
            
            case 3:
                System.out.print("Masukan Nama Ilmiah Kerang           : ");
                String addilmiahkerang = br.readLine();
                System.out.print("Masukan Nama umum Kerang             : ");
                String addnamakerang = br.readLine();
                System.out.print("Masukan Status dari Kerang           : ");
                String addstatuskerang = br.readLine();
                System.out.print("Apakah Bisa Dikonsumsi               : ");
                String addkonsumsikerang = br.readLine();
                System.out.print("Masukan Kedalaman Kerang (Meter)     : ");
                double addkedalamankerang = Double.parseDouble(br.readLine());
                System.out.print("Masukan daerah penemuan dari Kerang  : ");
                String adddaerahkerang = br.readLine();
                System.out.print("Masukan tahun ditemukannya Kerang    : ");
                int addtahunkerang = Integer.parseInt(br.readLine());
                System.out.print("Batas Makan Kerang dalam Sehari      : ");
                int addbatas = Integer.parseInt(br.readLine());
                System.out.print("Berapa kandungan kolestrol Kerang    : ");
                int addkolestrol = Integer.parseInt(br.readLine());
                Kerang kerangBaru = new Kerang(addilmiahkerang, addnamakerang, addstatuskerang, addkonsumsikerang, addkedalamankerang, adddaerahkerang, addtahunkerang, addbatas, addkolestrol); 
                kerang.add(kerangBaru);
                kerangBaru.registrasi();
            break;

            case 4:
                System.out.print("Masukan Nama Ilmiah Karang    : ");
                String addilmiahkarang = br.readLine();
                System.out.print("Masukan Nama umum Karang             : ");
                String addnamakarang = br.readLine();
                System.out.print("Masukan Status dari Biota             : ");
                String addstatuskarang = br.readLine();
                System.out.print("Apakah Bisa Dikonsumsi               : ");
                String addkonsumsikarang = br.readLine();
                System.out.print("Masukan Kedalaman Biota (Meter)       : ");
                double addkedalamankarang = Double.parseDouble(br.readLine());
                System.out.print("Masukan daerah penemuan dari Biota    : ");
                String adddaerahkarang = br.readLine();
                System.out.print("Masukan tahun ditemukannya Biota      : ");
                int addtahunkarang = Integer.parseInt(br.readLine());
                System.out.print("Apakah Karang ini Boleh dikoleksi     : ");
                String addkoleksi = br.readLine();
                System.out.print("Masukan Berat dari Karang             : ");
                int addberatkarang = Integer.parseInt(br.readLine());

                Karang karangBaru = new Karang(addilmiahkarang, addnamakarang, addstatuskarang, addkonsumsikarang, addkedalamankarang, adddaerahkarang, addtahunkarang, addkoleksi, addberatkarang);
                karang.add(karangBaru);
                karangBaru.registrasi();
            break;

        }
    }

    public static int readBiota() throws IOException{
        System.out.println("\n");
        System.out.println("        _____________________________________");
        System.out.println("        |                                   |");
        System.out.println("        |           DATA BIOTA LAUT         |");
        System.out.println("        |___________________________________|\n");
        System.out.println("                   Melihat data");
        System.out.println("                    1. Ikan");
        System.out.println("                    2. Krustasea");
        System.out.println("                    3. Kerang");
        System.out.println("                    4. Terumbu Karang\n");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) { 
        case 1:
            System.out.println(" DATA IKAN");
            for (int i = 0; i < ikan.size(); i++) {
                System.out.println("        ( Ikan ke " + (i+1) + " : " + ikan.get(i).getNamaumum() + " )");
                System.out.println("       ----------------------");
                System.out.println("Nama Ilmiah Ikan Laut              : " + ikan.get(i).getNamailmiah());
                System.out.println("Nama umum Ikan Laut                : " + ikan.get(i).getNamaumum());
                System.out.println("Warna Ikan adalah                  : " + ikan.get(i).getWarna());
                System.out.println("Kecepatan Berenang Ikan            : " + ikan.get(i).getKecepatan());
                System.out.println("Status Ikan Laut                   : " + ikan.get(i).getStatus());
                System.out.println("Apakah Aman untuk Dikonsumsi       : " + ikan.get(i).getKonsumsi());
                System.out.println("Kedalaman Laut Ikan Laut (Meter)   : " + ikan.get(i).getKedalaman());
                System.out.println("Daerah Ditemukan Ikan Laut         : " + ikan.get(i).getDaerah());
                System.out.println("Tahun ditemukan Ikan Laut          : " + ikan.get(i).getTahun());
                System.out.print("\n");
            }
            return(pilihan);

        case 2:
            System.out.println(" DATA KRUSTASEA / SERANGGA LAUT");
            for (int i = 0; i < krustasea.size(); i++) {
                System.out.println("        ( Krustasea ke " + (i+1) + " : " + krustasea.get(i).getNamaumum() + " )");
                System.out.println("       ----------------------");
                System.out.println("Nama Ilmiah Krustasea Laut              : " + krustasea.get(i).getNamailmiah());
                System.out.println("Nama umum Krustasea Laut                : " + krustasea.get(i).getNamaumum());
                System.out.println("Status Ikan Krustasea                   : " + krustasea.get(i).getStatus());
                System.out.println("Kedalaman Laut Krustasea Laut (Meter)   : " + krustasea.get(i).getKedalaman());
                System.out.println("Daerah Ditemukan Krustasea Laut         : " + krustasea.get(i).getDaerah());
                System.out.println("Tahun ditemukan Krustasea Laut          : " + krustasea.get(i).getTahun());
                System.out.println("Jumlah Kaki Krustasea Laut              : " + krustasea.get(i).getJumlahkaki());
                System.out.println("Harga Krustasea Laut                    : " + krustasea.get(i).getHarga());
                System.out.print("\n");
            }
            return(pilihan);

        case 3:
            System.out.println(" DATA KERANG LAUT");
            for (int i = 0; i < kerang.size(); i++) {
                System.out.println("        ( Kerang ke " + (i+1) + " : " + kerang.get(i).getNamaumum() + " )");
                System.out.println("       ----------------------");
                System.out.println("Nama kerang Laut                     : " + kerang.get(i).getNamailmiah());
                System.out.println("Nama umum kerang Laut                : " + kerang.get(i).getNamaumum());
                System.out.println("Status kerang Krustasea              : " + kerang.get(i).getStatus());
                System.out.println("Kedalaman Laut kerang Laut (Meter)   : " + kerang.get(i).getKedalaman());
                System.out.println("Daerah Ditemukan kerang Laut         : " + kerang.get(i).getDaerah());
                System.out.println("Tahun ditemukan kerang Laut          : " + kerang.get(i).getTahun());
                System.out.println("Batas Makan Kerang dalam Sehari      : " + kerang.get(i).getBatas());
                System.out.println("Kandungan Kolestrol dalam Kerang      : " + kerang.get(i).getKolestrol());

                System.out.print("\n");
            }
            return(pilihan);

        case 4:
            System.out.println(" DATA TERUMBU KARANG LAUT");
            for (int i = 0; i < karang.size(); i++) {
                System.out.println("        ( Biota ke " + (i+1) + " : " + karang.get(i).getNamaumum() + " )");
                System.out.println("       ----------------------");
                System.out.println("Nama Terumbu Karang Laut                     : " + karang.get(i).getNamailmiah());
                System.out.println("Nama umum Terumbu Karang Laut                : " + karang.get(i).getNamaumum());
                System.out.println("Status Terumbu Karang Krustasea              : " + karang.get(i).getStatus());
                System.out.println("Kedalaman Laut Terumbu Karang Laut (Meter)   : " + karang.get(i).getKedalaman());
                System.out.println("Daerah Ditemukan Terumbu Karang Laut         : " + karang.get(i).getDaerah());
                System.out.println("Tahun ditemukan Terumbu Karang Laut          : " + karang.get(i).getTahun());
                System.out.println("Apakah Karang ini boleh dikoleksi            : " + karang.get(i).getKoleksi());
                System.out.println("Max Berat dari karang ini adalah             : " + karang.get(i).getBerat());
                System.out.print("\n");
            }
            return(pilihan);

        }
        return 0;
            
    }
    
    public static void updateBiota() throws IOException{

        int pilihan = readBiota();

        System.out.println("\n");
        System.out.println("        __________________________________________");
        System.out.println("        |                                        |");
        System.out.println("        |      UBAH DATA BIOTA LAUT TERDAFTAR    |");
        System.out.println("        |________________________________________|\n");
        switch (pilihan) {
            case 1:
            System.out.print("Ubah Data Ikan ke -");
            int indexikan = Integer.parseInt(br.readLine());
    
            if(indexikan -1 >= ikan.size()){
                System.out.println("DATA TIDAK ADA !");
                return;
            }
    
            System.out.print("Masukan Nama Ilmiah Ikan     : ");
            String addilmiahikan = br.readLine();
            System.out.print("Masukan Nama umum Ikan               : ");
            String addnamaikan = br.readLine();
            System.out.print("Masukan Warna Ikan               : ");
            String addwarnaikan = br.readLine();
            System.out.print("Masukan Kecepatan Ikan Laut              : ");
            int addkecepatanikan  = Integer.parseInt(br.readLine());
            System.out.print("Masukan Status Ikan Laut          : ");
            String addstatusikan = br.readLine();
            System.out.print("Apakah Aman untuk dimakan            : ");
            String addkonsumsiikan = br.readLine();
            System.out.print("Masukan Kedalaman Ikan               : ");
            double addkedalamanikan  = Double.parseDouble(br.readLine());
            System.out.print("Masukan daerah penemuan dari Ikan    : ");
            String adddaerahikan = br.readLine();
            System.out.print("Masukan tahun ditemukannya Ikan      : ");
            int addtahunikan  = Integer.parseInt(br.readLine());
    
            ikan.get(indexikan-1).setNamailmiah(addilmiahikan);
            ikan.get(indexikan-1).setNamaumum(addnamaikan); 
            ikan.get(indexikan-1).setWarna(addwarnaikan);
            ikan.get(indexikan-1).setKecepatan(addkecepatanikan);
            ikan.get(indexikan-1).setStatus(addstatusikan);
            ikan.get(indexikan-1).setKonsumsi(addkonsumsiikan);
            ikan.get(indexikan-1).setKedalaman(addkedalamanikan);  
            ikan.get(indexikan-1).setDaerah(adddaerahikan);  
            ikan.get(indexikan-1).setTahun(addtahunikan); 
            
            ikan.get(indexikan-1).terupdate();
        break;

        case 2:
            System.out.print("Ubah Data Ikan ke -");
            int indexkrustasea = Integer.parseInt(br.readLine());

            if(indexkrustasea -1 >= krustasea.size()){
                System.out.println("DATA TIDAK ADA !");
                return;
            }

            System.out.print("Masukan Nama Ilmiah krustasea              : ");
            String addilmiahkrustasea  = br.readLine();
            System.out.print("Masukan Nama umum krustasea                : ");
            String addnamakrustasea  = br.readLine();
            System.out.print("Masukan Status dari krustasea              : ");
            String addstatuskrustasea  = br.readLine();
            System.out.print("Apakah Aman untuk dimakan                  : ");
            String addkonsumsikrustasea  = br.readLine();
            System.out.print("Masukan Kedalaman krustasea                : ");
            double addkedalamankrustasea   = Double.parseDouble(br.readLine());
            System.out.print("Masukan daerah penemuan dari krustasea     : ");
            String adddaerahkrustasea  = br.readLine();
            System.out.print("Masukan tahun ditemukannya krustasea       : ");
            int addtahunkrustasea  = Integer.parseInt(br.readLine());
            System.out.print("Masukan Jumlah Kaki Krustasea              : ");
            int addjumlahkakikrustasea  = Integer.parseInt(br.readLine());
            System.out.print("Masukan Harga Krustasea                    : ");
            int addhargakrustasea  = Integer.parseInt(br.readLine());

            krustasea.get(indexkrustasea-1).setNamailmiah(addilmiahkrustasea);
            krustasea.get(indexkrustasea-1).setNamaumum(addnamakrustasea); 
            krustasea.get(indexkrustasea-1).setStatus(addstatuskrustasea);
            krustasea.get(indexkrustasea-1).setKonsumsi(addkonsumsikrustasea);
            krustasea.get(indexkrustasea-1).setKedalaman(addkedalamankrustasea);  
            krustasea.get(indexkrustasea-1).setDaerah(adddaerahkrustasea);  
            krustasea.get(indexkrustasea-1).setTahun(addtahunkrustasea); 
            krustasea.get(indexkrustasea-1).setJumlahkaki(addjumlahkakikrustasea); 
            krustasea.get(indexkrustasea-1).setHarga(addhargakrustasea); 
            
            krustasea.get(indexkrustasea-1).terupdate();
        break;

        case 3:
            System.out.print("Ubah Data Ikan ke -");
            int indexkerang = Integer.parseInt(br.readLine());

            if(indexkerang -1 >= kerang.size()){
                System.out.println("DATA TIDAK ADA !");
                return;
            }

            System.out.print("Masukan Nama Ilmiah Kerang               : ");
            String addilmiahkerang  = br.readLine();
            System.out.print("Masukan Nama umum Kerang                 : ");
            String addnamakerang  = br.readLine();
            System.out.print("Masukan Status dari Kerang               : ");
            String addstatuskerang  = br.readLine();
            System.out.print("Apakah Aman untuk dimakan                : ");
            String addkonsumsikerang  = br.readLine();
            System.out.print("Masukan Kedalaman Kerang                 : ");
            double addkedalamankerang   = Double.parseDouble(br.readLine());
            System.out.print("Masukan daerah penemuan dari Kerang      : ");
            String adddaerahkerang  = br.readLine();
            System.out.print("Masukan tahun ditemukannya Kerang        : ");
            int addtahunkerang  = Integer.parseInt(br.readLine());
            System.out.print("Batas Makan Kerang dalam sehari          : ");
            int addbataskerang  = Integer.parseInt(br.readLine());
            System.out.print("Kandungan Kolestrol dalam Kerang         : ");
            int addkolestrolkerang = Integer.parseInt(br.readLine());

            kerang.get(indexkerang-1).setNamailmiah(addilmiahkerang);
            kerang.get(indexkerang-1).setNamaumum(addnamakerang); 
            kerang.get(indexkerang-1).setStatus(addstatuskerang);
            kerang.get(indexkerang-1).setKonsumsi(addkonsumsikerang);
            kerang.get(indexkerang-1).setKedalaman(addkedalamankerang);  
            kerang.get(indexkerang-1).setDaerah(adddaerahkerang);  
            kerang.get(indexkerang-1).setTahun(addtahunkerang); 
            kerang.get(indexkerang-1).setBatas(addbataskerang); 
            kerang.get(indexkerang-1).setKolestrol(addkolestrolkerang); 
            
            kerang.get(indexkerang-1).terupdate();
        break;

        case 4:
            System.out.print("Ubah Data Ikan ke -");
            int indexkarang = Integer.parseInt(br.readLine());

            if(indexkarang -1 >= karang.size()){
                System.out.println("DATA TIDAK ADA !");
                return;
            }

            System.out.print("Masukan Nama Ilmiah Terumbu Karang               : ");
            String addilmiahkarang  = br.readLine();
            System.out.print("Masukan Nama umum Terumbu Karang                 : ");
            String addnamakarang  = br.readLine();
            System.out.print("Masukan Status dari Terumbu Karang               : ");
            String addstatuskarang  = br.readLine();
            System.out.print("Masukan Kedalaman Terumbu Karang                 : ");
            double addkedalamankarang   = Double.parseDouble(br.readLine());
            System.out.print("Masukan daerah penemuan dari Terumbu Karang      : ");
            String adddaerahkarang  = br.readLine();
            System.out.print("Masukan tahun ditemukannya Terumbu Karang        : ");
            int addtahunkarang  = Integer.parseInt(br.readLine());
            System.out.print("Apakah Kerang ini boleh dikoleksi                : ");
            String addkoleksikarang  = br.readLine();
            System.out.print("Max Berat dari Karang ini adalah                 : ");
            int addberatkarang  = Integer.parseInt(br.readLine());

            karang.get(indexkarang-1).setNamailmiah(addilmiahkarang);
            karang.get(indexkarang-1).setNamaumum(addnamakarang); 
            karang.get(indexkarang-1).setStatus(addstatuskarang);
            karang.get(indexkarang-1).setKedalaman(addkedalamankarang);  
            karang.get(indexkarang-1).setDaerah(adddaerahkarang);  
            karang.get(indexkarang-1).setTahun(addtahunkarang); 
            karang.get(indexkarang-1).setKoleksi(addkoleksikarang); 
            karang.get(indexkarang-1).setBerat(addberatkarang); 
            
            karang.get(indexkarang-1).terupdate();
        break;

        default:
            break;
        }


    }

    public static void deleteBiota() throws IOException{
        int pilihan = readBiota();
        System.out.println("\n");
        System.out.println("        _________________________________");
        System.out.println("        |                               |");
        System.out.println("        |     HAPUS DATA BIOTA LAUT     |");
        System.out.println("        |_______________________________|\n");
        switch (pilihan) {
            case 1:
                System.out.print("Hapus Data Ikan ke- ");
                int indexikan = Integer.parseInt(br.readLine());

                if(indexikan -1 >= ikan.size()){
                    System.out.println("DATA TIDAK ADA !");
                    return;
                }
                ikan.remove(indexikan-1);
                System.out.println(" DATA BERHASIL TERHAPUS !");
            break;

            case 2:
                System.out.print("Hapus Data Biota ke- ");
                int indexkrustasea = Integer.parseInt(br.readLine());

                if(indexkrustasea -1 >= krustasea.size()){
                    System.out.println("DATA TIDAK ADA !");
                    return;
                }
                ikan.remove(indexkrustasea-1);
                System.out.println(" DATA BERHASIL TERHAPUS !");
            break;

            case 3:
                System.out.print("Hapus Data Biota ke- ");
                int indexkerang = Integer.parseInt(br.readLine());

                if(indexkerang -1 >= kerang.size()){
                    System.out.println("DATA TIDAK ADA !");
                    return;
                }
                kerang.remove(indexkerang-1);
                System.out.println(" DATA BERHASIL TERHAPUS !");
            break;

            case 4:
                System.out.print("Hapus Data Biota ke- ");
                int indexkarang = Integer.parseInt(br.readLine());

                if(indexkarang -1 >= karang.size()){
                    System.out.println("DATA TIDAK ADA !");
                    return;
                }
                ikan.remove(indexkarang-1);
                System.out.println(" DATA BERHASIL TERHAPUS !");
            break;


        }

    
    }
}