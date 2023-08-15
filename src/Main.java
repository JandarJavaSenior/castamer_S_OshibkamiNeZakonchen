

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Passport passport = new Passport(LocalDate.of(1990, 5, 15), "Dubai", "Female");
        Passport passpor = new Passport(LocalDate.of(2009, 3, 8), "Japan", "Male");
        Passport[] passports = {passpor, passport};
        Bank bank = new Bank("Manas", "12345", 15000);
        Bank bank1 = new Bank("Semetey", "56789", 2000);
        Bank[] banks = {bank, bank1};
        Product product = new Product("Coca Cola", "Beverage", 234, 100, LocalDate.of(2021, 9, 10), "-");
        Product product2 = new Product("Belyi", "Beverage", 89, 890, LocalDate.of(2023, 6, 10), "+");
        Product product3 = new Product("Pepsi", "Beverage", 89, 456, LocalDate.of(2022, 9, 10), "-");
        Product product4 = new Product("Baltika", "Beverage", 77, 5, LocalDate.of(2023, 5, 10), "+");
        Product product5 = new Product("Новый продукт!", "Beverage", 90, 67, LocalDate.of(2022, 9, 10), "-");
        Product[] products = {product, product2, product3, product4};
        Costumer customer = new Costumer("Manas", passport, products, bank);
        Costumer customer2 = new Costumer("Semetey", passpor, products, bank1);
        Costumer[] costumers = {customer, customer2};
        DataBaza dataBaza = new DataBaza(costumers, products, passports, banks);
        System.out.println("Добавили новый продукт!");
        System.out.println(Arrays.toString(dataBaza.addProduct("Manas", products, product5)));
        System.out.println("--------------------------------------");
        System.out.println("Информация о продукте!");
        System.out.println(dataBaza.getProductInfo("Coca Cola"));
        System.out.println(dataBaza.getProductInfo("Pepsi"));
        System.out.println("--------------------------------------");
        System.out.println("Удалили продукт у Алибека Водку");
        dataBaza.deleteProductByName("Alibek");
        System.out.println("------------------------------------------");
        System.out.println("Заминили имя Belyi на новое Belyi Medved!");
        dataBaza.updateName("Belyi", "Belyi Medved");
        System.out.println("--------------------------------------------");
        dataBaza.payment("Semetey","56789",scanner);
        dataBaza.sellProductToCustomer("Manas",product);


    }
}







