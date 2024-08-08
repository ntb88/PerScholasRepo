CREATE DATABASE IF NOT EXISTS AutomotiveDB; 

use AutoMotiveDB; 

Create table if not exists Cars (
	CarID INT primary key auto_increment,
    CarModel VARCHAR(100) NOT NULL, 
    Year INT NOT NULL, 
    Price DECIMAL(10,2) NOT NULL, 
    Color ENUM('Red', 'Blue', 'Green', 'Black', 'White') NOT NULL
); 

Create table if not exists Owners (
	OwnerID INT auto_increment Primary key, 
	OwnerName VARCHAR(100) Not Null,
	OwnerAddress VARCHAR(255) Not Null,
	OwnerPhone VARCHAR(20) Not Null
);


create table if not exists Ownerships (
	OwnershipID int auto_increment primary key,
	CarID int,
    OwnerID int, 
    PurchaseDate DATE not null,
    foreign key(CarID) references Cars(CarID) ON DELETE CASCADE ON UPDATE CASCADE,
    foreign key(OwnerID) references Owners(OwnerID) ON DELETE CASCADE ON UPDATE CASCADE
);



create table if not exists Services (
	ServiceID INT primary key auto_increment, 
    ServiceName varchar(100) not null,
    ServiceDescription text,
    ServiceCost Decimal(10,2) not null
); 


-- drop table Ownerships; 

 create table if not exists Ownerships (
	OwnershipID int auto_increment primary key,
	CarID int,
    OwnerID int, 
    PurchaseDate DATE not null,
    foreign key(CarID) references Cars(CarID) ON DELETE CASCADE ON UPDATE CASCADE,
    foreign key(OwnerID) references Owners(OwnerID) ON DELETE CASCADE ON UPDATE CASCADE
);

create table if not exists CarServices (
	CarID int,
    ServiceID int,
    ServiceDate DATE not null,
    primary key (CarID, ServiceID),
    foreign key(CarID) references Cars(CarID) on delete cascade on update cascade,
    foreign key(ServiceID) references Services(ServiceID) on delete cascade on update cascade
);


create table if not exists Mechanics(
	MechanicID int primary key auto_increment,
    MechanicName varchar(100) not null,
    PhoneNumber varchar(20) not null,
    HireDate timestamp default current_timestamp
);


create table if not exists Garages(
	GarageID int primary key auto_increment,
    GarageName varchar(100) not null unique, 
    Location varchar(255) not null
);

create table if not exists CarMechanics (
	CarID int,
    MechanicID int,
    ServiceDate Date not null,
    primary key(CarID, MechanicID),
    foreign key(CarID) references Cars(CarID) ON DELETE CASCADE ON UPDATE CASCADE,
    foreign key(MechanicID) references Mechanics(MechanicID) On DELETE cascade on update cascade
);


INSERT INTO Cars (CarModel, Year, Price, Color) VALUES
('Toyota Camry', 2020, 25000.00, 'Red'),
('Honda Accord', 2021, 27000.00, 'Blue'),
('Ford Focus', 2019, 22000.00, 'Green');

INSERT INTO Owners (OwnerName, OwnerAddress, OwnerPhone) VALUES
('John Doe', '123 Elm St', '555-1234'),
('Alice Johnson', '456 Oak St', '555-8765');

INSERT INTO Services (ServiceName, ServiceDescription, ServiceCost) VALUES
('Oil Change', 'Change the engine oil', 50.00),
('Tire Rotation', 'Rotate the tires', 30.00);

INSERT INTO Ownerships (CarID, OwnerID, PurchaseDate) VALUES
(1, 1, '2020-05-10'),
(2, 2, '2021-08-15');

INSERT INTO CarServices (CarID, ServiceID, ServiceDate) VALUES
(1, 1, '2021-01-10'),
(1, 2, '2021-06-15'),
(2, 1, '2021-02-20');

INSERT INTO Mechanics (MechanicName, PhoneNumber) VALUES
('Mike Smith', '555-6789'),
('Sarah Brown', '555-9876');

INSERT INTO Garages (GarageName, Location) VALUES
('Downtown Garage', '789 Maple St'),
('Uptown Garage', '101 Oak St');

INSERT INTO CarMechanics (CarID, MechanicID, ServiceDate) VALUES
(1, 1, '2021-01-10'),
(2, 2, '2021-08-15');


-- Testing 

-- 

select * from Cars; 
select * from Owners; 
select * from Services;
select * from Ownerships; 
select * from CarServices; 
select * from Mechanics; 
select * from Garages; 
select * from CarMechanics; 

-- test 1.  DELETE FROM Cars WHERE CarID = 1
-- Check the state of Ownerships and CarServices tables to confirm cascading delete. 

DELETE FROM Cars WHERE CarID = 1;
-- Ownerships has row with carID = 1 deleted 
-- CarServices has row with carID = 1 deleted 


--  Test 2 
-- Update CarID: UPDATE Cars SET CarID = 100 WHERE CarID = 1.
-- Check the state of Ownerships and CarServices tables to confirm cascading update.



UPDATE Cars SET CarID = 100 WHERE CarID = 1; 


-- test 3 
-- Test cascading delete by deleting an owner and checking related tables.
-- Delete an owner: DELETE FROM Owners WHERE OwnerID = 1.
-- Check the state of Ownerships table to confirm cascading delete.

DELETE FROM Owners WHERE OwnerID = 1; 

select * from owners; 
select * from Ownerships; 


-- test 4 

select * from services; 
select * from CarServices; 
DELETE FROM Services WHERE ServiceID = 1; 

--  works -- 


--  test 5 
UPDATE Services SET ServiceID = 101 WHERE ServiceID = 1 

-- does not work

















