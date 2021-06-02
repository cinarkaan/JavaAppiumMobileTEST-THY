package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

public class Flight implements WebElementMethods {

    private HashMap<String,String> key;

    public Flight () {
        key = new HashMap<>();
        key.put("ClickSortButtonId","com.turkishairlines.mobile:id/frFlightSearch_llSortFilter");
        key.put("SortByPriceXpath","/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
        key.put("DoneSortingId","com.turkishairlines.mobile:id/frFilterAndSort_btnApply");
        key.put("SelectFirstFlightXpath","/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.View");
        key.put("SelectEconomicClassXPath","/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup");
        key.put("ContinueId","com.turkishairlines.mobile:id/frFlightSearch_btnContinue");
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
