package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version base de donnes");
        double temp =25;
        return temp;
    }
}
