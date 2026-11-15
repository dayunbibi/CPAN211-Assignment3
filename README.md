# CPAN211 - Assignment 3 (Collections)

Reads `Sales.txt` and keeps two maps: customers by CustomerID (total bill) and products by ProductID (total items purchased).

## Roles
| # | Part | Member |
|---|------|--------|
| 1 | File reading + exception handling (try-with-resources) | TBD |
| 2 | Customer map - update total bill | TBD |
| 3 | Product map - update items purchased | Dayun Yu |
| 4 | Output + short main + testing | TBD |

## How the parts connect
- After reading a line, call `productMap.updateProduct(productId, productName, items);`
- To print the products report, call `productMap.printProducts();`

## Workflow
Create a branch for your part, push it, and open a pull request to `main`.
