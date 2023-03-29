package POSTTEST4PBO;

public class Ikan extends Biota {
    protected String warna;
    protected Integer kecepatan;

    public String getWarna() {
        return warna;
    }


    public void setWarna(String warna) {
        this.warna = warna;
    }


    public Integer getKecepatan() {
        return kecepatan;
    }


    public void setKecepatan(Integer kecepatan) {
        this.kecepatan = kecepatan;
    }


    public Ikan(String addilmiahikan, String addnamaikan, String addwarnaikan, int addkecepatanikan,
            String addstatusikan, String addkonsumsiikan, double addkedalamanikan, String adddaerahikan,
            int addtahunikan) {
            super(addilmiahikan, addnamaikan, addstatusikan, addkonsumsiikan, addkedalamanikan, adddaerahikan, addtahunikan);
            this.warna = addwarnaikan;
            this.kecepatan = addkecepatanikan;
    }


    // method
    @Override
    public void isAdded(){
        System.out.println("\n");
        System.out.println("        HASIL REGISTRASI DATA IKAN  ");
        System.out.println("=============================================");
        System.out.println("Nama Ilmiah Ikan ini adalah     : " + this.namailmiah);
        System.out.println("Nama Umum Ikan ini adalah       : " + this.namaumum);
        System.out.println("Warna dari Ikan ini adalah      : " + this.warna);
        System.out.println("Status dari Ikan ini adalah     : " + this.status);
        System.out.println("Apakah Ikan ini Boleh dimakan   : " + this.konsumsi);
        System.out.println("Kecepatan Berenang Ikan ini     : " + this.kecepatan + " (KM)");
        System.out.println("Ikan Hidup di Kedalaman Laut    : " + this.kedalaman + " Meter");
        System.out.println("Ikan ini ditemukan di daerah    : " + this.daerah);
        System.out.println("Ikan ini ditemukan pada tahun   : " + this.tahun);
        System.out.println("");
        System.out.println("Data telah terdaftar di pendataan Biota Laut Indonesia !");
        
    }
    
    @Override
    public void isUpdate(){
        System.out.println("\n");
        System.out.println("Nama Ilmiah Ikan ini adalah    : " + this.namailmiah);
        System.out.println("Nama Umum Ikan ini adalah      : " + this.namaumum);
        System.out.println("Status dari Ikan ini adalah    : " + this.status);
        System.out.println("Warna dari Ikan ini adalah     : " + this.warna);
        System.out.println("Ikan ini                       : " + this.konsumsi + " Dikonsumsi");
        System.out.println("Kecepatan Berenang Ikan ini    : " + this.kecepatan +" (KM)");
        System.out.println("Ikan Hidup di Kedalaman Laut   : " + this.kedalaman);
        System.out.println("Ikan ini ditemukan di daerah   : " + this.daerah);
        System.out.println("Ikan ini ditemukan pada tahun  : " + this.tahun);
        System.out.println("");
        System.out.println("Data telah Terubah di pendataan Biota Laut Indonesia !");
    }

    //Overloading 
    public void nama(String asd) {
        
    }

    public void nama(int asd) {
        
    }
}

