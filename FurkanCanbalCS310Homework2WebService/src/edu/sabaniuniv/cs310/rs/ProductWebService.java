package edu.sabaniuniv.cs310.rs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ProductWebService")
public class ProductWebService {
	
	
	
		
		@GET
		@Path("addNewProduct/{n}/{ln}/{k}")
		public boolean addNewProduct(@PathParam("n") String name, 
				@PathParam("ln")double price,
				@PathParam("k")int stock)
		{
			product p = new product(name,price,stock);
			boolean result =  JDBCManager.addNewProduct(p);
			return  result;
		}
		
		@GET
		@Path("deleteProduct/{n}")
		public boolean addNewProduct(@PathParam("n") int id)
		{
			
			boolean result =  JDBCManager.deleteProduct(id);
			return  result;
		}
		
		@GET
		@Path("updateProductStock/{n}/{ln}/{k}")
		public boolean updateProductStock(@PathParam("n") int id, 
				@PathParam("ln")double price,
				@PathParam("k")int stock)
		{
			
			boolean result =  JDBCManager.updateProductStock(id,price,stock);
			return  result;
		}
		
		

}
