import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Project10test {
    WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    @Parameters({"username", "password", "path"})
    public void setup(String username, String password, String path) {
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.get("https://test-basqar.mersys.io");
        driver.manage().window().maximize();
        // login info
        driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys(username);
        driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys(password);
        driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();
        wait = new WebDriverWait(driver, 5);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@class='cc-btn cc-dismiss']")).click();
    }

    @AfterMethod
    public void close() {
        driver.close();
    }

//    @Test
//    public void creategradelevel() {
//        //click setup
//        driver.findElement(By.cssSelector("fuse-navigation .group-items > .nav-item:nth-child(1)")).click();
//        //click parameters
//        driver.findElement(By.cssSelector("fuse-navigation .group-items > .nav-item:nth-child(1) > .children > .nav-item:nth-child(1)")).click();
//        //click grade level
//        driver.findElement(By.cssSelector("fuse-navigation .group-items > .nav-item:nth-child(1) > .children > .nav-item:nth-child(1) > .children > .nav-item:nth-child(9)")).click();
//        //Click on plus icon
//        driver.findElement(By.cssSelector("svg[data-icon='plus']")).click();
//        //create a name
//        String name = "10.grade";
//        WebElement gradename = driver.findElement(By.xpath("//ms-text-field/input"));
//        gradename.sendKeys(name);
//        //create a shortname
//        String sname = "10th";
//        WebElement shortname = driver.findElement(By.cssSelector("ms-text-field[formcontrolname='shortName']>input"));
//        shortname.sendKeys(sname);
//        //create a order
//        String gradeOrder = "10";
//        WebElement gradeOrderInput = driver.findElement(By.xpath("//div/ms-text-field[@formcontrolname='order']/input"));
//        gradeOrderInput.sendKeys(gradeOrder);
//        //click save button
//        WebElement saveButton = driver.findElement(By.xpath("//ms-save-button/button"));
//        saveButton.click();
//
//    }

    @Test
    public void schooldepartment() throws InterruptedException {
        //click setup
        driver.findElement(By.cssSelector("fuse-navigation .group-items > .nav-item:nth-child(1)")).click();
        //click school setup
        driver.findElement(By.cssSelector("fuse-navigation .group-items > .nav-item:nth-child(1) > .children > .nav-item:nth-child(2)")).click();
        //click departments
        driver.findElement(By.cssSelector("fuse-navigation .group-items > .nav-item:nth-child(1) > .children > .nav-item:nth-child(2) > .children > .nav-item:nth-child(5)")).click();
        //Click on plus icon
        driver.findElement(By.cssSelector("svg[data-icon='plus']")).click();
        //school departmemt name
        String name = "SCIENCE";
        WebElement departmanname = driver.findElement(By.cssSelector("ms-text-field[formcontrolname='name']>input"));
        departmanname.sendKeys(name);
        //school department code
        String code = "S101";
        WebElement codename = driver.findElement(By.cssSelector("ms-text-field[formcontrolname='code']>input"));
        codename.sendKeys(code);
        //Section  part
        WebElement section = driver.findElement(By.cssSelector(".mat-tab-list .mat-tab-labels :nth-child(2)"));
        section.click();
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //wait.until( ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mat-tab-list .mat-tab-labels :nth-child(2)") ) );

          Thread.sleep(1000);

        //Section name click
        String sectionname = "math";
        WebElement sectionn = driver.findElement(By.cssSelector("ms-text-field[formcontrolname='name']>input"));
        sectionn.sendKeys(sectionname);
       // wait.until( ExpectedConditions.visibilityOfElementLocated( By.cssSelector("ms-text-field[formcontrolname='name']>input") ) );

        //section shortname click
        String sectionshortname = "101";
        WebElement sectionsn = driver.findElement(By.cssSelector("ms-text-field[formcontrolname='shortName']>input"));
        sectionsn.sendKeys(sectionshortname);

        //click on add button
        WebElement addButton = driver.findElement(By.xpath("//div/ms-button/button"));
        addButton.click();

        //Departmant constants
        WebElement departmentConstants = driver.findElement(By.xpath("//div[@class='mat-tab-labels']/div[3]"));
        departmentConstants.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mat-tab-labels']/div[3]")));
        //send key
        String key = "M";
        WebElement keyname = driver.findElement(By.cssSelector("ms-text-field[placeholder='GENERAL.FIELD.KEY'] >input"));
        keyname.sendKeys(key);
        String value = "101";
        //send  value
        WebElement valuename = driver.findElement(By.cssSelector("ms-text-field[placeholder='GENERAL.FIELD.VALUE'] >input"));
        valuename.sendKeys(value);
        //Click on add button

        driver.findElement(By.cssSelector("ms-button .mat-raised-button")).click();
        //  Click on save button
        WebElement saveButton1 = driver.findElement(By.xpath("//ms-save-button/button"));
        saveButton1.click();
    }

