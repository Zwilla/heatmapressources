alter table HEATMAPRESSOURCES_RESPIRATORY_VENTILATOR add column RV_RESPIRATORY_VENTILATOR_SERIAL_NO varchar(255) ^
update HEATMAPRESSOURCES_RESPIRATORY_VENTILATOR set RV_RESPIRATORY_VENTILATOR_SERIAL_NO = '' where RV_RESPIRATORY_VENTILATOR_SERIAL_NO is null ;
alter table HEATMAPRESSOURCES_RESPIRATORY_VENTILATOR alter column RV_RESPIRATORY_VENTILATOR_SERIAL_NO set not null ;
alter table HEATMAPRESSOURCES_RESPIRATORY_VENTILATOR add column RV_LOCATION VARCHAR(100) ;
