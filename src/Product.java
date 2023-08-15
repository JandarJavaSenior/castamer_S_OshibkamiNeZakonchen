import java.time.LocalDate;

public class Product {
    private String name;
    private String description;
    private int prise;
    private int count;
    private LocalDate data;
    private String alcoholic;

    public Product(String name, String description, int prise, int count, LocalDate data, String alcoholic) {
        this.name = name;
        this.description = description;
        this.prise = prise;
        this.count = count;
        this.data = data;
        this.alcoholic = alcoholic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(String alcoholic) {
        this.alcoholic = alcoholic;
    }

    @Override
    public String toString() {
        return "imya: "+name +"  opisane:"+
                description+ "  praise: "+prise+"  kol: "+count+"  data: "+data+ "  alkogol: "+alcoholic+"\n";
    }

}
