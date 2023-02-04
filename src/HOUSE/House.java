public class House {
 public static final  int NUM_BED =9;
 public static final  int NUM_REST =9;
 private Kitchen kitchen;
 private LivingRoom livingRoom;
 private DiningRoom diningRoom;
 private RestRoom[] restRooms=new RestRoom[NUM_REST];
 private BedRoom[] bedRooms=new BedRoom[NUM_BED];
 private Yard yard;
 int contador1=0;
 int contador2=0;
 public void addRoom(BedRoom bedRoom ){
  if (contador1<bedRoom.length){
  bedRooms[contador1]=bedRoom;
  contador1++;
 }
 }
 public void addRoom(RestRoom restRoom) {
  if (contador2 < restRooms.length) {
   restRooms[contador2] = restRoom;
   contador2++;
  }
 }

 public Kitchen getKitchen() {
  return kitchen;
 }

 public void setKitchen(Kitchen kitchen) {
  this.kitchen = kitchen;
 }
}
