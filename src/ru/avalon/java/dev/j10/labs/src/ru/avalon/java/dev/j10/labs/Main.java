package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.*;
import ru.avalon.java.dev.j10.labs.commons.Address;
import java.time.*;

public class Main {

   public static void main (String args []) {
        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */
        Address ivanovAddress = new Address (123456," Санкт-Петербург, ул. Оптиков д. 1");
 
        Person ivanov = new Person("Иванов", "Иван", "Иванович", ivanovAddress);
        
        Person smith = null;
        smith = new Person ("John Edvard", "Smith" );
        
        Passport passportIvanov = new Passport("1234", "222333", "Иванов2", "Иван2", LocalDate.of(1990, 1, 31), LocalDate.of(2018, 1, 31), "fff" );
        

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        String ivan = ivanov.getFullName ();
        String smith1 = smith.getFullName ();
        String ivanAddress = ivanov.getAddress();
        String smithAddress = smith.getAddress();

       
        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        System.out.println(ivan);
        System.out.println(smith1);
        System.out.println(ivanAddress);
        System.out.println(smithAddress);
                
    }
}
