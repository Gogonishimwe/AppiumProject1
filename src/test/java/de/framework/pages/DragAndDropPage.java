package de.framework.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class DragAndDropPage extends Basepage{
	By untextredCicleBy =AppiumBy.id("io.appium.android.apis:id/drag_dot_1");
	By DroppedMessageBy=AppiumBy.id("io.appium.android.apis:id/drag_result_text");
	
	public void untextredCicle() {
		getElement(untextredCicleBy).click();
	}
	

}
