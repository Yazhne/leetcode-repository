-- Last updated: 8/23/2026, 10:40:50 AM
SELECT 
    p.product_name,             -- get product name
    SUM(o.unit) AS unit         -- total units sold in Feb 2020
FROM Orders o
JOIN Products p
    ON o.product_id = p.product_id
WHERE o.order_date BETWEEN '2020-02-01' AND '2020-02-29'   -- only Feb 2020
GROUP BY p.product_id, p.product_name
HAVING SUM(o.unit) >= 100;       -- only products with 100+ total