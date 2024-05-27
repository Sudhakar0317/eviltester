package AppManager;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileReader {

   private  Properties property;

   public FileReader(){
       property = new Properties();
       try(InputStream input = new FileInputStream("src/resources/local.properties")){
           property.load(input);
       }catch (IOException e){
           e.printStackTrace();
       }
   }
   public  String getProperty(String key){
       return property.getProperty(key);
   }




}
