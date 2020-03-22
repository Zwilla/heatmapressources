create table HEATMAPRESSOURCES_STATE_PROVINCE_DISTRICT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STATE_PROVINCE_DISTRICT_NAME varchar(255) not null,
    DESCRIPTION varchar(255),
    COUNTRY_NAME_ID varchar(36) not null,
    --
    primary key (ID)
);