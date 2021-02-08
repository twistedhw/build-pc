public class Main
{
    public static void main (String []  args)
    {
        Computer pc;
        pc = new Computer("Threadripper 3990x", "MSI creator TRX40", "Crucial Ballistix  3600Mhz 32GBx2", "Rtx 2060", "Hdd 1tb", "Ssd Samsung 970 pro 1tb", "Cooler Master MasterAir MA610P", "Rog Thor 1200W","Cooler Master MasterCase 5");
        System.out.println(pc.toString());
    }
}
