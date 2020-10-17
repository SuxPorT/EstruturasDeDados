package array;

import array.classes.Schedule;

public class Exercise_03 {

    public static void main(String[] args) {
        Schedule phoneBook = new Schedule(100);

        for (int i = 0; i < 20; i++) {
            phoneBook.add("Aluno " + i, i * 11);
        }

        phoneBook.list();

        for (int i = 0; i < 5; i++) {
            phoneBook.remove();
        }

        phoneBook.list();
    }
}