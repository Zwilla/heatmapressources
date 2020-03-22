create table HEATMAPRESSOURCES_RESPIRATORY_VENTILATOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    RV_RESPIRATORY_VENTILATOR_MODELL_NO varchar(255) not null,
    RV_RESPIRATORY_VENTILATOR_TYPE varchar(255) not null,
    RV_RESPIRATORY_VENTILATOR_MANUFACTURER varchar(255) not null,
    RV_RESPIRATORY_VENTILATOR_PROTABLE boolean,
    RV_RESPIRATORY_VENTILATOR_MAX_PATIENTS integer not null,
    RV_RESPIRATORY_VENTILATOR_DESCRIPTION varchar(2000) not null,
    --
    primary key (ID)
);