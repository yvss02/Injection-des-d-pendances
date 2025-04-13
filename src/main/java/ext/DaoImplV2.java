package ext;

import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier("dao2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        double t=70;
        return t;
    }
}
