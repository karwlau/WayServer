UPDATE sys_menu c
SET path = concat(
	(
		SELECT
			t2.pp
		FROM
			(
				SELECT
					t.id AS pid,
					t.path pp
				FROM
					sys_menu t
			) t2
		WHERE
			t2.pid = c.parent_id
	),
	',',
	c.id
)
WHERE
	c.path IS NULL
AND c.depth = 5;