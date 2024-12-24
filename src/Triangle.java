// Класс Triangle представляет треугольник
class Triangle {
    //Стороны треугольника
    private double a;
    private double b;
    private double c;

    // Конструктор класса Triangle, принимает длины сторон a, b и c
    public Triangle(double a, double b, double c) {
        // Проверка, что все стороны положительные и выполняется неравенство треугольника
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            // Если одно из условий не выполнено, выбрасываем исключение
            throw new RuntimeException("There is no figure with such parameters.");
        }
        // Установка значений сторон
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Метод для вычисления площади треугольника по формуле Герона
    public double area() {
        double s = (a + b + c) / 2;
        // Площадь = √(s * (s - a) * (s - b) * (s - c))
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Метод для вычисления периметра треугольника
    public double perimeter() {
        return a + b + c;
    }
}

