package problem1.after;

import problem1.after.ReportDao;

public class Test {
    public static void main(String[] args) {
        MySqlFactory mySql= new MySqlFactory();
        SqlServerFactory SqlServer= new SqlServerFactory();
        new ReportDao(mySql).topStudents(3);
        new ReportDao(SqlServer).topStudents(3);
    }
}

