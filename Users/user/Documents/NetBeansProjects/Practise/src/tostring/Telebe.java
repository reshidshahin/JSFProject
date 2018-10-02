package tostring;

public class Telebe {

    private String ad;
    private String soyadi;
    private int yas;
    private int ID;
    private static String mekteb; //static in menasi hamisi ucun ortaq olan ozellikleri belirtmek ucundur.

    public Telebe(String ad, String soyadi, int yas, int ID) {
        this.ad = ad;
        this.soyadi = soyadi;
        this.yas = yas;
        this.ID = ID;
    }

    public void melumatlariYazdir() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyadi: " + soyadi);
        System.out.println("Yas: " + yas);
        System.out.println("Mekteb: " + mekteb);
        System.out.println("ID: " + ID);
    }

    @Override
    public String toString() {
        return "Ad: " + ad + " , Soyad: " + soyadi + ", Yas:" + yas + ", Mekteb: " + mekteb + ", ID: " + ID;
    }

    public static void setmekteb(String mekteb) {
        Telebe.mekteb = mekteb;
    }

    public static String getmekteb() {
        return mekteb;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
