# ChatbotApp

## Overview
ChatbotApp is a simple Java-based chatbot application that provides user authentication and assists with course information, technical support, and general inquiries. Users can either log in or register before interacting with the chatbot.

## Features
- User authentication (login and registration)
- Provides information about courses
- Handles technical support queries
- Responds to general inquiries
- Simple text-based interaction

## Prerequisites
- Java Development Kit (JDK) 8 or later

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/4koushik4/consolechatbot.git
   ```
2. Navigate to the project directory:
   ```bash
   cd consolechatbot
   ```
3. Compile the Java file:
   ```bash
   javac ChatbotApp.java
   ```
4. Run the application:
   ```bash
   java ChatbotApp
   ```

## Usage
1. Enter your username to log in or register if not found.
2. After logging in, select an option:
   - `1` for course information (provide course ID)
   - `2` for technical support (describe your issue)
   - `3` for general inquiries (ask any question)
   - `exit` to end the conversation

## Example Interaction
```
Welcome to the Chatbot App!
Please enter your username: john
Welcome back, John Doe!
Hello, John Doe! How can I assist you today?
1. Course Information
2. Technical Support
3. General Inquiry
Type 'exit' to end the conversation.

You: 1
Chatbot: Please enter the course ID (e.g., CS101, MATH201, PHY101):
You: CS101
Chatbot: CS101: Introduction to Computer Science
- Duration: 3 months
- Instructor: Dr. Smith
- Topics: Basics of programming, algorithms, and data structures.
```

## Contributing
Feel free to fork this repository and submit pull requests for improvements.

## License
This project is open-source and available under the MIT License.

