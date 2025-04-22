
public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + (smartTv.verificarLigada() ? "Ligada" : "Desligada"));
        System.out.println("Canal: " + smartTv.getCanal());
        System.out.println("Volume: " + smartTv.getVolume());

        smartTv.ligar();
        smartTv.aumentarCanal();
        smartTv.aumentarVolume();

        System.out.println("TV Ligada? " + (smartTv.verificarLigada() ? "Ligada" : "Desligada"));
        System.out.println("Canal: " + smartTv.getCanal());
        System.out.println("Volume: " + smartTv.getVolume());

        smartTv.diminuirCanal();
        smartTv.dimunuirVolume();

        System.out.println("TV Ligada? " + (smartTv.verificarLigada() ? "Ligada" : "Desligada"));
        System.out.println("Canal: " + smartTv.getCanal());
        System.out.println("Volume: " + smartTv.getVolume());

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("TV Ligada? " + (smartTv.verificarLigada() ? "Ligada" : "Desligada"));
        System.out.println("Canal: " + smartTv.getCanal());
        System.out.println("Volume: " + smartTv.getVolume());

        smartTv.escolherCanal(15);

        System.out.println("TV Ligada? " + (smartTv.verificarLigada() ? "Ligada" : "Desligada"));
        System.out.println("Canal: " + smartTv.getCanal());
        System.out.println("Volume: " + smartTv.getVolume());

        System.out.println("Canal via argumento");

        String argumento = "";
        int canal = 5;

        if (args != null && args.length > 0) {
            argumento = args[0];
        }

        if (!argumento.isEmpty()) {
            canal = Integer.valueOf(argumento);
        }

        smartTv.escolherCanal(canal);

        System.out.println("TV Ligada? " + (smartTv.verificarLigada() ? "Ligada" : "Desligada"));
        System.out.println("Canal: " + smartTv.getCanal());
        System.out.println("Volume: " + smartTv.getVolume());
    }
}
