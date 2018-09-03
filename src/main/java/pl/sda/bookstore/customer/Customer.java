package pl.sda.bookstore.customer;

public abstract class Customer {

    private final String address;

    public Customer(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return address != null ? address.equals(customer.address) : customer.address == null;
    }

    @Override
    public int hashCode() {
        return address != null ? address.hashCode() : 0;
    }
}
