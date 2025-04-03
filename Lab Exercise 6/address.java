class address {
    public String Name;
    private String Address;
    private String Telephone_Number;
    private String Email_Address;

    public address(String var1, String var2, String var3, String var4) {
        this.Name = var1;
        this.Address = var2;
        this.Telephone_Number = var3;
        this.Email_Address = var4;
    }

    public void setAddress(String var1) {
        this.Address = var1;
    }

    public void setTelephoneNumber(String var1) {
        this.Telephone_Number = var1; 
    }

    public void setEmailAddress(String var1) {
        this.Email_Address = var1;
    }

    public String getAddress() {
        return this.Address;
    }

    public String getTelephoneNumber() {
        return this.Telephone_Number;
    }

    public String getEmailAddress() {
        return this.Email_Address;
    }
}


public class AddressBookTest {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        addressBook.AddEntry("Narisma", "El Salvador, Misamis Oriental", "0912-345-6789", "narisma@gmail.com");
        addressBook.AddEntry("Mae", "Manila, Quezon City", "099-876-5432", "mae@gmail.com");

        System.out.println("Added entries: ");
        addressBook.ListEntries();

        addressBook.UpdateEntry("Ira", "Opol, Misamis Oriental", "0912-345-678", "ira@gmail.com");

        System.out.println("Updated entry: ");
        addressBook.ListEntries();

        addressBook.RemoveEntry("Mae");

        System.out.println("Removed entry: ");
        addressBook.ListEntries();

    }
}

