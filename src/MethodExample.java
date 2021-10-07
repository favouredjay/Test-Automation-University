import java.util.Scanner;

public class MethodExample {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws InterruptedException {
        MethodExample example = new MethodExample();
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name");
        String name = input.next();
        example.setName(name);
        Thread.sleep(1000);

        System.out.println("Hello " + example.getName());
    }
}
