public class Pen {
    private int inkLevel;
    private String color;
    private String type;

    public Pen(){

    }
    public Pen(int inkLevel,String color,String type){
        this.type=type;
        this.color=color;
        this.inkLevel=inkLevel;
    }

    @Override
    public String toString() {
        return "Pen{inkLevel='" + inkLevel + "', color=" + color + "', type=" + type+"}";
    }

    public void setInkLevel(int inkLevel) {
        this.inkLevel = inkLevel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void changeInkLevel(int level){
        inkLevel+=level;
    }
}
