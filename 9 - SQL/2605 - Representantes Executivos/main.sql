SELECT
  products.name,
  providers.name
FROM
  products
JOIN
  providers
ON
  id_providers = providers.id
JOIN
  categories
ON
  id_categories = categories.id
WHERE
  id_categories = 6;