package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;
/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person extends Passport{

     Address adrs;
     
      public Person (String name, String surname){
      super(name, surname);
    }
    
     public Person (String name, String surname, Address adrs){
      super(name, surname);
      this.adrs = adrs;
    }
    public Person (String surname, String name, String patronymic, Address adrs){
      super(surname, name, patronymic);
      this.adrs = adrs;
        
    }
    
    /*
     * TODO(Студент): Создайте класс Address.
     *
     * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
     *
     * 2. Создайте класс, видимый из пакета. Подумайте о том
     *    Какое имя должен иметь класс, если он объявленн в этом
     *    файле.
     *
     * 3. Подумайте над тем, какие переменные должены быть
     *    определены в классе.
     *
     * 4. Подумайте над тем, какие методы должны быть объявлены
     *    в классе.
     */

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     * @return имя человека в виде строки.
     */
    
    
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
    
   

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        if (adrs == null){
            return "Адрес не задан";
        } else
        return adrs.toString();
    }
}