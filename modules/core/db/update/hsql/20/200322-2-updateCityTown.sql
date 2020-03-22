-- alter table HEATMAPRESSOURCES_CITY_TOWN add column CT_COUNTRY_ID varchar(36) ^
-- update HEATMAPRESSOURCES_CITY_TOWN set CT_COUNTRY_ID = <default_value> ;
-- alter table HEATMAPRESSOURCES_CITY_TOWN alter column CT_COUNTRY_ID set not null ;
alter table HEATMAPRESSOURCES_CITY_TOWN add column CT_COUNTRY_ID varchar(36) not null ;
-- alter table HEATMAPRESSOURCES_CITY_TOWN add column CT_EMERGENCY_CONTACT_ID varchar(36) ^
-- update HEATMAPRESSOURCES_CITY_TOWN set CT_EMERGENCY_CONTACT_ID = <default_value> ;
-- alter table HEATMAPRESSOURCES_CITY_TOWN alter column CT_EMERGENCY_CONTACT_ID set not null ;
alter table HEATMAPRESSOURCES_CITY_TOWN add column CT_EMERGENCY_CONTACT_ID varchar(36) not null ;
