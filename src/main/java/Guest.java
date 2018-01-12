public class Guest {

    String name;
    Boolean dataPermission;

    public Guest(String name, boolean dataPermission) {
        this.name = name;
        this.dataPermission = dataPermission;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getDataPermission() {
        return this.dataPermission;
    }
}
