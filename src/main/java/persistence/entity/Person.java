package persistence.entity;

import model.PersonModel;

import javax.persistence.*;

@Entity
@Table (name = "students")
public class Person {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(name = "name")
    private  String name;

    @Column (name = "surname")
    private  String  surname;
   @Column(name = "date")
    private String date;

    public void getPerson(PersonModel model) {

        name = model.getName();
        surname = model.getSurname();
        date=model.getDate();
    }

    public Person() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setDate(String date){
        this.date= date;
    }
    public String getDate(){
        return date;
    }
}

