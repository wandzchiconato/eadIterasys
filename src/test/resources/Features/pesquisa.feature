Feature: Busca Curso
  Scenario: Efetuar a busca de um curso
    Given que o visitante acessa o site da Iterasys
    And preenche o termo de busca como "Mantis"
    And clica no botao Lupa
    Then visualiza a lista de cursos relacionados
    When seleciona o curso "Mantis" na lista
    Then visualiza o titulo como "Mantis" e o preco como "R$ 49,99"

