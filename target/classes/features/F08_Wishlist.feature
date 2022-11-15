@smoke
Feature: F08_Wishlist | User can add items to wishlist
  Scenario: user can click on wishlist button to add item to wishlist
    When user clicks on wishlist button on this product "HTC One M8 Android L 5.0 Lollipop"
    Then success message will appear

  Scenario: user can click on wishlist button to add item to wishlist then preview in wishlist tcb
    When user clicks on wishlist button on this product "HTC One M8 Android L 5.0 Lollipop"
    Then success message will appear
    When user clicks on wishlist tab

