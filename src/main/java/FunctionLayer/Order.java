package FunctionLayer;


public class Order {

    private int orderId;
    private int userId;
    private int length;
    private int height;
    private int width;
    private String status;

    public Order(int orderId, int userId, int length, int height, int width, String status) {
        this.orderId = orderId;
        this.userId = userId;
        this.length = length;
        this.height = height;
        this.width = width;
        this.status = status;
    }
    
    public Order(int userId, int length, int height, int width) {
        this.userId = userId;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getStatus() {
        return status;
    }
    
    
}
