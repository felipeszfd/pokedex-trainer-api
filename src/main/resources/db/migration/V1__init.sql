create table if not exists species (
    id bigint generated always as identity primary key,
    pokedex_number int unique not null,
    name varchar(50) not null,
    height int not null,
    weight int not null,
    base_hp int not null,
    base_attack int not null,
    base_defense int not null,
    base_speed int not null,
    sprite_url varchar(200) not null
);

create table if not exists type (
    id bigint generated always as identity primary key,
    name varchar(20) unique not null
);

create table if not exists species_type (
    species_id bigint not null,
    type_id bigint not null,
    constraint pk_species_type primary key (species_id, type_id),
    constraint fk_species_type_species foreign key (species_id) references species(id) on delete cascade,
    constraint fk_species_type_type foreign key (type_id) references type(id) on delete cascade
);