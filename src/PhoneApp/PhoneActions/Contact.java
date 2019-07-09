package PhoneApp.PhoneActions;

public class Contact {
    public static Contact[] contacts=new Contact[10];
    public static int id=0;
    public String firstName;
    public String lastName;
    public long phoneNr;

//////////////////////////////////////////////////////////////////////

    public Contact(int id,String firstName, String lastName, long phoneNr){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNr=phoneNr;
    }

//////////////////////////////////////////////////////////////////////


    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Contact.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(long phoneNr) {
        this.phoneNr = phoneNr;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNr=" + phoneNr +
                '}';
    }
}
