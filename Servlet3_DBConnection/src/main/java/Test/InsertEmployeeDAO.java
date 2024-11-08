package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertEmployeeDAO {

	public int k=0;

	public int insertDetails(EmployeeBean eb) {

		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement(" insert into employee64  (eid,ename,edesg,bsal) values (?,?,?,?)");  
			ps.setInt(1, eb.getId());
			ps.setString(2, eb.getName());
			ps.setString(3, eb.getDesg());

			ps.setDouble(4, eb.getBsal());

			k=ps.executeUpdate();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}






}
