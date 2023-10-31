create schema demo
use demo
create table Suppliers(sid int,sname varchar(25),address varchar(25))
create table Parts(pid int,pname varchar(25),partsSupplied varchar(25))
create table PartsSupplied(sid int,pid int,cost int)

insert into Suppliers values('21','Acme Widgets','chennai');
insert into Suppliers values('22','Puma Widgets','ooty');
insert into Suppliers values('23','Boat Widgets','Salem');
insert into Suppliers values('24','Pass Widgets','Karur');

 insert into Parts values('001','wid1','red');
insert into Parts values('002','wid2','blue');
insert into Parts values('003','Acme Widgets','green');
insert into Parts values('004','wid4','yellow');
insert into Parts values('005','wid5','purple');

 insert into PartsSupplied values('21','001',1000.00);
insert into PartsSupplied values('22','002',2000.00);
insert into PartsSupplied values('23','003',3000.00);
insert into PartsSupplied values('24','004',4000.00);
insert into PartsSupplied values(null,'009',4000.00);

-- Find the total number of parts (pids) that are red. 
select count(partsSupplied) from parts where partsSupplied='red'

-- Find the pnames of parts supplied by Acme Widget Suppliers. 
select sname from Suppliers where sname='Acme Widgets'

-- Find the sids of suppliers that supply a red part or a green part. 
SELECT DISTINCT s.sid
FROM Suppliers s
INNER JOIN PartsSupplied ps ON s.sid = ps.sid
INNER JOIN Parts p ON ps.pid = p.pid
WHERE p.partsSupplied = 'red' OR p.partsSupplied = 'green';
SELECT sid
FROM PartsSupplied
WHERE pid IN (SELECT pid FROM Parts WHERE partsSupplied = 'red')
INTERSECT
SELECT sid
FROM PartsSupplied
WHERE pid IN (SELECT pid FROM Parts WHERE partsSupplied = 'green');






create table teams(
team_id int primary key,
t_name varchar(20)
);

 

create table players(
p_id int primary key,
p_last varchar(10),
p_first varchar(10),
team_id int,
foreign key (team_id) references teams(team_id),
p_number int (5)
);

 

create table players_data(
p_id int,
foreign key (p_id) references players(p_id),
weight int,
height int
);

 

create table games(
games_id int primary key,
game_date date not null,
home_game_id int,
guest_team_id int
);

 

create table scores(
games_id int,
foreign key (games_id) references games(games_id),
team_id int,
foreign key (team_id) references teams(team_id),
score int,
win_lose varchar(5)
);

 

insert into teams values(1,'Sharp Shooters');
insert into teams values(2,'Hammer Time');
insert into teams values(3,'String Music');
insert into teams values(4,'Hackers');

 

insert into players values(1,'smith','john',1,12);
insert into players values(2,'bobbit','billy',1,2);
insert into players values(3,'hurta','wil',2,32);
insert into players values(4,'ouchy','tim',2,22);
insert into players values(5,'byrd','eric',3,6);
insert into players values(6,'jordan','ryan',4,23);
insert into players values(7,'hammer','wally',4,21);
insert into players values(8,'hammer','ron',4,44);
insert into players values(11,'knotgood','al',null,0);

 

insert into players_data values(1,71,120);
insert into players_data values(2,58,195);
insert into players_data values(3,72,200);
insert into players_data values(4,74,170);
insert into players_data values(5,71,182);
insert into players_data values(6,72,289);
insert into players_data values(7,79,250);
insert into players_data values(8,73,193);
insert into players_data values(11,85,310);

 

insert into games values(1,str_to_date('05-01-2002','%m-%d-%Y'),1,2);
insert into games values(2,str_to_date('05-02-2002','%m-%d-%Y'),3,4);
insert into games values(3,str_to_date('05-03-2002','%m-%d-%Y'),1,3);
insert into games values(4,str_to_date('05-05-2002','%m-%d-%Y'),2,4);
insert into games values(5,str_to_date('05-05-2002','%m-%d-%Y'),1,2);
insert into games values(6,str_to_date('05-09-2002','%m-%d-%Y'),3,4);
insert into games values(7,str_to_date('05-10-2002','%m-%d-%Y'),2,3);
insert into games values(8,str_to_date('05-11-2002','%m-%d-%Y'),1,4);
insert into games values(9,str_to_date('05-12-2002','%m-%d-%Y'),2,3);
insert into games values(10,str_to_date('05-15-2002','%m-%d-%Y'),1,4);

 

insert into scores values(1,1,66,'lose');
insert into scores values(2,3,78,'win');
insert into scores values(3,1,45,'lose');
insert into scores values(4,2,56,'lose');
insert into scores values(5,1,100,'win');
insert into scores values(6,3,67,'lose');
insert into scores values(7,2,57,'lose');
insert into scores values(8,1,98,'win');
insert into scores values(9,2,56,'lose');
insert into scores values(10,1,46,'lose');
insert into scores values(1,2,75,'win');
insert into scores values(2,4,46,'lose');
insert into scores values(3,3,87,'win');
insert into scores values(4,4,99,'win');
insert into scores values(5,2,88,'win');
insert into scores values(6,4,77,'win');
insert into scores values(7,3,87,'win');
insert into scores values(8,4,86,'lose');
insert into scores values(9,3,87,'win');
insert into scores values(10,4,78,'win');

select * from scores
select * from games
select * from players_data
select * from players
select * from teams 

-- 1)what is the average height of all players
select avg(height) as Average_height from players_data 

-- 2)what is the average weight of all players
select avg(weight) as Average_weight from players_data 

-- 3)what team has scored the most points of all games
select sum(score) as Most_points , team_id from scores group by team_id order by Most_points desc limit 1

-- 4)what is the most points scored in a single game by one team
select 

-- 7) how many teams are there
select count(t_name) from teams

-- 8) how many players are there
select count(p_id) as players from players

-- 9)how many games were played on the 5th of may 2002
select count(*) as game_date from games where game_date=2002-05-05

-- 10) who is the tallest player
select p.p_first,p.p_last,pd.height from players p  join players_data pd on p.p_id=pd.p_id order by pd.height desc limit 1

-- 20)Display games who’s days are from 5th to 10th date
select games_id,game_date from games where parts

use data
create table Products(Product_id int,Product_name varchar(50))
use data;
products

use data
CREATE TABLE accounts (
    user_id VARCHAR(25) PRIMARY KEY,
    password VARCHAR(25),
    account_number VARCHAR(20) UNIQUE,
    balance DECIMAL(10,2)
);
select * from accounts
use demo
select * from Product
use dummy
select * from Category
select * from Product
select * from emp
select * from empprojects
select * from account
create schema shoppingdb
use shoppingdb

create table product(
prd_Id int primary key,
prd_Name varchar(20),
prd_Price double
);

insert into product values(1,"mobile",50000);
insert into product values(2,"laptop",82000);

use data
CREATE TABLE admin (
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50),
  PRIMARY KEY (username)
);

create schema pharmacy
use pharmacy



