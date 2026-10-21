package problem1.after;

public class OracleFactory implements DatabaseFactory {
    @Override
    public DbConnection createConnection() {
        return new OracleConnection();
    }

    @Override
    public SqlDialect createDialect() {
        return new OracleDialect();
    }

}
