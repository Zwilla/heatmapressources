alter table HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM add constraint FK_HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM_ON_HOSPITAL_PATIENT_ROOM foreign key (HOSPITAL_PATIENT_ROOM_ID) references HEATMAPRESSOURCES_HOSPITAL(ID);
