package level5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Menu 클래스로 카테고리 객체화
        Menu burgers = new Menu("Burgers");
        Menu drinks = new Menu("Drinks");
        Menu desserts = new Menu("Desserts");

        List<Menu> menus = new ArrayList<>();

        menus.add(burgers);
        menus.add(drinks);
        menus.add(desserts);

        // MenuItem 객체 생성 + burgers 카테고리에 삽입
        burgers.addMenuItem(new MenuItem("ShakeBurger", "6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("SmokeShack", "8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Cheeseburger", "6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Hamburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거"));

        // MenuItem 객체 생성 + drinks 카테고리에 삽입
        drinks.addMenuItem(new MenuItem("Lemonade", "4.8", "매장에서 직접 만드는 상큼한 레몬에이드"));
        drinks.addMenuItem(new MenuItem("Shack Coffee", "3.9", "쉑 블렌드 원두를 사용한 밸런스 좋은 블랙 커피"));
        drinks.addMenuItem(new MenuItem("Fountain Soda", "3.3", "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플"));
        drinks.addMenuItem(new MenuItem("Fresh Brewed Iced Tea", "3.8", "직접 유기농 홍차를 우려낸 아이스 티"));

        // MenuItem 객체 생성 + Desserts 카테고리에 삽입
        desserts.addMenuItem(new MenuItem("Classic Hand-Spun Shakes", "6.9", "쫀득하고 진한 커스터드가 들어간 클래식 쉐이크"));
        desserts.addMenuItem(new MenuItem("Floats", "6.8", "부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료"));
        desserts.addMenuItem(new MenuItem("Cup & Cones", "5.8", "매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림 (바닐라/초콜릿)"));


        // kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menus);

        // start() 함수 실행
        kiosk.start();

    }
}