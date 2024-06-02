import smartphone.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone iphone = new IPhone();
        
        // Ipod
        iphone.selecionarMusica("Java Song");
        iphone.tocar();
        iphone.pausar();

        // Phone
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.ligar("2199999999");

        // Safari
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.dio.me/");
        iphone.atualizarPagina();
    }
}
