public class Program4_NullPointerDemo {
    public static void main(String[] args) {
        String text = null;
        
        System.out.println("--- Scenario 1: Handling Exception ---");
        try {
            
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught Expected Exception: " + e);
        }
        
        System.out.println("\n--- Scenario 2: Generating Crash (Abrupt End) ---");
        
        System.out.println(text.length()); 
    }
}