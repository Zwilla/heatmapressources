create table HEATMAPRESSOURCES_EMERGENCY_TRANSPORTATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ET_AMBULANCE_UUID varchar(512),
    ET_EMERGENCY_HELICOPTER varchar(512),
    ET_LOCATION VARCHAR(100),
    ET_TRACKING_SOURCE varchar(512),
    --
    primary key (ID)
);