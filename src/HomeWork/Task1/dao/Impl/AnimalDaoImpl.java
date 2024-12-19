package HomeWork.Task1.dao.Impl;

import HomeWork.Task1.dao.GenericDao;
import HomeWork.Task1.db.DataBase;
import HomeWork.Task1.model.Animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalDaoImpl implements GenericDao<Animal> {
    @Override
    public String add(List<Animal> animals) {
        for (Animal animal : animals) {
            DataBase.animalList.add(animal);
        }
        return "Successfully added.";
    }

    @Override
    public Animal getById(Long id) {
        for (Animal animal : getAll()) {
            if(animal.getId().equals(id)){
                return animal;
            }
        }
        return null;
    }

    @Override
    public List<Animal> getAll() {
        return DataBase.animalList;
    }

    @Override
    public List<Animal> sortByName(int number) {
        List<Animal> animals = new ArrayList<>(getAll());
        if(number == 1){
            animals.sort(new Comparator<Animal>() {
                @Override
                public int compare(Animal o1, Animal o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            return animals;
        }else if(number == 2){
            animals.sort(new Comparator<Animal>() {
                @Override
                public int compare(Animal o1, Animal o2) {
                    return o2.getName().compareTo(o1.getName());
                }
            });
            return animals;
        }
        return null;
    }

    @Override
    public List<Animal> filterByGender(int number) {
        List<Animal> animals = new ArrayList<>(getAll());
        if(number == 1){
            animals.sort(new Comparator<Animal>() {
                @Override
                public int compare(Animal o1, Animal o2) {
                    return o1.getGender().compareTo(o2.getGender());
                }
            });
            return animals;
        }else if(number == 2){
            animals.sort(new Comparator<Animal>() {
                @Override
                public int compare(Animal o1, Animal o2) {
                    return o2.getGender().compareTo(o1.getGender());
                }
            });
            return animals;
        }
        return null;
    }

    @Override
    public List<Animal> clear() {
        DataBase.animalList.clear();
        return DataBase.animalList;
    }
}
