package posttest6pbo;

public final class Karang extends Biota {
    protected final String koleksi;
    protected final Integer berat;

    
    
    public String getKoleksi() {
        return koleksi;
    }


    public Integer getBerat() {
        return berat;
    }

        //constructor
        public Karang(String namailmiah, String namaumum, String status, String konsumsi, double kedalaman, String daerah, int tahun, String koleksi, int berat){
            super(namailmiah, namaumum, status, konsumsi, kedalaman, daerah, tahun);
            this.koleksi = koleksi;
            this.berat = berat;
        }
    
    
        // method
       @Override
        public final void isAdded(){
            System.out.println("\n");
            System.out.println("        HASIL REGISTRASI DATA TERUMBU KARANG  ");
            System.out.println("=============================================");
            System.out.println("Nama Ilmiah Terumbu Karang ini adalah    : " + this.namailmiah);
            System.out.println("Nama Umum Terumbu Karang ini adalah      : " + this.namaumum);
            System.out.println("Status dari Terumbu Karang ini adalah    : " + this.status);
            System.out.println("Terumbu Karang Hidup di Kedalaman Laut   : " + this.kedalaman + " Meter");
            System.out.println("Terumbu Karang ini ditemukan di daerah   : " + this.daerah);
            System.out.println("Terumbu Karang ini ditemukan pada tahun  : " + this.tahun);
            System.out.println("Apakah Terumbu Karang ini bisa dikoleksi : " + this.koleksi);
            System.out.println("berat max dari Terumbu Karang ini        : " + this.berat);
            System.out.println("");
            System.out.println("Data telah terdaftar di pendataan Biota Laut Indonesia !");
            
        }
        @Override
        public final void isUpdate(){
            System.out.println("\n");
            System.out.println("Nama Ilmiah Terumbu Karang ini adalah    : " + this.namailmiah);
            System.out.println("Nama Umum Terumbu Karang ini adalah      : " + this.namaumum);
            System.out.println("Status dari Terumbu Karang ini adalah    : " + this.status);
            System.out.println("Terumbu Karang Hidup di Kedalaman Laut   : " + this.kedalaman);
            System.out.println("Terumbu Karang ini ditemukan di daerah   : " + this.daerah);
            System.out.println("Terumbu Karang ini ditemukan pada tahun  : " + this.tahun);
            System.out.println("Terumbu Karang ini                       : " + this.koleksi + " Koleksi");
            System.out.println("Berat Max Terumbu Karang ini adalah      : " + this.berat);
            System.out.println("");
            System.out.println("Data telah Terubah di pendataan Biota Laut Indonesia !");
        }
}