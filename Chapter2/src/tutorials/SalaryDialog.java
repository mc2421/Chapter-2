package tutorials;

import javax.swing.JOptionPane;

public class SalaryDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wageString; 
		String dependentString;
		String hoursWorkedString;
		int dependents;
		double wage, weeklyPay;
		double HOURS_IN_WEEK;
		
		hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours did you work work during the week? ", "Hourly Wage Dialog",
				JOptionPane.INFORMATION_MESSAGE);
		HOURS_IN_WEEK = Double.parseDouble(hoursWorkedString);
		
		wageString = JOptionPane.showInputDialog(null, "Enter employees's hourly wage", "Salary dialog 1",	+ JOptionPane.INFORMATION_MESSAGE);
		weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
		
		dependentString = JOptionPane.showInputDialog(null, "How many dependants?", "Salary Dialog 2", JOptionPane.QUESTION_MESSAGE);
		dependents = Integer.parseInt(dependentString);
		
		JOptionPane.showMessageDialog(null, "Weekly salaray is $" + weeklyPay + "/nDeductions will be "
				+ "made for " + dependents + " dependents");
	}

}
