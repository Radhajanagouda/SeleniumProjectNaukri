package Utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.file.Path;
import java.util.Properties;

public class ConfigReader {
    static final Logger log = LoggerFactory.getLogger(ConfigReader.class);
    public static final Properties properties =new Properties();

    static {
        try{
            Path curpath = Path.of(System.getProperty("user.dir") + "/src/test/resources/configurations/config.properties" );
            System.out.println(curpath);
            FileInputStream reader = new FileInputStream(curpath.toFile() );
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyName){
        String propertyValue ="";
        try {
            propertyValue = properties.getProperty(keyName);
        }
        catch (NullPointerException e){
            log.debug("Error occured while retriving the property with keyname " + keyName);
            e.printStackTrace();

        }
        return propertyValue;
    }

}
