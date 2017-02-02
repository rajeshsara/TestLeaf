package compare;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class compareloop {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		driver = new FirefoxDriver();
		driver.get("https://www.cardekho.com/compare-cars");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement make = driver.findElement(By.id("carMake1"));
		List<WebElement> mak1 = make.findElements(By.tagName("option"));

		for(int i=1; i<mak1.size(); i++){
			Select slt = new Select(make);
			slt.selectByIndex(i);
			String ma1 = mak1.get(i).getText();

			WebElement make1 = driver.findElement(By.id("carMake2"));
			List<WebElement> mak2 = make1.findElements(By.tagName("option"));

			for(int j=1; j<mak2.size(); j++){
				Select slt3 = new Select(make1);
				slt3.selectByIndex(j);
				String ma2 = mak2.get(j).getText();

				WebElement model = driver.findElement(By.id("modelMake1"));
				List<WebElement> mod1 = model.findElements(By.tagName("option"));

				for(int k=1; k<mod1.size();k++){
					Select slt1 = new Select(model);
					slt1.selectByIndex(k);
					String mo1 = mod1.get(k).getText();

					WebElement model2 = driver.findElement(By.id("modelMake2"));
					List<WebElement> mod2 = model2.findElements(By.tagName("option"));

					for(int l=1; l<mod2.size(); l++){
						Select slt4 = new Select(model2);
						slt4.selectByIndex(l);
						String mo2 = mod2.get(l).getText();

						WebElement variant = driver.findElement(By.id("CarVariant1"));
						List<WebElement> var1 = variant.findElements(By.tagName("option"));

						for(int m=1; m<var1.size(); m++){
							Select slt2 = new Select(variant);
							slt2.selectByIndex(m);
							String va1 = var1.get(m).getText();

							WebElement variant2 = driver.findElement(By.id("CarVariant2"));
							List<WebElement> var2 = variant2.findElements(By.tagName("option"));

							for(int n=2; n<var2.size();n++){
								Select slt5 = new Select(variant2);
								slt5.selectByIndex(n);
								String va2 = var2.get(n).getText();
								System.out.println(va1+"\t"+va2 );

								//Thread.sleep(1000);

								//driver.navigate().to("makeUrlForComparisonResults()");
//								WebElement element = driver.findElement(By.xpath("//div[@id = 'getPrice']/div"));
//								element.sendKeys(Keys.PAGE_UP);
//								Thread.sleep(5000);
//								element.click();
//
//								//Alert alrt = driver.switchTo().
//
//								System.out.println("Compared button clicked");
//
//								driver.findElement(By.linkText("Compare")).click();
//								System.out.println("Return Home page");
//								Thread.sleep(5000);


							}

							

						}


					}

				}

			}

		}

		driver.close();
	}

}
