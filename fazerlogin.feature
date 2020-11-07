Feature: Validar tela de Login

  Scenario: fazer login com usuario Valido
    Given usuario acessou o app
    When preenchido o usuario e senha valido
    Then deve ser apresentado a tela inicial do App
    
    

