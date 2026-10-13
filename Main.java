import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SandraEngine engine = new SandraEngine();
        Scanner sc = new Scanner(System.in);

        showMenu();

        while (true) {
            System.out.print("enter a value (num): ");
            int value = sc.nextInt();

            switch (value) {
                case 1:
                    System.out.print("enter key: ");
                    String key = sc.next();
                    System.out.print("enter value: ");
                    String keyValue = sc.next();
                    engine.put(key.getBytes(), keyValue.getBytes());
                    break;
                case 2:
                    System.out.print("enter key value: ");
                    byte[] readKey = sc.next().getBytes();
                    System.out.println(engine.get(readKey));
                    break;
                case 3:
                    System.out.print("enter key: ");
                    byte[] delKey = sc.next().getBytes();
                    engine.delete(delKey);
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("enter a valid number");
            }
        }
    }

    private static void showMenu() {
        System.out.println("========== Welcome to Sandra ==========");
        System.out.println("1. create/update key value");
        System.out.println("2. get key value");
        System.out.println("3. delete Key");
        System.out.println("0. show this menu");
    }
}
