package entities;

public class TaxPayer {
  private Double salaryIncome;
  private Double serviceIncome;
  private Double capitalIncome;
  private Double healthSpending;
  private Double educationSpending;

  public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double healthSpending,
                  double educationSpending) {
    this.salaryIncome = salaryIncome;
    this.serviceIncome = serviceIncome;
    this.capitalIncome = capitalIncome;
    this.healthSpending = healthSpending;
    this.educationSpending = educationSpending;
  }

  public double salaryTax() {
    double salaryPerMonth = salaryIncome / 12;
    if (salaryPerMonth <= 3000) {
      return 0.00;
    } else if (salaryPerMonth <= 5000) {
      return salaryIncome * 0.10;
    }
    return salaryIncome * 0.20;
  }

  public double serviceTax() {
    return serviceIncome * 0.15;
  }

  public double capitalTax() {
    return capitalIncome * 0.20;
  }

  public double grossTax() {
    return salaryTax() + serviceTax() + capitalTax();
  }

  public double taxRebate() {
    return healthSpending + educationSpending > grossTax() * 0.3 ? grossTax() * .30
        : healthSpending + educationSpending;
  }

  public double netTax() {
    return grossTax() - taxRebate();
  }

  public Double getSalaryIncome() {
    return salaryIncome;
  }

  public void setSalaryIncome(Double salaryIncome) {
    this.salaryIncome = salaryIncome;
  }

  public Double getServiceIncome() {
    return serviceIncome;
  }

  public void setServiceIncome(Double serviceIncome) {
    this.serviceIncome = serviceIncome;
  }

  public Double getCapitalIncome() {
    return capitalIncome;
  }

  public void setCapitalIncome(Double capitalIncome) {
    this.capitalIncome = capitalIncome;
  }

  public Double getHealthSpending() {
    return healthSpending;
  }

  public void setHealthSpending(Double healthSpending) {
    this.healthSpending = healthSpending;
  }

  public Double getEducationSpending() {
    return educationSpending;
  }

  public void setEducationSpending(Double educationSpending) {
    this.educationSpending = educationSpending;
  }

  public String toString() {
    return String.format("Imposto bruto total: %.2f%n", grossTax()) +
           String.format("Abatimento: %.2f%n", taxRebate()) +
           String.format("Imposto devido: %.2f%n", netTax());
  }
}
