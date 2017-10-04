import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JdbcConnection.init();
        Suppliers supp=new Suppliers();
        supp.name="belynichskiy";
        supp.phone="802434";
        supp.email="belynich@tut.by";
        supp.address="belynichi,4";
        supp.date_reg="2017-09-28";
        supp.id=8;
        SupplaersRep sRep=new SupplaersRep();
        //sRep.update(supp);
        //sRep.add(supp);
        sRep.remove(supp);
        ArrayList<Object> Suppliers=sRep.getAll();
        System.out.println(Suppliers);
    }
}
