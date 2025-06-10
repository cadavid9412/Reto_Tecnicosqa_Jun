@e2e
Feature: Datepicker interactions

  @firstScenario
  Scenario: Booking an appointment by selecting a date on the calendar
    Given the user has opened the jQuery Datepicker main page
    When the user selects the fifteenth day of the current month
    Then the selected date should be "06/15/2025"

  @secondScenario
  Scenario: Selecting a specific date in a different month
    Given the user has opened the jQuery Datepicker main page
    When the user selects the tenth day of the next month
    Then the selected date should be "07/10/2025"

  @thirdScenario
  Scenario: Validation of locked input field
    Given the user has opened the jQuery Datepicker main page
    When the user types the date "07/04/2024" into the text field
    Then the selected date should be "07/04/2024"
