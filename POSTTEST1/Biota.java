package POSTTEST1;


public class Biota {
    // property
    String namailmiah;
    String namaumum;
    String status;
    Double kedalaman;
    String daerah;
    Integer tahun;
    
    //constructor
    public Biota(String namailmiah, String namaumum, String status, double kedalaman, String daerah, int tahun){
        this.namailmiah = namailmiah;
        this.namaumum = namaumum;
        this.status = status;
        this.kedalaman = kedalaman;
        this.daerah = daerah;
        this.tahun = tahun;
    }

    // method
    public void registrasi(){
        System.out.println("\n");
        System.out.println("        HASIL REGISTRASI DATA   ");
        System.out.println("=============================================");
        System.out.println("Nama Ilmiah Biota ini adalah    : " + this.namailmiah);
        System.out.println("Nama Umum Biota ini adalah      : " + this.namaumum);
        System.out.println("Status dari Biota ini adalah    : " + this.status);
        System.out.println("Biota Hidup di Kedalaman Laut   : " + this.kedalaman + " Meter");
        System.out.println("Biota ini ditemukan di daerah   : " + this.daerah);
        System.out.println("Biota ini ditemukan pada tahun  : " + this.tahun);
        System.out.println("");
        System.out.println("Data telah terdaftar di pendataan Biota Laut Indonesia !");
    }
    
    public void terupdate(){
        System.out.println("Nama Ilmiah Biota ini adalah    : " + this.namailmiah);
        System.out.println("Nama Umum Biota ini adalah      : " + this.namaumum);
        System.out.println("Status dari Biota ini adalah    : " + this.status);
        System.out.println("Biota Hidup di Kedalaman Laut   : " + this.kedalaman);
        System.out.println("Biota ini ditemukan di daerah   : " + this.daerah);
        System.out.println("Biota ini ditemukan pada tahun  : " + this.tahun);
        System.out.println("");
        System.out.println("Data telah Terubah di pendataan Biota Laut Indonesia !");
    }
}