CREATE DATABASE todo_app;

USE todo_app;

-- Users table
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Unique user identifier
    username VARCHAR(50) NOT NULL UNIQUE, -- Username for login, must be unique
    password VARCHAR(255) NOT NULL, -- Encrypted password
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP -- Timestamp for user registration
);

-- To-do items table
CREATE TABLE todo_items (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Unique identifier for each to-do item
    user_id INT NOT NULL, -- Foreign key referencing users table
    title VARCHAR(255) NOT NULL, -- Title of the to-do item
    description TEXT, -- Optional description of the to-do item
    due_date DATE, -- Optional due date
    status ENUM('Pending', 'Completed') DEFAULT 'Pending', -- Status of the to-do item
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Timestamp for when the item was created
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- Timestamp for last update
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE -- Ensures to-do items are deleted if the user is deleted
);