-- alter table HEATMAPRESSOURCES_HOSPITAL_CONTACTS add column HC_HOSPITAL_ID varchar(36) ^
-- update HEATMAPRESSOURCES_HOSPITAL_CONTACTS set HC_HOSPITAL_ID = <default_value> ;
-- alter table HEATMAPRESSOURCES_HOSPITAL_CONTACTS alter column HC_HOSPITAL_ID set not null ;
alter table HEATMAPRESSOURCES_HOSPITAL_CONTACTS add column HC_HOSPITAL_ID varchar(36) not null ;
alter table HEATMAPRESSOURCES_HOSPITAL_CONTACTS add column HC_PHONE_NUMBER varchar(255) ^
update HEATMAPRESSOURCES_HOSPITAL_CONTACTS set HC_PHONE_NUMBER = '' where HC_PHONE_NUMBER is null ;
alter table HEATMAPRESSOURCES_HOSPITAL_CONTACTS alter column HC_PHONE_NUMBER set not null ;
alter table HEATMAPRESSOURCES_HOSPITAL_CONTACTS add column HC_FAXIMILE varchar(255) ;
alter table HEATMAPRESSOURCES_HOSPITAL_CONTACTS add column HC_HEAD_OF varchar(255) ;
alter table HEATMAPRESSOURCES_HOSPITAL_CONTACTS add column HC_EMAIL varchar(255) ^
update HEATMAPRESSOURCES_HOSPITAL_CONTACTS set HC_EMAIL = '' where HC_EMAIL is null ;
alter table HEATMAPRESSOURCES_HOSPITAL_CONTACTS alter column HC_EMAIL set not null ;