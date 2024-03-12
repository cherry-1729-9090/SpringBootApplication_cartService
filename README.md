***CART SERVICE APPLICATION***

**Step 1 :**

Clone the repo using to your local system

`git clone https://github.com/cherry-1729-9090/SpringBootApplication_cartService.git`



**Step 2 :**


**Test the api by adding all the below end points to the following url `http:localhost:8080/`**



**REQUEST**

1. GET
   
    Endpoints:



     a. `/carts/{id}` --- Get a single Cart
**RESPONSE**
    ![getSingleCart()](https://github.com/cherry-1729-9090/SpringBootApplication_cartService/assets/145871325/9ed02a17-4d25-4fde-8cfe-8749d0c27d0c)




   
     b.`/carts`  --- Get all carts
**RESPONSE**

  ![getAllCarts()](https://github.com/cherry-1729-9090/SpringBootApplication_cartService/assets/145871325/ca1267b4-324b-4ec3-a50a-6776ea0a9df6)




     c. `carts/user/{id}` --- Get user carts
**RESPONSE**

![getUserCarts()](https://github.com/cherry-1729-9090/SpringBootApplication_cartService/assets/145871325/ac2491fb-039d-4649-9a33-f1d4907409fb)





     d. `/carts?startdate={strt_dt}&enddate={end_dt}` --- Get carts in a date range
**RESPONSE**
![getCartInDate()](https://github.com/cherry-1729-9090/SpringBootApplication_cartService/assets/145871325/3e3d7100-6e4b-4cff-b1ae-d4c354e93110)




3. DELETE

   Endpoints:

   a. `/carts/{id}` --- Delete a cart
**RESPONSE**
![DeleteCart()](https://github.com/cherry-1729-9090/SpringBootApplication_cartService/assets/145871325/9ea34cb9-ab35-4539-946c-dde9500aca29)





5. POST

  Endpoints:

  a. `/carts` --- Add a new cart
**RESPONSE**

![AddProduct()](https://github.com/cherry-1729-9090/SpringBootApplication_cartService/assets/145871325/2527ba91-084e-4da3-9d5b-1e06920c350b)





4. PUT

  Endpoints:

  a.`/carts/{id}` --- Update a cart

**RESPONSE**

![updateCart()](https://github.com/cherry-1729-9090/SpringBootApplication_cartService/assets/145871325/b2b2cdb0-53e1-4228-9c32-afa10d370f47)

