public class Main {
    public static void main(String[] args) {
        Author authorbook1 = new Author("Джордан ", "Белфорт");
        Book book1 = new Book("Волк с Уолл-Стрит ", authorbook1 , 2007);
        System.out.println(book1);
        book1.setAge(2008);
        System.out.println("book1.getAge() = " + book1.getAge());
        Author authorbook2 = new Author("Чак ", "Паланик");
        Book book2 = new Book("Бойцоский клуб  ",authorbook2 , 1996);
        System.out.println("Книга вторая : " + book2.getname()  +"Автор "+authorbook2.getName()+authorbook2.getSurName()+" год издательства "+ book2.getAge());
    }
}