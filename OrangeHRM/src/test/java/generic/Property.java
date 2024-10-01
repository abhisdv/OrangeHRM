package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Property {
	public String fetch(String key) {
		String data = "";
		Properties p = new Properties();
		try {
			p.load(new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\OrangeHRM\\data.properties"));
			data = p.getProperty(key); 

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}
