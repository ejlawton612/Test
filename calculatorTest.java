class calculatorTest {
  @Test
  void twoPlusTwo() {
    var calculator = new simpleCalculator();
    assertEquals(4, calculator.add(2,2));
  }
