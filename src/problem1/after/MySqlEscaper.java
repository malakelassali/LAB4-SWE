package problem1.after;

public class MySqlEscaper implements SqlEscaper {
    @Override
    public String escape(String column) {
        return "`" + column + "`";
    }
}
