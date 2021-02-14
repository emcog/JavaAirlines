package plane;

public enum PlaneModelType {
    B737("737"),
    B747("747"),
    B767("767"),
    B777("777"),
    B787("787"),
    A300("A300"),
    A310("A310"),
    A220("A220"),
    A318("A318"),
    A319("A319"),
    A320("A320"),
    A321("A321");

    private final String model;


    PlaneModelType(String model) {
        this.model = model;
    }

    public String getModelType() {
        return this.model;
    }
}