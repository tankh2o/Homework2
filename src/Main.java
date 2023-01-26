public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerFirstWeight = 78.2;
        var boxerSecondWeight = 82.7;
        var totalWeightBoxer = boxerFirstWeight + boxerSecondWeight;
        System.out.println("Общий вес двух боксеров " + totalWeightBoxer + " кг.");
        var weightDifferenceBoxer = boxerSecondWeight - boxerFirstWeight;
        System.out.println("Разница веса двух боксёров " + weightDifferenceBoxer + " кг.");

        var differenceWeightBoxer = boxerFirstWeight - boxerSecondWeight;
        System.out.println("Разница веса спортсменов " + differenceWeightBoxer + " кг.");
        var differenceWeight = (boxerSecondWeight - boxerFirstWeight) % totalWeightBoxer;
        System.out.println("Это будет наш остаток " + differenceWeight + " кг!");

        var totalHours = 640;
        var hoursWorker = 8;
        var quantityWorker = totalHours / hoursWorker;
        System.out.println("Всего работников в компании - " + quantityWorker + " человек");
        var newWorker = 94;
        quantityWorker = quantityWorker + newWorker;
        var newDivisionHours = totalHours / quantityWorker;
        System.out.println("Если в компании работает " + quantityWorker + " человека, то всего " + newDivisionHours + " часа работы может быть поделено между сотрудниками.");
    }
}