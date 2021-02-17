
class UIControl {
    boolean isEnabled = true;

    // CONSTRUCTOR
    UIControl(boolean isEnabled) {
        System.out.println("Inside UIControl");
        this.isEnabled = isEnabled;
    }

    void enable() {
        isEnabled = true;
    }

    void disable() {
        isEnabled = false;
    }

    boolean isEnabled() {
        return isEnabled;
    }
}

class TextBox extends UIControl {
    String text = "";

    // when we inherit parent and creating an instance of child
    // than it will come in child's constructor and on first line java by default
    // call parent's construtor
    // after completion of parents's consturctor, it comes back to child's
    // constructor and excute the remainig part of chil's code
    TextBox() { // CONSTRUCTOR
        // but here while creating instance of child's we are not passing any argumet
        // so when it calls child's constructor, always on first line java by dfault
        // call parents constructor without any argument
        // bcoz we are not passing any argument while creating an instance of child
        // class
        // so here java will confuse bcoz parent's constructor accepts parameter so we
        // have to explicitly
        // call the parents constructor and pass the argument with the help of super()
        super(true);
        System.out.println("Inside TextBox");
    }

    void setText(String text) {
        this.text = text;
    }

    void clear() {
        text = "";
    }
}

public class Main {

    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Hello World hurray");
        System.out.println(textBox1.text);
    }
}