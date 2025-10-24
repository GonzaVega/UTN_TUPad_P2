package trabajospracticosp2.TrabajoPractico8.Ejercicio2;

public class Divisor {
  int dividir(int a, int b) {
    if (a == 0 ||b == 0) {
      throw new ArithmeticException("División por cero no permitida");
    }
    return a / b;
  }
}
