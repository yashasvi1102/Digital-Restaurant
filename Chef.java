
package chef.dto;

public class Chef {
    private String Id;
    private String pass;
    private int orderId;
    private int tableNo;
    private String dishName;
    private int quantity;
    private String readyTime;

    public Chef() {
    }
    

    public Chef(String Id, String pass,int orderId, int tableNo, String dishName, int quantity, String readyTime) {
         this.Id = Id;
        this.pass = pass;
        this.orderId = orderId;
        this.tableNo = tableNo;
        this.dishName = dishName;
        this.quantity = quantity;
        this.readyTime = readyTime;
    }

   
    public int getOrderId() {
        return orderId;
    }

   
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getReadyTime() {
        return readyTime;
    }

    public void setReadyTime(String readyTime) {
        this.readyTime = readyTime;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setPassword(String newPass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
