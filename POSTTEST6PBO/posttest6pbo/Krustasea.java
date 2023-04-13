package posttest6pbo;
public class Krustasea extends Biota {
    protected Integer jumlahkaki; 
    protected Integer harga;

    
    public Integer getJumlahkaki() {
        return jumlahkaki;
    }

    public void setJumlahkaki(Integer jumlahkaki) {
        this.jumlahkaki = jumlahkaki;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

        //constructor
        public Krustasea(String namailmiah, String namaumum, String status, String konsumsi, double kedalaman, String daerah, int tahun, int Jumlahkaki, int harga){
            super(namailmiah,  namaumum,  status, konsumsi, kedalaman, daerah, tahun);
            this.jumlahkaki = Jumlahkaki;
            this.harga = harga;
        }
    
        // method
        @Override
        public void isAdded(){
            System.out.println("\n");
            System.out.println("        HASIL REGISTRASI DATA Krustasea (Serangga Laut)   ");
            System.out.println("=============================================");
            System.out.println("Nama Ilmiah Krustasea ini adalah    : " + this.namailmiah);
            System.out.println("Nama Umum Krustasea ini adalah      : " + this.namaumum);
            System.out.println("Status dari Krustasea ini adalah    : " + this.status);
            System.out.println("Apakah Krustasea ini boleh dimakan  : " + this.konsumsi);
            System.out.println("Krustasea Hidup di Kedalaman Laut   : " + this.kedalaman + " Meter");
            System.out.println("Krustasea ini ditemukan di daerah   : " + this.daerah);
            System.out.println("Krustasea ini ditemukan pada tahun  : " + this.tahun);
            System.out.println("Krustasea ini Mempunyai berapa kaki : " + this.jumlahkaki);
            System.out.println("Harga Krustasea jika dijual         : " + this.harga);
            System.out.println("");
            System.out.println("Data telah terdaftar di pendataan Biota Laut Indonesia !");
            
        }
        
        @Override
        public void isUpdate(){
            System.out.println("\n");
            System.out.println("Nama Ilmiah Krustasea ini adalah    : " + this.namailmiah);
            System.out.println("Nama Umum Krustasea ini adalah      : " + this.namaumum);
            System.out.println("Status dari Krustasea ini adalah    : " + this.status);
            System.out.println("Krustasea ini                       : " + this.konsumsi + " Dikonsumsi");
            System.out.println("Krustasea Hidup di Kedalaman Laut   : " + this.kedalaman);
            System.out.println("Krustasea ini ditemukan di daerah   : " + this.daerah);
            System.out.println("Krustasea ini ditemukan pada tahun  : " + this.tahun);
            System.out.println("Krustasea ini mempunyai             : " + this.jumlahkaki +" Kaki");
            System.out.println("Harga Krustasea jika dijual         : " + this.harga);
            System.out.println("");
            System.out.println("Data telah Terubah di pendataan Biota Laut Indonesia !");
        }
    }



