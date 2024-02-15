package de.framework.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PreferenceDependenciesPage extends Basepage{

	By wifiCheckBoxBy=AppiumBy.id("android:id/checkbox");
	By wifiSettingsBy=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout\r\n"
			+ "");
	By inputPopupWindowBy=AppiumBy.id("android:id/edit");
	By okBtnBy=AppiumBy.id("android:id/button1");
	
	
	public void clickonWifiCheckbox() {
		getElement(wifiCheckBoxBy).click();
	}
	public void clickonWifiSetting() {
		getElement(wifiSettingsBy).click();
	}
	public void sendKeysToPopup(String name) {
		sendTextToField(inputPopupWindowBy,name);
	
	}
	public void oKBtn() {
		getElement(okBtnBy).click();
	}
	
	//
	
}
