Feature: Verify security during file upload

  Scenario: Upload document with malicious code in the filename
    Given I navigate to the upload page
    When I upload a document with 'evil<script>.txt' as the filename
    Then The system should validate the security
    And It should not allow execution of any potentially harmful code