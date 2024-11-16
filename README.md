# To-DoNova

To-DoNova is a simple and efficient To-Do list application that helps you organize your tasks for the day. Built using JavaFX and Java 8, and leveraging MySQL as its database, To-DoNova aims to streamline your daily task management with ease.

---

## Features

- **Task Management**: Add, view, and manage your daily tasks.
- **User Authentication**: Sign up and log in to maintain a personalized task list.
- **Simple and User-Friendly Interface**: Intuitive design for efficient task organization.

---

## Future Updates

- **Due Dates**: Ability to set due dates for tasks.
- **Alerts**: Notifications for overdue tasks.
- **Task Categories**: Organize tasks by customizable categories.

---

## Technologies Used

- **Java 8**: Core programming language.
- **JavaFX**: For building the user interface.
- **MySQL**: Relational database for efficient data storage and retrieval.

---

## Installation and Setup

### Prerequisites

1. **Java 8**: Download and install Java 8 from [here](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html).
2. **MySQL**: Download and install MySQL. Follow the instructions [here](https://dev.mysql.com/downloads/).
3. **IntelliJ IDEA**: Download and install IntelliJ IDEA Community Edition from [here](https://www.jetbrains.com/idea/download/).

---

### Steps to Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/To-DoNova.git
   cd To-DoNova
   ```
2. **Configure the Database**:
   - Start MYSQL server:
   ```bash
   mysql.server start
   ```
   - Follow the SQL queries in the databas.sql in application folder.
3. **Import the Project into IntelliJ IDEA**
   - Open IntelliJ IDEA and select Open.
   - Navigate to the To-DoNova directory and open it as a project.
4. **Run the Application**
   - Open the Main class in IntelliJ IDEA.
   - Right-click on the file and select Run ‘Main.main()’.
## Usage

1. **Start the Application**:
   - Launch the application, and you will see the login window.
2. **Sign Up**:
   - If you're a new user, sign up using the **Sign Up** button and provide a username and password.
3. **Add Tasks**:
   - Log in, and you'll be redirected to the main To-Do list window. Add your tasks and manage them efficiently.
## Troubleshooting

1. **Database Connection Issues**:
   - Ensure the MySQL server is running.
   - Verify the `DatabaseConnection` class has the correct credentials:
     ```java
     private static final String URL = "jdbc:mysql://localhost:3306/ToDoApp";
     private static final String USER = "your_mysql_username";
     private static final String PASSWORD = "your_mysql_password";
     ```

2. **JavaFX Runtime Errors**:
   - Ensure JavaFX libraries are properly linked in your project.
   - Update IntelliJ's VM options in the run configuration:
     ```
     --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml
     ```
## Dependencies

All required dependencies are listed in the `pom.xml` file in the repository:
- **MySQL Connector**: `mysql-connector-java`
- **JavaFX Controls**: `javafx-controls`
- **JavaFX FXML**: `javafx-fxml`
## Contact

For any questions or suggestions, please contact me at [taanishqsethi28@gmail.com](mailto:taanishqsethi28@gmail.com).