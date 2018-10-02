package tostring;

/**
 *
 * @author Shahin_Rashidbayli
 */
public class Main {

    public static void main(String[] args) {
        Telebe.setmekteb("216 no mekteb");

        Telebe telebe1 = new Telebe("shahin", "rashidbayli", 24, 120101010);
        Telebe telebe2 = new Telebe("nicat", "qasimli", 21, 987654312);

        //String birinci_telebe = telebe1.melumatlariAl();
        System.out.println(telebe1); 
        System.out.println(telebe2);
        
        /*
        tostring bize komek edirki biz uje String birinci_telebe = telebe1.melumatlariAl();
        sonra ise birinci_telebe capa ver etmeyek 
        ele birbasa telebe1 veya telebe2 yazib melumatlari alaq
        
       
        */
        
    }
}
