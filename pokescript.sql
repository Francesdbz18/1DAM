create database pokemon
use pokemon

drop table if exists adquiereHabilidad
drop table if exists aprendeMovimiento
drop table if exists tieneTipo
drop table if exists grupoHuevo
drop table if exists evoluciona
drop table if exists movimiento
drop table if exists tipo
drop table if exists baseStats
drop table if exists habilidad
drop table if exists pokemon

create table if not exists pokemon (
PID int primary key
nombre varchar(50) not null,
altura int not null
peso int not null
fechaObtenido timestamp not null
EO varchar(20) not null
cintas int not null
);

create table if not exists habilidad (
    hID int primary key
    nombre varchar(20) not null
    descripcion varchar (100)
);

create table if not exists baseStats (
    PID int primary key
    ataque int not null
    defensa int not null
    ataqueEsp int not null
    defensaEsp int not null
    pSalud int not null
    velocidad int not null
    IV int not null
    EV int not null
    exp int not null
    foreign key (PID) references pokemon(PID)
);

create table if not exists tipo (
    IDtipo int primary key
    nombreTipo varchar(20) not null
    eficaz int
    pocoEficaz int
    debil int
);

create table if not exists movimiento (
    IDmov int primary key
    nombre varchar(20) primary key not null
    IDtipo int not null
    potencia int
    precisionMov int not null
    efecto varchar(100) not null
    foreign key (IDtipo) references tipo(IDtipo)
);

create table if not exists evoluciona (
    PID int primary key
    nombre varchar(20)
    método varchar(100)
    nivel int 
    foreign key (PID) references pokemon(PID)
);

create table if not exists grupoHuevo (
    IDgrupo int primary key
    nombre varchar(20) not null
    puedeCriar BOOLEAN 
    PID int not null
    foreign key (PID) references pokemon(PID)
);

create table if not exists tieneTipo (
    PID int not null
    IDtipo int not null
    dobleTipo BOOLEAN
    foreign key PID references pokemon(PID)
    foreign key IDtipo references tipo(IDtipo)
    constraint pk_tieneTipo primary key (PID, IDtipo)
);

create table if not exists aprendeMovimiento (
    PID int not null
    IDmov int not null
    nivel int
    aprendeMT BOOLEAN 
    foreign key PID references pokemon(PID)
    foreign key IDmov references movimiento(IDmov)
    constraint pk_aprendeMov primary key (PID, IDmov)
);

create table if not exists adquiereHabilidad (
    PID int
    HID int
    esOculta BOOLEAN
    foreign key PID references pokemon(PID)
    foreign key HID references habilidad(HID)
    constraint pk_adquiereHabilidad primary key (PID, HID)
);
