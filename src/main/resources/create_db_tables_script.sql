create table SLOT_CATEGORY
(
    id       INT AUTO_INCREMENT PRIMARY KEY NOT NULL ,
    status   VARCHAR(100) NOT NULL ,
    category VARCHAR(256) NOT NULL 
);

create table SLOT_PLAN
(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    slot_number VARCHAR(100) NOT NULL ,
    slot_info VARCHAR(256) NOT NULL ,
    slot_category_id INT NOT NULL ,
    status VARCHAR(100) NOT NULL ,
    FOREIGN KEY (slot_category_id) REFERENCES SLOT_CATEGORY(id)
);

create table VEHICLE_IN
(
    id INT AUTO_INCREMENT NOT NULL ,
    vehicle_no VARCHAR(100) NOT NULL ,
    vehicle_type VARCHAR(100) NOT NULL ,
    vehicle_color VARCHAR(100) NULL ,
    slot_plan_id INT NOT NULL ,
    lot_in_time DATETIME NOT NULL ,
    PRIMARY KEY (id),
    FOREIGN KEY (slot_plan_id) REFERENCES SLOT_PLAN(id)
);

create table PRICE_RATE
(
    id int not null auto_increment,
    time_slot int not null ,
    avg_rate double not null ,
    peak_time_rate double not null ,
    off_peak_rate double not null ,
    spatial_discount_rate double not null ,
    primary key (id)

);

create table VEHICLE_OUT
(
    id int auto_increment not null ,
    vehicle_in_id int not null ,
    vehicle_out_time datetime not null ,
    primary key (id)
);

create table BILLING
(
    id int auto_increment not null ,
    vehicle_in_id int not null ,
    vehicle_out_id int not null ,
    slot_plan_id int not null ,
    total_used_time varchar(256) not null ,
    used_time_in_price_list int not null ,
    bill_amount double not null ,
    primary key (id),
    foreign key (vehicle_in_id) references VEHICLE_IN(id),
    foreign key (vehicle_out_id) references VEHICLE_OUT(id),
    foreign key (slot_plan_id) references SLOT_PLAN(id)
    
);

