package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class home extends pageObject {
    private final String termo = "Mantis";
    @FindBy(id = "searchtext")
    private WebElement campoTermo;

    @FindBy(id = "btn_form_search")
    private WebElement btnBuscar;

    public home(WebDriver driver) {
        super(driver);
    }

    public void limparCampo() {
        this.campoTermo.clear();
    }


    public void escreverTermo(String termo) {
        this.campoTermo.sendKeys(this.termo);
    }

    public void clicarLupa() {
        this.btnBuscar.click();
    }

    public void pressionarEnter() {
        this.campoTermo.sendKeys(Keys.ENTER);
    }

}
