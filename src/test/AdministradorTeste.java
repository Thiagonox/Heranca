package test;

import domain.Administrador;

public class AdministradorTeste {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Moacir Rocha", "Rua 1", "123456789", 1, 5000, 14, 400);
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Porcentagem imposto: " + administrador.getImposto() + "%");
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário: " + administrador.calcularSalario());
    }
}
