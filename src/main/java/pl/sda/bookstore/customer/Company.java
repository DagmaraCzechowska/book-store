package pl.sda.bookstore.customer;

public class Company extends Customer{
    private final String companyName;
    private final String taxCode;

    public Company(String address, String companyName, String taxCode) {
        super(address);
        this.companyName = companyName;
        this.taxCode = taxCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getTaxCode() {
        return taxCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Company company = (Company) o;

        if (companyName != null ? !companyName.equals(company.companyName) : company.companyName != null) return false;
        return taxCode != null ? taxCode.equals(company.taxCode) : company.taxCode == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (taxCode != null ? taxCode.hashCode() : 0);
        return result;
    }
}
