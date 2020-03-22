alter table HEATMAPRESSOURCES_HOSPITAL_ROOM_FACILITIES add constraint FK_HEATMAPRESSOURCES_HOSPITAL_ROOM_FACILITIES_ON_RV_RESPIRATORY_VENTILATOR foreign key (RV_RESPIRATORY_VENTILATOR_ID) references HEATMAPRESSOURCES_RESPIRATORY_VENTILATOR(ID);
create index IDX_HEATMAPRESSOURCES_HOSPITAL_ROOM_FACILITIES_ON_RV_RESPIRATORY_VENTILATOR on HEATMAPRESSOURCES_HOSPITAL_ROOM_FACILITIES (RV_RESPIRATORY_VENTILATOR_ID);