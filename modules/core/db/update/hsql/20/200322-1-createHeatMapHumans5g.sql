create table HEATMAPRESSOURCES_HEAT_MAP_HUMANS5G (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HM_IMEI varchar(255) not null,
    HM_H_LOCATION VARCHAR(100),
    --
    primary key (ID)
);