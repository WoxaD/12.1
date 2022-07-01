import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void shouldShowAllFilms() {
        FilmsManager manager = new FilmsManager();

        manager.save("First");
        manager.save("Second");
        manager.save("Third");

        String[] expected = {"First", "Second", "Third"};

        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void shouldShowWithMaxDefaultLimit() {
        FilmsManager manager = new FilmsManager();

        manager.save("First");
        manager.save("Second");
        manager.save("Third");

        String[] expected = {"Third", "Second", "First"};

        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldShowWithMaxLimit() {
        FilmsManager manager = new FilmsManager(10);

        manager.save("First");
        manager.save("Second");
        manager.save("Third");

        String[] expected = {"Third", "Second", "First"};

        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldShowWithMaxBiggerLimit() {
        FilmsManager manager = new FilmsManager(12);

        manager.save("First");
        manager.save("Second");
        manager.save("Third");

        String[] expected = {"Third", "Second", "First"};

        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldShowWithMaxSmallerLimit() {
        FilmsManager manager = new FilmsManager(5);

        manager.save("First");
        manager.save("Second");
        manager.save("Third");

        String[] expected = {"Third", "Second", "First"};

        assertArrayEquals(expected, manager.findLast());
    }
}
