package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg = new Zerg();
        zerg.name = "asasd";
        Zerg zer1 = new Zerg();
        zer1.name = "as";
        Zerg zer3 = new Zerg();
        zer3.name = "q";
        Zerg zer4 = new Zerg();
        zer4.name = "ewf";
        Zerg zer5 = new Zerg();
        zer5.name = "koli";
        Protoss protoss=new Protoss();
        protoss.name="2rge";
        Protoss protoss1=new Protoss();
        protoss1.name="eorngbe";
        Protoss protoss2=new Protoss();
        protoss2.name="jbnergq";
        Terran terran1=new Terran();
        terran1.name="21";
        Terran terran2=new Terran();
        terran2.name="g34g";
        Terran terran3=new Terran();
        terran3.name="b344";
        Terran terran4=new Terran();
        terran4.name="yf93bg";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
