Feature:  Testing explicit features

Scenario: Verify successful login
       Given I login to the application with "Test" and "pass" as password
       When  I click on "Login" button
       Then I should be able to see "Welcome" message
