package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class busca extends  pageObject {

    private final String indicadorPesquisa = "CursosMantis";
    @FindBy(tagName = "h3")
    private WebElement compararPesquisa;

    @FindBy(css= "span.comprar")
    private WebElement btnMatricule;

    public busca(WebDriver driver) {
        super(driver);
    }

    public String lerindicadorPagina(){
        return this.compararPesquisa.getText().replaceAll("[^a-zA-Z0-9]", "");
    }

    public void clicarMatricule(){
        this.btnMatricule.click();
    }
}
