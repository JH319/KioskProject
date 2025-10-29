package level4;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    /*--------------속성---------------*/
    String category;
    List<MenuItem> menuItems;


    /*--------------생성자---------------*/
    public Menu(String category) {
        this.category = category;
        this.menuItems = new ArrayList<>();
    }


    /*--------------기능---------------*/
    // 메뉴아이템 리스트 getter
    public List<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    // 카테고리에 MenuItem을 추가하는 매서드
    public void addMenuItem(MenuItem item) {
        this.menuItems.add(item);
    }

    // 카테고리 출력
    public void printCategory(int a) {
        System.out.printf("%d. %s\n", a, category);
    }

    //  메뉴 출력
    public void printMenuItem(){
        System.out.println("\n[ " + category + " MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.printf("%d. %-15s | W %s | %s \n", (i + 1), item.getName(), item.getPrice(), item.getDescription());
        }
        System.out.println("0. 뒤로가기");
        }

    }



