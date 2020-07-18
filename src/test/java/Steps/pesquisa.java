
package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;


public class pesquisa {
    String url;
    WebDriver driver;
    static String caminhoPrint = new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime());
    public void print(String nomePrint) throws IOException, IOException {

        File foto = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(foto, new File("out/prints/" + caminhoPrint + "/" + nomePrint + ".png"));
    }
    @Before
    public void Iniciar() {
        url = "https://www.iterasys.com.br";
        System.setProperty("webdriver.chrome.driver","driver/chrome/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

    }

    @After
    public void finalizar() {
        driver.quit();

    }

    @Given("^que o visitante acessa o site da Iterasys$")
    public void que_o_visitante_acessa_o_site_da_Iterasys() throws Throwable {
        driver.get(url);

        print("Consultar Curso - Passo 1 - Abriu o site");
        System.out.println("Passo 1 - Acessou o Site");

    }

    @Given("^preenche o termo de busca como \"([^\"]*)\"$")
    public void preenche_o_termo_de_busca_como(String termo) throws Throwable {
        driver.findElement(By.id("searchtext")).click();
        driver.findElement(By.id("searchtext")).clear();
        driver.findElement(By.id("searchtext")).sendKeys(termo);
        print("Consultar Curso - Passo 2 - Digitou a pesquisa");
        System.out.println("Passo 2 - Digitou a pesquisa");
    }

    @Given("^clica no botao Lupa$")
    public void clica_no_botao_Lupa() throws Throwable {
        driver.findElement(By.id("btn_form_search")).click();
        print("Consultar Curso - Passo 3 - Clicou em Procurar");
        System.out.println("Passo 3 - Clicou em procurar");
    }

    @Then("^visualiza a lista de cursos relacionados a \"([^\"]*)\"$")
    public void visualiza_a_lista_de_cursos_relacionados(String termo) throws Throwable {
        //Assert.assertEquals(" Cursos › " + termo  ,driver.findElement(By.cssSelector("col-md-6")).getText());
        //Assert.assertTrue(driver.findElement(By.tagName("h3")).getText().contains(termo));
        Assert.assertEquals("Cursos"+ termo,driver.findElement(By.tagName("h3")).getText().replaceAll("[^a-zA-Z0-9]", ""));
        print("Consultar Curso - Passo 4 - Validou o nome do curso");
        System.out.println("Passo 4 - Validou o nome do curso");
    }

    @When("^seleciona o curso \"([^\"]*)\" na lista$")
    public void seleciona_o_curso_na_lista(String termo) throws Throwable {
        driver.findElement(By.cssSelector("span.comprar")).click();
        print("Consultar Curso - Passo 5 - Selecionou o curso");
        System.out.println("Passo 5 - Clicou em Comprar ");
    }

    @Then("^visualiza o titulo como \"([^\"]*)\" e o preco como \"([^\"]*)\"$")
    public void visualiza_o_titulo_como_e_o_preco_como(String titulo, String preco) throws Throwable {
        Assert.assertEquals(titulo,driver.findElement(By.cssSelector("span.item-title")).getText());
        Assert.assertEquals(preco,driver.findElement(By.cssSelector("span.new-price")).getText());
        print("Consultar Curso - Passo 6 - Validou o curso e o Preço");
        System.out.println("Passo 6 - Validou o Curso e o Preço");
    }
    @And("^aperta o enter$")
    public void aperta_o_enter() throws Throwable {
        driver.findElement(By.id("btn_form_search")).sendKeys(Keys.ENTER);
    }

}
