package Stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
public class ModifRcpPlaneteSteps {
    Recette r;
    Legume nvLegume;
    String nomLegume;

    @Given("une recette est composé des legumes de la planete")
    public void une_recette_est_composé_des_legumes_de_la_planete() {
        r = new RecettePlaneteMer();
        r.creerRecette();
    }

    @When("un nouveau legume apparait dans une planete")
    public void un_nouveau_legume_apparait_dans_une_planete() {
        nvLegume = new Legume("haricot",new Planete("Mer",10000));
        nomLegume = r.addLegume(nvLegume);
    }

    @Then("la recette change")
    public void la_recette_change() {
        assertEquals("haricot",nomLegume);
    }
}
