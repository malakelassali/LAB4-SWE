package problem1.after;

public class OracleEscaper implements SqlEscaper {
    @Override
    public String escape(String column) {
        return '"' + column + '"';
    }
}

