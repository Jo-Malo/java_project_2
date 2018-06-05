package enums;

public enum ItemType {
    POSTER("Poster"),
    SIGNATURE("Signature"),
    SCRIPT("Script"),
    COSTUME("Costume"),
    PROP("Prop"),
    VEHICLE("Vehicle"),
    PUPPET("Puppet");

    private String type;

    ItemType(String type) {
        this.type = type;
    }

//    ItemType itemType = ItemType.valueOf("POSTER");

    public String getPosters() {
        return ItemType.POSTER.toString();
    }

}
