package problem1.after;

public class SqlServerEscaper implements SqlEscaper {
    @Override
    public String escape(String column) {
        return "[" + column + "]";
    }
}
