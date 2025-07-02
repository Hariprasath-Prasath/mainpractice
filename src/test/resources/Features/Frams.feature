Feature: Handling Frames in Web Applications

  Scenario: Switch to a frame and interact with elements
    
    When User Switch to the frame
    And User ender "Hariprasath"
    And User Enter "T"
    Then User switch back to the default content
    
    Scenario: Without Switch to a frame and interact with elements
    When User Enter frame "Hariprasath"
    But User send messege "unable to ender frams" user switch to frams
    
    Scenario: Handle nested frames
    When User switch to the outer frame
    And User switch to the inner frame
    And I enter "Example@gmail.com" into the input field
    Then send message "User entered successfully in nested fram" in sysout
    

