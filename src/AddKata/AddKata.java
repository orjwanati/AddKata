
package AddKata;

public class AddKata {

	public int Add(String numbers) {
		int result = 0;
		
		if(!numbers.isEmpty()) {
			String[] numbersArray = numbers.split(",");
	
			for (String number : numbersArray) {
			    result += Integer.parseInt(number.trim());
			}
		}
		return result;
	}

}
