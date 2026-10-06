package HelloWorld;

 class Parents {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

public class Demo8 extends Parents {
    public static void main(String[] args) {
        Demo8 obj = new Demo8();
        
        // Setting the String value
        obj.setText("Welcome to Demo8");
        
        // Getting and printing the String
        String message = obj.getText();
        System.out.println(message);
    }
}