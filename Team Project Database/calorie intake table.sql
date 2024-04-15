CREATE TABLE month (
    month_id INT AUTO_INCREMENT PRIMARY KEY,
    month_name VARCHAR(20) NOT NULL,
    days_in_month INT NOT NULL
);

CREATE TABLE daily_calorie_intake (
    intake_id INT AUTO_INCREMENT PRIMARY KEY,
    month_id INT,
    day_of_month INT,
    calorie_value INT,
    FOREIGN KEY (month_id) REFERENCES month(month_id)
);
