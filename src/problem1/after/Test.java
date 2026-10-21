package problem1.after;

public class Test {
    public static void main(String[] args) {
        DatabaseFactory mySql= DatabaseFactory.forName("mysql");
        DatabaseFactory sqlServer= DatabaseFactory.forName("sqlserver");
        DatabaseFactory oracle= DatabaseFactory.forName("oracle");
        new ReportDao(mySql).topStudents(3);
        new ReportDao(sqlServer).topStudents(3);
        new ReportDao(oracle).topStudents(3);
    }
}

