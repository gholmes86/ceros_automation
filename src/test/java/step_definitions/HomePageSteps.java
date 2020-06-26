package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.pages.HomePage;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class HomePageSteps extends AbstractStepDef {
  private final static Logger log = Logger.getLogger(HomePageSteps.class.getName());

	protected WebDriver driver;

	public HomePageSteps() {
		driver = Hooks.driver;
	}

	@Given("^the ceros inspire home page is loaded$")
    public void theCerosInspireHomePageIsLoaded() throws Throwable {
       HomePage homePage = new HomePage(driver);
       homePage.getCerosURL();
    }

    @Then("^the user should see (\\d+) menu items displaying within the Industry dropdown in the ceros homepage$")
    public void theUserShouldSeeMenuItemsDisplayingWithinTheIndustryDropdownInTheCerosHomepage(int total) throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.verifyListSize(total);
    }

    @And("^the user selects \"([^\"]*)\" from the Industry dropdown in the ceros homepage$")
    public void theUserSelectsFromTheIndustryDropdownInTheCerosHomepage(String text) throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.selectDropdownOption(text);
    }


    @And("^the user selects \"([^\"]*)\" from the Type dropdown in the ceros homepage$")
    public void theUserSelectsFromTheTypeDropdownInTheCerosHomepage(String text) throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.selectDropdownOption(text);
    }


    @And("^the user selects \"([^\"]*)\" from the Feature dropdown in the ceros homepage$")
    public void theUserSelectsFromTheFeatureDropdownInTheCerosHomepage(String text) throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.selectDropdownOption(text);
    }

    @Then("^the user should see the grid image$")
    public void theUserShouldSeeTheGridImage() throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.verifyImageDisplay();
    }

    @And("^the user should see the \"([^\"]*)\" header in the ceros homepage$")
    public void theUserShouldSeeTheHeaderInTheCerosHomepage(String text) throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.verifyHeader(text);
    }

    @And("^the user should see the \"([^\"]*)\" subheader in the ceros homepage$")
    public void theUserShouldSeeTheSubheaderInTheCerosHomepage(String text) throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.verifysubHeader(text);
    }

    @And("^the user should see breadcrumbs displayed in the ceros homepage$")
    public void theUserShouldSeeBreadcrumbsDisplayedInTheCerosHomepage() throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.verifyBreadcrumbs();
    }

    @When("^the user clicks the \"([^\"]*)\" filter in the ceros homepage$")
    public void theUserClicksTheFilterInTheCerosHomepage(String text) throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.clickFilter(text);
    }


}