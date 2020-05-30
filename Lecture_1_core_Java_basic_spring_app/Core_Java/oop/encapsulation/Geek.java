package com.gfg.oop.encapsulation;

public class Geek {


        // private variables declared
        // these can only be accessed by
        // public methods of class
        private String geekName;
        private int geekRoll;
        private int geekAge;

        // get method for age to access
        // private variable geekAge
        public int getAge()
        {
            return geekAge;
        }

        // get method for name to access
        // private variable geekName
        public String getName()
        {
            return geekName;
        }

        // get method for roll to access
        // private variable geekRoll
        public int getRoll()
        {
            return geekRoll;
        }

        // set method for age to access
        // private variable geekage
        public void setAge( int newAge)
        {
            geekAge = newAge;
        }

        // set method for name to access
        // private variable geekName
        public void setName(String newName)
        {
            geekName = newName;
        }

        // set method for roll to access
        // private variable geekRoll
        public void setRoll( int newRoll)
        {
            geekRoll = newRoll;
        }
    }
