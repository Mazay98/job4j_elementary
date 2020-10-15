package ru.job4j.condition;

public class SwitchWeek {
    public String nameOfDay(int day) {
        String name;
        switch (day) {
            case 7:
                name = "Воскресенье";
                break;
            case 6:
                name = "Суббота";
                break;
            case 5 :
                name = "Пятниц";
                break;
            case 4:
                name = "Четверг";
                break;
            case 3:
                name = "Среда";
                break;
            case 2:
                name = "Вторник";
                break;
            case 1:
                name = "Понедельник";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }
}