public abstract class CrewMember extends Person {

    private String name;
    private String announcement;

//    constructor

    public CrewMember(String name) {
        super(name);
    }

    public String makeAnnouncement(String newAnnouncement) {
        return announcement = newAnnouncement;
    }
}