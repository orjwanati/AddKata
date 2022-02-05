package test;

//import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import AddKata.AddKata;

class AddKataTest {

	AddKata addKata;
	
    @BeforeEach                                         
	void setUp() throws Exception {
		addKata = new AddKata();
	}

	 @Test                                               
	 @DisplayName("Empty String")   
	 void testAddEmptyString() {
		 assertEquals(addKata.Add(""), 0);  
	 }
	 
	 @Test                                               
	 @DisplayName("1 number String")   
	 void testAddStringWithOneNumber() {
		 assertEquals(addKata.Add("1"), 1);  
	 }

	 @Test                                               
	 @DisplayName("2 numbers String With Comma")   
	 void testAddStringWithTwoNumbersAndComma() {
		 assertEquals(addKata.Add("1,2"), 3);  
	 }
	 
	 @Test                                               
	 @DisplayName("x numbers String With Comma")   
	 void testAddStringWithXNumbersAndComma() {
		 assertEquals(addKata.Add("1,2,4,5,5,6,6,7,8,9"), 1+2+4+5+5+6+6+7+8+9);  
	 }
	 
	 @Test                                               
	 @DisplayName("2 numbers String With Comma and new Line")   
	 void testAddStringWithTwoNumbersAndCommaAndNewLine() {
		 assertEquals(addKata.Add("1\n2,3"), 6);  
	 }
	  

}
