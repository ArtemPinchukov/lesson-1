import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SupplaersRep implements Repository {
    @Override
    public ArrayList<Object> getAll() throws SQLException {
        PreparedStatement ps=JdbcConnection.getConnetion().prepareStatement("SELECT*FROM suppliers"); // подготавливает запрос
        ResultSet result=ps.executeQuery();// в прееменную result возвращается таблица suppliers
        ArrayList<Object>list=new ArrayList<>();
        while (result.next()){//result.next перемещает "курсор"на строку вниз. пока строки есть возвращается true
            Suppliers supp=new Suppliers();
            supp.id=result.getInt("id");
            supp.name=result.getString("name");
            supp.address=result.getString("address");
            supp.email=result.getString("email");
            supp.phone=result.getString("phone");
            supp.date_reg=result.getString("date_reg");
            list.add(supp);
        }
        return list;
    }

    @Override
    public void add(Object o) throws SQLException {
        Suppliers supp=(Suppliers) o;
        PreparedStatement ps=JdbcConnection.getConnetion().prepareStatement("INSERT INTO suppliers(name,address,phone,email,date_reg)VALUES(?,?,?,?,?)");
        ps.setString(1,supp.name);
        ps.setString(2,supp.address);
        ps.setString(3,supp.phone);
        ps.setString(4,supp.email);
        ps.setString(5,supp.date_reg);
        ps. executeUpdate();

    }

    @Override
    public void update(Object o) throws SQLException {
        Suppliers supp=(Suppliers) o;
        PreparedStatement ps=JdbcConnection.getConnetion().prepareStatement("UPDATE suppliers SET name=?,address=?,phone=?,email=?,date_reg=? WHERE id=?");
        ps.setString(1,supp.name);
        ps.setString(2,supp.address);
        ps.setString(3,supp.phone);
        ps.setString(4,supp.email);
        ps.setString(5,supp.date_reg);
        ps.setInt(6,supp.id);
        ps. executeUpdate();

    }

    @Override
    public void remove(Object o) throws SQLException {
        Suppliers supp=(Suppliers) o;
        PreparedStatement ps=JdbcConnection.getConnetion().prepareStatement("DELETE FROM suppliers WHERE id=?");
        ps.setInt(1,supp.id);
        ps. executeUpdate();

    }// реппозиторий через него будет работать программа

}
