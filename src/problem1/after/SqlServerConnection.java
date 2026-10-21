package problem1.after;

public class SqlServerConnection implements DbConnection {
    public String connect() {
        return "Connected to SQL Server on port 1433";
    }
}

