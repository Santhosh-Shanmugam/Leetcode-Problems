# Write your MySQL query statement below
select actor_id , director_id from ActorDirector
-- where actor_id = director_id
group by actor_id , director_id
having count(*) >= 3;