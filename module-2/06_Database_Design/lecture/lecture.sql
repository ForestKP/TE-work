DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS artists;
DROP TABLE IF EXISTS artwork;
DROP TABLE IF EXISTS customer_purchases;

CREATE TABLE customrer ( 
                customer_id serial,
                fullname varchar(64) not null,
                address varchar(500) not null,
                phone varchar(15) null,
                
                CONSTRANT pk_customers PRIMARY KEY(customrer_id)
                );
                
                
                CREATE TABLE artists (
                artist_id serial,
                first_name vanchar(50) not null,
                last_name varchar(50) not null, 
                
                CONSTRAINT pk_artists PRIMARY(artist_id_
                
       );
       
        CREATE TABLE artwork (
        artwork_code char(3),
        title varchar(150),
        artist_id int,
        
        CONSTRAINT fk_artwork_artist FOREIGN KEY(artist_id)
        );
        
        CREATE TABLE artwork (
        artwork_code char(3),
        title varchar(150),
        artist_id int not null,
        CONSTRAINT fk_artwork_artists FOREIGN KEY(artist_id) REFERENCES artists(artist_id)
        );
        
        CREATE TABLE customer_purchases (
        customer_id int,
        artwork_code char(30);
        purchase_date timestamp,
        price money not null,
        
        constraint pk_customer_purshases PRIMARY KEY ( customer_id, artwork_code, purchase_date)
        );
        
        INSERT INTO
        
                