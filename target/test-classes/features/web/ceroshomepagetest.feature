@regression

Feature: Ceros filter test

  Background:
    Given the ceros inspire home page is loaded

  Scenario: verifies the number of Industry menu items is 16.
    When the user clicks the "Industry" filter in the ceros homepage
    Then the user should see 16 menu items displaying within the Industry dropdown in the ceros homepage

  Scenario: verifies filter addition and image headers
    When the user clicks the "Industry" filter in the ceros homepage
    And the user selects "finance" from the Industry dropdown in the ceros homepage
    And the user clicks the "Type" filter in the ceros homepage
    And the user selects "content-hub" from the Type dropdown in the ceros homepage
    And the user clicks the "Feature" filter in the ceros homepage
    And the user selects "video" from the Feature dropdown in the ceros homepage
    Then the user should see the grid image
    And the user should see the "Citywire" header in the ceros homepage
    And the user should see the "CEO Tapes" subheader in the ceros homepage
    And the user should see breadcrumbs displayed in the ceros homepage





