package demo;

public class Example {

    private String name;

    public Example(String name) {
        this.name = name;
    }

    public Example () {
        this.name = "John";
    }
    public void print() {
        System.out.println("Hello " + name);
    }
}
