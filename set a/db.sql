-- Create database
CREATE DATABASE IF NOT EXISTS pb_company;

-- Use database
USE pb_company;

-- Create employee table
CREATE TABLE emp (
    empid INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    salary DOUBLE
);

-- Insert some sample records
INSERT INTO emp (name, salary) VALUES
('Ravi Kumar', 45000),
('Priya Sharma', 52000),
('Aman Verma', 38000),
('Neha Patel', 60000),
('Vikas Singh', 47000);

-- View data
SELECT * FROM emp;
