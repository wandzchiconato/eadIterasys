import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.BeforeClass;



public class pesquisa extends objetos {
    @Given("^clica no botao Lupa$")
    public void clica_no_botao_Lupa() throws Throwable {

    }

    @And("^visualiza a lista de cursos relacionados$")
    public void visualiza_a_lista_de_cursos_relacionados() throws Throwable {

    }

    @And("^seleciona o curso \"([^\"]*)\" na lista$")
    public void seleciona_o_curso_na_lista(String termo) throws Throwable {

    }

    @Then("^visualiza o titulo como \"([^\"]*)\" e o preco como \"([^\"]*)\"$")
    public void visualiza_o_titulo_como_e_o_preco_como(String termo, String valor) throws Throwable {

    }
}
