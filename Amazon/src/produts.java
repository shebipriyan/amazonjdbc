import java.sql.*;

public class produts {
	
public static void produtsdetails()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/amazon";
		String username="root";
		String password="0525";	
		String Query="insert into products values(?,?,?,?)";
        Connection conn=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=conn.prepareStatement(Query);
		pst.setInt(1,301 );
		pst.setString(2,"babyhub products");
		pst.setDouble(3,1000);
		pst.setInt(4,533);
		pst.setInt(1,302 );
		pst.setString(2,"womens products");
		pst.setDouble(3,10000);
		pst.setInt(4,55);
		
		pst.executeUpdate();
		conn.close();

		}
		
		public static void main(String[] args)throws Exception{
			
			produtsdetails();


}
}
