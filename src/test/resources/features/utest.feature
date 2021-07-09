@stories
  Feature: utest automation
    As a user I want to sign up at utest web page with my log information to access to utest services
  @scenario1
    Scenario Outline:
    Given than the user wants to sign up at utest

    When the user enter its log
      |strFirstName|strLastName|strEmail|strBirthDay|strBirthMonth|strBirthYear|strLanguages|strCity|strZip|strCountry|strPC|strVersion|strLanguage|strBrand|strModel|strOS|strPassword|
      |<strFirstName>|<strLastName>|<strEmail>|<strBirthDay>|<strBirthMonth>|<strBirthYear>|<strLanguages>|<strCity>|<strZip>|<strCountry>|<strPC>|<strVersion>|<strLanguage>|<strBrand>|<strModel>|<strOS>|<strPassword>|
    Then the user can see
      |strMessage|
      |<strMessage>|
    Examples:
      |strFirstName|strLastName|strEmail|strBirthDay|strBirthMonth|strBirthYear|strLanguages|strCity|strZip|strCountry|strPC|strVersion|strLanguage|strBrand|strModel|strOS|strPassword|strMessage|
      |Sandra      |López      |slopez@example.com|10|April       |1995        |Spanish     |Malaga |29007 |Spain     | Linux|Ubuntu   |Spanish    |Apple   |iPhone  |iOS 2.2|Holi123456*|Complete Setup|