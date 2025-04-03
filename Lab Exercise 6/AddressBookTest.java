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