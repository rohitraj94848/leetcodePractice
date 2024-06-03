SELECT
    s.user_id,
    ROUND(
        avg(case when c.action = "confirmed" then 1.0 else 0.0 end),2
    ) AS confirmation_rate
FROM
    Signups s
LEFT JOIN
    Confirmations c ON s.user_id = c.user_id
GROUP BY
    s.user_id;
