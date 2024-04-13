package lesson13.hw2;
/*
Создать массив типа Инструмент, содержащий инструменты разного типа.
В цикле вызвать метод play() для каждого инструмента, который должен выводить строку "Играет такой-то инструмент, с такими-то характеристиками".
 */
public class Main {
    public static void printInstruments(Instruments[] instruments){
        for(Instruments instrument : instruments){
            instrument.play();
        }
    }
    public static void main(String[] args) {
        Instruments[] instruments = new Instruments[5];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(43);
        instruments[2] = new Pipe(23.4);
        instruments[3] = new Guitar(8);
        instruments[4] = new Drum(54);

        printInstruments(instruments);
    }
}
