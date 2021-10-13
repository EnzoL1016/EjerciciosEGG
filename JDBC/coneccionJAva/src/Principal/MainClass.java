package Principal;



import Principal.servicios.menuService;

public class MainClass {

    public static void main(String[] args) throws Exception {

        menuService menu = new menuService();
        menu.Menu();
    }
}

