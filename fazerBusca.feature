Feature: Fazer Busca

  Scenario: Buscar Loja
    Given usuario está logado no APP Loja
    When fazer a busca de uma loja pelo campo Busca Loja
    Then Deve ser apresentado a loja pesquisada

  Scenario: Buscar Loja
    Given usuario está logado no APP Shopping
    When fazer a busca de um Shopping pelo campo Busca Shopping
    Then Deve ser apresentado o Shopping pesquisada



