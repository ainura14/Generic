package HomeWork.Task1.service.Impl;

import HomeWork.Task1.dao.Impl.AnimalDaoImpl;
import HomeWork.Task1.model.Animal;
import HomeWork.Task1.service.GenericService;

import java.util.List;

public class AnimalServiceImpl implements GenericService<Animal> {
    private final AnimalDaoImpl animalDao;

    public AnimalServiceImpl(AnimalDaoImpl animalDao) {
        this.animalDao = animalDao;
    }

    @Override
    public String add(List<Animal> animalList) {
        return animalDao.add(animalList);
    }

    @Override
    public Animal getById(Long id) {
        return animalDao.getById(id);
    }

    @Override
    public List<Animal> getAll() {
        return animalDao.getAll();
    }

    @Override
    public List<Animal> sortByName(int number) {
        return animalDao.sortByName(number);
    }

    @Override
    public List<Animal> filterByGender(int number) {
        return animalDao.filterByGender(number);
    }

    @Override
    public List<Animal> clear() {
        return animalDao.clear();
    }
}
