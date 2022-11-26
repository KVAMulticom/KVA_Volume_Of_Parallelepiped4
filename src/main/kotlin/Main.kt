// Программа 01:
// Вычисления объёма параллелепипеда по двум сторонам
// и его высоте.

fun main(args: Array<String>) {
    println(
        """
        Программа вычисления объёма параллелепипеда        
             по двум его сторонам и высоте.
    """
    )

    println("Введите размеры параллелепипеда в метрах:")
    println("Длина:")
    val side1 = readln().toInt()
    println("Ширина:")
    val side2 = readln().toInt()
    println("Высота:")
    val height = readln().toInt()

    val volume = side1 * side2 * height

    println("Объём = $volume м3")
}