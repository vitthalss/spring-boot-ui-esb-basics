/*
  Clean the existing mess.
 */
DROP TABLE memos;
DROP SEQUENCE serial;

/*
  Create the new schemas.
 */

CREATE SEQUENCE serial START 1;
CREATE TABLE memos
(
  ID      SERIAL PRIMARY KEY,
  TITLE   VARCHAR(40) NOT NULL,
  AUTHOR  VARCHAR(40) NOT NULL,
  TEXT    TEXT        NOT NULL,
  ACTIVE  BOOLEAN   DEFAULT TRUE,
  CREATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  UPDATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);