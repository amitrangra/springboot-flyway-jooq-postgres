CREATE TABLE IF NOT EXISTS restsample.USER (
  id                  BIGSERIAL        PRIMARY KEY NOT NULL UNIQUE,
  username            VARCHAR(255)     UNIQUE NOT NULL,
  first_name          VARCHAR(255),
  middle_name         VARCHAR(255),
  last_name           VARCHAR(255),
  email               VARCHAR(255),
  created_on timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_on timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP
);