create table HEATMAPRESSOURCES_EMERGENCY_HELICOPTER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EH_CONTROL_CENTER_ID varchar(36) not null,
    EH_EMERGENCY_HELICOPTER_UUID varchar(255) not null,
    EH_LOCATION_HOME VARCHAR(100) not null,
    EH_LOCATION_TRACKING VARCHAR(100),
    EH_TRACKING_SOURCE varchar(512),
    EH_CONTACT varchar(255) not null,
    --
    primary key (ID)
);