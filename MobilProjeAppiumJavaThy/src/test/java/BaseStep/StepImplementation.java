package BaseStep;


import Model.Flight;
import Model.Ticket;
import Util.Base;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;

public class StepImplementation extends Base {

    Ticket ticket;
    Flight flight;

    public StepImplementation() throws MalformedURLException, InterruptedException {
        super();
        ticket = new Ticket();
        flight = new Flight();
    }

    @Step("Hamburger Menuyu Ac")
    public void getMenu() throws InterruptedException {
        WebElement webElement = ticket.findByXpath(webDriver,ticket.getKey().get("MenuXPath") );
        webElement.click();
        Thread.sleep(2000);
    }

    @Step("Bilet Al Elementine Tikla")
    public void getTakeTicket () throws InterruptedException {
        WebElement webElement = ticket.findByXpath(webDriver,ticket.getKey().get("TakeTicketElementXpath"));
        webElement.click();
        Thread.sleep(2000);
    }

    @Step("TekYon Bilet Fragmentini(Bolumunu) Ac")
    public void getSingleWayTicket () throws InterruptedException {
        WebElement webElement = ticket.findById(webDriver,ticket.getKey().get("SingleWayId"));
        webElement.click();
        Thread.sleep(2000);
    }

    @Step("Saw To Esb Havalimanı Secimini ayarla")
    public void selectAirport () throws InterruptedException {
        WebElement webElement = ticket.findById(webDriver, ticket.getKey().get("SelectFlightId"));
        webElement.click();
        Thread.sleep(2500);
        webElement = ticket.findById(webDriver,ticket.getKey().get("SearchBarId"));
        webElement.sendKeys("ANKARA");
        Thread.sleep(2500);
        webElement = ticket.findById(webDriver,ticket.getKey().get("SawToEsbId"));
        webElement.click();
    }

    @Step("Tarih bilgisini 2 gün sonrasi icin sec ve yolcu sayisini 2 yetiskin yap")
    public void selectDateAndPersonCount () throws InterruptedException {
        WebElement webElement = ticket.findById(webDriver,ticket.getKey().get("DateId"));
        webElement.click();
        Thread.sleep(2500);
        webElement = ticket.findByXpath(webDriver,ticket.getKey().get("AfterTwoDaysXpath"));
        webElement.click();
        Thread.sleep(2500);
        webElement = ticket.findById(webDriver,ticket.getKey().get("DoneDateOperationId"));
        webElement.click();
        Thread.sleep(2500);
        webElement = ticket.findByXpath(webDriver,ticket.getKey().get("PassengerCountsXPath"));
        webElement.click();
        Thread.sleep(2500);
        webElement = ticket.findById(webDriver,ticket.getKey().get("FlightListId"));
        webElement.click();
        Thread.sleep(2500);
    }

    @Step("Ucuslari Fiyata Gore Listeleyip Ekonomik Olani Sec Ve Devam Et")
    public void getEconomicalFlight () throws InterruptedException {
        WebElement webElement = flight.findById(webDriver,flight.getKey().get("ClickSortButtonId"));
        webElement.click();
        Thread.sleep(2000);
        webElement = flight.findByXpath(webDriver,flight.getKey().get("SortByPriceXpath"));
        webElement.click();
        Thread.sleep(2000);
        webElement = flight.findById(webDriver,flight.getKey().get("DoneSortingId"));
        webElement.click();
        Thread.sleep(2000);
        webElement = flight.findByXpath(webDriver,flight.getKey().get("SelectFirstFlightXpath"));
        webElement.click();
        Thread.sleep(2000);
        webElement = flight.findByXpath(webDriver,flight.getKey().get("SelectEconomicClassXPath"));
        webElement.click();
        Thread.sleep(2000);
        webElement = flight.findById(webDriver,flight.getKey().get("ContinueId"));
        webElement.click();
    }

}
