public class Instance {
    // Encapsulation: setting private values.
    private String name, location;

    // Getter setter for instance name.
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    // Getter setter for instance location.
    public void setLocation(String location) { this.location = location; }
    public String getLocation() {
        // TODO: what if location has no value?
//        if (location.isEmpty()) {
//            return "Unknown location";
//        }
        return location;
    }
}
