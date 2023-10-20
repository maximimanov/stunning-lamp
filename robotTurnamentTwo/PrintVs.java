package robotTurnamentTwo;

class PrintVs {

    // делаем табличку с параметрами роботов.
    String[] VsStats = {"   <VS>    ",// блок 2. имена параметров
                        "  <mark>   ",
                        "  <сила>    ",
                        " <ловкость> ",
                        " <здоровье> ",
                        "  <масса>   "};

    void robotVs(DefaultRobot rbt0, DefaultRobot rbt1) {
        String[] fighterBlock0 = stringBlockRobot(rbt0); //блок 1.отформатированные строки для первого робота
        String[] fighterBlock1 = rbt1.infoArr();         // блок 3. строки второго робота
        String[] demoVs = new String[fighterBlock0.length];

        for (int i = 0; i < fighterBlock0.length; i++) {// склеиваем блоки
            demoVs[i] = fighterBlock0[i] + VsStats[i] + fighterBlock1[i];
            System.out.println(demoVs[i]);
        }
        System.out.println("___________________________________");

    }

    String[] stringBlockRobot(DefaultRobot rbt) {
        // форматирование, выравниваем по правому краю
        // есть String.format метод для таких штук, но он не интуитивный, я не стал вникать глубоко и отформатировал в цикле

        int len = rbt.infoArr()[1].length(); // осторожно, прибит гвоздями индекс max length. так то нужно посчитать самую длинную строку конечно
        String[] StringArray = new String[rbt.infoArr().length];

        for (int i = 0; i < rbt.infoArr().length; i++) {
            int diff = len - rbt.infoArr()[i].length();
            StringArray[i] = (" ".repeat(diff) + rbt.infoArr()[i]);
            }
        return StringArray;
    }

}
