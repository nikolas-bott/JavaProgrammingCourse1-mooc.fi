/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */

import java.util.ArrayList;

    public class Room {
        private ArrayList<Person> persons;

        public Room(){
            this.persons = new ArrayList();
        }

        public void add(Person person){
            persons.add(person);
        }

        public boolean isEmpty(){
            if(persons.isEmpty()){
                return true;
            }
            return false;
        }

        public ArrayList<Person> getPersons(){
            return persons;
        }

        public Person shortest(){

            if(persons.isEmpty()){
                return null;
            }

            int j = 0;
            for (int i = 1; i < persons.size(); i++) {
                if(persons.get(j).getHeight() > persons.get(i).getHeight()){
                    j = i;
                }
            }
            return persons.get(j);
        }

        public Person take(){

            if(persons.isEmpty()){
                return null;
            }
            Person temp = new Person(shortest().getName(),shortest().getHeight());
            persons.remove(shortest());
            return temp;
         
        }
}
