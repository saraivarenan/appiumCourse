Feature: Validar tela de Login

  Scenario: fazer login com usuario Valido
    Given usuario acessou o app
    When preenchido o usuario e senha valido
    Then deve ser apresentado a tela inicial do App

  Scenario: Fazer login com usuario invalido
    Given usuario informamou a credencial de um usuario que não existe
    When clicado em Entrar
    Then o sistema irá apresentar mensagem de usuário ou senha invalido

    Scenario: Validar campos obrigatórios
      Given o usuario acessou o app
      When clicado em entrar - campos obrigatórios
      Then o sistema deve apresentar mensagem de campos obrigatórios


