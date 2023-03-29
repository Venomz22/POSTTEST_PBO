package POSTTEST4PBO;
public class Kerang extends Biota {
    protected Integer batas;
    protected Integer kolestrol;

    
    public Integer getBatas() {
        return batas;
    }


    public void setBatas(Integer batas) {
        this.batas = batas;
    }


    public Integer getKolestrol() {
        return kolestrol;
    }


    public void setKolestrol(Integer kolestrol) {
        this.kolestrol = kolestrol;
    }


        //constructor
        public Kerang(String namailmiah, String namaumum, String status, String konsumsi, double kedalaman, String daerah, int tahun, int batas, int kolestrol){
            super(namailmiah, namaumum, status, konsumsi, kedalaman, daerah, tahun);
            this.batas = batas;
            this.kolestrol = kolestrol;
        }
            
    
        // method
        @Override
        public void isAdded(){
            System.out.println("\n");
            System.out.println("        HASIL REGISTRASI DATA KERANG  ");
            System.out.println("=============================================");
            System.out.println("Nama Ilmiah Kerang ini adalah    : " + this.namailmiah);
            System.out.println("Nama Umum Kerang ini adalah      : " + this.namaumum);
            System.out.println("Status dari Kerang ini adalah    : " + this.status);
            System.out.println("Apakah Kerang ini Boleh dimakan  : " + this.konsumsi);
            System.out.println("Kerang Hidup di Kedalaman Laut   : " + this.kedalaman + " Meter");
            System.out.println("Kerang ini ditemukan di daerah   : " + this.daerah);
            System.out.println("Kerang ini ditemukan pada tahun  : " + this.tahun);
            System.out.println("Batas Makan Kerang sehari (kg)   : " + this.batas + " (KG)");
            System.out.println("Kandungan Kolestrol dalam kerang : " + this.kolestrol + " (MG)");

            System.out.println("");
            System.out.println("Data telah terdaftar di pendataan Biota Laut Indonesia !");
            
        }
        
        @Override
        public void isUpdate(){
            System.out.println("\n");
            System.out.println("Nama Ilmiah Kerang ini adalah    : " + this.namailmiah);
            System.out.println("Nama Umum Kerang ini adalah      : " + this.namaumum);
            System.out.println("Status dari Kerang ini adalah    : " + this.status);
            System.out.println("Kerang ini                       :" + this.konsumsi + " Dikonsumsi");
            System.out.println("Kerang Hidup di Kedalaman Laut   : " + this.kedalaman);
            System.out.println("Kerang ini ditemukan di daerah   : " + this.daerah);
            System.out.println("Kerang ini ditemukan pada tahun  : " + this.tahun);
            System.out.println("Batas Makan Kerang sehari adalah : " + this.batas + " (KG)");
            System.out.println("Kandungan Kolestrol dalam kerang : " + this.kolestrol + " (MG)");
            System.out.println("");
            System.out.println("Data telah Terubah di pendataan Biota Laut Indonesia !");
        }
}

