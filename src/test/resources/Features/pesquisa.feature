Feature: Busca Curso
  Scenario: Efetuar a busca de um curso clicando na lupa
    Given que o visitante acessa o site da Iterasys
    And preenche o termo de busca como "Mantis"
    And clica no botao Lupa
    Then visualiza a lista de cursos relacionados a "Mantis"
    When seleciona o curso "Mantis" na lista
    Then visualiza o titulo como "Mantis" e o preco como "R$ 49,99"

  Scenario: Efetuar a busca de um curso apertando enter
    Given que o visitante acessa o site da Iterasys
    And preenche o termo de busca como "TestLink"
    And aperta o enter
    Then visualiza a lista de cursos relacionados a "TestLink"
    When seleciona o curso "TestLink" na lista
    Then visualiza o titulo como "TestLink" e o preco como "R$ 79,99"

  Scenario Outline: Busca por Curso Simples com Clique utilizando Exemplos

    # Multiplas Linhas
  Given que o visitante acessa o site da Iterasys
  And preenche o termo de busca como <termo>
  And clica no botao Lupa
  Then visualiza a lista de cursos relacionados a <termo>
  When seleciona o curso <titulo> na lista
  Then visualiza o titulo como <titulo> e o preco como <preco>

  Examples:
  | termo    | titulo       | preco      |
  | "MANTIS"   | "Mantis"   | "R$ 49,99" |
  | "testlink" | "TestLink" | "R$ 79,99" |