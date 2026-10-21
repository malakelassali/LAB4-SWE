package problem1.after;

import problem1.before.MySqlConnection;
import problem1.before.MySqlDialect;
import problem1.before.SqlServerConnection;

public class ReportDao {
    private final DatabaseFactory dbFactory;
    public ReportDao(DatabaseFactory dbFactory) { this.dbFactory = dbFactory; }

    public void topStudents(int n) {
        DbConnection c= dbFactory.createConnection();
        SqlDialect d= dbFactory.createDialect();
        System.out.println(c.connect());
        System.out.println(d.selectTop("students", n));
    }
}
