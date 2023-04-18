import java.util.Scanner;

public class Library {
    public static void MainMenu() {
        Scanner sc = new Scanner(System.in);
        String user_input = "";
        System.out.println("""
                    Подобрать Laptop :
                    1.по ОЗУ
                    2.по ПЗУ
                    3.по ОС
                    4.по цвету
                    5.Выход""");


        while (!(user_input.equals("5"))) {
            user_input=sc.nextLine();


        }
    }
}
