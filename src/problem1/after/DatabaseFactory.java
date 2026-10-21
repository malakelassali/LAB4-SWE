package problem1.after;

public interface DatabaseFactory {
    DbConnection createConnection();
    SqlDialect createDialect();
    static DatabaseFactory forName(String name) {
        switch (name) {
            case "mysql" : return new MySqlFactory();
            case "sqlserver" : return new SqlServerFactory();
            case "oracle" : return new OracleFactory();
            default: return null;
        }
    }
}
