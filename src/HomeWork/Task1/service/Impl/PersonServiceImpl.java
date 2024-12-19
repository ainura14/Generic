package HomeWork.Task1.service.Impl;

import HomeWork.Task1.dao.Impl.PersonDaoImpl;
import HomeWork.Task1.model.Person;
import HomeWork.Task1.service.GenericService;

import java.util.List;

public class PersonServiceImpl implements GenericService<Person> {
    private final PersonDaoImpl personDao;

    public PersonServiceImpl(PersonDaoImpl personDao) {
        this.personDao = personDao;
    }

    @Override
    public String add(List<Person> t) {
        return personDao.add(t);
    }

    @Override
    public Person getById(Long id) {
        return personDao.getById(id);
    }

    @Override
    public List<Person> getAll() {
        return personDao.getAll();
    }

    @Override
    public List<Person> sortByName(int number) {
        return personDao.sortByName(number);
    }

    @Override
    public List<Person> filterByGender(int number) {
        return personDao.filterByGender(number);
    }

    @Override
    public List<Person> clear() {
        return personDao.clear();
    }
}
