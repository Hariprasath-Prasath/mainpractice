Feature: Handling Frames in Web Applications

  Scenario: Switch to a frame and interact with elements
    
    When User Switch to the frame
    And User ender "Hariprasath"
    And User Enter "T"
    Then User switch back to the default content
    
    Scenario: Without Switch to a frame and interact with elements
    When User Enter frame "Hariprasath"
    But User should receive error message

