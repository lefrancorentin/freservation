#!/bin/bash
set -e
psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL

  CREATE TYPE languagelevel AS ENUM ('A1', 'A2', 'B1', 'B2', 'C1', 'C2');

  CREATE TABLE bookings (
      id serial PRIMARY KEY,
      firstName VARCHAR (50) NOT NULL,
      lastName VARCHAR  (50) NOT NULL,
      languageLevel languageLevel NOT NULL,
      email VARCHAR(255) UNIQUE NOT NULL,
      startDate TIMESTAMP NOT NULL,
      endDate TIMESTAMP NOT NULL,
      bookingDate TIMESTAMP NOT NULL default current_timestamp
    );

EOSQL