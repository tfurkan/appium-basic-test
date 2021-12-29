package DB;

import java.sql.*;

public class DBConnection {

    private Connection openConnection(Connection con){
        if(con != null){
            closeConnection(con);
        }

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con= DriverManager.getConnection("jdbc:oracle:thin:@10.248.72.175:1521:cepfaz2dbt","AVEACEP","aveacep123");



        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return con;
    }

    private void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public String queryHelper(String sql) throws SQLException{
        String result = "";
        Connection connection = openConnection(null);
        ResultSet rs = connection.createStatement().executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        int numberOfColumns = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= numberOfColumns; i++) {
                result +=rs.getString(i);
            }
        }
        closeConnection(connection);
        return result;
    }
}


