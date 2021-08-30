package com.day13.invocation.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {
	public BaseTest objbaseTest;
	public Actions doActions;
	
	public DragAndDropPage(BaseTest baseTest) {

		this.objbaseTest=baseTest;
	}
	
	public void dragAndDrop()
	{
		
		WebElement elementFrom=objbaseTest.getDriver().findElement(By.xpath("//div[text()='Drag me']"));
		WebElement elementTo=objbaseTest.getDriver().findElement(By.xpath("//*[@id='droppable']"));
		doActions=new Actions(objbaseTest.getDriver());
		doActions.dragAndDrop(elementFrom, elementTo).build().perform();
	}
}
