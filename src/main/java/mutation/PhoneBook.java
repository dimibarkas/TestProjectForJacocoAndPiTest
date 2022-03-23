package mutation;


import java.util.Set;
import java.util.TreeSet;

/**
 * This class represents a simple PhoneBook
 */
public class PhoneBook {

    private final Set<PhoneBookEntry> phoneBookEntries;

    public PhoneBook() {
        this.phoneBookEntries = new TreeSet<>();
    }

    public String addContact(PhoneBookEntry phoneBookEntry) {
        if (!this.phoneBookEntries.add(phoneBookEntry)) {
            return String.format("Der Kontakt [%s;%s;%s] konnte nicht hinzugefügt werden, da dieser bereits vorhanden ist.", phoneBookEntry.getFirstname(), phoneBookEntry.getLastname(), phoneBookEntry.getPhoneNumber());
        } else {
            return String.format("Der Kontakt [%s;%s;%s] wurde hinzugefügt. Es befinden sich nun %d Kontakte im Telefonbuch.", phoneBookEntry.getFirstname(), phoneBookEntry.getLastname(), phoneBookEntry.getPhoneNumber(), phoneBookEntries.size());
        }
    }

    public void removeContact() {

    }


}
