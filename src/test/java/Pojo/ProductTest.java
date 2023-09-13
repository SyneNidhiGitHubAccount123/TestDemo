package Pojo;

import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;
import org.testng.annotations.Test;

public class ProductTest

{

	@Test
	public void prodctTest() throws SerializeException, ParseException
	
	{
	
		//POJO to json
		
		JsonSerializer  jsonsearilizer = JsonSerializer.DEFAULT_READABLE;
		
		String[] Sellename = {"Neon Enterprose","ABC Software","XYZ IT Solutions"};
		
		Product product = new Product("MacbookPro","1000","white",Sellename);
		
		String json =jsonsearilizer.serialize(product);
		
//		System.out.println(json);
		
		
		//POJo to xml 
		
		XmlSerializer xmlserializer =	XmlSerializer.DEFAULT_NS_SQ_READABLE;
		
		String xml =xmlserializer.serialize(product);
		
//		System.out.println(xml);
		
		//POJO to HTML 
		
//		HtmlSerializer HtmlSerializer = null;
		HtmlSerializer HtmlSerializer1 = HtmlSerializer.DEFAULT_SQ_READABLE;
		String html =HtmlSerializer1.serialize(product);
//		System.out.println(html);
		
			
		
		//Desealization
		//JSON to POJO
		
		
		
		JsonParser jsonparser = JsonParser.DEFAULT;
		
		String jsonvalue = "{\"color\":\"white\",\"name\":\"MacbookPro\",\"price\":\"1000\",\"sellerNames\":[\"NeonEnterprose\",\"ABCSoftware\",\"XYZITSolutions\"]}";
		
	    Product pro =	jsonparser.parse(jsonvalue, Product.class);
	    System.out.println("color  " + pro.getColor());
	    
	    System.out.println(pro);
		
		
		
		
	}
	
	
	
	
	
	
	
}
