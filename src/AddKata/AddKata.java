
package AddKata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class AddKata {

	public int Add(String numbers) {
		int result = 0;
		String delimiter = ",";
		String delimiterHead  = "//";
		ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();

		String numberStrings = numbers;

		if(!numberStrings.isEmpty()) {
			
			// separate lines
			ArrayList<String> numbersArray = new ArrayList<>(Arrays.asList(numberStrings.split("\n")));
			
			// check if the first item is a delimiter
			if(numbersArray.get(0).startsWith(delimiterHead)) {
				int startIndex = delimiterHead.length();
				delimiter = numbersArray.get(0).substring(startIndex);
			
				// remove delimiter line
				numbersArray.remove(0);
				
				// check delimiter and array are still valid
				if(delimiter.isEmpty() || numbersArray.isEmpty()) {
					throw new RuntimeException("String Delimiter Format is Invalid!");
				}				
			}

			for (String number : numbersArray) {
				//separate lines by delimiter
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
		
		System.out.println("numbers: " + numbers + "\t\tresult = " +  result);

		return result;
	}

}
