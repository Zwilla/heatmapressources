alter table HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM alter column HOSPITAL_PATIENT_ROOM_ID rename to HOSPITAL_PATIENT_ROOM_ID__U82299 ^
alter table HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM alter column HOSPITAL_PATIENT_ROOM_ID__U82299 set null ;
alter table HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM drop constraint FK_HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM_ON_HOSPITAL_PATIENT_ROOM ;
drop index IDX_HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM_ON_HOSPITAL_PATIENT_ROOM ;
-- alter table HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM add column HOSPITAL_PATIENT_ROOM_ID varchar(36) ^
-- update HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM set HOSPITAL_PATIENT_ROOM_ID = <default_value> ;
-- alter table HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM alter column HOSPITAL_PATIENT_ROOM_ID set not null ;
alter table HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM add column HOSPITAL_PATIENT_ROOM_ID varchar(36) not null ;
alter table HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM add column HPR_RESSOURCES longvarchar ;
