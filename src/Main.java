public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Волк с Уолл-Стрит ", 2007);
        Author authorbook1 = new Author("Джордан ", "Белфорт");
        System.out.println("Книга первая : " + book1.getname()  +"Автор "+authorbook1.getName()+authorbook1.getSurName()+" год издательства "+ book1.getAge());
        book1.setAge(2008);
        System.out.println("book1.getAge() = " + book1.getAge());
        Book book2 = new Book("Бойцоский клуб  ", 1996);
        Author authorbook2 = new Author("Чак ", "Паланик");
        System.out.println("Книга вторая : " + book2.getname()  +"Автор "+authorbook2.getName()+authorbook2.getSurName()+" год издательства "+ book2.getAge());
    }
}