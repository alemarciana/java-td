-- Primera Consulta
USE world;
SELECT languages.language,countries.name,languages.percentage FROM languages
JOIN countries ON countries.id = languages.country_id
WHERE languages.language='slovene';
-- Segunda Consulta
SELECT countries.name as 'Country Name', COUNT(cities.country_id) AS 'Cities' FROM cities 
JOIN countries ON countries.id = cities.country_id
GROUP BY countries.name
order by Cities desc;
-- Tercera Consulta
SELECT name, population, country_code FROM cities WHERE country_id=136 AND population > 500000;
-- Cuarta Consulta
SELECT countries.name, languages.language, languages.percentage FROM languages
JOIN countries ON countries.id = languages.country_id
WHERE percentage > 89 ORDER BY percentage DESC;
-- Quinta Consulta
SELECT name, surface_area, population FROM countries WHERE surface_area < 501 AND population > 100000;
-- Sexta Consulta
SELECT name, government_form, capital, life_expectancy FROM countries WHERE government_form = 'Constitutional Monarchy' AND capital > 200 AND life_expectancy > 75;
-- Septima Consulta
SELECT countries.name, cities.name, cities.district, cities.population FROM cities 
JOIN countries ON cities.country_id = countries.id
WHERE country_id='9' AND cities.population > 500000;
-- Octava Consulta
SELECT countries.region AS 'Region', COUNT(countries.name) AS 'Countries' FROM countries
GROUP BY countries.region
ORDER BY Countries desc;