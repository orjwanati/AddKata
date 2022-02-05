
package AddKata;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddKata {

	public int Add(String numbers) {
		int result = 0;
		
		if(!numbers.isEmpty()) {
			String[] numbersArray = numbers.split("\n");

			for (String number : numbersArray) {
				
				
				String[] numbersArray2 = number.split(",");
				if(number.contains(",") && numbersArray2.length == 1) {
		            throw new RuntimeException("String Format is Invalid!");    
				}
				
				for (String number2 : numbersArray2) {
					
					
					result += Integer.parseInt(number2.trim());
				}
			}
		}
		return result;
	}

}
