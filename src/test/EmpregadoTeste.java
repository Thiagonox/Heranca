package test;

import domain.Empregado;
import java.util.ArrayList;

public class EmpregadoTeste {
    public static void main(String[] args) {
        ArrayList<Empregado> empregados = new ArrayList<>();

        Empregado empregado1 = new Empregado();
        empregado1.setNome("Ronaldo Silva");
        empregado1.setEndereco("Rua 2");
        empregado1.setTelefone("987654321");
        empregado1.setCodigoSetor(345);
        empregado1.setSalarioBase(2000);
        empregado1.setImposto(9);
        empregados.add(empregado1);

        Empregado empregado2 = new Empregado();
        empregado2.setNome("João Santos");
        empregado2.setEndereco("Rua 3");
        empregado2.setTelefone("123456789");
        empregado2.setCodigoSetor(123);
        empregado2.setSalarioBase(1412);
        empregado2.setImposto(7.5);
        empregados.add(empregado2);

        for (Empregado empregado : empregados) {
            System.out.println("Nome: " + empregado.getNome());
            System.out.println("Endereço: " + empregado.getEndereco());
            System.out.println("Telefone: " + empregado.getTelefone());
            System.out.println("Código Setor: " + empregado.getCodigoSetor());
            System.out.println("Salário Base: " + empregado.getSalarioBase());
            System.out.println("Porcentagem imposto: " + empregado.getImposto() + "%");
            System.out.println("Salário: " + empregado.calcularSalario());
            System.out.println();
        }
    }
}
