public class Device {

    private String code;
    private String producer;
    private String type;
    private double price;

    public Device(String code, String producer, String type, double price) {
        this(code, producer,type);
        this.price = price;
    }

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getProducer() {
        return producer;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    String getInfo() {
        return code +", producent: " +producer +", typ: " +type +" cena: " +price;
    }

}
