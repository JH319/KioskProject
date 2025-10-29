package level5;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    /*--------------속성---------------*/
    private List<Menu> menus;


    /*--------------생성자---------------*/
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    /*--------------기능---------------*/
    void start() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // [ MAIN MENU ] 출력하기
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < this.menus.size(); i++) {
                this.menus.get(i).printCategory(i + 1);
            }
            System.out.println("0. 종료    | 종료");

            // 숫자 입력 받기
            try {
                System.out.print("선택 : ");
                int choice1 = sc.nextInt();

                // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
                if (choice1 == 0) {
                    // 종료
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                } else if (0 < choice1 && choice1 <= menus.size()) {
                    // 카테고리 선택
                    Menu selectCategory = menus.get(choice1 - 1);
                    boolean running2 = true;

                    // [ 상세 메뉴 ] 출력하기
                    while (running2) {
                        selectCategory.printMenuItem();

                        try {
                            System.out.print("선택 : ");
                            int choice2 = sc.nextInt();

                            if (choice2 == 0) {
                                System.out.println("뒤로가기\n");
                                running2 = false;
                            } else if (0 < choice2 && choice2 <= selectCategory.getMenuItems().size()) {
                                MenuItem selectedItem = selectCategory.getMenuItems().get(choice2 - 1);

                                System.out.printf("선택한 메뉴 : %s | W %s | %s\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getDescription());
                                System.out.println();
                                running2 = false;
                            }
                            // 상세 : 범위를 벗어난 숫자 처리하기
                            else {
                                System.out.println("상세 메뉴 번호를 다시 확인해주세요.");
                            }
                        }
                        // 상세 : 문자 입력시 처리하기
                        catch (InputMismatchException e) {
                            System.out.println("상세 메뉴 번호를 숫자로 선택해주세요.");
                            sc.nextLine();
                        }

                    }
                }
                // 메인 : 범위를 벗어난 숫자 처리하기
                else {
                    System.out.println("메인 메뉴 번호를 다시 확인해주세요.\n");
                }
            }
            // 메인 : 문자 입력시 처리하기
            catch (InputMismatchException e) {
                System.out.println("메인 메뉴 번호를 숫자로 선택해주세요.\n");
                sc.nextLine();
            }
        }
        sc.close();
    }
}

