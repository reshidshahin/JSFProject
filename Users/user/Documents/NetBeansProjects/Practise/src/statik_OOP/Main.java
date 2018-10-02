package statik_OOP;

/**
 *
 * @author Shahin_Rashidbayli
 */
public class Main {

    public static void main(String[] args) {
        Telebe telebe1 = new Telebe();

        Telebe.setmekteb("BAKU ENGINEERING UNIVERSITY"); //static metodlari cagiranda clasin adi ile cagiririq
        telebe1.setAd("Nicat");
        telebe1.setSoyadi("Rashidli");
        telebe1.setID(120101010);
        telebe1.setYas(24);

        System.out.println("Ad: " + telebe1.getAd());
        System.out.println("Soyad: " + telebe1.getSoyadi());
        System.out.println("ID: " + telebe1.getID());
        System.out.println("YAS: " + telebe1.getYas());
        System.out.println("YAS: " + Telebe.getmekteb());
    }
}
