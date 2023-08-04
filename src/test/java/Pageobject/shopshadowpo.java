package Pageobject;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class shopshadowpo {

    public WebDriver driver;
    public shopshadowpo(WebDriver newdriver){
        driver = newdriver;
        PageFactory.initElements(newdriver,this);
    }

    @FindBy(how = How.XPATH, using = "//shop-app")
    @CacheLookup
    WebElement dom1;
    @FindBy(how = How.CSS, using = "a[href='/list/ladies_outerwear']")
    @CacheLookup
    WebElement shop ;

    public void setShop(){
//       sdom1().findElement()
    }

//    public SearchContext sdom1(){
////        dom1.getShadowRoot();
////        return dom1.getShadowRoot();
//    }
}
