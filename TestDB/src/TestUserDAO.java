/**
 * 
 */
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
/**
 * @author kae
 *
 */
public class TestUserDAO {
	
		String name ="";
		String password = "";
	public void select(String name,String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		String sql ="select * from test_table where user_name=? and password=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			System.out.println(rs.getString("user_name"));
			System.out.println(rs.getString("password"));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
		try {
			con.close() ;
		} catch (SQLException e) {
			e.printStackTrace();
		}
}
	
	public void selectAll() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		String sql ="select * from test_table";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void selectByName(String name) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		String sql ="select * from test_table where user_name=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,  name);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void selectByPassword(String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		String sql ="select * from test_table where password=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,  password);
			ResultSet rs=ps.executeQuery();
			//executeQuery 検索なしさい
			while (rs.next()) {
				//検索した結果で一つでも結果があればこちらに記入しなさい。
				System.out.println(rs.getString("user_name"));
				//getString　文字列で結果を持って来てください。画面に表示します。
				System.out.println(rs.getString("password"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
			//もしSQLに何かあったら表示してください。
		}
		try {
			con.close();
			//終了してくださいSQLに何かあったら表示してください。
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	
	public void updateUserNameByUserName(String oldName, String newName) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		String sql ="update test_table set user_name=? where user_name=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newName);
			ps.setString(2, oldName);
			int i =ps.executeUpdate();
			if(i > 0) {
				System.out.println(i + "件更新されました");
			}else {
				System.out.println("該当するデータはありませんでした");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
			//もしSQLに何かあったら表示してください。
		}
		try {
			con.close();
			//終了してくださいSQLに何かあったら表示してください。
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void insert(int user_id, String name, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		String sql ="insert into test_table values(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			ps.setString(2, name);
			ps.setString(3, password);
			int i =ps.executeUpdate();
			if(i > 0) {
				System.out.println(i + "件更新されました");
			}else {
				System.out.println("該当するデータはありませんでした");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
			//もしSQLに何かあったら表示してください。
		}
		try {
			con.close();
			//終了してくださいSQLに何かあったら表示してください。
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void delete(String name) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		String sql ="delete from test_table where user_name=?";
		//「?」はパラメータ変数
		//テーブルに格納されているデータを削除する
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			//「1」は1番目の「?」という意味。user_name= nameが入る
			int i =ps.executeUpdate();
			if(i > 0) {
				System.out.println(i + "削除されました");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
			//もしSQLに何かあったら表示してください。
		}
		try {
			con.close();
			//終了してくださいSQLに何かあったら表示してください。
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
