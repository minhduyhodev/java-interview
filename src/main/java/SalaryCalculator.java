public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        if (daysSkipped < 0)
            return 0;
        return daysSkipped >= 5 ? 1 - 0.15 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        if (productsSold < 0)
            return 0;
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        if (productsSold < 0)
            return 0;
        return bonusMultiplier(productsSold) * productsSold; // 13 * 77
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = salaryMultiplier(daysSkipped) * 1000.00 + bonusForProductsSold(productsSold);
        return salary > 2000.0 ? 2000.0 : salary;
    }

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println("tinh luong: " + salaryCalculator.finalSalary(2, 77));
    }
}
