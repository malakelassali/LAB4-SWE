package problem1.after;

public interface DatabaseFactory {
    DbConnection createConnection();
    SqlDialect createDialect();
}
