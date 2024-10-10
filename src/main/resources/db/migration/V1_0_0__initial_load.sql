CREATE TABLE IF NOT EXISTS installation (
    dv_hub_id varchar NOT NULL PRIMARY KEY,
    name varchar,
    description varchar,
    latitude varchar,
    longitude varchar,
    hostname varchar,
    country varchar,
    continent varchar,
    launchYear integer,
    gdccMmember bool,
    doiAuthority varchar,
    contact_email varchar
);