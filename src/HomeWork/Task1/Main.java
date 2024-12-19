package HomeWork.Task1;

import HomeWork.Task1.dao.Impl.AnimalDaoImpl;
import HomeWork.Task1.dao.Impl.PersonDaoImpl;
import HomeWork.Task1.enums.Gender;
import HomeWork.Task1.model.Animal;
import HomeWork.Task1.model.Person;
import HomeWork.Task1.service.Impl.AnimalServiceImpl;
import HomeWork.Task1.service.Impl.PersonServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonDaoImpl personDao = new PersonDaoImpl();
        PersonServiceImpl personService = new PersonServiceImpl(personDao);
        AnimalDaoImpl animalDao = new AnimalDaoImpl();
        AnimalServiceImpl animalService = new AnimalServiceImpl(animalDao);
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        while(isTrue) {
            System.out.println("""
                    1. Person
                    2. Animal
                    """);
            switch (scanner.nextLine()){
                case "1"->{
                    boolean isCheck = true;
                    while(isCheck) {
                        System.out.println("""
                                1. add
                                2. get By ID
                                3. get All
                                4. sort by name
                                5. filter by gender
                                6. clear
                                7. log out
                                """);
                        switch (scanner.nextLine()){
                            case "1"->{
                                List<Person> personList = new ArrayList<>(Arrays.asList(new Person(1L, "Ainura", 20, Gender.FEMALE),
                                        new Person(2L, "Aidarkan", 22, Gender.MAlE),
                                        new Person(3L,"Aksamai", 23, Gender.FEMALE)
                                        ));

                                System.out.println(personService.add(personList));
                            }
                            case "2"->{
                                System.out.println(personService.getById(1L));
                            }
                            case "3"->{
                                System.out.println(personService.getAll());
                            }
                            case "4"->{
                                System.out.println("Sort ascending: ");
                                System.out.println(personService.sortByName(1));
                                System.out.println("Sort descending");
                                System.out.println(personService.sortByName(2));
                            }
                            case "5"->{
                                System.out.println("Sort ascending: ");
                                System.out.println(personService.filterByGender(1));
                                System.out.println("Sort descending");
                                System.out.println(personService.filterByGender(2));
                            }
                            case "6"->{
                                System.out.println(personService.clear());
                            }
                            case "7"->{
                                isCheck = false;
                            }
                        }
                    }
                }case "2"->{
                    boolean isCheck = true;
                    while(isCheck) {
                        System.out.println("""
                                1. add
                                2. get By ID
                                3. get All
                                4. sort by name
                                5. filter by gender
                                6. clear
                                7. log out
                                """);
                        switch (scanner.nextLine()){
                            case "1"->{
                                List<Animal> animalList = new ArrayList<>(Arrays.asList(new Animal(1L, "Dog", 2, Gender.FEMALE),
                                        new Animal(2L, "Cat", 3, Gender.MAlE),
                                        new Animal(3L,"Frog", 1, Gender.FEMALE)
                                ));

                                System.out.println(animalService.add(animalList));
                            }
                            case "2"->{
                                System.out.println(animalService.getById(1L));
                            }
                            case "3"->{
                                System.out.println(animalService.getAll());
                            }
                            case "4"->{
                                System.out.println("Sort ascending: ");
                                System.out.println(animalService.sortByName(1));
                                System.out.println("Sort descending");
                                System.out.println(animalService.sortByName(2));
                            }
                            case "5"->{
                                System.out.println("Sort ascending: ");
                                System.out.println(animalService.filterByGender(1));
                                System.out.println("Sort descending");
                                System.out.println(animalService.filterByGender(2));
                            }
                            case "6"->{
                                System.out.println(animalService.clear());
                            }
                            case "7"->{
                                isCheck = false;
                            }
                        }
                    }
                }
            }
        }

    }
}
