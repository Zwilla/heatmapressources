create table HEATMAPRESSOURCES_CITY_TOWN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CITY_NAME varchar(255) not null,
    CT_ZIP_CODE varchar(255) not null,
    CT_EMERGENCY_CONTACT varchar(255),
    DESCRIPTION varchar(255),
    STATE_PROVINCE_DISTRICT_NAME_ID varchar(36) not null,
    --
    primary key (ID)
);