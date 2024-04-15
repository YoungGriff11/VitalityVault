CREATE TABLE calories_intake (
    `Day` INT,
    `January` INT, `February` INT, `March` INT, `April` INT,
    `May` INT, `June` INT, `July` INT, `August` INT,
    `September` INT, `October` INT, `November` INT, `December` INT
);

-- Add rows for days of the month
INSERT INTO calories_intake (`Day`) VALUES 
(1), (2), (3), (4), (5), (6), (7), (8), (9), (10),
(11), (12), (13), (14), (15), (16), (17), (18), (19), (20),
(21), (22), (23), (24), (25), (26), (27), (28), (29), (30), (31);

-- Set all month columns to NULL except for the last row of each month (total calories)
UPDATE calories_intake SET
    `January` = NULL, `February` = NULL, `March` = NULL, `April` = NULL,
    `May` = NULL, `June` = NULL, `July` = NULL, `August` = NULL,
    `September` = NULL, `October` = NULL, `November` = NULL, `December` = NULL;
