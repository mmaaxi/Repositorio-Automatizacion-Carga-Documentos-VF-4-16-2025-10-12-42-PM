Feature: Document Upload in Unsupported Format

  Scenario: Attempt to upload a document in an unsupported format
    Given The user is on the document upload page
    When The user selects a file with an unsupported format
    Then The system rejects the file and displays an error message