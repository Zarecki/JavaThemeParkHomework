public class TobaccoStall extends Stall implements iSecurity{

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
         if (visitor.getAge() >= 18){
         return true;}
         else return false;
    }


}
