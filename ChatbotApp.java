import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChatbotApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> users = new HashMap<>();
        users.put("john", "John Doe");
        users.put("jane", "Jane Smith");
        users.put("admin", "Administrator");

        System.out.println("Welcome to the Chatbot App!");
        String username;

        
        while (true) {
            System.out.print("Please enter your username: ");
            username = scanner.nextLine().trim().toLowerCase();

            if (users.containsKey(username)) {
                System.out.println("Welcome back, " + users.get(username) + "!");
                break;
            } else {
                System.out.println("Username not found. Would you like to register? (yes/no): ");
                String choice = scanner.nextLine().trim().toLowerCase();
                if (choice.equals("yes")) {
                    System.out.print("Enter your full name to register: ");
                    String fullName = scanner.nextLine().trim();
                    users.put(username, fullName);
                    System.out.println("Registration successful! Welcome, " + fullName + "!");
                    break;
                } else {
                    System.out.println("Invalid username. Please try again or register.");
                }
            }
        }

        
        System.out.println("Hello, " + users.get(username) + "! How can I assist you today?");
        System.out.println("Here are some topics I can help you with:");
        System.out.println("1. Course Information");
        System.out.println("2. Technical Support");
        System.out.println("3. General Inquiry");
        System.out.println("Type 'exit' to end the conversation.");

        
        Map<String, String> courseResponses = new HashMap<>();
        courseResponses.put("cs101", "CS101: Introduction to Computer Science\n- Duration: 3 months\n- Instructor: Dr. Smith\n- Topics: Basics of programming, algorithms, and data structures.");
        courseResponses.put("math201", "Math201: Advanced Mathematics\n- Duration: 4 months\n- Instructor: Prof. Johnson\n- Topics: Linear algebra, calculus, and differential equations.");
        courseResponses.put("phy101", "Phy101: Physics Basics\n- Duration: 3 months\n- Instructor: Dr. Brown\n- Topics: Mechanics, thermodynamics, and waves.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().trim().toLowerCase();

            if ("exit".equalsIgnoreCase(userInput)) {
                System.out.println("Chatbot: Goodbye, " + users.get(username) + "! Take care!");
                break;
            }

            switch (userInput) {
                case "1":
                    System.out.println("Chatbot: Please enter the course ID (e.g., CS101, MATH201, PHY101): ");
                    String courseId = scanner.nextLine().trim().toLowerCase();
                    String courseResponse = courseResponses.getOrDefault(courseId, "Sorry, I don't have information about that course.");
                    System.out.println("Chatbot: " + courseResponse);
                    break;

                case "2":
                    System.out.println("Chatbot: What technical issue are you facing? For example, 'Login problem' or 'Access denied.'");
                    String techIssue = scanner.nextLine().trim();
                    System.out.println("Chatbot: Thank you for reporting. Our technical team will look into the issue: \"" + techIssue + "\"");
                    break;

                case "3":
                    System.out.println("Chatbot: Feel free to ask any general questions. For example, 'Office hours' or 'Library timings.'");
                    String generalQuery = scanner.nextLine().trim();
                    System.out.println("Chatbot: Thank you for your query. We'll provide details about: \"" + generalQuery + "\" shortly.");
                    break;

                default:
                    System.out.println("Chatbot: I'm sorry, I didn't understand that. Please select a number from the menu or type 'exit' to quit.");
                    break;
            }
        }

        scanner.close();
    }
}
