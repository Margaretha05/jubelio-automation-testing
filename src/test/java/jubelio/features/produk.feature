Feature: Product Page
  Background: Login to jubelio
    Given login page jubelio
    When input correct email
    And input correct password
    And click login button
    Then user in on dashboard page

  @Positive
  Scenario: Add Non-Varian Produk
    Given in review page
    When click add new
    And input detail barang
    And upload product image
    And input variasi barang
    And input other field
    And click simpan button