package com.javarush.task.task17.task1701;

import java.util.ArrayList;
import java.util.List;

/* 
Заметки
*/

public class Solution {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class Note {

        public static final List<String> notes = new ArrayList<>();

        public synchronized static void addNote(String note) {
            notes.add(0, note);
        }

        public synchronized static void removeNote(String threadName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("Другая нить удалила нашу заметку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Нить [" + threadName + "] удалила чужую заметку [" + note + "]");
            } else {
                System.out.println("Нить [" + threadName + "] удалила свою заметку [" + note + "]");
            }
        }
    }

    public static class NoteThread extends Thread {
        @Override
        public void run() {
            for (int a = 0; a < 1000; a++) {
                Note.addNote(this.getName() + "-Note" + a);

                try {
                    Thread.sleep(1);

                } catch (Exception exception) {

                }
                Note.removeNote(this.getName());
            }
        }
    }
}
