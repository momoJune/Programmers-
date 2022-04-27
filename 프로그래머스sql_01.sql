-- 코드를 입력하세요
SELECT * 
from ANIMAL_INS
order by animal_id;

-- 코드를 입력하세요
SELECT  NAME,	DATETIME
from animal_ins
order by ANIMAL_ID desc ;

-- 코드를 입력하세요
SELECT ANIMAL_ID,	NAME
from animal_ins
where INTAKE_CONDITION = "sick"
order by animal_id;

-- 코드를 입력하세요
SELECT ANIMAL_ID,	NAME
from animal_ins
where intake_condition != 'Aged'
order by  animal_id;

-- 코드를 입력하세요
SELECT ANIMAL_ID,	NAME
from animal_ins
order by animal_id;

-- 코드를 입력하세요
SELECT ANIMAL_ID,	NAME,	DATETIME
from animal_ins
order by name, datetime desc

-- 코드를 입력하세요
SELECT name
from animal_ins
order by datetime
limit 1;