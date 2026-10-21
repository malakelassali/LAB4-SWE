package problem1.after;

import problem1.after.ReportDao;

public class Test {
    public static void main(String[] args) {
        MySqlFactory mySql= new MySqlFactory();
        SqlServerFactory sqlServer= new SqlServerFactory();
        OracleFactory oracle= new OracleFactory();
        new ReportDao(mySql).topStudents(3);
        new ReportDao(sqlServer).topStudents(3);
        new ReportDao(oracle).topStudents(3);
    }
}

