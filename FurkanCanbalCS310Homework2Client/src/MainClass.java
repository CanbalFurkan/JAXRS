

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class MainClass {

	public static void main(String[] args) {
		try 
		{
		
			URL url  =  new URL("http://localhost:8080/FurkanCanbalCS310Homework2WebService/rest/ProductWebService/addNewProduct/Apple/2/7");

			
			InputStreamReader reader = new InputStreamReader(url.openStream());
			
			BufferedReader rd = new BufferedReader(reader);
			
			while(true)
			{
				String line = rd.readLine();
				if(line==null)
					break;
				System.out.println(line);
			}
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	try 
	{
	
		URL url  =  new URL("http://localhost:8080/FurkanCanbalCS310Homework2WebService/rest/ProductWebService/updateProductStock/1/25.0/554");

		
		InputStreamReader reader = new InputStreamReader(url.openStream());
		
		BufferedReader rd = new BufferedReader(reader);
		
		while(true)
		{
			String line = rd.readLine();
			if(line==null)
				break;
			System.out.println(line);
		}
			
		
	} catch (Exception e) {
		e.printStackTrace();
	}


try 
{

	URL url  =  new URL("http://localhost:8080/FurkanCanbalCS310Homework2WebService/rest/ProductWebService/deleteProduct/1");

	
	InputStreamReader reader = new InputStreamReader(url.openStream());
	
	BufferedReader rd = new BufferedReader(reader);
	
	while(true)
	{
		String line = rd.readLine();
		if(line==null)
			break;
		System.out.println(line);
	}
		
	
} catch (Exception e1) {
	e1.printStackTrace();
}

}

}