//    @Test
//    public void createstudent() {
//        //click on students
//        driver.findElement(By.cssSelector("fuse-navigation .group-items > .nav-item:nth-child(3)")).click();
//        //click on students
//        driver.findElement(By.cssSelector("fuse-navigation .group-items > .nav-item:nth-child(3) > .children > .nav-item:nth-child(1)")).click();
//        //click on plus icon
//        driver.findElement(By.cssSelector("svg[data-icon='plus']")).click();
//
//        //write studentnme
//        String studentname = "sumeyra";
//        WebElement sn = driver.findElement(By.cssSelector("ms-text-field[formcontrolname='firstName']>input"));
//        sn.sendKeys(studentname);
//
//        //write student lastname
//        String studentlastname = "civelek";
//        WebElement sln = driver.findElement(By.cssSelector("ms-text-field[formcontrolname='lastName']>input"));
//        sln.sendKeys(studentlastname);
//
//        //click on gender
//        driver.findElement(By.cssSelector("mat-select[formcontrolname='gender']")).click();
//        //click on female
//        driver.findElement(By.cssSelector(".cdk-overlay-pane mat-option:last-child")).click();
//
//        //click on grade level
//        driver.findElement(By.cssSelector("mat-select[aria-label='Grade Level']")).click();
//        driver.findElement(By.cssSelector(".cdk-overlay-pane mat-option:first-child")).click();
//
//        //click on status
//        driver.findElement(By.cssSelector("mat-select[aria-label='Status']")).click();
//        driver.findElement(By.cssSelector(".cdk-overlay-pane mat-option:first-child")).click();
//
//        //click on depertmant
//        driver.findElement(By.cssSelector("mat-select[aria-label='School Department']")).click();
//        driver.findElement(By.cssSelector(".cdk-overlay-pane mat-option:first-child")).click();
//
//        //click on section
//        driver.findElement(By.cssSelector("mat-select[aria-label='Section']")).click();
//        driver.findElement(By.cssSelector(".cdk-overlay-pane mat-option:first-child")).click();
//
//        //document type
//        WebElement documenttype = driver.findElement(By.xpath("//div[@class='mat-tab-labels']/div[3]"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", documenttype);
//
//        //click on document type
//        driver.findElement(By.cssSelector("mat-select[aria-label='Document Type']")).click();
//        driver.findElement(By.cssSelector(".cdk-overlay-pane mat-option:first-child")).click();
//
//        //click on document number
//        String documentnumber = "1234566789";
//        WebElement dn = driver.findElement(By.cssSelector("div .mat-form-field-infix [formcontrolname='documentNumber']"));
//        dn.sendKeys(documentnumber);
//
//        //click on representetive
//        driver.findElement(By.cssSelector("div .mat-tab-labels :nth-child(2)")).click();
//
//        WebElement representativesTab = driver.findElement(By.xpath("//div[contains(text(),'Representatives')]"));
//        representativesTab.click();
//
//        WebElement addRepresentativeButton = driver.findElement(By.cssSelector("ms-add-button button"));
//        addRepresentativeButton.click();
//
//        WebElement selectRepresentative = driver.findElement(By.xpath("//mat-select[@aria-label='Representative']/div"));
//        selectRepresentative.click();
//
//        WebElement studentRepresentative;
//        String representative = "Mother";
//        if (representative.equalsIgnoreCase("Mother")) {
//            studentRepresentative = driver.findElement(By.xpath("//span[contains(text(), 'Mother')]"));
//
//        } else if (representative.equalsIgnoreCase("Father")) {
//            studentRepresentative = driver.findElement(By.xpath("//span[contains(text(), 'Father')]"));
//
//        } else if (representative.equalsIgnoreCase("Guardian")) {
//            studentRepresentative = driver.findElement(By.xpath("//span[contains(text(), 'Guardian')]"));
//
//        } else {
//            studentRepresentative = null;
//            System.out.println("No such representative yet");
//        }
//        studentRepresentative.click();
//        String reprFirstName = "Sarah";
//        WebElement reprFirstNameInput = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
//        reprFirstNameInput.sendKeys(reprFirstName);
//        String reprLastName = "Edison";
//        WebElement reprLastNameInput = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
//        reprLastNameInput.sendKeys(reprLastName);
//        String reprPhone = "1234567890";
//        WebElement reprPhoneInput = driver.findElement(By.xpath("//input[@id='mat-input-27']"));
//        reprPhoneInput.sendKeys(reprPhone);
//
//        WebElement reprCountrySelect = driver.findElement(By.cssSelector("mat-select[aria-label='Country'] div"));
//        reprCountrySelect.click();
//
//        driver.findElement(By.cssSelector("mat-option[role='option'] span")).click();
//
//        WebElement saveReprSaveButton = driver.findElement(By.cssSelector("mat-dialog-actions div button "));
//        saveReprSaveButton.click();
//
//        //click on adress info
//        driver.findElement(By.cssSelector("div .mat-tab-labels :nth-child(3)")).click();
//
//        //select country
//        driver.findElement(By.cssSelector("mat-select[aria-label='Country']")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("mat-select[aria-label='Country']")));
//        driver.findElement(By.cssSelector(".cdk-overlay-pane mat-option:first-child")).click();
//
//        //select city
////        driver.findElement(By.cssSelector("mat-select[aria-label='City']")).click();
////        driver.findElement(By.cssSelector(".cdk-overlay-pane mat-option:first-child")).click();
//
//        WebElement saveButton1 = driver.findElement(By.xpath("//*[@id=\"container-2\"]/footer/student-form-buttons/button-bar/div/div[1]/button[2]"));
//        saveButton1.click();
//
//        //click on Discounts
//        driver.findElement(By.cssSelector("div .mat-tab-labels :nth-child(4)")).click();
//        //click on note
//        driver.findElement(By.cssSelector("div .mat-tab-labels :nth-child(5)")).click();
//        //click on attacments
//        driver.findElement(By.cssSelector("div .mat-tab-labels :nth-child(6)")).click();
//        //click on save button
//        WebElement saveStudentButton1 = driver.findElement(By.xpath("//button-bar/div/div/button[2]"));
//        saveStudentButton1.click();
//    }
//

}