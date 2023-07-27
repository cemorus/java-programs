import java.lang.reflect.Method;

class DynamicClass {
    public void displayMessage() {
        System.out.println("Hello, Reflection!");
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Load the DynamicClass using reflection
            Class<?> dynamicClass = Class.forName("DynamicClass");

            // Create an instance of the DynamicClass
            Object dynamicObject = dynamicClass.newInstance();

            // Invoke the displayMessage() method using reflection
            Method displayMethod = dynamicClass.getMethod("displayMessage");
            displayMethod.invoke(dynamicObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
