public class Main {
    public static void main(String[] args) {
        Author author = new Author("Анастасия", "Россошик");
        Author author2 = new Author("Иван", "Дикарев");
        Book book = new Book("Маленький Принц", 2022, author);
        Book book2 = new Book("Гарри Поттер", 2011, author2);
        book.setpublicationYear(2054);
        System.out.println(author2.getFirstName() + " " + author2.getsecondName() + " - ''" + book2.getName() + "'' "  + book2.getpublicationYear() + " год.");
        System.out.println(author.getFirstName() + " " + author.getsecondName() + " - ''" + book.getName() + "'' "  + book.getpublicationYear() + " год.");
    }
}