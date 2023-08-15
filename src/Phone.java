public class Phone {
    private String brend;
    private String model;
    private int prise;
    private String vladeles;
    private Contact [] contacts;

    public Phone(String brend, String model, int prise, String vladeles, Contact[] contacts) {
        this.brend = brend;
        this.model = model;
        this.prise = prise;
        this.vladeles = vladeles;
        this.contacts = contacts;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getVladeles() {
        return vladeles;
    }

    public void setVladeles(String vladeles) {
        this.vladeles = vladeles;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public void getContactCount(){
        System.out.println(getVladeles());
        int count = 0;
        for (Contact c:contacts) {
            count++;
        }
        System.out.println("v telepone "+count+" kontaktov!");
    }

}