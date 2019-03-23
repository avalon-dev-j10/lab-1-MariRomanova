package ru.avalon.java.dev.j10.labs.commons;
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


public class Address {
    int index;
    String city;
    
    public Address (int index, String city) {
        this.index = index;
        this.city = city;
    }
    
    
     public String toString() {
  return " Адрес " + index + city;
}
}