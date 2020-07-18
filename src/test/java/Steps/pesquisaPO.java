package Steps;

import Pages.Utils;
import Pages.busca;
import Pages.carrinho;
import Pages.home;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class pesquisaPO {

    private static final WebDriver driver = new ChromeDriver();
    // Referencia a todas as páginas envolvidas no teste
    // Referencia a todas as páginas envolvidas no teste
    home home = new home(driver);
    busca busca = new busca(driver);
    carrinho carrinho = new carrinho(driver);

    @BeforeSuite
    public void Iniciar() {
        System.setProperty("webdriver.chrome.driver", Utils.caminhoChromeDriver);
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

    }

    @AfterSuite
    public void finalizar() {
        driver.quit();

    }

    @Given("^que o visitante acessa o site da Iterasys PgOb$")
    public void que_o_visitante_acessa_o_site_da_Iterasys_PgOb() throws Throwable {
        driver.get(Utils.url);
    }

    @And("^preenche o termo de busca como \"([^\"]*)\" PgOb$")
    public void preenche_o_termo_de_busca_como_PgOb(String termo) throws Throwable {
        home.escreverTermo(termo);
    }

    @And("^clica no botao Lupa PgOb$")
    public void clica_no_botao_Lupa_PgOb() throws Throwable {
        home.clicarLupa();

    }

    @Then("^visualiza a lista de cursos relacionados a \"([^\"]*)\" PgOb$")
    public void visualiza_a_lista_de_cursos_relacionados_a_PgOb(String termo) throws Throwable {
        Assert.assertEquals("Cursos" + termo, busca.lerindicadorPagina());
    }

    @When("^seleciona o curso \"([^\"]*)\" na lista PgOb$")
    public void seleciona_o_curso_na_lista_PgOb(String termo) throws Throwable {
        busca.clicarMatricule();
    }

    @Then("^visualiza o titulo como \"([^\"]*)\" e o preco como \"([^\"]*)\" PgOb$")
    public void visualiza_o_titulo_como_e_o_preco_como_PgOb(String tituloCurso, String precoCurso) throws Throwable {
        Assert.assertEquals(tituloCurso,carrinho.validarTitulo());
        Assert.assertEquals(precoCurso,carrinho.validarpreco());
    }
}
