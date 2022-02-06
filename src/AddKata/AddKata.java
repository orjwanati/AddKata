
package AddKata;

import java.util.ArrayList;

public class AddKata {

	public int Add(String numbers) {
		int result = 0;
		String delimiter = ",";
		
		ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();

		String numberStrings = numbers;

		if(!numberStrings.isEmpty()) {
			
			// read delimiter line if exists
			String delimiterHead  = "//";
			String delimiterTail  = "\n";
			
			if(numbers.startsWith(delimiterHead)) {
				int startIndex = delimiterHead.length();
				numberStrings = numbers.substring(startIndex);
				int endIndex = numbers.indexOf(delimiterTail);
				if(endIndex != -1) {
					numberStrings = numbers.substring(endIndex+delimiterTail.length());
					delimiter = numbers.substring(startIndex, endIndex);
				} else {
		            throw new RuntimeException("String Delimiter Format is Invalid!");    
				}
			}
			
			
			String[] numbersArray = numberStrings.split("\n");

			for (String number : numbersArray) {
				String[] numbersArray2 = number.split(delimiter);
				
				// handle case where two numbers are separated by the delimiter and \n
				if(number.contains(delimiter) && numbersArray2.length == 1) {
		            throw new RuntimeException("String Format is Invalid!");    
				}
				
				for (String number2 : numbersArray2) {
					int num = Integer.parseInt(number2.trim());
					
					if(num < 0) {
						negativeNumbers.add(num);
					} else {
						result += num;
					}
				}
			}
			
			if(!negativeNumbers.isEmpty()) {
	            throw new RuntimeException("Negatives not Allowed. Found the Following Negative Numbers: " + negativeNumbers.toString());    
			}
		}
		return result;
	}

}
