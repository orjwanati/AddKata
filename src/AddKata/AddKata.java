
package AddKata;

public class AddKata {

	public int Add(String numbers) {
		int result = 0;
		
		if(!numbers.isEmpty()) {
			String[] numbersArray = numbers.lines().toArray(String[]::new);
	
			for (String number : numbersArray) {
				String[] numbersArray2 = number.split(",");
				for (String number2 : numbersArray2) {
					result += Integer.parseInt(number2.trim());
				}
			}
		}
		return result;
	}

}
