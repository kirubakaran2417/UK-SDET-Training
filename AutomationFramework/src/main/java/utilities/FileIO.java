package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class FileIO {

    //create a method to read a property file


        public static Properties readPropertyFile() {
            Properties properties = new Properties();
            try {
                FileInputStream fileInputStream = new FileInputStream("src\\test\\resources\\config.properties");
                properties.load(fileInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return properties;
        }



}
