package week4;

public class _03_Methods {
    /*
    Methodlar:
    1- Parametre alan methodlar
    2- Parametre almayan methodlar
    3- Değer döndüren methodlar
    4- Değer döndürmeyen methodlar
     */
    public /*access modifier*/static /*can be used from everywheer*/void /*return type*/ method(){
        System.out.println("method1");
    }

    public static int methodWithIntReturn() {
        return 5;
    }

    public static int method2(String name, String surname) {
        System.out.println(name + " " + surname);
        return 77;
    }

    public static void main(String[] args) {
        method();

        int x = methodWithIntReturn();
        System.out.println(x);

        int y = method2("Erdem", "Buke");
    }
}
