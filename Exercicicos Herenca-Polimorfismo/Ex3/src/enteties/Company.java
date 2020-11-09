package enteties;

public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company(){
        super();
    }

    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double taxPaid() {
        double taxPaid;
        if (numberOfEmployees > 10) {
            taxPaid = getAnnualIncome() * 0.14;
        } else {
            taxPaid = getAnnualIncome() * 0.16;
        }
        return taxPaid;
    }
}
