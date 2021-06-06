package SeleniumPages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Setter
@Getter
public class HomePage extends BasePage {


    @FindBy(xpath ="//*[@id=\\\"one\\\"]/div/div/section[1]/a/i" )
    private WebElement clockIcon;

    @FindBy(xpath ="//*[@id=\\\"one\\\"]/div/div/section[2]/a/i")
    private WebElement commentsIcon;

    @FindBy(xpath ="//*[@id=\\\"one\\\"]/div/div/section[3]/a/i")
    private  WebElement userIcon;

    public HomePage(final WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(webDriver,this);
    }

    public TablePage goToTablePage(){
        getClockIcon().click();
        return new TablePage(getWebdriver());
    }

    public RadioButtonsPage goToRadioButtonsPage(){
        getCommentsIcon().click();
        return  new RadioButtonsPage(getWebdriver());
    }

    public SelectPage goToSelectPage(){
        getUserIcon().click();
        return new SelectPage(getWebdriver());
    }


}
