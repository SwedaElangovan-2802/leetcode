select s.machine_id, round(avg(e.timestamp - s.timestamp), 3) AS processing_time
from Activity s
Join Activity e
ON s.machine_id = e.machine_id
AND s.process_id = e.process_id
AND s.activity_type = 'start'
And e.activity_type = 'end'
GROUP BY s.machine_id;