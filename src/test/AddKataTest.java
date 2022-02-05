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

}
