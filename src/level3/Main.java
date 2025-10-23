package level3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // [1] 각 메뉴 객체 생성
        MenuItem menu1 = new MenuItem("ShakeBurger", "6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menu2 = new MenuItem("SmokeShack", "8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menu3 = new MenuItem("Cheeseburger", "6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menu4 = new MenuItem("Hamburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거");

        // [2] List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        // [3] add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(menu1);
        menuItems.add(menu2);
        menuItems.add(menu3);
        menuItems.add(menu4);

        // [4] kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menuItems);

        // [5] start() 함수 실행
        kiosk.start();

    }
}