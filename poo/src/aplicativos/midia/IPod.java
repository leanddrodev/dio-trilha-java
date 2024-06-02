package aplicativos.midia;

public class IPod implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("iPod tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("iPod pausou música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("iPod selecionou música " + musica);
    }
    
}
