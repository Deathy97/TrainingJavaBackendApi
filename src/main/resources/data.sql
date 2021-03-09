CREATE TABLE year (
    id INT AUTO_INCREMENT PRIMARY KEY,
    number INT NOT NULL
);
CREATE TABLE month (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);
CREATE TABLE month_year(
    id INT AUTO_INCREMENT PRIMARY KEY,
    year_id INT,
    month_id INT,
    FOREIGN KEY (year_id) REFERENCES year (id) ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY (month_id) REFERENCES month (id) ON DELETE RESTRICT ON UPDATE CASCADE
);
CREATE TABLE expense_type (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);
CREATE TABLE rental_type (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);
CREATE TABLE rental (
    id INT AUTO_INCREMENT PRIMARY KEY,
    rental_type_id INT,
    name VARCHAR(250) NOT NULL,
    initial_value INT,
    FOREIGN KEY (rental_type_id) REFERENCES rental_type (id) ON DELETE RESTRICT ON UPDATE CASCADE
);

CREATE TABLE rent_expense (
    id INT AUTO_INCREMENT PRIMARY KEY,
    expense_type_id INT,
    rental_id INT,
    FOREIGN KEY (expense_type_id) REFERENCES expense_type (id) ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY (rental_id) REFERENCES rental (id) ON DELETE RESTRICT ON UPDATE CASCADE
);

CREATE TABLE month_expense (
    id INT AUTO_INCREMENT PRIMARY KEY,
    month_year_id INT,
    rent_expense_id INT,
    value INT,
    FOREIGN KEY (month_year_id) REFERENCES month_year (id) ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY (rent_expense) REFERENCES rent_expense (id) ON DELETE RESTRICT ON UPDATE CASCADE
);