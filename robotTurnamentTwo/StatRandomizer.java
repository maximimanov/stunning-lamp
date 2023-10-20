package robotTurnamentTwo;

import java.util.Random;

class StatRandomizer {
    // разные рандом методы

    Random rand = new Random();
    private int maxMass = 120;
    private int minMass = 30;
    private int maxRoll = 7;

    int roll(){
        return rand.nextInt(maxRoll);
    } //бросок кубика

    int getNameNum() {
        return rand.nextInt(100, 1000);
    } // цифры для имении 100-1000

    int getSeries() {
        return getNameNum()* 10;
    } // цифры для серийного номераю просто умножаем на 10


    int getMass() {
        return rand.nextInt(minMass, maxMass);
    } // масса от 30 до 120. от массы расчитываются остальные параметры
}
