package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {"pretty"},
        strict = true,
        features = {" src/test/resources/Features"},
        glue = {"Steps"})
public class CursoRunner {


}
