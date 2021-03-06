package ru.avalon.java.dev.j10.labs.models;
import java.util.*;
import java.time.*;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    String serial;
    String number;
    String name;
    String secondName;
    String surname;
    String patronymic;
    LocalDate birthDate;
    LocalDate dateOfIssue;
    String issuingAuthority;
    
   // String nnn = String.format("%4.4s", serial);

    public Passport(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Passport( String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Passport(String serial, String number, String name, String surname, LocalDate birthDate, LocalDate dateOfIssue, String issuingAuthority) {
        this.serial = serial;
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.dateOfIssue = dateOfIssue;
        this.issuingAuthority = issuingAuthority;
    }
    
       
   public String getSecondName(){
         if (name.contains(" ")) {
                int index = name.lastIndexOf(" ");                
                   return name.substring(index+2);
             }
         else return "Нет второго имени";
    }

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
