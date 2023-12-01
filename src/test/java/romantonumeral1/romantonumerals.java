package romantonumeral1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class romantonumerals {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        int result = romanToInteger(romanNumeral);
        System.out.println("Integer representation: " + result);
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        // Define the values for each Roman numeral symbol
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            // Get the value of the current symbol
            int currentValue = romanValues.get(s.charAt(i));

            // If the next symbol has a greater value, subtract the current value
            if (i < s.length() - 1 && romanValues.get(s.charAt(i + 1)) > currentValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        return result;
    }


}
