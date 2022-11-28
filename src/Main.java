public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        var dog = 8;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2(){
        var dog = 8;
        dog = dog + 4;
        System.out.println(dog);

        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);

        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3(){
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4(){
        var friend = 19;
        System.out.println(friend);

        friend = friend * 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6(){
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");

        var differenceBetweenWeight = weightFirstBoxer - weightSecondBoxer;
        System.out.println("Разница между бойцами " + differenceBetweenWeight + " кг");
    }
    public static void task7(){
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var differenceBetweenWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница между бойцами " + differenceBetweenWeight + " кг");

        var differenceBetweenFighters = weightSecondBoxer % weightFirstBoxer;
        System.out.println(differenceBetweenFighters);
    }
    public static void task8(){
        var totalNumberHours = 640;
        var hoursPerEmployee = 8;
        var numberOfEmployees = totalNumberHours / hoursPerEmployee;
        System.out.println("Всего работников в компании " + numberOfEmployees + " человек");

        numberOfEmployees = numberOfEmployees + 94;
        System.out.println(numberOfEmployees);
        var numberOfHoursBetweenEmployees = numberOfEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + numberOfHoursBetweenEmployees + " часов работы может быть поделено между сотрудниками");


    }
}

