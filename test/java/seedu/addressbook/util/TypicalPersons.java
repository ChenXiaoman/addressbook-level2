package seedu.addressbook.util;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.*;
import seedu.addressbook.data.person.Email;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.Phone;
import seedu.addressbook.data.tag.Tag;
import seedu.addressbook.data.tag.UniqueTagList;

/**
 * Class to generate typical test persons
 */
public class TypicalPersons {

    public Person amy, bill, candy, dan;

    public TypicalPersons() {
        try {
            amy = new Person(new Name("Amy Buck"), new Phone("91119111", false), new Email("ab@gmail.com", false),
                    new Block("456", false), new Street("my street", false), new Unit("#01-01", false),
                    new PostalCode("123456", false), new UniqueTagList());
            bill = new Person(new Name("Bill Clint"), new Phone("92229222", false), new Email("bc@gmail.com", false),
                    new Block("456", false), new Street("my street", false), new Unit("#01-01", false),
                    new PostalCode("123456", false),  new UniqueTagList());
            candy = new Person(new Name("Candy Destiny"), new Phone("93339333", true),
                    new Email("cd@gmail.com", false), new Block("456", false), new Street("my street", false), new Unit("#01-01", false),
                    new PostalCode("123456", false), new UniqueTagList());
            dan = new Person(new Name("Dan Smith"), new Phone("1234556", true), new Email("ss@tt.com", true),
                    new Block("456", false), new Street("my street", false), new Unit("#01-01", false),
                    new PostalCode("123456", false), new UniqueTagList(new Tag("Test")));
        } catch (IllegalValueException e) {
            e.printStackTrace();
            assert false : "not possible";
        }
    }

    private void loadAddressBookWithSampleData(AddressBook ab) {
        try {
            for (Person p : this.getTypicalPersons()) {
                ab.addPerson(new Person(p));
            }
        } catch (IllegalValueException e) {
            assert false : "not possible";
        }
    }

    public Person[] getTypicalPersons() {
        return new Person[]{amy, bill, candy, dan};
    }

    public AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        loadAddressBookWithSampleData(ab);
        return ab;
    }

}
