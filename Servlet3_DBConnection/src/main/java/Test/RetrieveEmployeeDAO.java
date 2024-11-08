package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RetrieveEmployeeDAO {
public ArrayList<EmployeeBean> al=new ArrayList<EmployeeBean>();

 
	public  ArrayList<EmployeeBean> getEmp() {
		
		try {

			Connection con =DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select  * from employee64");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				EmployeeBean eb=new EmployeeBean();
				eb.setId(rs.getInt(1));
				eb.setName(rs.getString(2));
				eb.setDesg(rs.getString(3));
				eb.setBsal(rs.getDouble(4));

				al.add(eb);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return al;

	}
}

