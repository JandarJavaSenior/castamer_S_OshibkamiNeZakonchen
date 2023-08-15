import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

public class DataBaza {
    private Costumer[] costumers;
    private Product[] products;
    private Passport[] passports;
    private Bank[] banks;
    private Scanner scanner;

    public DataBaza(Costumer[] costumers, Product[] products, Passport[] passports, Bank[] banks) {
        this.costumers = costumers;
        this.products = products;
        this.passports = passports;
        this.banks = banks;
    }


    public Costumer[] getCostumers() {
        return costumers;
    }

    public void setCostumers(Costumer[] costumers) {
        this.costumers = costumers;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Passport[] getPassports() {
        return passports;
    }

    public void setPassports(Passport[] passports) {
        this.passports = passports;
    }

    public Bank[] getBanks() {
        return banks;
    }

    public void setBanks(Bank[] banks) {
        this.banks = banks;
    }


    public Product getProductInfo(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public Product[] deleteProductByName(String productName) {
        int indexToRemove = 99;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(productName)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != 99) {
            products = Arrays.copyOf(products, products.length - 1);
            System.out.println(Arrays.toString(products));
        }
        return products;
    }

    public Product[] addProduct(String customerName, Product newProduct) {
        Costumer customer = findCustomerByName(customerName);

        if (customer != null) {
            products = Arrays.copyOf(products, products.length + 1);
            products[products.length - 1] = newProduct;
        } else {
            System.out.println("Такого клиента не существует!");
        }

        return products;
    }

    public void payment(String name, String password, Scanner scanner) {
        for (Bank bank : banks) {
            if (bank.getUserName().equals(name) && bank.getPassword().equals(password)) {
                System.out.println("Вы вошли в аккаунт!");
                System.out.println("Что хотите сделать? Купить товар (1) или взять кредит (2)?");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        int totalCost = 0;
                        for (Product product : products) {
                            if (product.getPrise() != 0) {
                                totalCost += product.getPrise();
                            }
                        }

                        if (bank.getTotalMoney() >= totalCost) {
                            System.out.println("Денег хватает!");
                        } else {
                            System.out.println("Денег не хватает, возьмите в долг!");
                        }
                        break;

                    case 2:
                        System.out.println("Сколько долга?");
                        int debt = scanner.nextInt();
                        int newMoney = bank.getTotalMoney() + debt;
                        bank.setTotalMoney(newMoney);
                        System.out.println("Вы взяли кредит " + debt + " сом. Ваш текущий баланс: " + newMoney);
                        break;

                    default:
                        System.out.println("Неправильный выбор.");
                        break;
                }
            }
        }
    }

    public boolean isCustomerAdult(Costumer customer) {
        int age = Period.between(customer.getPassport().getAga(), LocalDate.now()).getYears();
        return age >= 18;
    }

    public boolean isProductExpired(Product product) {
        return product.getData().isBefore(LocalDate.now());
    }

    public Costumer findCustomerByName(String name) {
        for (Costumer customer : costumers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void sellProductToCustomer(String customerName, Product product) {
        Costumer customer = findCustomerByName(customerName);
        Product productToSell = findProductByName(product.getName());

        if (customer == null) {
            System.out.println("Покупатель не найден.");
            return;
        }

        if (productToSell == null) {
            System.out.println("Продукт не найден.");
            return;
        }

        if (!isCustomerAdult(customer)) {
            System.out.println("Продажа запрещена: покупатель младше 18 лет.");
            return;
        }

        if (isProductExpired(productToSell)) {
            System.out.println("Продажа запрещена: продукт просрочен.");
            return;
        }

        System.out.println("Продан продукт " + productToSell.getName() + " покупателю " + customer.getName());
    }


}
