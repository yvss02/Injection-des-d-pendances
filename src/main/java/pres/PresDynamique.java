package pres;


import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresDynamique {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            //DaoImpl dao=new DaoImpl();
            String daoClassname = scanner.nextLine();
            Class cdao = Class.forName(daoClassname);
            IDao dao = (IDao) cdao.getConstructor().newInstance();
            //IMetier metier=new MetierImpl(dao);
            String metierClassName = scanner.nextLine();
            Class cmetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cmetier.getConstructor(IDao.class).newInstance(dao);

            //metier.setDao(dao);
            Method meth = cmetier.getDeclaredMethod("setDao", IDao.class);
            meth.invoke(metier, dao);
            System.out.println("RES= "+metier.calcul());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

