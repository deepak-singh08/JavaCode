class Book {

    void title() {
        System.out.println("Java Book");
    }
}

public class BookInheritance
extends Book {

    void author() {
        System.out.println("James Gosling");
    }

    public static void main(String[] args) {

        BookInheritance b =
            new BookInheritance();

        b.title();
        b.author();
    }
}
