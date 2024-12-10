package query;

import java.sql.*;

class Meth {

	public void insertData(Connection con, String name, String email, String password) throws SQLException {
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO users (Name,Email,password) VALUES (?, ?,?)");
		pstmt.setString(1, name);
		pstmt.setString(2, email);
		pstmt.setString(3, password);
		
		int rowsInserted = pstmt.executeUpdate();
		System.out.println(" Rows inserted: " + rowsInserted);
	}

	public void readData() {

	}

	public void deleteData(Connection con,int id) throws SQLException {
		
		String deletequery = "delete from users where id =?";
		PreparedStatement ps = con.prepareStatement(deletequery);
		ps.setInt(1, id);
		int rs = ps.executeUpdate();
		System.out.println(" No Rows deleted: " + rs);
		

	}

	public void updateData(Connection con,String email,int id) throws SQLException {
		
		String updatequery ="update users set name=? ,where id=?";
		PreparedStatement ps = con.prepareStatement(updatequery);
		ps.setString(1,email);
		ps.setInt(2, id);
		
		int rs = ps.executeUpdate();
		System.out.println(" Rows inserted: data updated Successfully" + rs);
		

	}

	public void displayData(ResultSet res) throws SQLException {
		while (res.next()) {
			int id = res.getInt("id");
			String name = res.getString("name");
			String email = res.getString("email");
			System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
		}

		System.out.println("\n Executed successfully \n");

	}
}

public class Index {

	public static void main(String[] args) throws SQLException {

		System.out.println(" ");

		String url = "jdbc:mysql://localhost:3306/users";
		String username = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, username, password);

		Meth meth = new Meth();

		String q1 = "Select * from users;";
		String q2 = "select * from users where id>5;";
		Statement st = con.createStatement();
		ResultSet res = st.executeQuery(q1);
		meth.displayData(res);
		res.close();
		ResultSet res1 = st.executeQuery(q2);
		meth.displayData(res1);
		res1.close();

		//meth.insertData(con, "sam sundhar", "bro@tsc", "paswor3d");
		//meth.updateData(con,"anothe0r@dance.com",2);
		meth.deleteData(con,13);
		ResultSet resw = st.executeQuery(q2);
		meth.displayData(resw);
		

	}

}
