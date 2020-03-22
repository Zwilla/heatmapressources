-- alter table HEATMAPRESSOURCES_HOSPITAL add column H_CONTROL_CENTER_ID varchar(36) ^
-- update HEATMAPRESSOURCES_HOSPITAL set H_CONTROL_CENTER_ID = <default_value> ;
-- alter table HEATMAPRESSOURCES_HOSPITAL alter column H_CONTROL_CENTER_ID set not null ;
alter table HEATMAPRESSOURCES_HOSPITAL add column H_CONTROL_CENTER_ID varchar(36) not null ;
