package com.javarush.task.task19.task1903;

import java.util.HashMap;
import java.util.Map;

/* 
Адаптация нескольких интерфейсов
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(new IncomeDate());
        System.out.println(incomeDataAdapter.getPhoneNumber());
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {//+

            return data.getCompany();
        }

        @Override
        public String getCountryName() {//+
            String countryCod = data.getCountryCode();
            String counryName = null;
            for (Map.Entry<String, String> pairs : countries.entrySet()) {
                if (pairs.getKey().equalsIgnoreCase(countryCod)) {
                    counryName = pairs.getValue();
                }
            }
            return counryName;
        }

        @Override
        public String getName() {//+
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String cod = String.valueOf(data.getCountryPhoneCode());
            StringBuilder phoneNumber = new StringBuilder();
            phoneNumber.append(data.getPhoneNumber());
            while (phoneNumber.length() != 10) {
                phoneNumber.insert(0, "0");
            }
            return String.format("+%s(%s)%s-%s-%s", cod, phoneNumber.substring(0, 3), phoneNumber.substring(3, 6),
                    phoneNumber.substring(6, 8), phoneNumber.substring(8, 10));


        }
    }


    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    }

    public static class IncomeDate implements IncomeData {

        @Override
        public String getCountryCode() {
            String kod = countries.get("Ukraine");
            return kod;
        }

        @Override
        public String getCompany() {
            return "JavaRush Ltd";
        }

        @Override
        public String getContactFirstName() {
            return "Ivan";
        }

        @Override
        public String getContactLastName() {
            return "Ivanov";
        }

        @Override
        public int getCountryPhoneCode() {
            return 38;
        }

        @Override
        public int getPhoneNumber() {
            return 501234567;
        }
    }
}