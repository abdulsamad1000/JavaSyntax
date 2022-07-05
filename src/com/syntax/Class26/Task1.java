package com.syntax.Class26;

public class Task1 {
    /*
     Create a WebDriver Interface that will have the following unimplemented behaviour:
     openBrowser(), closeBrowser(), maximizeWindow(), findElement().
     Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
}
interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Google Chrome");
    }

    @Override
    public void maximizeWindow() {

        System.out.println("Maximizing Google Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Finding the element in Google Chrome");
    }
}


class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox");
    }

    @Override
    public void maximizeWindow() {

        System.out.println("Maximizing Firefox");
    }

    @Override
    public void findElement() {
        System.out.println("Finding the element in Firefox");
    }
    public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.openBrowser();
       driver.closeBrowser();
       driver.maximizeWindow();
       driver.findElement();
       WebDriver driver1=new FirefoxDriver();
        driver1.openBrowser();
        driver1.closeBrowser();
        driver1.maximizeWindow();
        driver1.findElement();

    }
}

