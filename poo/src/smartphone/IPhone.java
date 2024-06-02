package smartphone;

import aplicativos.ligacao.AparelhoTelefonico;
import aplicativos.ligacao.Phone;
import aplicativos.midia.IPod;
import aplicativos.midia.ReprodutorMusical;
import aplicativos.navegador.NavegadorInternet;
import aplicativos.navegador.Safari;

public final class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private ReprodutorMusical ipod;
    private AparelhoTelefonico phone;
    private NavegadorInternet safari;

    public IPhone() {
        ipod = new IPod();
        phone = new Phone();
        safari = new Safari();
    }

    @Override
    public void pausar() {
        ipod.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        ipod.selecionarMusica(musica);
    }

    @Override
    public void tocar() {
        ipod.tocar();
    }

    @Override
    public void atender() {
        phone.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        phone.iniciarCorreioVoz();
    }

    @Override
    public void ligar(String numero) {
        phone.ligar(numero);
    }

    @Override
    public void adicionarNovaAba() {
        safari.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        safari.atualizarPagina();
    }

    @Override
    public void exibirPagina(String url) {
        safari.exibirPagina(url);
    }
    
}
