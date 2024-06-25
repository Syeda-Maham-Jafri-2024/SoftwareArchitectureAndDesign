//Name:Syeda Maham Jafri, 22796
//19th May 2024

// public class Product {
//     public double calculateShippingCost() {
//         // Logic to calculate standard shipping cost based on weight and dimensions
//         return calculateWeightBasedCost();
//         }
//     private double calculateWeightBasedCost() {
//         // Implementation details for weight-based cost calculation
//         return 0; // Placeholder for actual calculation
//         }
// }

// public class DigitalProduct extends Product {
//     @Override
//     public double calculateShippingCost() {
//         return 0; // Free shipping for digital products
//     }
// }

//MODIFIED CODE
abstract class Product{
    String getProductName(){}
}

interface shippingcost {
    double calculateShippingCost(){};
}
interface weightBasedcost(){
    double calculateWeightBasedCost(){};
}

class DigitalProduct1 extends Product implements shippingcost(){
    public String getProductName(){
        return "DigitalProduct1";
    }
    
    public double calculateShippingCost(){
        return 12.0;
    }
}

class DigitalProduct2 extends Product implements weightBasedcost(){
    public String getProductName(){
        return "DigitalProduct2";
    }
    
    public double calculateWeightBasedCost(){
        return 22.0;
    }
}
