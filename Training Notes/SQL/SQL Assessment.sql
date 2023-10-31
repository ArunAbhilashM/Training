use demo

-- 1. Create the SQL commands that would generate the STRIKE, FIRES, and PICTURES tables.

-- Create the STRIKE table
CREATE TABLE STRIKE (
    ID INT PRIMARY KEY,
    Date DATE,
    Time TIME,
    Lat FLOAT,
    Lon FLOAT,
    Intensity INT
);

-- Insert values into the STRIKE table
INSERT INTO STRIKE (ID, Date, Time, Lat, Lon, Intensity)
VALUES
    (1, '2006-05-05', '02:02', 41.34, -122.45, 6235),
    (2, '2006-05-05', '02:09', 40.47, -120.47, 16235),
    (3, '2006-05-05', '03:32', 42.14, -122.98, 7779),
    (4, '2006-05-05', '04:34', 38.32, -122.17, 4645),
    (5, '2006-05-05', '05:02', 39.04, -121.22, 8989);

-- Create the FIRES table
CREATE TABLE FIRES (
    ID INT PRIMARY KEY,
    Date DATE,
    Lat FLOAT,
    Lon FLOAT,
    Area FLOAT
);

-- Insert values into the FIRES table
INSERT INTO FIRES (ID, Date, Lat, Lon, Area)
VALUES
    (1, '2006-05-05', 32.34, -122.45, 123.90),
    (2, '2006-05-05', 37.19, -121.66, 627.09),
    (3, '2006-05-05', 40.47, -120.47, 45.00),
    (4, '2006-05-05', 42.14, -122.98, 1774.9),
    (5, '2006-05-05', 37.21, -120.47, 2034.8),
    (6, '2006-05-05', 42.04, -126.22, 49.62);

-- Create the PICTURES table
CREATE TABLE PICTURES (
    ID INT PRIMARY KEY,
    Strike_FK INT,
    Date DATE,
    Filename VARCHAR(255)
);

-- Insert values into the PICTURES table
INSERT INTO PICTURES (ID, Strike_FK, Date, Filename)
VALUES
    (1, 1, '2006-05-05', '04938245.png'),
    (2, 1, '2006-05-05', '04983284.png'),
    (3, 2, '2006-05-05', '04773626.png'),
    (4, 2, '2006-05-05', '04789789.png'),
    (5, 4, '2006-05-05', '04323456.png'),
    (6, 5, '2006-05-05', '04325342.png');

    
-- 2. Create an SQL command to generate an appropriate LIGHTNING_FIRES table that would connect the FIRES table to the STRIKE table:
-- Create the LIGHTNING_FIRES table with foreign key constraints
CREATE TABLE lightning_fires (
    Strike_ID INT,
    Fire_ID INT,
    FOREIGN KEY (Strike_ID) REFERENCES STRIKE(ID),
    FOREIGN KEY (Fire_ID) REFERENCES FIRES(ID)
);


-- 3. Write an SQL command that would report a single number for the average intensity for all records in the STRIKE table:
select avg(Intensity) as Avg_Intensity  from strike 	

-- 4. Write an SQL command that would list all STRIKE IDs for those lightning STRIKEs that do not have a picture available in the PICTURES table. Show the result set the query would generate:
select s.ID from strike s left join pictures p on s.ID = p.Strike_FK where p.ID is null;

-- 5. Write an SQL command that would list the largest three FIRES in order of the maximum Area burned by the fire.Show the result set the query would generate:
 select * from fires order by area desc limit 3 
 
 -- 6. Write an SQL command to report the total Area burned by these largest three FIRES (report a single number):
select sum(area) as Total_Area from fires order by area desc limit 3

-- 7. Create an SQL query that would match lightning STRIKES to FIRES based on these identifying features 
-- The lightning strike and fire occurred on the same date and
-- The lightning strike and fire occurred at the same latitude and longitude
select s.id,f.id,s.Date,f.Date,s.Time,s.Lat,f.Lat,s.lon,f.lon from strike s inner join fires f on s.date=f.date and s.lat=f.lat and s.lon = f.lon

-- 8. Create one or more SQL command that would fill the LIGHTNING_FIRES table you created in part 2 above with he results from your SQL query from part 7 above.
INSERT INTO LIGHTNING_FIRES (Strike_ID, Fire_ID) SELECT STRIKE.ID AS Strike_ID, FIRES.ID AS Fire_ID FROM STRIKE INNER JOIN FIRES ON STRIKE.Date = FIRES.Date AND STRIKE.Lat = FIRES.Lat AND STRIKE.Lon = FIRES.Lon;


-- 10. Write the appropriate SQL ALTER command to add a FIRE_FK attribute to the STRIKES table:
alter table strike add fire_fk varchar(25)
select * from strike

-- 9. Create the result set for the following query (with headers for each column returned):
SELECT STRIKE.Lat as LATITUDE, STRIKE.Lon as LONGITUDE, Filename AS PNG FROM STRIKE, PICTURES WHERE Strike.ID=Strike_FK ORDER BY Filename DESC;



