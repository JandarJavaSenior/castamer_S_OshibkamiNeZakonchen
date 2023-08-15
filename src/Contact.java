

public class Contact {
    private String contactName;
    private int phoneNomber;

    public Contact(String contactName, int phoneNomber) {
        this.contactName = contactName;
        this.phoneNomber = phoneNomber;
    }
    public Contact() {

    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getPhoneNomber() {
        return phoneNomber;
    }

    public void setPhoneNomber(int phoneNomber) {
        this.phoneNomber = phoneNomber;
    }

    @Override
    public String toString() {
        return "Contact : " +
                "contactName - " + contactName +
                "phoneNomber - " + phoneNomber +
                '\n';
    }
}