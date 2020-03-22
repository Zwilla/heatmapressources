create table HEATMAPRESSOURCES_CONTROL_CENTER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CC_CITY_ID varchar(36) not null,
    CC_NAME varchar(255) not null,
    CC_CONTACT varchar(255),
    CC_MAIN_TRACKING_SOURCES varchar(512),
    --
    primary key (ID)
);