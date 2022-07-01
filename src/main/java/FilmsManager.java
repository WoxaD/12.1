public class FilmsManager {
    private String[] films = new String[0];
    private final int limit;

    public FilmsManager() {
        limit = 10;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = movie;
        films = tmp;
    }
    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength = Math.min(films.length, limit);
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
