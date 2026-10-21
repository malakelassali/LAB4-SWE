package problem1.after;

public class MySqlDialect implements SqlDialect {
    public String selectTop(String table, int n) {
        return "SELECT * FROM " + table + " LIMIT " + n;
    }
}