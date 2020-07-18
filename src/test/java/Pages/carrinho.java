package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class carrinho extends pageObject {
    @FindBy(css = "span.item-title")
        private WebElement tituloCurso;
    @FindBy(css = "span.new-title")
    private WebElement precoCurso;


    public carrinho(WebDriver driver) {
        super(driver);
    }

    public String validarTitulo() {
        return this.tituloCurso.getText();

    }
    public String validarpreco() {
        return this.precoCurso.getText();

    }
}
