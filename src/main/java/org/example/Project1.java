//package org.example;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Project1{
//    public static WebDriver driver, high;
//    public static void highlight(WebDriver driver, WebElement ele) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid blue;');",ele);
//    }
//    public static <HSSFWorkbook, HSSFSheet> void main(String[] args) throws InterruptedException, FileNotFoundException {
//
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\MubeenaKousar-Kairos\\Desktop\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        driver.get("https://practicetestautomation.com/practice-test-login/");
//        driver.manage().window().maximize();
//        File Project1file =    new File("C:\\Users\\MubeenaKousar-Kairos\\Documents");
//        FileInputStream inputStream = new FileInputStream(Project1file);
//        HSSFWorkbook wb=new HSSFWorkbook(inputStream);
//        HSSFSheet sheet=wb.getSheet("Login");
//
//
////        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
////        highlight(driver,username);
////        username.sendKeys("student");
////        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
////        highlight(driver,password);
////        password.sendKeys("Password123");
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//button[@class=\"btn\"]")).click();
////        System.out.println(driver.getTitle());
////
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//*[@id=\"menu-item-20\"]/a")).click();
////        Thread.sleep(2000);
////        JavascriptExecutor js1 = (JavascriptExecutor) driver;
////        js1.executeScript("window.scrollBy(0,150)", "");
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//*[@href=\"https://practicetestautomation.com/practice-test-exceptions/\"]")).click();
////        Thread.sleep(2000);
////        JavascriptExecutor js2 = (JavascriptExecutor) driver;
////        js2.executeScript("window.scrollBy(0,150)", "");
////        driver.findElement(By.xpath("//button[@name=\"Edit\"]")).click();
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//input[@value=\"Pizza\"]")).clear();
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//input[@class=\"input-field\"]")).sendKeys("Apple");
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//button[@name=\"Save\"]")).click();
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//button[@name=\"Add\"]")).click();
////        Thread.sleep(5000);
////        driver.findElement(By.cssSelector("#row2 > input")).sendKeys("Orange");
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[3]/div/button[1]")).click();
////        Thread.sleep(2000);
//        driver.quit();
//
//    }
//}
