Feature: Job Search Test
  In Order to job search functionality
  As a User
  I should verify different scenarios for Search functionality

  Scenario Outline: User should verify job search result using different data set
    Given I am on Home page
    And I enter job title "<jobTitle>"
    And I enter location "<location>"
    And I enter distance "<distance>"
    And I click on search more option link
    And I enter salary minimum "<salaryMin>"
    And I enter salary maximum "<salaryMax>"
    And I select salary type "<salaryType>"
    And I select job type "<jobType>"
    And I click on find Jobs
    Then I verify the result "<result>"
    Examples:
      | jobTitle    | location | distance | salaryMin | salaryMax | salaryType | jobType   | result                                     |
      | Tester      | Harrow   | 5 miles  | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow onthe Hill |
      | Team Leader | london   | 7 miles  | 2000      | 5000      | Per month  | Part Time | Prt Time jobs in London                    |





