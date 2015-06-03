/**
 * A class used to calculate gross pay including overtime if applicable.
 * Created by ahutsona on 6/1/15.
 */
public class Calculations {
	private double hours, rate, pay;
	private final double STD_WORK_WEEK, OVER_TIME_RATE;

	public Calculations() {
		hours = pay = rate = 0;
		STD_WORK_WEEK = 40.0;
		OVER_TIME_RATE = 1.5;
	}
	/**
	 * Sets the pay rate of an employee.
	 * @param rate the amount made per hour
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/**
	 * Sets the hours worked by an employee.
	 * @param hours the amount hours worked
	 */
	public void setHours(double hours) {
		this.hours = hours;
	}


	/**
	 * Computes the gross pay due to an employee.
	 * @return gross pay due to an employee
	 *
	 * Task #1 Writing an Algorithm.
	 *
	 * This is the pseudocode for the calculation portion of
	 * the Pay_AH.java source code file.
	 *
	 * if hours are less than or equal to 40.
	 * 	 take value of hours multiplied by the value in rate and assign to pay variable.
	 * otherwise
	 *   calculate overtime hours, overtime rate and non-overtime hours. Multiply overtime hours by overtime pay and
	 *   add it to non-overtime hours multiplied by hourly rate
	 *
	 * return value stored in pay
	 */

	public double getCalculations() {
		if (hours <= STD_WORK_WEEK) {
			pay = hours * rate;
		} else {
			// ((overtime hours) *  (overtime rate))  + ((non-overtime hours) * rate)
			pay = ((hours - STD_WORK_WEEK) * (rate * OVER_TIME_RATE)) + ( (hours - (hours - STD_WORK_WEEK)) * rate);

		}
		return pay;
	}

}
