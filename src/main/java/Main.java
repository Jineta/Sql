import databaseCalls.DogsDBCalls;
import databaseCalls.OwnerDBCalls;
import pojo.Dog;
import pojo.Owner;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog>  listDog=  new DogsDBCalls().getDogsAll();
        List<Owner> listOwner = new OwnerDBCalls().getOwnersAll();
        for(Dog i:listDog){
            System.out.println(i);
        }
        for(Owner i:listOwner){
            System.out.println(i);
        }
        for(Dog i:listDog){
            i.changeAge(-1);
        }
        for(Dog i:listDog){
            System.out.println(i);
        }
    }
}
