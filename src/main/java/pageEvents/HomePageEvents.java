package pageEvents;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.HomePageObjects;
import utils.ElementsFetch;
import utils.FetchBy;

public class HomePageEvents {
    public void searchPageitem() {
        ElementsFetch elementsFetch = new ElementsFetch();
        elementsFetch.getWebElement(FetchBy.ID, HomePageObjects.Search_ID).sendKeys("samsung galaxy");
        WebElement searchItem=elementsFetch.getWebElement(FetchBy.CSS, HomePageObjects.search_Item);
        String itemText=searchItem.getText();
        searchItem.click();
        String searchResultSpan="//span[contains(text(),'\""+itemText+"\"')]";
        Assert.assertTrue(elementsFetch.getWebElements(FetchBy.XPATH, searchResultSpan).size()>0, "search page didnot open");
        
    }
}
