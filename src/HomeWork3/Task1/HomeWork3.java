package HomeWork3.Task1;

import java.io.*;

public class HomeWork3 {
    //Базовый уровень
    //Задача №1
    //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
    //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
    //Необходимо:
    // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
    // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
    // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
    // 3. Создать два экземпляра этих классов, и вызвать методы характерные для них

    public static void main(String[] args) throws IOException {
        TOYOTA toyota = new TOYOTA("Toyota");
        Lada lada = new Lada("Lada");
        System.out.println(lada + " " + lada.startDrive());
        System.out.println(lada + " " + lada.carStop());
        System.out.println(lada + " " + lada.lights());
        System.out.println(lada +" " + lada.destroy());
        System.out.println(toyota + " " + toyota.startDrive());
        System.out.println(toyota + " " + toyota.carStop());
        System.out.println(toyota + " " + toyota.startDrive());
        System.out.println(toyota + " "+ toyota.playMusic());

        //Задача №2
        //Необходимо:
        // 1. Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 2. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"

        String path = "C:\\Users\\boldirevvk\\IdeaProjects\\HomeWork1\\src\\HomeWork3\\Task1\\my_first_file.txt";
        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line;
            String temp = "";
            while ((line = bf.readLine())!=null ) {
                 temp += line + " " ;
             }
            System.out.println(temp);
        } catch (IOException e) {
            e.printStackTrace();

            //Задача №3
            //Необходимо:
            // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
            // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
            // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
            // 4. Записать в файл "report.txt" данные из объекта класса.
            // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300

            Financialrecord fr = new Financialrecord(500, 300);
            File file = new File("C:\\Users\\boldirevvk\\IdeaProjects\\HomeWork1\\src\\report.txt");

            FileWriter fileWriter = new FileWriter(file, true);
            file.createNewFile();

            fileWriter.write(fr.getIncomes() + " "+ fr.getOutcomes() );

            fileWriter.flush();
            fileWriter.close();









        }







    }



}
