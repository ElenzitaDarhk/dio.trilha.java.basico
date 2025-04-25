
public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando Main!");
        a();
        System.out.println("Finalizando Main!");
    }

    static void a() {
        System.out.println("Entrando em a!");
        b();
        System.out.println("Finalizando a!");
    }

    static void b() {
        System.out.println("Entrando em b!");

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        c();
        System.out.println("Finalizando b!");
    }

    static void c() {
        System.out.println("Entrando em c!");
        //Thread.dumpStack();
        System.out.println("Finalizando c!");
    }
}
