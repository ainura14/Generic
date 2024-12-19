package HomeWork.Task1.dao.Impl;

import HomeWork.Task1.dao.GenericDao;
import HomeWork.Task1.db.DataBase;
import HomeWork.Task1.model.Person;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class PersonDaoImpl implements GenericDao<Person> {
    @Override
    public String add(List<Person> newPerson) {
        for (Person person : newPerson) {
            DataBase.personList.add(person);
        }
        return "Successfully added.";
    }

    @Override
    public Person getById(Long id) {
        for (Person person : getAll()) {
            if(person.getId().equals(id)){
                return person;
            }
        }
        return null;
    }

    @Override
    public List<Person> getAll() {
        return DataBase.personList;
    }

    @Override
    public List<Person> sortByName(int number) {
        List<Person> personList = new ArrayList<>(getAll());
        if(number == 1) {
            personList.sort(new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            return personList;
        }else if(number == 2){
            personList.sort(new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o2.getName().compareTo(o1.getName());
                }
            });
            return personList;
        }
        return null;
    }

    @Override
    public List<Person> filterByGender(int number) {
        List<Person> personList = new ArrayList<>(getAll());
        if(number == 1){
            personList.sort(new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.getGender().compareTo(o2.getGender());
                }
            });
            return personList;
        }else if(number == 2){
            personList.sort(new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o2.getGender().compareTo(o1.getGender());
                }
            });
            return personList;
        }
        return null;
    }

    @Override
    public List<Person> clear() {
        DataBase.personList.clear();
        return DataBase.personList;
    }
}
