//Name:Syeda Maham Jafri, 22796
//19th May 2024

// MODIFIED CODE
interface service {
     String servicename(){};
     void send(){};
     String getcontact(){};
}

class EmailService implements service{
    private final String senderEmail = "sender@example.com";

    public String getcontact(){
        return senderEmail;
    }

    public String servicename(){
        return "Email Service";
    }
    public void send(String recipient, String message) {
        // Logic to send email using the senderEmail field
        System.out.println("Sending email from " + senderEmail + " to " + recipient + ": " + 
        message + " using" + servicename()) ;
    }
}

class SMSService implements service {
    private final String smsnum = "0332"
     public String getcontact(){
        return smsnum;
    }
    public String servicename(){
        return "SMS Service";
    }
    public void send(String recipient, String message) {
        // Logic to send email using the senderEmail field
        System.out.println("Sending sms from " + smsnum + " to " + recipient + ": " + 
        message + " using" + servicename()) ;
    }
   
}

class OrderService {
    private service Service;

    public OrderService(service oservice){
       this.Service = oservice;
    }

    public void confirmOrder(Order order) {
        // Order confirmation logic
        oservice.send(order.getCustomerName(), "Your order has been confirmed!");
    }
}





