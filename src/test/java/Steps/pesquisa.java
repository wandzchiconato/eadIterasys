package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.BeforeClass;




public class pesquisa  {

    @Given("^que o visitante acessa o site da Iterasys$")
    public void que_o_visitante_acessa_o_site_da_Iterasys() throws Throwable {
        System.out.println("Passo 1");
    }

    @Given("^preenche o termo de busca como \"([^\"]*)\"$")
    public void preenche_o_termo_de_busca_como(String arg1) throws Throwable {
        System.out.println("Passo 2");
    }

    @Given("^clica no botao Lupa$")
    public void clica_no_botao_Lupa() throws Throwable {
        System.out.println("Passo 3");
    }

    @Then("^visualiza a lista de cursos relacionados$")
    public void visualiza_a_lista_de_cursos_relacionados() throws Throwable {
        System.out.println("Passo 4");
    }

    @When("^seleciona o curso \"([^\"]*)\" na lista$")
    public void seleciona_o_curso_na_lista(String arg1) throws Throwable {
        System.out.println("Passo 5");
    }

    @Then("^visualiza o titulo como \"([^\"]*)\" e o preco como \"([^\"]*)\"$")
    public void visualiza_o_titulo_como_e_o_preco_como(String arg1, String arg2) throws Throwable {
        System.out.println("Passo 6");
    }

}
