public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada?: " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo Status - TV Ligada?: " + smartTv.ligada);

        System.out.println("Canal Atual?: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual?: " + smartTv.canal);
        System.out.println("Volume Atual?: " + smartTv.volume);

        smartTv.diminuirVolume();
        
        System.out.println("Volume Atual?: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo Status - TV Ligada?: " + smartTv.ligada);
    }
}
