import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void shouldShowAllFilms() {
        FilmsManager manager = new FilmsManager();

        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"First", "Second", "Third"};

        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void shouldShowWithMaxDefaultLimit() {
        FilmsManager manager = new FilmsManager();

        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"Third", "Second", "First"};

        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldShowWithMaxLimit() {
        FilmsManager manager = new FilmsManager(10);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"Third", "Second", "First"};

        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldShowWithMaxBiggerLimit() {
        FilmsManager manager = new FilmsManager(12);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"Third", "Second", "First"};

        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldShowWithMaxSmallerLimit() {
        FilmsManager manager = new FilmsManager(5);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"Third", "Second", "First"};

        assertArrayEquals(expected, manager.findLast());
    }
}
