package level2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // [1] 각 메뉴 객체 생성
        MenuItem menu1 = new MenuItem("ShakeBurger", "6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menu2 = new MenuItem("SmokeShack", "8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menu3 = new MenuItem("Cheeseburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거");
        MenuItem menu4 = new MenuItem("Hamburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거");

        // [2] List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        // [3] add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(menu1);
        menuItems.add(menu2);
        menuItems.add(menu3);
        menuItems.add(menu4);

        // [4] Scanner 선언
        Scanner sc = new Scanner(System.in);

        // [5] 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        boolean running = true;
        while (running) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                String name = menuItems.get(i).getName();
                String price = menuItems.get(i).getPrice();
                String description = menuItems.get(i).getDescription();

                System.out.printf("%d. %-15s | W %s | %s \n", (i + 1), name, price, description);
            }
            System.out.println("0. 종료    | 종료");

            // [6] 숫자를 입력 받기
            try {
                System.out.print("선택 : ");
                int choice = sc.nextInt();

                // [7] 입력된 숫자에 따른 처리
                if (choice == 0) {
                    System.out.println("\n프로그램을 종료합니다.");
                    running = false;
                } else if (0 < choice && choice <= menuItems.size()) {
                    System.out.printf("선택한 메뉴 : %s, W %s, %s \n",
                            menuItems.get(choice-1).getName(),
                            menuItems.get(choice-1).getPrice(),
                            menuItems.get(choice-1).getDescription());
                    break;
                } else {
                    System.out.println("메뉴 번호를 다시 확인하고 입력해주세요.\n");
                    continue;
                }
                sc.close();
            }
            // [4] 숫자가 아닌 것을 입력 받았을 때 오류 처리하기
            catch (InputMismatchException e) {
                System.out.println("메뉴 번호를 선택해주세요.\n");
                sc.nextLine();
            }

        }
    }
}