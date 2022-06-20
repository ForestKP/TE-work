-- 12. Create a "Bill Murray Collection" in the collection table. For the movies that have Bill Murray in them, set their collection ID to the "Bill Murray Collection". (1 row, 6 rows)

INSERT INTO collection (collection_name)
VALUES ('Bill Murray collection');

UPDATE movie
SET collection_id = (SELECT collection_id FROM collection WHERE collection_name = 'Bill Murray Collection')
WHERE movie_id IN (
Select ma.movie_id
FROM person p 
JOIN movie_actor ma 
ON p.person_id = ma.actor_id
WHERE person_name = 'Bill Murray'
)
