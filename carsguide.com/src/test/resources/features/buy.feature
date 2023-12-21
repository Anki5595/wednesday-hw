Feature: Search functionality
  In Order to perform Search functionality
  As a User
  I should verify different scenarios for Search functionality

  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
#    Then I should see the make "<make>" in results

    Examples:
      | make   | model    | location  | price   |
      | Suzuki | Alto     | NSW - All | $5,000  |
      | Honda  | CR-V     | NT - All  | $10,000 |
      | Audi   | A7       | NSW - All | $35,000 |
      | BMW    | 1 Series | QLD - All | $40,000 |
      | Kia    | Rio      | NSW - All | $2,500  |
      | Toyota | Aurion   | NT - All  | $25,000 |


  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
#    Then I should see the make "<make>" in results

    Examples:
      | make   | model    | location  | price   |
      | Suzuki | Alto     | NSW - All | $5,000  |
      | Honda  | CR-V     | NT - All  | $10,000 |
      | Audi   | A7       | NSW - All | $35,000 |
      | BMW    | 1 Series | QLD - All | $40,000 |
      | Kia    | Rio      | NSW - All | $2,500  |
      | Toyota | Aurion   | NT - All  | $25,000 |