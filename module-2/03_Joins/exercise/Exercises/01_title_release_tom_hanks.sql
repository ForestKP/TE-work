-- 1. The titles and release dates of movies that Tom Hanks has appeared in (47 rows)
SELECT m.title, m.release_date
FROM person p
--WHERE p.person_name = 'Tom Hanks';
--go to actor_id
JOIN movie_actor ma
ON p.person_id = ma.actor_id
--change to movie id
JOIN movie m
ON ma.movie_id = m.movie_id
WHERE p.person_name = 'Tom Hanks';
