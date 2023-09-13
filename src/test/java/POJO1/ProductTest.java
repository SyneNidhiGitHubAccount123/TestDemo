package POJO1;

import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;
import org.testng.annotations.Test;

import Pojo.Product;

public class ProductTest
{
	
	@Test
	public void testProduct() throws SerializeException, ParseException
	{
		//POJO to Json
		
		JsonSerializer json = JsonSerializer.DEFAULT_READABLE;
		String[] Sellename = {"Neon Enterprose","ABC Software","XYZ IT Solutions"};
		
		Product product = new Product("MacbookPro","1000","white",Sellename);
		
		String jsonString= json.serialize(product);
		System.out.println(jsonString);
		
		
		//POJO to XML
		
		XmlSerializer xml = XmlSerializer.DEFAULT_NS_SQ_READABLE;
		String xmlString =  xml.serialize(product);
		System.out.println(xmlString);
		
		
		//POJO to HTML
		
		HtmlSerializer html = HtmlSerializer.DEFAULT_SQ_READABLE;
		String htmlString =	html.serialize(product);
	    System.out.println(htmlString);
		
		
	    //Desearilze 
		//JSON to POJO
	    
	    JsonParser jsonparser = JsonParser.DEFAULT;
	    
	    String jsonVal = "{\"color\":\"white\",\"name\":\"MacbookPro\",\"price\":\"1000\",\"sellerNames\":[\"Neon Enterprose\",\"ABC Software\",\"XYZ IT Solutions\"]}";
	  
	    POJO1.Product pro =	jsonparser.parse(jsonVal, POJO1.Product.class);
	    
	    System.out.println(pro.getColor());
	    
	    System.out.println(pro);
	    
	    
	}

	
	
}
