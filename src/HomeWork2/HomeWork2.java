package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {
        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
    for (int i = 1; i < 101; i++){
        System.out.print(i + "a ");
        continue;
    }
        // Задание №2
        // Дано:

        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
        int ageChildren = 13;
        System.out.println();
        if (ageChildren > 0 && ageChildren <=6 ) {
            System.out.println("в сад");
        } else if (ageChildren>6 && ageChildren <=11 ) {
            System.out.println("в младшую школу");
        } else if (ageChildren>12 && ageChildren <=17) {
            System.out.println(" в среднюю школу");
        } else {
            System.out.println(" в универ");
        }
        // Задание №3
        // Дано:
        boolean chicken = true;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = false;
        boolean sausage = false;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        if (chicken && vegetables && sour && toast) {
            System.out.println(" Цезарь готов!");
        } else if  (vegetables && (sausage || chicken) && eggs) {
            System.out.println("Оливье готов!");
        } else if  (vegetables) {
            System.out.println("Овощной салат готов");
        } else {
            System.out.println("У меня ничего нет");
        }

        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.
        Cat cat = new Cat("Barsik",5);
        Dog dog = new Dog("Tuzik",6);
        System.out.println(cat);
        System.out.println(dog);

        // Продвинутый уровень
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        int count = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        if (increment<=0){
            System.out.println("Число отрицательное");
        }  else {
            while (result < 1000000) {
                result += increment;
                count++;
            }
        }

        System.out.println("Количество итераций "+ count);

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        int[] array = { 1,1,1,1,1,1,1,1,1,1};
        for (int i = 0; i < array.length; i++) {
            if (i%2==0){
                array[i]=0;
            }
            System.out.println(array[i]);
        }
        // Задание №3:
        // Дано:
        boolean hasFuel = false;
        boolean hasElectricsProblem =true;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = true;
        int countGarage = (hasFuel ? 1 : 0) + (hasElectricsProblem ? 1 : 0) + (hasMotorProblem ? 1 : 0) + (hasWheelsProblem ? 1 : 0);
        System.out.println(countGarage);
        int chek = 0;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.

        if (!hasElectricsProblem & !hasMotorProblem & !hasTransmissionProblem & !hasWheelsProblem & hasFuel){
               chek += 1000;
            System.out.println("С Вас, за консультацию и бензин 1000 рублей ");
        }
        if (hasMotorProblem) {
            chek += 10000;
            System.out.println("У Вас сломан двигатель, за ремонт 10 000 рублей");
        }
        chek += 5000;
        System.out.println("у Вас проблемы с электрикой, с вас 5000 рублей ");
        if (hasTransmissionProblem) {
            chek += 4000;
            System.out.println("У вас проблемы с коробкой передач, с Вас 4000");
        }
        if (hasWheelsProblem) {
            chek += 2000;
            System.out.println("Если у машины проблема с колесами, то чинят и берут 2000" );

        }
        if ( countGarage == 2) {
            double endPrice = chek/100*10;
            System.out.println("Ваша скидка " + endPrice);
            System.out.println("Итого:" + (chek-endPrice));

        }
        if (hasTransmissionProblem &&( hasElectricsProblem || hasMotorProblem )) {
            double endPrice2 = chek/100*20;
            System.out.println("Ваша скидка " + endPrice2);
            System.out.println("Итого:" + (chek-endPrice2));
        }



    }
}
