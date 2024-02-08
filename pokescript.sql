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
altura int not null
peso int not null
fechaObtenido timestamp not null
EO varchar(20) not null
cintas int not null
);
