package SeleniumPages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

@Setter
@Getter
public class SelectPage extends BasePage{

    @FindBy(id = "category")
    private WebElement select;

    @FindBy(xpath = "//*[@id=\"main\"]/div/section/input")
    private WebElement submitButton;

    @FindBy(id = "selected-value")
    private WebElement selectedValueSpan;

    public SelectPage(final WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }

    public void selectCategory(int index){
        new Select(getSelect()).selectByIndex(index);
    }

    public void submitSelectedValue() {
        getSubmitButton().click();
    }

    public String getSelectedCategory() {
        return getSelectedValueSpan().getText();
    }
}
