package aplicativos.navegador;

public class Safari implements NavegadorInternet {

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página solicitada " + url);
    }
    
}
