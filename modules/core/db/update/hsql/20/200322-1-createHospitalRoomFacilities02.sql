create table HEATMAPRESSOURCES_HOSPITAL_ROOM_FACILITIES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    INTENSIVE_CARE_BEDS_NUMBER integer not null,
    RV_RESPIRATORY_VENTILATOR_ID varchar(36) not null,
    DSECRIPTION varchar(255),
    --
    primary key (ID)
);