package test;

import domain.Fornecedor;

public class FornecedorTeste {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setNome("Magnesita");
        fornecedor.setEndereco("Rua 1");
        fornecedor.setTelefone("123456789");
        fornecedor.setValorCredito(100000);
        fornecedor.setValorDivida(5000);

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor de Crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor de Dívida: " + fornecedor.getValorDivida());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}
