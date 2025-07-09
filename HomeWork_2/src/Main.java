//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        System.out.println("Задача 1");
        double dog = 8.0;
        double cat = 3.6;
        int paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("");

        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("");

        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("");

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
        System.out.println("");

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        System.out.println("");

        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общая масса двух бойцов равна " + totalWeight);
        var diffBetweenMasses = Math.abs(boxer1Weight - boxer2Weight);
        System.out.println("Разница между массами бойцов равна " + diffBetweenMasses);
        System.out.println("");

        System.out.println("Задача 7");
        var weight1 = 10;
        var weight2 = 3.0;
        var remainderDivision = 0.0;
        if(weight1 >= weight2)
            remainderDivision = weight1 % weight2;
        else remainderDivision = weight2 % weight1;
        System.out.println("Остаток от деления между двумя весами равен " + remainderDivision);
        System.out.println("");

        System.out.println("Задача 8");
        var timeTotal = 640;
        var timeEach = 8;
        var employeesTotal = timeTotal / timeEach;
        System.out.println("Всего работников в компании — " + employeesTotal + " человек");
    }
}