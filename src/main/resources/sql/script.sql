USE webcuisine;

create table user
(
    id           int auto_increment primary key,
    nom          varchar(50)  not null,
    prenom       varchar(50)  not null,
    email        varchar(255) not null unique ,
    image        varchar(255) null,
    mot_de_passe varchar(50)  not null
);


create table categorie
(
    id           int auto_increment primary key,
    libelle      varchar(50)  null
);

create table ingredient
(
    id           int auto_increment primary key,
    libelle      varchar(50)  not null,
    image        varchar(255) null
);

create table recette (
    id                  int auto_increment primary key,
    title               varchar(50)  not null,
    temps               int,
    difficulte          VARCHAR(50),
    cout                VARCHAR(50),
    nombre_personne     int,
    etapes              TEXT
);