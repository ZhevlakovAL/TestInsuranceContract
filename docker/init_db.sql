-- PostgreSQL DB init script on first create 'pgsql-data' docker-volume.

CREATE DATABASE demo WITH OWNER = demo ENCODING = 'UTF8';
COMMENT ON DATABASE demo IS 'Registry of State Regions and Districts';