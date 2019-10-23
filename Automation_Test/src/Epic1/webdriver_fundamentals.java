package Epic1;

public class webdriver_fundamentals {

	public static void main(String[] args) {
		
		/*Selenium WebDriver is a browser automation framework that accepts commands and sends them to a browser. 
		It is implemented through a browser-specific driver. It controls the browser by directly communicating with it. 
		Selenium WebDriver supports Java, C#, PHP, Python, Perl, Ruby.*/
		
		/*Selenium is a cross-platform tool that supports cross-browser testing. Selenium users can perform tests on any 
		operating system like Android, Windows, Mac, iOS, and Linux. Selenium can be used across various browsers like 
		Safari, Chrome, IE, Mozilla, and Opera.*/
		
		/* Source: https://www.edureka.co/blog/webelement-in-selenium/ 
		 * Anything that is present on the web page is a WebElement such as text box, button, etc. WebElement represents 
		  an HTML element. Selenium WebDriver encapsulates a simple form element as an object of the WebElement. 
		  It basically represents a DOM element and all the HTML documents are made up by these HTML elements.
		  	* There are various techniques using which the WebDriver identifies the WebElements which are based on 
		  	different properties like ID, Name, Class, XPath, Tagname, CSS Selectors, link Text, etc.
		  		* WebDriver provides two methods to find the elements on the web page.
    				* findElement() – finds a single WebElement and returns it as a WebElement object.
    				* findElements() – finds elements in a particular location using locators
    				
    		* WebElement in Selenium: Types of Web elements
				WebElements in Selenium can be divided into different types, namely:
				    1. Edit box: It is a basic text control that enables a user to type a small amount of text. 
    				2. Link: Link is more appropriately referred to as a hyperlink and connects one web page to another. 
    				It allows the user to click their way from page to page. 
    				3. Button: This represents a clickable button, which can be used in forms and places in the 
    				document that needs a simple, standard button functionality.
    				4. Image, image link, an image button: It helps in performing actions on images 
    				like clicking on the image link or the image button, etc.  
    				5. Text area: It is an inline element used to designate a plain-text editing control containing multiple lines.
    				6. Checkbox: This is a selection box or a tick box which is a small interactive box that can be toggled by 
    				the user to indicate an affirmative or a negative choice. 
    				7. Radio button: It is an option button which is a graphical control element that allows the user 
    				to choose only one predefined set of mutually exclusive options.
    				8. Dropdown list: It is a graphical control element, similar to the list box, which allows the user to choose 
    				one value from the list. When this drop-down list is inactive, it displays only a single value. 
    				
    		 * WebElement in Selenium: Operations performed on the WebElements
    		 	In order to access WebElements, we need to perform a set of 
    		 	operations starting with browser actions until the operations are performed on  frames.
    		 		* Operations performed on the browser
					    1. Launch the browser
					    2. Navigate to particular web page
					    3. Close the current browser
					    4. Close all browsers opened by WebDriver during execution
					    5. Maximize browser
					    6. Refresh the browser
					* Operations on the web page
					    1. Get page title
					    2. Get page URL					  
					* Operations on edit box
					    1. Enter a value
					    2. Get the value
					    3. Clear the value
					* Operations on link
					    1. Click the link
					    2. Return the link name
					* Operations on button
					    1. Click enabled
					    2. Display status
					* Operations on image
					    1. General image(No functionality)
					    2. Image button(click)
					    3. Image link(redirects to another page)
					* Operations on text area
    					1. Return or capture the messages from the web page
					* Operations on checkbox
					    1. Select the checkbox
					    2. Unselect the checkbox
					* Operations on radio button
					    1. Select radio button
					    2. Check if it displays the radio button
					* Operations on drop down
					    1. Select an item in the list
					    2. Get the item count
					* Operations on frame
					    1. Switch from top window to a particular frame on the web page
					    2. Switch to a frame to top window
					    	
    		* WebElement in Selenium: How to locate web elements on the web page
    			Selenium provides functionalities that help in locating the element on a web page. Locators are defined as an 
    			address that identifies a WebElement uniquely within a web page. It is a command that tells Selenium IDE 
    			which GUI elements it needs to operate, like – Text Box, Buttons, Check Boxes, etc. Using the right locator 
    			ensures that the tests are faster, more reliable and has lower maintenance over releases.
    				* Types of element locators - In order to identify WebElements accurately and precisely, Selenium makes 
    				use of different types of locators, namely:
					    * Id locator: The most popular way to identify web element is to use ID. ID’s are considered as the safest 
					    and fastest locator option and should always be the first priority among multiple locators.
					    * Name locator: This is also an effective way to locate an element which has a name attribute. With this 
					    strategy, the first element with the value of the name attribute will be returned. If no element 
					    has a matching name attribute, then a  NoSuchElementException will be raised.
					    * Class locator: 
					    * linkText & Partial linkText: You can identify the hyperlinks on a web page using this linkText. It can be 
					    determined with the help of an anchor tag (<a>). To create the hyperlinks on a web page, you can use the 
					    anchor tags followed by the link text. In some cases, you may need to find links by a portion of the text in 
					    a linkText element. In such situations, you can use Partial Link Text to locate elements.
					    * CSS Selector: CSS is mainly used to provide style rules for the web pages and you can use it for identifying 
					    one or more elements in the web page. The CSS selector is always the best possible way to locate complex 
					    elements in page. We’ll talk more about CSS selectors in the next topic. 
					    * XPath: XPath is a language to query XML documents. XPath is an important strategy to locate elements in 
					    selenium. It also consists of a path expression along with some conditions. Here, you can easily write 
					    an XPath script/query to locate any element in the webpage. 
		
		 */
		
		
	/* 	CSS SELECTOR: CSS selector is the combination of an element selector and a selector value which identifies the web element within a web page.
		 * CSS (Cascading Style Sheets) - is a style sheet language used to describe the presentation of a document written in HTML or XML 
		 (including XML dialects such as SVG, MathML or XHTML). CSS describes how elements should be rendered on screen, on paper, in speech, 
		 or on other media.
		 * Locate a web element by using the corresponding HTML code, 
		 * This method is faster compared to XPath which is one of the most popular used element locator.
		 * It uses certain symbols for locating an element on the webpage.
		    	Synatx & Basic Commands: 
		    	* (When ID is present) CSS = (select HTML tag) <HTML Tag> (symbolize ID attribute) <#> (value of an attribute) <AttributeValue>
		    	* (When Class is present) CSS = <HTML Tag> (class attribute) <.> <AttributeValue>
		    		* In instances where ID nor the Class is specified:
		    			* Partial values: Searching for the partial value of an element - HTML tag [locator *='value'](match anywhere in the attribute)
		    			* For substrings: To match the prefix of a particular element on the web page
		    			 		* HTML tag [locator ^ ='value'] match at the beginning of the attribute
		    			 		* HTML tag [locator $ = 'value'] match at the end of the attribute
		    			 		* HTML tag <:> <contains> <(text)>
		    			 		
		   
		 */
		
	/* 	Xpath: XPath also called as XML Path is a language to query XML documents. It is an important strategy to locate elements in selenium. 
	 	It consists of a path expression along with some conditions. 
	 	* Syntax of Xpath - Xpath = //tagname[@attribute = 'value']
	 		//: Is used to select the current node
	 		tagname: It is the name of the tag of a particular node. (e.g. input, div, img, etc...)
	 		@: It is used to select the attribute
	 		Attribute: It is the name of the attribute of the node
	 		Value: It is the value of the attribute 
	 	* Regex example: Syntax - //tagname[contains(@attribute,'value')]
	 	* Types of Xpaths:
	 			* Relative Xpath: The path starts from the middle of the HTML DOM structure. It begins with the double forward slash (//), which 
	 							  means it can search the anywhere on the web page. (e.g. //input[@id='ap_email])
	 			
	 			* Absolute Xpath: It is the direct way to find the element, but the disadvantage of absolute Xpath is that, if there are any changes 
	 							  made in the path of the elements then that Xpath fails. (e.g. /html/body/div[1]/section/div[1]/div) 
	 		

	 */
		
	/*			* WAITS IN SELENIUM: Waits help the user to troubleshoot issues while redirecting to different web pages. Users are often found navigating
	 								through various web pages back and forth. Thus, navigate() commands/methods provided by WebDriver help the user to 
	 								simulate real time scenarios by navigating between the web pages with reference to the web browser's history. 
	 								
	 				* Why do we need waits in Selenium: Most web applications are developed using Ajax and Javascript. When a page is loaded by the 
	 													browser the elements which we want to interact with may load at different time intervals. With this,
	 													it not only becomes difficult to identify the element but if the element is not located, it will 
	 													throw an “ElementNotVisibleException” exception. By using waits, we can resolve this problem. 
	 				
	 				* Types of waits in Selenium: The most widely used waits are Implicit and Explicit and Fluent waits are not preferable for real-time projects.
	 				 		Implicit = Timeouts()
	 				 		Explicit = Thread.sleep() & WebDriver Wait. 
	 						
	 						* Implicit Wait: Implicit wait will tell the WebDriver to wait for a certain amount of time before it throws a "No Such Element Exception."
	 						 				 The default setting of Implicit wait is zero. Once you set the time, the web driver will wait for that particular amount 
	 						 				 of time before throwing an exception. (Implicitly wait is applied globally which means it is always available for all the 
	 						 				 web elements throughout the driver instance. It implies if the driver is interacting with 100 elements then, Implicitly 
	 						 				 wait is applicable for all the 100 elements.)
	 						 		Syntax: driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
	 						 		
	 						* Explicit Wait: It is a concept of the dynamic wait which waits dynamically for specific conditions. It can be implemented 
	 										 by WebDriverWait class. To understand the Explicit wait in Selenium Webdriver, below are examples of why we use wait 
	 										 statements in programs:
	 										  	* Condition 1: Suppose I have a web page which has some login form and after login, it takes a lot of time to load 
	 										  				   Account page or Home page. This page is dynamic it means sometimes it takes 10 seconds to load the homepage, 
	 										  				   sometimes it’s 15 second and so on. In such situations, Explicit wait helps us to wait until a specific page is 
	 										  				   not present.
	 										  	* Condition 2: You are working on travel application and you have filled a web form and clicked on the submit button. Now you 
	 										  				   have to wait until the specific data is not displayed. In this case, again you can use Explicit wait in which 
	 										  				   you can give waits till specific or set of elements are not displayed.
	 								Syntax: WebDriverWait wait = WebDriverWait(WebDriverReference,TimeOut);
	 								
	 						Implicit, Explicit and Fluent waits, are dynamic waits. 
	 						WHAT ARE DYNAMIC WAITS? Consider a situation where you have given TimeOut value as 20 seconds. If the element is loaded in 5 seconds, 
	 						then rest 15 seconds will be ignored. It won’t wait till TimeOut value is completed i.e 20 seconds. That’s why all waits are considered 
	 						as dynamic waits.
	 						
	 		                Implicit Waits	                                                                   Explicit Waits
1. Implicit Wait time is applied to all the elements in the script.	                1. Explicit Wait time is applied only to those elements which are specified by the user.
2. In Implicit Wait, we need not specify “ExpectedConditions” on the element        2. In Explicit Wait, we need to specify “ExpectedConditions” on the element to be located.
to be located.	
3. It is recommended to use when the elements are located with the time frame       3. It is recommended to use when the elements are taking a long time to load and also for verifying the property 
specified in implicit wait.	                                                        of the element like (visibilityOfElementLocated, elementToBeClickable,elementToBeSelected) 
	 											 
	  
	 
	
	 */


	}

}
