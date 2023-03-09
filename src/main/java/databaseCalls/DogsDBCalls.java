package databaseCalls;

import lombok.SneakyThrows;
import pojo.Dog;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static databaseCalls.DataBaseUtils.executeQueryActions;

public class DogsDBCalls {
    @SneakyThrows
    public List<Dog> getDogsAll() {
        String query = "select * from pets.dog;"; //check one monent
        List<Dog> dogList = new ArrayList<>();
        try (ResultSet response = executeQueryActions(query)) {
            while (response.next()) {
                Dog dog = Dog.builder()
                        .dogId(response.getInt("DOG_ID"))
                        .dogName(response.getString("DOG_NAME"))
                        .birthYear(response.getInt("BIRTH_YEAR"))
                        .build();
                dogList.add(dog);
            }
            return dogList;
        }

    }

}
