SELECT
    categories.name,
    SUM(products.amount) AS sum
FROM
    products
INNER JOIN
    categories
ON
    id_categories = categories.id
GROUP BY
    categories.name
