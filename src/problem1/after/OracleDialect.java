package problem1.after;

public class OracleDialect implements SqlDialect {
    public String selectTop(String table, int n) {
        return "SELECT * FROM " + table + " FETCH FIRST " + n + " ROWS ONLY";
    }
}
