package taskloop;



import java.util.List;

import org.apache.commons.io.comparator.SizeFileComparator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Taskloop {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cardekho.com/compare-cars");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement make = driver.findElement(By.id("carMake1"));
		List<WebElement> make1 = make.findElements(By.tagName("option"));


		for(int i=1; i<make1.size(); i++){
			Select slt = new Select(make);
			
			String mak = make1.get(i).getText();
			slt.selectByIndex(i);
			//System.out.println("\t"+mak);

			
			WebElement model = driver.findElement(By.id("modelMake1"));
			List<WebElement> model1 = model.findElements(By.tagName("option"));
			
		
			for(int j=1; j<model1.size(); j++){
				Select slt1 = new Select(model);
				String mod = model1.get(j).getText();
				slt1.selectByIndex(j);
				//System.out.println("\t\t" +mod);
				
				WebElement variant = driver.findElement(By.id("CarVariant1"));
				List<WebElement> var1 = variant.findElements(By.tagName("option"));
			
				for(int k=0; k<var1.size(); k++){
					String var = var1.get(k).getText();
					//System.out.println("\t\t\t" +var);	

					System.out.println(mak+"\t"+mod+"\t"+var);	

				}
			}

			//System.out.println("running");
		}



		driver.close();

	}

}
