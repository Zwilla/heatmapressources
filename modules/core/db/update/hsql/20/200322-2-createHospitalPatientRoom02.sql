alter table HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM add constraint FK_HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM_ON_HOSPITAL_PATIENT_ROOM foreign key (HOSPITAL_PATIENT_ROOM_ID) references HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM(ID);
create index IDX_HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM_ON_HOSPITAL_PATIENT_ROOM on HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM (HOSPITAL_PATIENT_ROOM_ID);