public class Computer
{
    private String cpu;                         //threadripper 3990x
    private String schedaMadre;                 //MSI creator TRX40
    private String ram;                         //Crucial ballistix  3600Mhz 32GBx2
    private String schedaVideo;                 //Rtx 2060
    private String hdd;                         //Hdd 1tb
    private String ssd;                         //Ssd samsung 970 pro 1tb
    private String dissipatore;                 //Cooler master masterair MA610P
    private String alimentatore;                //Rog Thor 1200W
    private String Case;                        //Cooler master mastercase 5
    //costruttore classico
    public Computer(String c, String sm, String r, String sv, String hd, String sd, String ds, String al, String cs)
    {
        cpu = c;
        schedaMadre = sm;
        ram = r;
        schedaVideo = sv;
        hdd = hd;
        ssd= sd;
        dissipatore = ds;
        alimentatore = al;
        Case = cs;
    }

    public String getCpu()
    {
        return cpu;
    }

    public void setCpu(String cpu)
    {
        this.cpu = cpu;
    }

    public String getSchedaMadre()
    {
        return schedaMadre;
    }

    public void setSchedaMadre(String schedaMadre)
    {
        this.schedaMadre = schedaMadre;
    }

    public String getSchedaVideo()
    {
        return schedaVideo;
    }

    public String getRam()
    {
        return ram;
    }

    public void setRam(String ram)
    {
        this.ram = ram;
    }

    public void setSchedaVideo(String schedaVideo)
    {
        this.schedaVideo = schedaVideo;
    }

    public String getHdd()
    {
        return hdd;
    }

    public void setHdd(String hdd)
    {
        this.hdd = hdd;
    }

    public String getSsd()
    {
        return ssd;
    }

    public void setSsd(String ssd)
    {
        this.ssd = ssd;
    }

    public String getDissipatore()
    {
        return dissipatore;
    }

    public void setDissipatore(String dissipatore)
    {

        this.dissipatore = dissipatore;
    }

    public String getAlimentatore()
    {
        return alimentatore;
    }

    public void setAlimentatore(String alimentatore)
    {
        this.alimentatore = alimentatore;
    }

    public String getCase()
    {
        return Case;
    }

    public void setCase(String Case)
    {
        this.Case = Case;
    }

    public String toString()
    {
        return "\nIl pc è formato dalle seguenti caratteristiche: "+ "\nCpu: " + cpu + "\nScheda madre: " + schedaMadre +"\nRam: " + ram +  "\nScheda video: " + schedaVideo +"\nHdd: " + hdd + "\nSsd: "+ ssd +"\nDissipatore: "+dissipatore+ "\nAlimenatore: "+alimentatore+ "\nCase: "+Case;
    }
}
