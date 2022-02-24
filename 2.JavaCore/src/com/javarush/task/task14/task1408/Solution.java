package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            if (country.equalsIgnoreCase("Belarus")) {
                return new BelarusianHen();
            }
            if (country.equalsIgnoreCase("Russia")) {
                return new RussianHen();
            }
            if (country.equalsIgnoreCase("Ukraine")) {
                return new UkrainianHen();
            }
            //напишите тут ваш код
            return new MoldovanHen();
        }
    }


}
