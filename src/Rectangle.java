// Класс Rectangle представляет прямоугольник
class Rectangle {
    private double width;  // Ширина прямоугольника
    private double height; // Высота прямоугольника

    // Конструктор класса Rectangle, принимает ширину и высоту
    public Rectangle(double width, double height) {
        // Проверка, что ширина и высота положительные
        if (width <= 0 || height <= 0) {
            // Если хотя бы одно из значений не положительное, выбрасываем исключение
            throw new RuntimeException("There is no figure with such parameters.");
        }
        // Установка значений ширины и высоты c помощью геттеров
        this.width = width;
        this.height = height;
    }

    // Метод для вычисления площади прямоугольника
    public double area() {
        return width * height;
    }

    // Метод для вычисления периметра прямоугольника
    public double perimeter() {
        return 2 * (width + height);
    }
}

