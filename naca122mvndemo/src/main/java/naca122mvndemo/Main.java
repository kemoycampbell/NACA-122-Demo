package naca122mvndemo;

public class Main {
    public static void main(String[] args) {
        Student abhik = new Student("Abhik", 2);
        Student nathan = new Student("Nathan", 2);

        System.out.println(abhik);
        System.out.println();
        System.out.println(nathan.toString());
    }
}