package com.javarush.task.task24.task2406;

import java.math.BigDecimal;

/* 
Наследование от внутреннего класса
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.Building building = solution.new Building();
        Solution.Apt3Bedroom apt3Bedroom = solution.new Apt3Bedroom(building);
        Solution.BigHall bigHall = solution.new BigHall(building, new BigDecimal(12));
    }

    public class Apt3Bedroom extends Building.Apartments {
        public Apt3Bedroom(Building building) {
            building.super();
        }
    }

    public class BigHall extends Building.Hall {

        public BigHall(Building building, BigDecimal square) {
            building.super(square);

        }
    }


    public class Building {

        public class Hall {
            private BigDecimal square;

            public Hall(BigDecimal square) {
                this.square = square;
            }
        }

        public class Apartments {
        }
    }


}

