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
    TS_CONTACT_CONTACT_PHONE varchar(255),
    TS_DESCRIPTION longvarchar not null,
    --
    primary key (ID)
);