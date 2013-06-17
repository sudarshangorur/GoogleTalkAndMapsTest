import org.openqa.selenium.By;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class GoogleMapsPage extends Browser {

    public static final By LOCATION_SEARCH_BOX = cssSelector(".gbqfif");
    public static final By LENS_BUTTON = cssSelector(".gbqfb");
    public static final By RESULTS_PANEL = cssSelector("#opanel1000");
    public static final By TILE_SOURCE = xpath("/html/body/div/div/div[3]/div[5]/div[2]/div/div[2]/div/div[2]/div/img[2]");
    public static final String GOOGLE_MAPS_URL = "https://maps.google.co.uk/";

    public GoogleMapsPage searchFor(String location) {
        webDriver.get(GOOGLE_MAPS_URL);
        WaitFor(LOCATION_SEARCH_BOX);
        webDriver.findElement(LOCATION_SEARCH_BOX).sendKeys(location);
        webDriver.findElement(LENS_BUTTON).click();
        WaitFor(RESULTS_PANEL);
        return this;
    }

    public String getTileSource() {
        return webDriver.findElement(TILE_SOURCE).getAttribute("src");
    }
}
