import org.example.PhoneBook;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookTest {
    PhoneBook phoneBook;


    @BeforeEach
    public void initPhoneBook() {
        phoneBook = new PhoneBook();
    }
    @AfterEach
    public void nullPhonebook(){
        phoneBook = null;

    }
    @Test
    public void testAddContact(){
        String name = "Екатерина";
        String phoneNumber = "9-999-999-99";

        int expected = 1;
        int result = phoneBook.addContact(name, phoneNumber);

        assert(expected, result);
    }


}

