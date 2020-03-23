create table HEATMAPRESSOURCES_THINGS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    THINGS_NAME varchar(255) not null,
    THINGS_UUID varchar(255),
    THINGS_UUID_TRACKING varchar(255),
    THINGS_LOCATION VARCHAR(100),
    THINGS_TRACKING_SOURCE varchar(512) not null,
    THINGS_TRACKING_LOCATION_API varchar(512),
    THINGS_KIND varchar(255),
    --
    primary key (ID)
);