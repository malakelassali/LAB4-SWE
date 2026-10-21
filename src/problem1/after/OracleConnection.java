package problem1.after;

public class OracleConnection implements DbConnection {
    public String connect() { return "Connected to Oracle on port 1521"; }
}
