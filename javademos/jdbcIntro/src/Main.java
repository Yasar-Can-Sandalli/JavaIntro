import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.prepareStatement("insert into city(Name,CountryCode,District,Population) values('Kocaeli','TUR','Darica',200000) ");
            int result = statement.executeUpdate();
            System.out.println("Kayit Eklendi");
        } catch (SQLException exception) {
            helper.showErrorMassage(exception);
        } finally {
            statement.close();
            connection.close();
            //System.out.println("Baglanti kapandi");
        }
    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("insert into city(Name,CountryCode,District,Population) values('Kocaeli','41','Darica',200000) ");
            ArrayList<Country> films = new ArrayList<Country>();
            while (resultSet.next()) {
                films.add(new Country(
                        resultSet.getString("Name"),
                        resultSet.getString("CountryCode"),
                        resultSet.getString("District"),
                        resultSet.getString("Population")));
            }
            System.out.println(films.size());
        } catch (SQLException exception) {
            helper.showErrorMassage(exception);
        } finally {
            connection.close();
            //System.out.println("Baglanti kapandi");
        }
    }

}