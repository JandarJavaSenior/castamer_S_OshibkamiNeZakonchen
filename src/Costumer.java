public class Costumer {
    private String name;
    private Passport passport;
    private Product[] products;
    private Bank bank;

    public Costumer(String name, Passport passport, Product[] products, Bank bank) {
        this.name = name;
        this.passport = passport;
        this.products = products;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }


    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                '}';
    }

}
