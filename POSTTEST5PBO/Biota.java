package POSTTEST5PBO;


public abstract class Biota {
    // property
    protected String namailmiah;
    protected String namaumum;
    protected String status;
    protected String konsumsi;
    protected Double kedalaman;
    protected String daerah;
    protected Integer tahun;
    
    

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

    public String getKonsumsi() {
        return konsumsi;
    }

    public void setKonsumsi(String konsumsi) {
        this.konsumsi = konsumsi;
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
    public Biota(String namailmiah, String namaumum, String status, String addkonsumsikerang, double kedalaman, String daerah, int tahun){
        this.namailmiah = namailmiah;
        this.namaumum = namaumum;
        this.status = status;
        this.konsumsi = addkonsumsikerang;
        this.kedalaman = kedalaman;
        this.daerah = daerah;
        this.tahun = tahun;
    }

    //Override
    public void isAdded(){}

    abstract void isUpdate();

}