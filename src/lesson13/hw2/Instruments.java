package lesson13.hw2;
/*
Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
 */
public interface Instruments {
    String key = "До мажор";
    void play();
}
