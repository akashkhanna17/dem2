package utilities;

import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScreenshotUtil {
     public static void captureScreenshot(WebDriver driver,String name) {
    	 try {
    		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		 String folder = System.getProperty("user.dir")+"/screenshots/";
    		 Files.createDirectories(Paths.get(folder));
    		 String dest = folder+name+".png";
    		 Files.copy(src.toPath(), Paths.get(dest));
    		 System.out.println("Screenshot saved at: "+dest);
    	 }catch(IOException e) {
    		 e.printStackTrace();
    	 }
     }
}
