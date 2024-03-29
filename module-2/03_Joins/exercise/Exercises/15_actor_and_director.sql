-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)
SELECT m.title, p.person_name
FROM movie AS m
    JOIN movie_actor AS ma USING (movie_id)
	JOIN person AS p ON ma.actor_id = p.person_id
WHERE  m.director_id = ma.actor_id;
