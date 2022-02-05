
package AddKata;

import java.util.regex.Pattern;

public class AddKata {

	public int Add(String numbers) {
		int result = 0;
		String numberString = numbers;

		if(!numbers.isEmpty()) {
			
			String delimiter = ",";
			if(numbers.startsWith("//[")) {
				numberString = numbers.substring(3);
				int endIndex = numbers.indexOf("]\n");
				if(endIndex != -1) {
					numberString = numbers.substring(endIndex+2);
					delimiter = numbers.substring(3, endIndex);
				}
			}
			
			String[] numbersArray = numberString.split("\n");

			for (String number : numbersArray) {
				String[] numbersArray2 = number.split(delimiter);
				if(number.contains(delimiter) && numbersArray2.length == 1) {
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
