public class Book {
    private  String name;

    private Author author;

    private int age;

    public Book(String name, Author author, int age) {
        this.name = name;
        this.age = age;
        this.author = author;
    }

    public Author getName() {
        return this.author;
    }

    public int getAge() {
        return this.age;
    }

    public String getname() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;

    }
}
