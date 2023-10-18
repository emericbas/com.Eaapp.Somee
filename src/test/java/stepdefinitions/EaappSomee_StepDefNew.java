package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import pages.EaappSomee_Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EaappSomee_StepDefNew {

    EaappSomee_Page page=new EaappSomee_Page();
    List<String> NameList;




    @Given("Navigate to eaapSomee Application")
    public void navigate_to_eaap_somee_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("eaappUrl"));

    }
    @Then("Login as admin")
    public void login_as_admin() {
        page.loginLink.click();
        page.userNameField.sendKeys(ConfigurationReader.getProperty("UserName"));
        page.passwordField.sendKeys(ConfigurationReader.getProperty("Password"));
        page.logInButton.click();
    }
    @Then("Go to Employee List page")
    public void go_to_employee_list_page() {
        page.employeeListLink.click();
    }
    @Then("Create a new employee")
    public void create_a_new_employee() {
        page.createNewLink.click();
        page.nameField.sendKeys("Cirem Meric");
        page.salaryField.sendKeys("30000");
        page.durationWorkedField.sendKeys("4");
        page.gradeField.sendKeys("4");
        page.emailField.sendKeys("emine@gmail.com");
        page.createButton.click();
    }
    @Then("Verify the new employee info in Employee List page")
    public void verify_the_new_employee_info_in_employee_list_page() {
        NameList=new ArrayList<>();

        for (WebElement name : page.nameList) {
            NameList.add( name.getText());

        }

        assertTrue(NameList.contains("Cirem Meric"));

    }
    @Then("Delete the new employee")
    public void delete_the_new_employee() {
        page.searchnameButton.sendKeys("Cirem Meric");
        page.searchButton.click();
        ReusableMethods.wait(2);
        page.deleteLink.click();
        ReusableMethods.wait(2);
        page.deleteButton.click();
    }
    @Then("Verify the new employee deleted in Employee List page")
    public void verify_the_new_employee_deleted_in_employee_list_page() {
        page.employeeListLink.click();
        NameList=new ArrayList<>();

        for (WebElement name : page.nameList) {
            NameList.add( name.getText());

        }

        assertFalse(NameList.contains("Cirem Meric"));
    }


}
