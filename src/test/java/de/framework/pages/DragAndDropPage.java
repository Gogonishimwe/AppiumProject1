package de.framework.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class DragAndDropPage extends Basepage{
	By untextredCircleBy =AppiumBy.id("io.appium.android.apis:id/drag_dot_1");
	By droppedMessageBy=AppiumBy.id("io.appium.android.apis:id/drag_result_text");
	
	public void dragAndDropUntextRedCircle() {
		dragAndDrop(214,532,605,918);
		
	}

	public void theElementDropped(String expectedDragResultMessage) {
		String dragResultMessage = getElement(droppedMessageBy).getText();
		System.out.println("dragresult message " + dragResultMessage);
		System.out.println("expectedDragresult message " + expectedDragResultMessage);
		checkSimilarityOfText(expectedDragResultMessage, dragResultMessage);
}
	}
	


