package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
       public String getDataFromProperties(String key) throws IOException {
    	   FileInputStream fis=new FileInputStream(IPathUtility.propertiespath);
    	   Properties prop=new Properties();
    	   prop.load(fis);
    	   String value=prop.getProperty(key);
    	   return value;
    	   
       }
       /**
        * 
        * @param key
        * @param value
        * @param comment
        * @throws IOException
        */
       public void writeDataToProperties(String key,String value,String comment) throws IOException {
    	   FileInputStream fis=new FileInputStream(IPathUtility.propertiespath);
    	   Properties prop=new Properties();
    	   prop.load(fis);
    	   prop.setProperty(key, value);
    	   FileOutputStream fos=new FileOutputStream(IPathUtility.propertiespath);
    	   prop.store(fos, comment);
       }     
       
}
