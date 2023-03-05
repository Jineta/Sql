public class Owner {
    private int ownerId;
    private String ownerName;

    public Owner (int ownerId, String ownerName){
        this.ownerId = ownerId;
        this.ownerName = ownerName;
    }

    public int getOwnerId() {
        return ownerId;
    }
    public String getOwnerName(){
        return ownerName;
    }
}
