Feature: User Login

  Scenario: Verify login with valid credentials
    Given you are on OrangeHRM page
    When you enter username and password
    Then you verigy login success

  Scenario Outline: Verify login with multiple credentials
    Given you are on OrangeHRM page
    When you enter "<username>" and "<password>"
    Then you verigy login success

    Examples: 
      | username | password |
      | admin    | admin343 |
      | Admin    | admin123 |
