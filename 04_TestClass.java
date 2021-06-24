import org.testng.annotations.Test;

import java.io.IOException;


public class TestClass extends BaseTest {

    @Test
    public void test001_WhoWeAre() throws IOException {

        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);
        ExcelUtils excel = new ExcelUtils("src/test/resources/data/testBook.xlsx", "sheet2");

        mainPage.goToMainPage();
        mainPage.clickOnElement(excel.getCellDateString(1,1));
        mainPage.clickOnElement(excel.getCellDateString(2,1));
        resultPage.waitUntilElement(excel.getCellDateString(8,1));
        resultPage.verifyElIsThere(excel.getCellDateString(9,1));
        driver.quit();

    }

    @Test
    public void test002_WhatSetsUsApart() throws IOException {

        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);
        ExcelUtils excel = new ExcelUtils("src/test/resources/data/testBook.xlsx", "sheet2");

        mainPage.goToMainPage();
        mainPage.clickOnElement(excel.getCellDateString(1,1));
        mainPage.clickOnElement(excel.getCellDateString(3,1));
        resultPage.waitUntilElement(excel.getCellDateString(10,1));
        resultPage.verifyElIsThere(excel.getCellDateString(11,1));
        driver.quit();

    }

    @Test
    public void test003_HowWeMeasureSuccess() throws IOException {

        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);
        ExcelUtils excel = new ExcelUtils("src/test/resources/data/testBook.xlsx", "sheet2");

        mainPage.goToMainPage();
        mainPage.clickOnElement(excel.getCellDateString(1,1));
        mainPage.clickOnElement(excel.getCellDateString(4,1));
        resultPage.waitUntilElement(excel.getCellDateString(12,1));
        resultPage.verifyElIsThere(excel.getCellDateString(13,1));
        driver.quit();

    }

    @Test
    public void test004_WhereWeBegan() throws IOException {

        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);
        ExcelUtils excel = new ExcelUtils("src/test/resources/data/testBook.xlsx", "sheet2");

        mainPage.goToMainPage();
        mainPage.clickOnElement(excel.getCellDateString(1,1));
        mainPage.clickOnElement(excel.getCellDateString(5,1));
        resultPage.waitUntilElement(excel.getCellDateString(14,1));
        resultPage.verifyElIsThere(excel.getCellDateString(15,1));
        driver.quit();

    }

    @Test
    public void test005_ContactUs() throws IOException {

        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);
        ExcelUtils excel = new ExcelUtils("src/test/resources/data/testBook.xlsx", "sheet2");

        mainPage.goToMainPage();
        mainPage.clickOnElement(excel.getCellDateString(1,1));
        mainPage.clickOnElement(excel.getCellDateString(6,1));
        resultPage.waitUntilElement(excel.getCellDateString(16,1));
        resultPage.verifyTextIsOnPage(excel.getCellDateString(17,1));
        driver.quit();

    }
}
