DROP TABLE Hotel;
DROP TABLE Booking;
DROP TABLE Room;
DROP TABLE Guest;

CREATE TABLE IF NOT EXISTS  Hotel(
	hotelNo VARCHAR(27) PRIMARY KEY,
	hotelName VARCHAR(27),
	city VARCHAR
);

CREATE TABLE IF NOT EXISTS Room (
	roomNo VARCHAR(27),
	hotelNo VARCHAR(27),
	type VARCHAR(10),
	price double precision,
	PRIMARY KEY(roomNo, hotelNo)
);

CREATE TABLE IF NOT EXISTS Booking (
	hotelNo varchar(27),
	guestNo varchar(27),
	dateFrom varchar(10),
	dateTo varchar(10),
	roomNo varchar(27),
	PRIMARY KEY(hotelNo, guestNo, dateFrom)
);

CREATE TABLE IF NOT EXISTS Guest (
	guestNo varchar(27) PRIMARY KEY,
	guestName VARCHAR(27),
	guestAddress VARCHAR(100)
);

INSERT INTO Hotel VALUES ('H01', 'Grosvenor Hotel', 'London'), 
						('H02', 'Ocean View', 'Miami'),
						('H03', 'Mountain Retreat', 'Denver');

INSERT INTO Room VALUES ('101', 'H01', 'Single', 50.00),
						('102', 'H01', 'Double', 35.00),
						('103', 'H01', 'Family', 39.00),
						('201', 'H02', 'Single', 70.00),
						('202', 'H02', 'Double', 120.00),
						('301', 'H03', 'Double', 65.00);
INSERT INTO Guest VALUES ('G01', 'Alice Smith', '23 London Rd, London'),
						('G02', 'Bob Stone', '45 River Rd, Miami'),
						('G03', 'Clara Oswald', '31 Queen St, London'),
						('G04', 'David Tenn', '10 Aspen St, Denver');
INSERT INTO Booking VALUES ('H01', 'G01', '2024-08-01', '2024-08-05', '102'),
						('H01', 'G03', '2024-08-02', NULL, '103'),
						('H01', 'G02', '2024-07-10', '2024-07-15', '101'),
						('H02', 'G04', '2024-08-03', '2024-08-08', '202'),
						('H01', 'G04', '2024-08-10', '2024-08-15', '101'),
						('H01', 'G04', to_char(current_timestamp, 'YYYY-MM-DD'), NULL, '101');
-- 6.7 List full details of all hotels.
select * from hotel;
-- 6.8 List full details of all hotels in London.
select * from hotel where city = 'London';
-- 6.9 List the names and addresses of all guests living in London, alphabetically ordered by name.
select guestName, guestAddress from guest where guestAddress like '%London%' order by guestName;
-- 6.10 List all double or family rooms with a price below £40.00 per night, in ascending order of price.
select * from room where price < 40 and (type = 'Double' or Type ='Family') order by price;
-- 6.11 List the bookings for which no dateTo has been specified.
select * from booking where dateto is not null;
-- Aggregate functions
-- 6.12 How many hotels are there?
select count(*) from hotel;
-- 6.13 What is the average price of a room?
select avg(price) from room;
-- 6.14 What is the total revenue per night from all double rooms?
select avg(price) from room where type='Double';
-- 6.15 How many different guests have made bookings for August?
select count(distinct(guestno)) from booking where dateFrom like '%-08-%';
-- Subqueries and joins
-- 6.16 List the price and type of all rooms at the Grosvenor Hotel.
select price, type from hotel join room on hotel.hotelno=room.hotelno where hotelname = 'Grosvenor Hotel';
-- 6.17 List all guests currently staying at the Grosvenor Hotel.
select guest.* from booking join guest on guest.guestno = booking.guestno join hotel on hotel.hotelno = booking.hotelno
where dateTo is null and hotel.hotelname = 'Grosvenor Hotel';
-- 6.18 List the details of all rooms at the Grosvenor Hotel,
-- including the name of the guest staying in the room, if the room is occupied.
-- booking, guest, hotel, room
select room.*, guest.guestname, hotel.hotelname from booking join guest on guest.guestno = booking.guestno join hotel on hotel.hotelno = booking.hotelno
join room on room.roomno = booking.roomno
where booking.dateTo is null and hotel.hotelname = 'Grosvenor Hotel';
-- 6.19 What is the total income from bookings for the Grosvenor Hotel today?
select sum(room.price) from booking join hotel on booking.hotelno = hotel.hotelno join room on room.roomno = booking.roomno 
where hotel.hotelname = 'Grosvenor Hotel'
and booking.dateFrom >= to_char(current_timestamp, 'YYYY-MM-DD');
-- Grouping
-- 6.22 List the number of rooms in each hotel.
select hotelno, count(*) from room group by hotelno;
-- 6.23 List the number of rooms in each hotel in London.
select hotelname, count(*) from hotel join room on room.hotelno = hotel.hotelno group by hotelname;
-- 6.24 What is the average number of bookings for each hotel in August?
select hotelname, count(*) from booking join hotel on hotel.hotelno = booking.hotelno where booking.dateTo like '%-08-%' group by hotel.hotelno;