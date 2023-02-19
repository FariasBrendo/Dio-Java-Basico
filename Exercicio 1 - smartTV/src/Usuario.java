public class Usuario {
    public static void main(String [] args) {
        smartTV smartTV = new smartTV();

        System.out.println("TV está ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Qual o volume da TV? " + smartTV.volume);

        smartTV.ligar();
        System.out.println("NOVO STATUS -> TV está ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("NOVO STATUS -> TV está ligada? " + smartTV.ligada);

        smartTV.novoCanal();
        System.out.println("NOVO STATUS -> Canal: " + smartTV.canal);

        smartTV.aumentarVolume();
        System.out.println("NOVO STATUS -> Volume: " + smartTV.volume);

        
    }

}
