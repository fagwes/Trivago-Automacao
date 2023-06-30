#Author: Wesley de França Amorim Gomes

@Testando
Feature: Dado que eu não esteja logado, eu quero selecionar um produto dentro do site.

  @testes
  Scenario: Acessar o site http://www.trivago.com.br
    Given que eu esteja no site
    And digito o valor “Manaus” no campo de busca
    When clicar no botão Pesquisar
    And selecionar a opção Ordenar por Avaliação e Sugestões
    Then verifique o nome da lista, avaliação e o valor
    

 