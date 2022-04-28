
public class Launcher {
    public static void main(String[] args) {

        Book witcher = new Book("Ведьмак", 1990, new Author("Анджей", "Сапковский"));
        witcher.setReleaseYear(1986);
        System.out.println(witcher);

        Book dune = new Book("Дюна", 1965, new Author("Френк", "Герберт"));
        System.out.println(dune);
    }
}
