package dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("dao1")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version base de donnes");
        double temp =25;
        return temp;
    }
}
