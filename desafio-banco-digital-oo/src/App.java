public class App {
    public static void main(String[] args) throws Exception {
        
        // Cria o banco digital
        Banco bancoDigital = new Banco();
        System.out.println(bancoDigital.getCodigo());
        System.out.println(bancoDigital.getNome());
        bancoDigital.listarContas();
        
        //Cria cliente
        Cliente cliente1 = new Cliente("Leandro1", "123456", 25);
        Cliente cliente2 = new Cliente("Leandro2", "489000", 26);
        Cliente cliente3 = new Cliente("Leandro3", "369111", 27);
        Cliente cliente4 = new Cliente("Leandro4", "222333", 28);

        //Cria contas correntes e realiza operações
        Conta cc1 = new ContaCorrente(bancoDigital, 1111, cliente1);
        cc1.depositar(1000);
        cc1.sacar(150);
        cc1.imprimirSaldo();

        Conta cc2 = new ContaCorrente(bancoDigital, 1111, cliente2);
        cc2.depositar(1000);
        cc2.sacar(150);
        cc2.transferir(100, cc1);
        cc2.imprimirSaldo();

        cc1.imprimirSaldo();

        //Cria contas poupanças e realiza operações
        Conta cp3 = new ContaPoupanca(bancoDigital, 2222, cliente3);
        cp3.depositar(500);
        cp3.sacar(100);
        cp3.imprimirSaldo();

        Conta cp4 = new ContaPoupanca(bancoDigital, 2222, cliente4);
        cp4.depositar(700);
        cp4.sacar(200);
        cp4.transferir(100, cp3);
        cp4.imprimirSaldo();

        cp3.imprimirSaldo();

        bancoDigital.listarContas();
        
    }
}
