-- Download file "pp-complete.csv", which has all records.
-- If schema changes/field added, consult: https://www.gov.uk/guidance/about-the-price-paid-data

-- Create table:
CREATE TABLE land_registry_price_paid_uk(
  transaction uuid,
  price numeric,
  transfer_date date,
  postcode text,
  property_type char(1),
  newly_built boolean,
  duration char(1),
  paon text,
  saon text,
  street text,
  locality text,
  city text,
  district text,
  county text,
  ppd_category_type char(1),
  record_status char(1));
