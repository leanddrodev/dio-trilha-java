public abstract class Conta {

    private Banco banco;
    private int agencia;
    private int numero;
    private Cliente cliente;
    private static int NUMERO_CONTA = 0;
    private double saldo;

    public Conta(Banco banco, int agencia, Cliente cliente) {
        this.banco = banco;
        this.agencia = agencia;
        this.numero = Conta.NUMERO_CONTA++;
        this.cliente = cliente;
        this.saldo = 0;
        this.banco.adicionarConta(this);
    }

    public Banco getBanco() {
        return banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(double valor, Conta conta) {
        sacar(valor);
        conta.depositar(valor);
    }
    
    public void imprimirSaldo() {
        System.out.println("================ EXTRATO ==============");
        System.out.println(String.format("Banco: %s", getBanco().getNome()));
        System.out.println(String.format("Agência: %s - Conta: %d", getAgencia(), getNumero()));
        System.out.println(String.format("Saldo: %.2f", getSaldo()));
        System.out.println("================== FIM ================");
    }

}