package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckBoxExample {
	
	@FindBy(how = How.XPATH, using = "//h1[@id ='automation-practice-page']")
	public WebElement ChkbxSectiontitle;
	
	@FindBy(how = How.XPATH, using = "//input[@name='radioGroup' and @value='option1']")
	public WebElement RadioOption1;
	
	@FindBy(how = How.XPATH, using = "//input[@name='radioGroup' and @value='option2']")
	public WebElement RadioOption2;
	
	@FindBy(how = How.XPATH, using = "//input[@name='radioGroup' and @value='option2']")
	public WebElement RadioOption3;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(), 'Dropdown Menu')]/following-sibling::select")
	public WebElement DropdownMenu;
	
	@FindBy(how = How.XPATH, using = "//input[@name='checkboxGroup' and @value='option1']")
	public WebElement ChkBxOption1;
	
	@FindBy(how = How.XPATH, using = "//input[@name='checkboxGroup' and @value='option2']")
	public WebElement ChkBxOption2;
	
	@FindBy(how = How.XPATH, using = "//input[@name='checkboxGroup' and @value='option3']")
	public WebElement ChkBxOption3;
	
	@FindBy(how = How.XPATH, using = "//input[@list='countries']")
	public WebElement CntryDrp;
	
	@FindBy(how = How.XPATH, using = "//input[@list='countries']/following-sibling::datalist//option[@value='United States']")
	public WebElement CntryUS;
	
	@FindBy(how = How.XPATH, using = "//input[@list='countries']/following-sibling::datalist//option[@value='Canada']")
	public WebElement CntryCanada;
	
	@FindBy(how = How.XPATH, using = "//input[@list='countries']/following-sibling::datalist//option[@value='United Kingdom']")
	public WebElement CntryUK;
	
	@FindBy(how = How.XPATH, using = "//input[@list='countries']/following-sibling::datalist//option[@value='Australia']")
	public WebElement CntryAustralia;
	
	@FindBy(how = How.XPATH, using = "//input[@list='countries']/following-sibling::datalist//option[@value='India']")
	public WebElement CntryIndia;
	
	
	public String getChkBXTitle() {
		return ChkbxSectiontitle.getText();
	}
	
	public void selectRadioBtn1() {
		RadioOption1.click();
	}
	
	public void selectRadioBtn2() {
		RadioOption2.click();
	}
	
	public void selectRadiBtn3() {
		RadioOption3.click();
	}
	
	public void selectChkBx1() {
		ChkBxOption1.click();		
	}
	
	public void selectChkBx2() {
		ChkBxOption1.click();		
	}
	
	public void selectChkBx3() {
		ChkBxOption1.click();		
	}
	
	public void selectCntry() {
		CntryDrp.click();		
	}
	
	public void selectCntryUS() {
		CntryUS.click();		
	}
	
	public void selectCntryCanada() {
		CntryCanada.click();		
	}
	
	public void selectCntryUK() {
		CntryUK.click();		
	}
	
	public void selectCntryAustralia() {
		CntryAustralia.click();		
	}
	
	public void selectCntryIndia() {
		CntryIndia.click();		
	}
	
}
