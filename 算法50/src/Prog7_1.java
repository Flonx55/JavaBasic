import java.util.Scanner;

/**
 * @Auther:Flonx
 * @Date:2020/12/28 - 12 - 28 - 21:58
 * @Description: PACKAGE_NAME
 * @Version: 1.0
 */
public class Prog7_1 {
    public static void main(String[] args) {
        System.out.println("请输入一串字符:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();//将一行字符转换为字符串
        scan.close();

    }
    private static void count(String str){
        String E1 = "[\u4e00-\u9fa5]";//汉字
        String E2 = "[a-zA-Z]";
        String E3 = "[0-9]";
        String E4 = "\\s";//空格
        int countChinese = 0;
        int countNumber = 0;
        int countSpace = 0;
        int countOther = 0;
    }

}
