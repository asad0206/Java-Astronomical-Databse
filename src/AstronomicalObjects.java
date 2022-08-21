public abstract class AstronomicalObjects{
    private String name = null;
    private String information = null;
    private String type = null;

    public void setName(String name) {
        this.name = name;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void setType(String type) {
        this.type = type;
    }

    String getInformation(){
        return information;
    }
    String getName(){
        return name;
    }
    String getType(){
        return type;
    }

    public abstract boolean objectExists(String name);
}
