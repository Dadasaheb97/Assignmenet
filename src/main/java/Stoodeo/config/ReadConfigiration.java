package Stoodeo.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigiration {
Properties pro;
	
	public ReadConfigiration() {
		
		File src = new File("C:\\Users\\ASUS\\Downloads\\Assignment\\Assignment\\Stoodeo_Assignment\\src\\main\\java\\Stoodeo\\config\\Config.properties");
	    FileInputStream fis;
		try {
			fis = new FileInputStream(src);	
	        pro =new Properties();	    
			pro.load(fis);
		} catch (Exception e1) {
			System.out.println("Exception is :"+e1.getMessage());
	}		
		}
	
	public String getApplicationURL() {
             String url = pro.getProperty("baseURL");
             return url; 
	}
	
	
	public String getChromePath() {
		
		String chromepath =pro.getProperty("chromepath");
		return chromepath;
	}
      
	
	

}
