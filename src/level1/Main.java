package level1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // [1] 메뉴 리스트 저장
        // {메뉴명, 가격, 설명}
        String[][] menuData = {
                {"ShackBurger", "6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거" },
                {"SmokeShack", "8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거" },
                {"Cheeseburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거" },
                {"Hamburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거" },
        };


        // [2] 메뉴 출력
        boolean running = true;
        while (running) {
            System.out.println("[ SHAKESHACK MENU ]");

            for (int i = 0; i < menuData.length; i++) {
                String name = menuData[i][0];
                String price = menuData[i][1];
                String description = menuData[i][2];

                System.out.printf("%d. %-15s | W %s | %s \n", (i + 1), name, price, description);
            }
            System.out.println("0. 종료    | 종료");


            // [3] 사용자 입력 받기
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("선택 : ");
                int choice = sc.nextInt();

                if (choice == 0) {
                    System.out.println("\n프로그램을 종료합니다.");
                    running = false;
                } else if (0 < choice && choice <= menuData.length) {
                    System.out.printf("%d. %-15s | W %s | %s \n", choice, menuData[choice-1][0],
                            menuData[choice-1][1], menuData[choice-1][2]);
                    break;
                } else {
                    System.out.println("메뉴 번호를 다시 확인하고 입력해주세요.");
                    continue;
                }
                sc.close();
            }
            // [4] 숫자가 아닌 것을 입력 받았을 때 오류 처리하기
            catch (InputMismatchException e) {
                System.out.println("메뉴 번호를 선택해주세요.\n");
            }
        }
    }
}