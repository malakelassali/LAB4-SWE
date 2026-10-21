package problem1.after;

public class MySqlConnection implements DbConnection {
    public String connect() { return "Connected to MySQL on port 3306"; }
}
