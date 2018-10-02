package statik_OOP;

/**
 *
 * @author Shahin_Rashidbayli
 */
public class Telebe {

    private String ad;
    private String soyadi;
    private int yas;
    private int ID;
    private static String mekteb; //static in menasi hamisi ucun ortaq olan ozellikleri belirtmek ucundur.

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
