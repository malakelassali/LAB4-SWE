package problem1.after;

public class SqlServerDialect implements SqlDialect {
    public String selectTop(String table, int n) {
        return "SELECT TOP " + n + " * FROM " + table;
    }
}
