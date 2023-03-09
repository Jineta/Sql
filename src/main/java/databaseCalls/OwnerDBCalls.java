package databaseCalls;

import lombok.SneakyThrows;
import pojo.Dog;
import pojo.Owner;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static databaseCalls.DataBaseUtils.executeQueryActions;

public class OwnerDBCalls {
    @SneakyThrows
    public List<Owner> getOwnersAll(){
        String query ="select * from pets.owner;";
        List<Owner> ownerList = new ArrayList<>();
        try (ResultSet response = executeQueryActions(query)){
            while (response.next()) {
                Owner owner =Owner.builder()
                        .ownerId(response.getInt("OWNER_ID"))
                        .ownerName(response.getString("OWNER_NAME"))
                        .build();
                ownerList.add(owner);
            }
            return ownerList;
        }

    }

}
