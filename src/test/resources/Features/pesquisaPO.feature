Feature: Busca Curso PgOb

  Scenario Outline: Busca por Curso Simples com Clique utilizando Exemplos PgOb

    # Multiplas Linhas
  Given que o visitante acessa o site da Iterasys PgOb
  And preenche o termo de busca como <termo> PgOb
  And clica no botao Lupa PgOb
  Then visualiza a lista de cursos relacionados a <termo> PgOb
  When seleciona o curso <titulo> na lista PgOb
  Then visualiza o titulo como <titulo> e o preco como <preco> PgOb

  Examples:
  | termo    | titulo       | preco      |
  | "MANTIS"   | "Mantis"   | "R$ 49,99" |
  | "testlink" | "TestLink" | "R$ 79,99" |