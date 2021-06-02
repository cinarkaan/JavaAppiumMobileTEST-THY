package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;

public class Ticket implements WebElementMethods
{

    private HashMap <String,String> key;

    public Ticket () {
        key = new HashMap<>();
        key.put("MenuXPath","//android.widget.ImageButton[@content-desc=\"Turkish Airlines\"]");
        key.put("TakeTicketElementXpath","/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]");
        key.put("SingleWayId","com.turkishairlines.mobile:id/frDashboard_tvOneWay");
        key.put("SelectFlightId","com.turkishairlines.mobile:id/frDashboard_tvToCode");
        key.put("SearchBarId","com.turkishairlines.mobile:id/frAirportSelection_etSearch");
        key.put("SawToEsbId","com.turkishairlines.mobile:id/itemAirport_tvBottom");
        key.put("DateId","com.turkishairlines.mobile:id/frDashboard_rlDeparture");
        key.put("AfterTwoDaysXpath","/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
        key.put("DoneDateOperationId","com.turkishairlines.mobile:id/frDashboard_btnDone");
        key.put("PassengerCountsXPath","/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
        key.put("FlightListId","com.turkishairlines.mobile:id/frDashboard_btnSearch");
    }

    @Override
    public WebElement findById (WebDriver webDriver,String id) {
        return webDriver.findElement(By.id(id));
    }

    @Override
    public WebElement findByXpath (WebDriver webDriver, String Xpath) {
        return webDriver.findElement(By.xpath(Xpath));
    }

    public HashMap<String, String> getKey() {
        return key;
    }

    public void setKey(HashMap<String, String> key) {
        this.key = key;
    }
}
