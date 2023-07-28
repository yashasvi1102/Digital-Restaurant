package order.dto;

public class Order {
    private int orderId;
    private int tableNo;
    private String dishName;
    private int quantity;
    private String additionalInfo;
    private int totalAmount;

    public Order() {
    }

    public Order(int orderId, int tableNo, String dishName, int quantity, String additionalInfo, int totalAmount) {
        this.orderId = orderId;
        this.tableNo = tableNo;
        this.dishName = dishName;
        this.quantity = quantity;
        this.additionalInfo = additionalInfo;
        this.totalAmount = totalAmount;
    }

    public Order(String dishName, int quantity, int tableNo, String additionalInfo, int totalAmount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
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

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
