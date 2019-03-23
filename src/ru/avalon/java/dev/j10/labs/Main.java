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
        Address smithAddress = new Address (1,"");
        Passport passportIvanov = new Passport("1234", "222333", "Иванов", "Иван", "Иванович", LocalDate.of(1990, 1, 31), LocalDate.of(2018, 1, 31), "ТП№1 ОУФМС" );
        Passport passportSmith = new Passport("5678", "999000", "Smith", "John Edvard", LocalDate.of(1990, 1, 31), LocalDate.of(2018, 1, 31), "NY 1st Avenue" );
        
        Person ivanov = new Person(passportIvanov, ivanovAddress);
        
        Person smith = null;
        smith = new Person (passportSmith, smithAddress );
        
        

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
        String smith1 = passportSmith.getFullName ();
        String ivanAddress = ivanov.getAddress();
        String smithAddress1 = smith.getAddress();

       
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
