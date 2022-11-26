public class Author {
 private String name;
 private   String surName;

    @Override
    public String toString() {
        return "" +
                "" + name + '\'' +
                "" + surName + '\'' ;
    }

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return this.surName;
    }
}
