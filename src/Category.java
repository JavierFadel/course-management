public class Category {
    private String name, desc;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setDesc(String desc) { this.desc = desc; }
    public String getDesc() { return desc; }

    public void taunt() {
        System.out.println(this.getName() + ", " + this.getDesc());
    }
}

class Math extends Category {

}
