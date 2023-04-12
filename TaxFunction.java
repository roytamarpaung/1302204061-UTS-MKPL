package lib;

public class TaxFunction {


    public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
        if (numberOfMonthWorking > 12) {
            System.err.println("More than 12 month working per year");
            return 0;
        }

        int maxNumberOfChildren = 3;
        if (numberOfChildren > maxNumberOfChildren) {
            numberOfChildren = maxNumberOfChildren;
        }

        int taxExemption = 54000000;
        if (isMarried) {
            taxExemption += 4500000;
        }
        taxExemption += (numberOfChildren * 1500000);

        int annualIncome = (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking - deductible;
        int taxableIncome = Math.max(0, annualIncome - taxExemption);
        int tax = (int) Math.round(0.05 * taxableIncome);

        return tax;
    }
}
