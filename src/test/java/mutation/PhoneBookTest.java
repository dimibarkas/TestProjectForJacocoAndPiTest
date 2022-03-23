package mutation;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void addContact() {
        assertEquals("Der Kontakt [Dimitrios;Barkas;017624955488] wurde hinzugefügt. Es befinden sich nun 1 Kontakte im Telefonbuch."
                ,phoneBook.addContact(new PhoneBookEntry("Dimitrios", "Barkas", "017624955488")));
    }

    @Test
    public void addContactGoesWrong() {
        assertEquals("Der Kontakt [Dimitrios;Barkas;017624955488] wurde hinzugefügt. Es befinden sich nun 1 Kontakte im Telefonbuch."
                ,phoneBook.addContact(new PhoneBookEntry("Dimitrios", "Barkas", "017624955488")));
        assertEquals("Der Kontakt [Dimitrios;Barkas;017624955488] konnte nicht hinzugefügt werden, da dieser bereits vorhanden ist."
                ,phoneBook.addContact(new PhoneBookEntry("Dimitrios", "Barkas", "017624955488")));
    }


}