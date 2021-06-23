import org.testng.annotations.Test;


public class TestClass extends BaseTest {

    //mainpage Xpaths
    private String about = "//*[@id=\"cm-dropdown1\"]/span";
    private String whoWeAre = "//*[@id=\"site-navigation\"]/ul/li[1]/ul/li[1]/a/span";
    private String whatSetsUsApart = "//*[@id=\"site-navigation\"]/ul/li[1]/ul/li[2]/a/span";
    private String howWeMeasureSuccess = "//*[@id=\"site-navigation\"]/ul/li[1]/ul/li[3]/a/span";
    private String whereWeBegan = "//*[@id=\"site-navigation\"]/ul/li[1]/ul/li[4]/a/span";
    private String contactUs = "//*[@id=\"site-navigation\"]/ul/li[1]/ul/li[5]/a/span";

    //resultpage Xpaths
    private String whoWeAreImg = "//*[@id=\"Main_C015_Col00\"]/img";
    private String whoWeAreButton = "//*[@id=\"Main_C015_Col01\"]/div[2]/p/a/button";
    private String whatSetsUsApartImg = "//*[@id=\"Main_C002_Col00\"]/div/span/img";
    private String whatSetsUsApartButton = "//*[@id=\"Main_C002_Col01\"]/div[3]/p/a/button";
    private String howWeMeasureSuccessImg = "//*[@id=\"Main_C002_Col01\"]/div/table/tbody/tr[1]/td[1]/a/span/img";
    private String howWeMeasureSuccessButton = "//*[@id=\"Main_TA0840B59002_Col00\"]/div[3]/p/a/button";
    private String whereWeBeganImg = "//*[@id=\"Main_C003_Col00\"]/div/span/img";
    private String whereWeBeganButton = "//*[@id=\"Main_TA0840B59002_Col00\"]/div[8]/p/a/button";
    private String contactUsForm = "//*[@id=\"Main_C020_Col01\"]/div[1]/h2";

    private String contactUsText = "<h2 style=\"margin-top:-5px;\">Contact Form</h2>";

    //tests
    @Test
    public void test001_WhoWeAre() {

        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);

        mainPage.goToMainPage();
        mainPage.clickOnElement(about);
        mainPage.clickOnElement(whoWeAre);
        resultPage.waitUntilElement(whoWeAreImg);
        resultPage.verifyElIsThere(whoWeAreButton);
        driver.quit();

    }

    @Test
    public void test002_WhatSetsUsApart() {

        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);

        mainPage.goToMainPage();
        mainPage.clickOnElement(about);
        mainPage.clickOnElement(whatSetsUsApart);
        resultPage.waitUntilElement(whatSetsUsApartImg);
        resultPage.verifyElIsThere(whatSetsUsApartButton);
        driver.quit();

    }

    @Test
    public void test003_HowWeMeasureSuccess() {

        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);

        mainPage.goToMainPage();
        mainPage.clickOnElement(about);
        mainPage.clickOnElement(howWeMeasureSuccess);
        resultPage.waitUntilElement(howWeMeasureSuccessImg);
        resultPage.verifyElIsThere(howWeMeasureSuccessButton);
        driver.quit();

    }

    @Test
    public void test004_WhereWeBegan() {

        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);

        mainPage.goToMainPage();
        mainPage.clickOnElement(about);
        mainPage.clickOnElement(whereWeBegan);
        resultPage.waitUntilElement(whereWeBeganImg);
        resultPage.verifyElIsThere(whereWeBeganButton);
        driver.quit();

    }

    @Test
    public void test005_ContactUs() {

        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);

        mainPage.goToMainPage();
        mainPage.clickOnElement(about);
        mainPage.clickOnElement(contactUs);
        resultPage.waitUntilElement(contactUsForm);
        resultPage.verifyTextIsOnPage(contactUsText);
        driver.quit();

    }
}
