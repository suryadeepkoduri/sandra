import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========== Welcome to Sandra ==========");
            System.out.println("1. Create key value");
            System.out.println("2. Get key value");
            System.out.println("3. Update key's value");
            System.out.println("4. Delete Key");
            System.out.print("Enter a value (num): ");
            int value = sc.nextInt();

            switch (value) {
                case 1:
                    System.out.print("Enter Key: ");
                    String key = sc.next();
                    System.out.print("Enter Value: ");
                    Object keyValue = sc.next();
                    map.put(key, keyValue);
                    break;
                case 2:
                    System.out.print("Enter key value: ");
                    String readKey = sc.next();

                    if (!map.containsKey(readKey)) System.out.println(
                        "Key not found"
                    );
                    else System.out.println(map.get(readKey));
                    break;
                case 3:
                    System.out.print("Enter key to update value: ");
                    String updateKey = sc.next();
                    if (!map.containsKey(updateKey)) {
                        System.out.println("Key not found");
                    } else {
                        Object updateValue = sc.next();
                        map.put(updateKey, updateValue);
                    }
                    break;
                case 4:
                    System.out.print("Enter key: ");
                    String delKey = sc.next();

                    if (!map.containsKey(delKey)) {
                        System.out.println("Key not found");
                    } else {
                        map.remove(delKey);
                    }
            }
        }
    }
}
