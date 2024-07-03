import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String codigo;
    private String nome;
    private List<Conta> contaList;

    public Banco() {
        codigo = "0001";
        nome = "Banco Digital DIO";
        contaList = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta) {
        contaList.add(conta);
    }

    public void listarContas() {
        //System.out.println(contaList);
        if(!contaList.isEmpty()) {
            contaList.stream().forEach(c -> {
                System.out.println(String.format("Agência: %d, Conta: %d, Cliente: %s ", c.getAgencia(), c.getNumero(), c.getCliente().getNome()));
            });
        } else {
            System.out.println("Ainda não existem contas.");
        }
    }

}
