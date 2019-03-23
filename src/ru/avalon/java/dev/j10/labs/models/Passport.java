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
    private String serial;
    private String number;
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate birthDate;
    private LocalDate dateOfIssue;
    private String issuingAuthority;
    
   // String nnn = String.format("%4.4s", serial);

    public Passport(String serial, String number, String surname, String name, LocalDate birthDate, LocalDate dateOfIssue, String issuingAuthority) {
        this.name = name;
        this.surname = surname;
        this.serial = serial;
        this.number = number;
        this.birthDate = birthDate;
        this.dateOfIssue = dateOfIssue;
        this.issuingAuthority = issuingAuthority;
    }

    public Passport( String serial, String number, String surname, String name, String patronymic, LocalDate birthDate, LocalDate dateOfIssue, String issuingAuthority) {
        this(serial, number,surname, name, birthDate, dateOfIssue, issuingAuthority);
        this.patronymic = patronymic;
    }
       
   public String getSecondName(){
         if (name.contains(" ")) {
                int index = name.lastIndexOf(" ");                
                   return name.substring(index+2);
             }
         else return "Нет второго имени";
    }
 
     public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
       // patronymic.equals("")
        if ( patronymic == null || patronymic.equals("")) 
            { if (name.contains(" ")) {
                int index = name.lastIndexOf(" ");
                
                   return name.substring(0,index+2) + ". " + surname;
             } else  {
                return name + surname;
                }
             }
        else {return surname + " " + name + " " + patronymic;}
        
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }
}
