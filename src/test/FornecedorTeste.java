package test;

import domain.Fornecedor;

public class FornecedorTeste {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Magnesita", "Rua 1", "123456789", 1000, 340);
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor de Crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor de Dívida: " + fornecedor.getValorDivida());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}
