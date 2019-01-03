package interfaceler;

/**
 *
 * @author Shahin_Rashidbayli
 */
public class MysqlDatabase implements IDatabase {

    @Override
    public void add() {
        System.out.println("Mysql added..");
    }

    @Override
    public void delete() {
        System.out.println("Mysql deleted..");
    }

    @Override
    public void get() {
        System.out.println("Mysql get..");
    }

    @Override
    public void update() {
        System.out.println("Mysql update..");
    }
}
