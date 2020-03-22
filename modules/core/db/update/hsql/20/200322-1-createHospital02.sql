create table HEATMAPRESSOURCES_HOSPITAL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HOSPITAL_NAME varchar(255) not null,
    LOCATION VARCHAR(100),
    H_MAX_ROOMS integer not null,
    H_ROOMS_WITH_RESPIRATORY_VENTILATOR integer not null,
    H_ROOMS_WITH_RESPIRATORY_VENTILATOR_FREE integer,
    H_INTENSIVE_CARE_UNITS integer,
    DESCRIPTION varchar(255) not null,
    --
    primary key (ID)
);