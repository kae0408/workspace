/**
 * 
 */
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import com.mysql.jdbc.Connection;
	/**
	 * <p>WySQLに接続するためのユーティリィクラスです<br> 
	 * ルートアカウントにてDBに接続されます。<p>
	 *
	 */
	public class DBConnector {
	/**
	 * JDBドライバ名
	 */
	private static String driverName ="com.mysql.jdbc.Driver";
	/**
	 * データベース接続URL
	 */
	private static String url =
	"jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";
	/**
	 * データベース接続ユーザー名
	 */
	private static String user ="root";
	/**
	 * データベースパスワード
	 */
	private static String password = "mysql";

	public Connection getConnection() {
		Connection con =null;
		try {
		Class.forName(driverName);
		con = (Connection) DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return con ;
		
	}

}
