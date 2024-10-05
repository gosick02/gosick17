import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入电脑的价格（小于等于100000）：");
        int price = scanner.nextInt();

        // 检查价格的有效性
        if (price <= 0 || price > 100000) {
            System.out.println("价格无效，请输入一个有效的价格。");
            return;
        }

        int total = 0;
        int day = 0;

        // 计算小明第几天可以达到或超过价格
        while (total < price) {
            day++;
            total += day;
        }

        System.out.println("小明在第 " + day + " 天可以达成心愿。");
    }
}
