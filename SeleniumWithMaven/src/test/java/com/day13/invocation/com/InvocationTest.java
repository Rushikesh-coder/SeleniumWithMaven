package com.day13.invocation.com;


import org.testng.annotations.Test;



public class InvocationTest extends BaseTest {
	public DragAndDropPage objDragAndDropPage;

	public void initializePageObject() {
		objDragAndDropPage = new DragAndDropPage(this);
	}

	@Test(priority = 1, invocationCount = 5)
	public void TC_01VerifyDropDown() {
		this.initializePageObject();
		this.initializWebEnvirenment();
		objDragAndDropPage.dragAndDrop();
	}

}
