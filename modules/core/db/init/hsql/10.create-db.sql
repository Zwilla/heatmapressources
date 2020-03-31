-- begin HEATMAPRESSOURCES_LAYER_WRAPPER
create table HEATMAPRESSOURCES_LAYER_WRAPPER (
    ID varchar(36) not null,
    --
    NAME longvarchar not null,
    DATACONTAINERID longvarchar not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_LAYER_WRAPPER
-- begin HEATMAPRESSOURCES_TRACKING_WHAT
create table HEATMAPRESSOURCES_TRACKING_WHAT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    GR_TRACKING_THIS varchar(255) not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_TRACKING_WHAT
-- begin HEATMAPRESSOURCES_PATIENTS
create table HEATMAPRESSOURCES_PATIENTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PATIENT_HUMAN_ID varchar(36) not null,
    PATIENT_NUMBER varchar(36) not null,
    P_DISEASE longvarchar not null,
    PATIENT_UNIQUE_IDENTITY_NUMBER varchar(255),
    PATIENT_BIRTH_DAY date not null,
    PATIENT_EMERGENCY_CONTACT varchar(255) not null,
    PATIENT_LAST_NAME varchar(255) not null,
    PATIENT_FRIST_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_PATIENTS
-- begin HEATMAPRESSOURCES_HEAT_MAPS_ALL
create table HEATMAPRESSOURCES_HEAT_MAPS_ALL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HM_KIND_OF_ID varchar(36) not null,
    HM_DESCRIPTION varchar(255) not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_HEAT_MAPS_ALL
-- begin HEATMAPRESSOURCES_USER_RIGHTS
create table HEATMAPRESSOURCES_USER_RIGHTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_RIGHTS_TYPE_NAME varchar(255) not null,
    DESCRIPTION varchar(255) not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_USER_RIGHTS
-- begin HEATMAPRESSOURCES_CONTACTS
create table HEATMAPRESSOURCES_CONTACTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CONTACT_NAME varchar(255) not null,
    CONTACT_EMAIL varchar(255),
    CONTACT_PHONE_NUMBER varchar(255),
    CONTACT_WEBSITE varchar(255),
    CONTACT_DATA_SOURCES varchar(255),
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_CONTACTS
-- begin HEATMAPRESSOURCES_ABOUT_TRACKING
create table HEATMAPRESSOURCES_ABOUT_TRACKING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TS_ABOUT_WHAT varchar(255) not null,
    TS_WEBSITE varchar(255) not null,
    TS_CONTACT_MAIL varchar(255),
    TS_CONTACT_PHONE varchar(255),
    TS_DESCRIPTION longvarchar not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_ABOUT_TRACKING
-- begin HEATMAPRESSOURCES_USERS
create table HEATMAPRESSOURCES_USERS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRSTNAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    EMAIL varchar(255) not null,
    USER_RIGHTS_GROUP varchar(255),
    USER_RIGHTS_ROLE varchar(255) not null,
    USER_RIGHTS_SUBSTITUTION varchar(255) not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_USERS
-- begin HEATMAPRESSOURCES_HUMANS
create table HEATMAPRESSOURCES_HUMANS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HR_FULLNAME varchar(255),
    HR_FIRST_NAME varchar(255) not null,
    HR_LAST_NAME varchar(255),
    HR_BIRTHDAY date,
    HR_IMEI_NUMBER varchar(255),
    HR_PHONENUMBER varchar(255) not null,
    HR_TRACKED_SINCE timestamp,
    HR_HEALTH_STATE varchar(1024),
    HR_DESCRIPTION varchar(255),
    HR_LOCATION VARCHAR(100),
    HR_LOCATION_TRACKING VARCHAR(100),
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_HUMANS
-- begin HEATMAPRESSOURCES_HEAT_MAPS_KIND
create table HEATMAPRESSOURCES_HEAT_MAPS_KIND (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HEAT_MAPS_KIND_NAME varchar(255) not null,
    HEAT_MAPS_KIND_DESCRIPTION varchar(2000) not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_HEAT_MAPS_KIND
-- begin HEATMAPRESSOURCES_RESPIRATORY_VENTILATOR
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
    RV_RESPIRATORY_VENTILATOR_SERIAL_NO varchar(255) not null,
    RV_RESPIRATORY_VENTILATOR_MODELL_NO varchar(255) not null,
    RV_RESPIRATORY_VENTILATOR_TYPE varchar(255) not null,
    RV_RESPIRATORY_VENTILATOR_MANUFACTURER varchar(255) not null,
    RV_RESPIRATORY_VENTILATOR_PROTABLE boolean,
    RV_RESPIRATORY_VENTILATOR_MAX_PATIENTS integer not null,
    RV_RESPIRATORY_VENTILATOR_DESCRIPTION varchar(2000) not null,
    RV_LOCATION VARCHAR(100),
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_RESPIRATORY_VENTILATOR
-- begin HEATMAPRESSOURCES_HOSPITAL_ROOM_FACILITIES
create table HEATMAPRESSOURCES_HOSPITAL_ROOM_FACILITIES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HRF_NAME varchar(255) not null,
    INTENSIVE_CARE_BEDS_NUMBER integer not null,
    RV_RESPIRATORY_VENTILATOR_ID varchar(36) not null,
    HRF_LOCATION_TRACKING VARCHAR(100),
    HRF_LOCATION_TRACKING_SOURCE VARCHAR(100),
    DSECRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_HOSPITAL_ROOM_FACILITIES
-- begin HEATMAPRESSOURCES_GLOBAL_RESOURCES
create table HEATMAPRESSOURCES_GLOBAL_RESOURCES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    GR_TRACKING_WHAT_ID varchar(36) not null,
    GR_TRACKING_URL varchar(512) not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_GLOBAL_RESOURCES
-- begin HEATMAPRESSOURCES_TRACKING
create table HEATMAPRESSOURCES_TRACKING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TR_TRACK_OVER varchar(50),
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_TRACKING
-- begin HEATMAPRESSOURCES_HEAT_MAP_HUMANS5G
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
    HAS_CORONA_SINCE timestamp,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_HEAT_MAP_HUMANS5G
-- begin HEATMAPRESSOURCES_STATE_PROVINCE_DISTRICT
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
    COUNTRY_NAME_ID varchar(36) not null,
    STATE_PROVINCE_DISTRICT_NAME varchar(255) not null,
    DESCRIPTION varchar(255),
    SPD_EMERGENCY_CONTACT_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_STATE_PROVINCE_DISTRICT
-- begin HEATMAPRESSOURCES_CITY_TOWN
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
    CT_COUNTRY_ID varchar(36) not null,
    CT_EMERGENCY_CONTACT_ID varchar(36) not null,
    CT_LOCATION VARCHAR(4000),
    CITY_NAME varchar(255) not null,
    DESCRIPTION varchar(255),
    CT_ZIP_CODE varchar(255) not null,
    STATE_PROVINCE_DISTRICT_NAME_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_CITY_TOWN
-- begin HEATMAPRESSOURCES_CONTROL_CENTER
create table HEATMAPRESSOURCES_CONTROL_CENTER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(100),
    --
    CC_NAME varchar(255) not null,
    CC_LOCATION VARCHAR(100) not null,
    CC_CONTACT varchar(255),
    CC_MAIN_TRACKING_SOURCES varchar(512),
    --
    -- from heatmapressources_Abmulance
    A_NAME varchar(255) not null,
    ET_CONTROL_CENTER_ID varchar(36) not null,
    A_LOCATION VARCHAR(100),
    A_TRACKING_SOURCE varchar(255) not null,
    A_TYPE varchar(255),
    A_DIRECT_CONTACT varchar(255),
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_CONTROL_CENTER
-- begin HEATMAPRESSOURCES_HOSPITAL
create table HEATMAPRESSOURCES_HOSPITAL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(100),
    --
    H_CONTROL_CENTER_ID varchar(36) not null,
    H_LOCATION_UUID varchar(255),
    H_ADDRESS longvarchar,
    H_NAME varchar(255) not null,
    H_LOCATION VARCHAR(100),
    H_MAX_ROOMS integer not null,
    H_ROOMS_WITH_RESPIRATORY_VENTILATOR integer not null,
    H_ROOMS_WITH_RESPIRATORY_VENTILATOR_FREE integer,
    H_INTENSIVE_CARE_UNITS integer,
    H_DESCRIPTION varchar(255) not null,
    --
    -- from heatmapressources_HospitalContacts
    HC_HOSPITAL_ID varchar(36) not null,
    HOSPITAL_MAIN_CONTACT varchar(255) not null,
    HC_PHONE_NUMBER varchar(255) not null,
    HC_EMAIL varchar(255) not null,
    HC_FAXIMILE varchar(255),
    HC_HEAD_OF varchar(255),
    DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_HOSPITAL
-- begin HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM
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
    HPR_RESSOURCES longvarchar,
    DESCRIPTION varchar(255) not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM
-- begin HEATMAPRESSOURCES_MEDICAL_PROFESSIONALS
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
    MP_NAME varchar(255) not null,
    MP_CONTROL_CENTER_ID varchar(36) not null,
    MP_UNIQUE_SOCIAL_NUMBER varchar(255),
    MP_CERTIFICATION varchar(255) not null,
    HR_IMEI_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_MEDICAL_PROFESSIONALS
-- begin HEATMAPRESSOURCES_EMERGENCY_HELICOPTER
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
    EH_NAME varchar(255) not null,
    EH_CONTROL_CENTER_ID varchar(36) not null,
    EH_EMERGENCY_HELICOPTER_UUID varchar(255) not null,
    EH_LOCATION_HOME VARCHAR(100) not null,
    EH_LOCATION_TRACKING VARCHAR(100),
    EH_TRACKING_SOURCE varchar(512),
    EH_CONTACT varchar(255) not null,
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_EMERGENCY_HELICOPTER
-- begin HEATMAPRESSOURCES_COUNTRY
create table HEATMAPRESSOURCES_COUNTRY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COUNTRY_NAME varchar(255) not null,
    C_EMERGENCY_WEBSITE varchar(512) not null,
    C_LOCATION VARCHAR(100),
    C_EMERGENCY_CONTACT_ID varchar(36),
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_COUNTRY
-- begin HEATMAPRESSOURCES_EMERGENCY_TRANSPORTATION
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
    ET_NAME varchar(255) not null,
    ET_CONTROL_CENTER_ID varchar(36) not null,
    ET_AMBULANCE_UUID varchar(512),
    ET_EMERGENCY_HELICOPTER varchar(512),
    ET_LOCATION VARCHAR(100),
    ET_TRACKING_SOURCE varchar(512),
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_EMERGENCY_TRANSPORTATION
-- begin HEATMAPRESSOURCES_THINGS
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
)^
-- end HEATMAPRESSOURCES_THINGS
-- begin HEATMAPRESSOURCES_POLY_GON_DATABASE
create table HEATMAPRESSOURCES_POLY_GON_DATABASE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DESCRIPTION varchar(255) not null,
    POLYGONE VARCHAR(4000),
    --
    primary key (ID)
)^
-- end HEATMAPRESSOURCES_POLY_GON_DATABASE
