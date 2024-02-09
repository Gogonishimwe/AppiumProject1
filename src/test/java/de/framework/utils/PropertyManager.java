package de.framework.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
   //initialize a variable of type Properties holding properties 
   private static Properties props = new Properties();
   //Create a method to fetch the properties from the config.properties file
   public Properties getProperties() throws IOException{
    InputStream inputStream = null;
    String propFileName="config.properties";
    if(props.isEmpty()){
        try{
          //fetch properties from iconfig.properties and assign them to inputstream variable
          inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
          //Assign the fetched properties to  props variable
          props.load(inputStream);
        }//catch the error if fetching doesn't work
        catch(IOException e){
            //print the error and its origin
            e.printStackTrace();
            throw e;
        }
        finally{
            if(inputStream != null)
               inputStream.close();
        }
    }
    return props;
   }
}
