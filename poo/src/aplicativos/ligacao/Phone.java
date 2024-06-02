package aplicativos.ligacao;

public class Phone implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Efetuando ligação para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
}
