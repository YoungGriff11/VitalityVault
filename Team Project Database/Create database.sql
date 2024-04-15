CREATE DATABASE foods;

SHOW DATABASES LIKE 'foods';

CREATE TABLE Foods (
    Food_ID INT AUTO_INCREMENT PRIMARY KEY,
    Food_Name VARCHAR(255) NOT NULL,
    Category VARCHAR(100),
    Portion_Size VARCHAR(50),
    Calories FLOAT,
    Protein FLOAT,
    Fat FLOAT,
    Carbohydrates FLOAT
);
