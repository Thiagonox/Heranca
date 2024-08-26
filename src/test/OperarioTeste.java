package test;

import domain.Operario;

public class OperarioTeste {
    public static void main(String[] args) {
        Operario operario = new Operario("Emanuel Vieira", "Rua 1", "123456789", 1, 3000, 12, 40000, 0.7);
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");
        System.out.println("Salário: " + operario.calcularSalario());
    }
}
