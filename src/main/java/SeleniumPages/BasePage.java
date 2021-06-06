package SeleniumPages;
import org.openqa.selenium.WebDriver;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BasePage {

    private WebDriver webdriver;

    public BasePage(WebDriver webDriver){
        this.webdriver=webDriver;
    }
}
