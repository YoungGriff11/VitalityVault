SELECT * FROM foods.foods;

CREATE TABLE calories_intake (
    Day INT,
    January INT,
    February INT,
    March INT,
    April INT,
    May INT,
    June INT,
    July INT,
    August INT,
    September INT,
    October INT,
    November INT,
    December INT
);

create table users(
	age int not null,
    gender varchar(111),
    height int not null,
    currentWeight int not null,
    goalWeight int not null,
    bodygoals varchar(33),
    activity double not null,
    timeframe int,
    comments varchar(100)
)
