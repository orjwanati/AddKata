package test;

import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.fail;
//import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

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
	 @DisplayName("3 numbers String With Comma and new Line")   
	 void testAddStringWithThreeNumbersAndCommaAndNewLine() {
		 assertEquals(addKata.Add("1\n2,3"), 6);  
	 }

	 
	 @Test                                               
	 @DisplayName("Invalid New Line and Comma")   
	 void testAddStringWithTwoNumbersAndCommaAndNewLine() {
		 RuntimeException exception = assertThrows(RuntimeException.class, () -> addKata.Add("1,\n"));
		 assertEquals("String Format is Invalid!", exception.getMessage());	
	}
	 
	 
	 @Test                                               
	 @DisplayName("x numbers with delimiter")   
	 void testAddStringWithDifferentDelimiter() {
		 assertEquals(addKata.Add("//;\n1\n2;3;"), 6);  
	 }
	 
	 
	 @Test                                               
	 @DisplayName("x numbers String With negative numbers")   
	 void testAddStringWithNegativeNumbers() {
		 

		 RuntimeException exception = assertThrows(RuntimeException.class, () -> addKata.Add("1,2,-4,5,-5,6,-6,7,-8,9"));
		 assertEquals("Negatives not Allowed. Found the Following Negative Numbers: [-4, -5, -6, -8]", exception.getMessage());
	 }
	 
	 
	 @Test                                               
	 @DisplayName("2 numbers String With White Space")   
	 void testAddStringWithWhiteSpace() {
		 assertEquals(addKata.Add("  1 , 2 "), 3);  
	 } 
	 
	 
	 @Test                                               
	 @DisplayName("; delimiter but No Delimiter Line")   
	 void testAddStringWithNoDelimiterLine() {
		 RuntimeException exception = assertThrows(RuntimeException.class, () -> addKata.Add("1\n2;3;"));
		 assertNotNull(exception);
	 }
	 
	 @Test                                               
	 @DisplayName("String with non integer Values")   
	 void testAddStringWithNoInteger() {
		 RuntimeException exception = assertThrows(RuntimeException.class, () -> addKata.Add("1\ntest;3;"));
		 assertNotNull(exception);
	 }
	 
	 @Test                                               
	 @DisplayName("x numbers with new delimiter &")   
	 void testAddStringWithDifferentDelimiter2() {
		 assertEquals(addKata.Add("//&\n1\n2&3&"), 6);  
	 }
	 
	 @Test                                               
	 @DisplayName("x numbers with new delimiter sd")   
	 void testAddStringWithDifferentDelimiter3() {
		 assertEquals(addKata.Add("//sd\n1\n2sd3sd"), 6);  
	 }
	 
	 @Test                                               
	 @DisplayName("x numbers with Special delimiter .")   
	 void testAddStringWithDifferentSpecialDelimiter1() {
		 assertEquals(addKata.Add("//\\.\n1\n2.3."), 6);  
	 }
	 
	 
	 @Test                                               
	 @DisplayName("x numbers with Special delimiter $")   
	 void testAddStringWithDifferentSpecialDelimiter2() {
		 assertEquals(addKata.Add("//\\$\n1\n2$3$"), 6);  
	 }
	 
	 @Test                                               
	 @DisplayName("String with invalid delimiter Line")   
	 void testAddStringWithInvalidDelimterLine() {
		 RuntimeException exception = assertThrows(RuntimeException.class, () -> addKata.Add("//;1\n;3;"));
		 assertEquals("String Delimiter Format is Invalid!", exception.getMessage());
	 }



}
