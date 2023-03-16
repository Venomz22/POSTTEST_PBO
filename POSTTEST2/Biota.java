package POSTTEST2;


public class Biota {
    // property
    private String namailmiah;
    private String namaumum;
    private String status;
    private Double kedalaman;
    private String daerah;
    private Integer tahun;
    
    public String getNamailmiah() {
        return namailmiah;
    }

    public void setNamailmiah(String namailmiah) {
        this.namailmiah = namailmiah;
    }

    public String getNamaumum() {
        return namaumum;
    }

    public void setNamaumum(String namaumum) {
        this.namaumum = namaumum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getKedalaman() {
        return kedalaman;
    }

    public void setKedalaman(Double kedalaman) {
        this.kedalaman = kedalaman;
    }

    public String getDaerah() {
        return daerah;
    }

    public void setDaerah(String daerah) {
        this.daerah = daerah;
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

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
