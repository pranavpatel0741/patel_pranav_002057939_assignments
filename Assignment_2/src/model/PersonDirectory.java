/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Person;

import java.util.ArrayList;

/**
 *
 * @author pranavpatel
 */
public class PersonDirectory {
    private ArrayList<Person> persons;
    
    public PersonDirectory(){
        this.persons=new ArrayList<Person>();
    }
    public ArrayList<Person> getPersons(){
     return persons;
    }
    public void setPersons(ArrayList<Person>persons){
        this.persons=persons;
    }

    /**
     *
     * @return
     */
    public Person addPerson(){
     Person p = new Person();
     persons.add(p);
     return p;
    }
    public void deletPerson(Person person){
        persons.remove(person);
    }
    public Person searchPerson (String FName){
    for(Person p : persons){
    if(p.getFName().contains(FName)){
    return p;}
    }
    return null;
        }
    
}
