package SeleniumPages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
@Getter
@Setter
public class RadioButtonsPage extends BasePage{

    @FindBy(name = "priority")
    private List<WebElement> radioButton;

    @FindBy(xpath = "//*[@id=\\\"main\\\"]/div/section/input")
    private WebElement submitButton;

    @FindBy (id = "priority-value")
    private WebElement prioritySpan;

    public RadioButtonsPage(final WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(webDriver,this);
    }

    public void choosePriority(int index){
        getRadioButton().get(index).click();
    }

    public void submitChoice(){
        getSubmitButton().click();
    }

    public String getChoosenPriority(){
        return getPrioritySpan().getText();
    }


}
