package org.xpath;

public class Xpath {

//                       //tagname[@attname='attValue'] 
//                                                      	             -----> //input[@type='text']
	
//	------------------------------------------------------------------------------------------------------
	
	
	
	
//                     (//tagname[@attname='attValue'])[numb]   
//                                                                      -----> (//a[@role='button'])[2]
	
//	------------------------------------------------------------------------------------------------------
	                          // by text
	
//                        // tagname[text()='txtValue']
//                                                                      ------->//button[text()='Log in']

	
	
//---------------------------------------------------------------------------------------------------------
	                           // contains by txt
	
//                       //tagname[conains(text(),'partial text value')]
//                                                                          ------->//button[contains(text(),'Log')]

	
//--------------------------------------------------------------------------------------------------------------
	                                     // contains by attribut AND Attribute value
	
//                     	//tagname[contains(@attributename,'partial text value')]
//                                                                             ----------> //input[contains(@name,'em')]
	
//--------------------------------------------------------------------------------------------------------------
	                                        // using child 
	
//                //tagname[@attri='atributevalue']//child::tagname[text()='txt value']	
//	                                                                           ---------->//select[@id='month']//child::option[text()='May']
//	                                                                           ---------->//select[@id='month']//child::option[5]
//                                                                           ---------->//select[@id='month']//child::option
//--------------------------------------------------------------------------------------------------------------
	//                                                 using parent
	
	
	//tagname[@attri='atributevalue']//parent::tagname[text()='txt value']	
	
	
	                                                                                     //option[@value='2']//parent::select[@id='day']
	
	
//--------------------------------------------------------------------------------------------------------------
	 
	//                                         using following (select entire)
	
	//tagname[@attri='value']//following::tagname
	
	                                                                                    //option[text()='May']//following::option
	
	//--------------------------------------------------------------------------------------------------------------

	           //                             using following and Sibilng(only sibling)
	
	//tagname[@attri='attribute value']//following-sibling::tagname
	
	                                                                //option[text()='May']//following-sibling::option
	
	
	
	//--------------------------------------------------------------------------------------------------------------

	                                           // using preceding and sibiling(only sibling)
	                                                                      
	
	//tagname[@attru='attrivalue']//preceding-sibling::option
//	                                                                 ---------------->   //option[text()='May']//preceding-sibling::option
	                                                                          
//--------------------------------------------------------------------------------------------------------------

	                                                      //using preceding 
	//tagname[@attri='attrivalue']//preceding::tagname
	                                                                           
	                                                                           
//	                                                                     ----------- >   //option[text()='May']//preceding::option
	                                                                           
	                                                                     
	
}
