# Projeto de Gestão de Pessoas

Este projeto é uma aplicação Java para gerenciar diferentes tipos de pessoas, incluindo empregados, administradores, operários, vendedores e fornecedores. A aplicação permite calcular salários, gerenciar informações de contato e outras funcionalidades específicas para cada tipo de pessoa.

## Estrutura do Projeto

- `src/domain`: Contém as classes de domínio que representam as entidades do sistema.
- `src/test`: Contém as classes de teste para verificar o funcionamento das classes de domínio.

## Classes de Domínio

### Pessoa
Classe base para todas as pessoas no sistema.
- Atributos: `nome`, `endereco`, `telefone`
- Métodos: Getters e setters

### Empregado
Extende `Pessoa` e adiciona atributos específicos para empregados.
- Atributos: `codigoSetor`, `salarioBase`, `imposto`
- Métodos: Getters e setters, `calcularSalario()`

### Administrador
Extende `Empregado` e adiciona o atributo `ajudaDeCusto`.
- Atributos: `ajudaDeCusto`
- Métodos: Getters e setters, `calcularSalario()` (sobrescrito)

### Operario
Extende `Empregado` e adiciona os atributos `valorProducao` e `comissao`.
- Atributos: `valorProducao`, `comissao`
- Métodos: Getters e setters, `calcularSalario()` (sobrescrito)

### Vendedor
Extende `Empregado` e adiciona os atributos `valorVendas` e `comissao`.
- Atributos: `valorVendas`, `comissao`
- Métodos: Getters e setters, `calcularSalario()` (sobrescrito)

### Fornecedor
Extende `Pessoa` e adiciona os atributos `valorCredito` e `valorDivida`.
- Atributos: `valorCredito`, `valorDivida`
- Métodos: Getters e setters, `obterSaldo()`

## Classes de Teste

### PessoaTeste
Testa a classe `Pessoa`.

### EmpregadoTeste
Testa a classe `Empregado`.

### AdministradorTeste
Testa a classe `Administrador`.

### OperarioTeste
Testa a classe `Operario`.

### VendedorTeste
Testa a classe `Vendedor`.

### FornecedorTeste
Testa a classe `Fornecedor`.

## Como Executar

1. Clone o repositório.
2. Importe o projeto em sua IDE (recomendado: IntelliJ IDEA).
3. Execute as classes de teste localizadas no pacote `src/test` para verificar o funcionamento das funcionalidades.

## Requisitos

- Java 8 ou superior
- IDE para desenvolvimento Java (recomendado: IntelliJ IDEA)

## Autor

Thiagonox
