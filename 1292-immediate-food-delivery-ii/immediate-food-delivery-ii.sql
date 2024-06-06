SELECT 
    ROUND((SUM(CASE WHEN order_date = customer_pref_delivery_date THEN 1 ELSE 0 END) / COUNT(DISTINCT customer_id)) * 100, 2) AS immediate_percentage 
FROM 
    Delivery AS d1
WHERE 
    order_date = (SELECT MIN(order_date) FROM Delivery AS d2 WHERE d1.customer_id = d2.customer_id);
