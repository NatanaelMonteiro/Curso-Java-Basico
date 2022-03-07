package br.com.natanael.aula43EX;

public class TesteBanco {
    
    public static void main(String[] args) {
        
        System.out.println("*** Teste ContaBancaria ***");
        
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Natanael");
        contaSimples.setNumConta("111");
        
        contaSimples.depositar(100);
        
        realizarSaque(contaSimples, 50);
        
        realizarSaque(contaSimples, 55);
        
        System.out.println(contaSimples);
        
        System.out.println("*** Teste ContaPoupança ***");
        
        ContaPoupanca contaPoupacanca = new ContaPoupanca();
        contaPoupacanca.setNomeCliente("Cliente Natanael Poupança");
        contaPoupacanca.setNumConta("222");
        contaPoupacanca.setDiaRendimento(3);
        
        contaPoupacanca.depositar(100);
        
        realizarSaque(contaPoupacanca, 20);
        
        realizarSaque(contaPoupacanca, 10);
        
        if (contaPoupacanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupacanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }
        
        System.out.println(contaPoupacanca);
        
        System.out.println("*** Teste ContaEspecial ***");
        
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Natanael Especial");
        contaEspecial.setNumConta("333");
        contaEspecial.setLimite(50);
        
        contaEspecial.depositar(100);
        
        realizarSaque(contaEspecial, 50);
        
        realizarSaque(contaEspecial, 70);
        
        realizarSaque(contaEspecial, 80);
        
        System.out.println(contaEspecial);
    }
    
    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }
}