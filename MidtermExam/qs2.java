//Name: Syeda Maham Jafri

// class Bird {
//     void fly() {
//         System.out.println("This bird can fly.");
//     }

//     void sing() {
//         System.out.println("This bird can sing.");
//     }
// }

// class Ostrich extends Bird {
//     // Ostriches cannot fly
//     @Override
//     void fly() {
//         throw new UnsupportedOperationException("Ostriches cannot fly.");
//     }
// }

//MODIFIED CODE

abstract class Bird{
    String getBirdName();

}
interface canfly{
    void fly();
}
interface canSing(){
    void sing();
}

class Ostrich extends Bird implements canSing{

   String getBirdName(){
    return "Ostrich";
   }

   void sing(){
    System.out.println(getBirdName() + " can sing");
   }
}
class BirdcanFly extends Bird implements canfly{

   String getBirdName(){
    return "Duck";
   }

   void fly(){
      System.out.println(getBirdName() + " can fly")
   }
}
 


