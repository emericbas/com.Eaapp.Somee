package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EaappSomee_Page {
    public EaappSomee_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id= "loginLink")
    public WebElement loginLink;
    @FindBy(xpath= "//input[@id='UserName']")
    public WebElement userNameField;
    @FindBy(xpath= "//input[@id='Password']")
    public WebElement passwordField;
    @FindBy(xpath= "//input[@type='submit']")
    public WebElement logInButton;
    @FindBy(xpath= "//a[text()='Employee List']")
    public WebElement employeeListLink;
    @FindBy(xpath= "//a[text()='Create New']")
    public WebElement createNewLink;
    @FindBy(xpath= "//input[@id='Name']")
    public WebElement nameField;
    @FindBy(xpath= "//input[@id='Salary']")
    public WebElement salaryField;
    @FindBy(xpath= "//input[@id='DurationWorked']")
    public WebElement durationWorkedField;
    @FindBy(xpath= "//input[@id='Grade']")
    public WebElement gradeField;
    @FindBy(xpath= "//input[@id='Email']")
    public WebElement emailField;
    @FindBy(xpath= "//input[@value='Create']")
    public WebElement createButton;
    @FindBy(name = "searchTerm")
    public WebElement searchnameButton;
    @FindBy(xpath = "//input[@value='Search']")
    public WebElement searchButton;
   @FindBy(xpath="//td[1]")
    public List<WebElement> nameList;
    @FindBy(xpath = "//td[6]/a[3]")
    public WebElement deleteLink;
    @FindBy(xpath = "//input[@value='Delete']")
    public WebElement deleteButton;

}
