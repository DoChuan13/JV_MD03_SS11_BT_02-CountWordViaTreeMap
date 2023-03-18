import java.util.Calendar;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //TreeMap cung cấp 2 thuộc tính lưu trữ {key, value}, key = chỉ số index, value = giá trị
        //Thêm và cập nhật bằng put(key, value)
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        System.out.println("Nhập vào một chuỗi ký tự: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char character = Character.toUpperCase(str.charAt(i));
            //System.out.println("Get du lieu " + character + " la: " + treeMap.get(character));
            //Gọi hàm trả ra value của TreeMap, nếu là null thì put() mới vào Tree với value = 1
            //Nếu tồn tại value, update lại vào Tree cũng bằng put() với value++;
            Integer checkValue = treeMap.get(character);
            if (checkValue == null) {
                treeMap.put(character, 1);
                continue;
            }
            treeMap.put(character, ++checkValue);
        }
        System.out.println("Chuỗi ban đầu là: " + str);
        System.out.println("Số lần lặp lại của các ký tự là: " + treeMap);
    }
}
