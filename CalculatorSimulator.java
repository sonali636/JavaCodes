package code;

import code.Custom.CountryNotValidException;
import code.Custom.EmployeeNameInvalidException;
import code.Custom.TaxNotEligibleException;

public class CalculatorSimulator {
	public static void main(String[] args) {
	    TaxCalculator calculator = new TaxCalculator();

	    testTax(calculator, "Jack", true, 55000);
	    testTax(calculator, "", true, 55000);         
	    testTax(calculator, "John", false, 60000);    
	    testTax(calculator, "Jane", true, 9000);      
	}

	private static void testTax(TaxCalculator calc, String name, boolean isIndian, double salary) {
	    try {
	        double tax = calc.calculateTax(name, isIndian, salary);
	        System.out.println("Tax amount is " + tax);
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	}

}
