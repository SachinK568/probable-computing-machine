package genric;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class genric_photo {
	public static void getscrrenshot(WebDriver driver) throws IOException{
		String photo=("./photo/");
		Date da= new Date();
		String da1 = da.toString();
		String da2 = da1.replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+da2+".jpeg");
		FileUtils.copyFile(src,dst);
	}
}