CREATE TABLE material (
  id   SERIAL,
  properties JSONB
);

DROP OPERATOR IF EXISTS #-#(JSONB,TEXT);

CREATE OPERATOR #-# (
  PROCEDURE = jsonb_exists,
  LEFTARG = JSONB,
  RIGHTARG = TEXT,
  RESTRICT = contsel,
  JOIN = contjoinsel
);