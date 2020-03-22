alter table HEATMAPRESSOURCES_PATIENTS add column P_DISEASE longvarchar ^
update HEATMAPRESSOURCES_PATIENTS set P_DISEASE = '' where P_DISEASE is null ;
alter table HEATMAPRESSOURCES_PATIENTS alter column P_DISEASE set not null ;
-- alter table HEATMAPRESSOURCES_PATIENTS add column PATIENT_HUMAN_ID varchar(36) ^
-- update HEATMAPRESSOURCES_PATIENTS set PATIENT_HUMAN_ID = <default_value> ;
-- alter table HEATMAPRESSOURCES_PATIENTS alter column PATIENT_HUMAN_ID set not null ;
alter table HEATMAPRESSOURCES_PATIENTS add column PATIENT_HUMAN_ID varchar(36) not null ;
