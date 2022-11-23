public class Book {
  private   String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
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
