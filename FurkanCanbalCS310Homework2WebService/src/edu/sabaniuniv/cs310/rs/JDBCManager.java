package edu.sabaniuniv.cs310.rs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JDBCManager {

	public static boolean addNewProduct(product p1) 
	{
		try 
		{
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cs310", "root","root");
			PreparedStatement ps =  con.prepareStatement("insert into product (productName,productPrice,productStock) values (?,?,?)");
			ps.setString(1, p1.getName());
			ps.setDouble(2, p1.getPrice());
			ps.setInt(3, p1.getStock());
			int result = ps.executeUpdate();
			
			if(result==1)
			{
				return true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
public static boolean deleteProduct(int id) {
		
		
		try
		{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cs310", "root", "root");		
			

				PreparedStatement ps =  connection.prepareStatement("delete from product where productID=?");
				ps.setInt(1,id);
				
				int result =ps.executeUpdate();

				if(result==1)
				{
					return true;
				}
		

			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	return false;
}


public static boolean updateProductStock(int id,double price,int stock) {
	
	
try
{
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cs310", "root", "root");		
	

		PreparedStatement ps =  connection.prepareStatement("UPDATE product SET productStock = ? where productID = ?");
		ps.setInt(1,stock);
		ps.setInt(2, id);
		
		int result=ps.executeUpdate();
		
		PreparedStatement ps2 =  connection.prepareStatement("UPDATE product SET productPrice = ? where productID = ?");
		ps2.setDouble(1,price);
		ps2.setInt(2, id);
		
		ps2.execute();


		if(result==1)
		{
			return true;
		}


	
}
catch (Exception e) {
	e.printStackTrace();
}
return false;
}



}
