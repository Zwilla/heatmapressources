create table HEATMAPRESSOURCES_MEDICAL_PROFESSIONALS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MP_UNIQUE_SOCIAL_NUMBER varchar(255),
    HR_IMEI_ID varchar(36) not null,
    --
    primary key (ID)
);