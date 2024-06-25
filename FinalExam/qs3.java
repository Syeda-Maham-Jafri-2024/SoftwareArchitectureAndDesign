//Name:Syeda Maham Jafri, 22796
//19th May 2024

// public class ProductServlet extends HttpServlet {
//     @Override
//     protected void doGet(HttpServletRequest request, HttpServletResponse response)
//             throws ServletException, IOException {
//         String action = request.getParameter("action");
//         if (action.equals("list")) {
//             // Logic to retrieve product list from database (replace with actual logic)
//             List<Product> products = new ArrayList<>();
//             // ... (database access code)
//             // Directly write HTML content to response (MVC Violation)
//             response.setContentType("text/html");
//             PrintWriter out = response.getWriter();
//             out.println("<h1>Products</h1>");
//             out.println("<ul>");
//             for (Product product : products) {
//                 out.println("<li>" + product.getName() + " - $" + product.getPrice() + "</li>");
//             }
//             out.println("</ul>");
//             out.close();
//         } else if (action.equals("details")) {
//             // Logic to retrieve product details based on ID (replace with actual logic)
//             int productId = Integer.parseInt(request.getParameter("id"));
//             Product product = null;
//             // ... (database access code)
//             // Directly write HTML content to response (MVC Violation)
//             response.setContentType("text/html");
//             PrintWriter out = response.getWriter();
//             if (product != null) {
//                 out.println("<h1>" + product.getName() + "</h1>");
//                 out.println("<p>Price: $" + product.getPrice() + "</p>");
//             } else {
//                 out.println("Product not found!");
//             }
//             out.close();
//         }
//     }
// }

interface action{
   String getactionName(){};
   void perform(){};
   void actionresponse(){};
}
class Details implements action{
    public String getactionName(){
        return "details";
    }
    public void perform(){
        // Logic to retrieve product details based on ID (replace with actual logic)
            int productId = Integer.parseInt(request.getParameter("id"));
            Product product = null;
            // ... (database access code)
    }
    public void actionresponse(){
      if (product != null) {
                System.out.println("<h1>" + product.getName() + "</h1>");
                System.out.println("<p>Price: $" + product.getPrice() + "</p>");
            } else {
                System.out.println("Product not found!");
            }
  }
 }

class List implements action{
    public String getactionName(){
        return "list";
    }
    public void perform(){
        // Logic to retrieve product list from database (replace with actual logic)
            List<Product> products = new ArrayList<>();
            // ... (database access code)
    }
    public void actionresponse(){
       System.out.println("<h1>Products</h1>");
        System.out.println("<ul>");
            for (Product product : products) {
                System.out.println("<li>" + product.getName() + " - $" + product.getPrice() + "</li>");
            }
           System.out.println("</ul>");
            
  }
}
class servletModel{
   public void perform(action Action){
    Action.perform();
   }
  public void setcontextType( String contexttype){
    return contexttype;
  }
}

class servletView{
    public void getParameter(action Action){
       return Action
    }
    public void getcontextType( ){
    return "text/html";
}
  public void getWriter(action Action){
     Action.actionresponse()
  }
}
class servletController{
    private servletModel model;
    private servletView view;
    private action action;

    public servletController(servletModel smodel, servletView sview, action saction){
     this.model = smodel;
     this.view = sview;
    this.action = saction;
    }

    public void perform(){
    action Action = view.getParameter(action);
    model.perform(Action);
   }
   public void setcontextType(){
    String context  = view.getcontextType();
    model.setContentType(context);

   }

   public void perform(){
    action Action = view.getParameter(action);
    model.perform(Action);
    view.getWriter(Action);
   }

}

