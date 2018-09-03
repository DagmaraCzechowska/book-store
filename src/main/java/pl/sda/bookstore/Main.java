package pl.sda.bookstore;

import pl.sda.bookstore.menu.MainMenu;

public class Main {

    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        while (true) {
            try {
                menu.showMenu();
            }catch (Exception e){
                System.err.println(e);
            }break;


        }
    }
}
