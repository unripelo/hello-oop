import java.util.ArrayList;
import java.util.Iterator;

class AddressBook {
    private ArrayList<address> entries;

    public AddressBook() {
        entries = new ArrayList<>();
    }

    public void AddEntry(String name, String address, String telephoneNumber, String emailAddress) {
        address newAddress = new address(name, address, telephoneNumber, emailAddress);
        entries.add(newAddress);
    }

    public void RemoveEntry(String name) {
        Iterator<address> iterator = entries.iterator();
        while (iterator.hasNext()) {
            address currentAddress = iterator.next();
            if (currentAddress.Name.equals(name)) {
                iterator.remove();
                return; // Exit after removing the first match
            }
        }
        System.out.println("Entry with name '" + name + "' not found.");
    }

    public void UpdateEntry(String name, String newAddress, String newTelephoneNumber, String newEmailAddress) {
        for (address currentAddress : entries) {
            if (currentAddress.Name.equals(name)) {
                currentAddress.setAddress(newAddress);
                currentAddress.setTelephoneNumber(newTelephoneNumber);
                currentAddress.setEmailAddress(newEmailAddress);
                return; // Exit after updating the first match
            }
        }
        System.out.println("Entry with name '" + name + "' not found.");
    }

    public void ListEntries() {
        if (entries.isEmpty()) {
            System.out.println("Address book is empty.");
            return;
        }
        for (address currentAddress : entries) {
            System.out.println("Name: " + currentAddress.Name);
            System.out.println("Address: " + currentAddress.getAddress());
            System.out.println("Telephone Number: " + currentAddress.getTelephoneNumber());
            System.out.println("Email Address: " + currentAddress.getEmailAddress());
            System.out.println("--------------------");
        }
    }
}