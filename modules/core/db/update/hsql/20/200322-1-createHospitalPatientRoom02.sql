create table HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HOSPITAL_ROOM_LOCATION_NUMDER varchar(255) not null,
    HOSPITAL_PATIENT_ROOM_ID varchar(36) not null,
    HPR_INTENSIVE_CARE_ROOM_NUMBER boolean not null,
    HPR_RESPIRATORY_VENTILATOR boolean not null,
    DESCRIPTION varchar(255) not null,
    --
    primary key (ID)
);