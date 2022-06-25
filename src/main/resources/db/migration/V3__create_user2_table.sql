CREATE TABLE IF NOT EXISTS restsample.USER2 (
  id                  INTEGER          PRIMARY KEY NOT NULL UNIQUE,
  username            VARCHAR(255)     UNIQUE NOT NULL,
  email               VARCHAR(255)     UNIQUE NOT NULL,
  password            VARCHAR(255)     NOT NULL,
  date_added timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP
);