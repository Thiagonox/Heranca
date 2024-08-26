package test;

import domain.Vendedor;

public class VendedorTeste {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Aparecido Fernandes", "Rua 1", "123456789", 6, 4000, 12, 100000, 2);
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor de Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao());
        System.out.println("Salário: " + vendedor.calcularSalario());
    }
}
