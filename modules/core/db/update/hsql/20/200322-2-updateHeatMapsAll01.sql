alter table HEATMAPRESSOURCES_HEAT_MAPS_ALL add column HM_DESCRIPTION varchar(255) ^
update HEATMAPRESSOURCES_HEAT_MAPS_ALL set HM_DESCRIPTION = '' where HM_DESCRIPTION is null ;
alter table HEATMAPRESSOURCES_HEAT_MAPS_ALL alter column HM_DESCRIPTION set not null ;
-- alter table HEATMAPRESSOURCES_HEAT_MAPS_ALL add column HM_KIND_OF_ID varchar(36) ^
-- update HEATMAPRESSOURCES_HEAT_MAPS_ALL set HM_KIND_OF_ID = <default_value> ;
-- alter table HEATMAPRESSOURCES_HEAT_MAPS_ALL alter column HM_KIND_OF_ID set not null ;
alter table HEATMAPRESSOURCES_HEAT_MAPS_ALL add column HM_KIND_OF_ID varchar(36) not null ;
