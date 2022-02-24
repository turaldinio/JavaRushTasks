package com.javarush.task.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронизированные заметки
*/

public class Solution {

    public static void main(String[] args) {
        Thread thread = new Note();
        thread.start();

    }

    public static class Note extends Thread {
        @Override
        public void run() {
            for (int a = 0; a < 100; a++) {
                addNote(0, "turaldinio");
            }
            for (int a = 0; a < 100; a++) {
                removeNote(0);
            }
        }

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
                notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note;
                note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }

}
