package level3;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 속성
    List<MenuItem> menuItems;

    // 생성자
    // Kiosk 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줌
    public Kiosk(List<MenuItem> allMenuItems){
        this.menuItems = allMenuItems;
    }

    // 기능
    // main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리
    void start() {
        Scanner sc = new Scanner(System.in);
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

            // 숫자를 입력 받기
            try {
                System.out.print("선택 : ");
                int choice = sc.nextInt();

                // 입력된 숫자에 따른 처리
                if (choice == 0) {
                    System.out.println("\n프로그램을 종료합니다.");
                    running = false;
                } else if (0 < choice && choice <= menuItems.size()) {
                    System.out.printf("선택한 메뉴 : %s  | W %s | %s \n",
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
            // 숫자가 아닌 것을 입력 받았을 때 오류 처리하기
            catch (InputMismatchException e) {
                System.out.println("메뉴 번호를 선택해주세요.\n");
                sc.nextLine();
            }

        }


    }





}


