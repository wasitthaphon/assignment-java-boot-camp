# Apis

## ตารางแสดง Api ที่จำเป็นต้องใช้

| Method | Url                             | Description                     | Request/response <br />reference                                                 |
| ------ | ------------------------------- | ------------------------------- | -------------------------------------------------------------------------------- |
| GET    | /products                       | แสดงรายการ product ที่มี        | [Get products](products.md#get-products)                                         |
| GET    | /products/{id}                  | แสดงรายการ product อย่างเจาะจง  | [Get product by id](products.md#get-productsid)                                  |
| GET    | /users/{usesrId}                | แสดงรายการ user อย่างเจาะจง     | [Get user by id](users.md#get-useruserid)                                        |
| GET    | /baskets/{userId}               | แสดงรายการสินค้าในตะกร้า        | [Get baskets](baskets.md#get-basketsuserid)                                      |
| POST   | /baskets                        | สร้างสินค้าเตรียมซื้อ           | [Post basket](baskets.md#post-basketsuserid)                                     |
| POST   | /shipping-instruction           | สร้างคำสั่งซื้อ                 | [Post shipping-instruction](shipping-instruction.md#post-shipping-instruction)   |
| GET    | /shipping-instruction/{id}      | แสดงรายการสั่งซื้ออย่างเจาะจง   | [Get shipping-instruction](shipping-instruction.md#get-shipping-instructionid)   |
| PUT    | /shipping-instruction/{id}      | อัปเดตรายการสั่งซื้อ            | [Put shipping-insstruction](shipping-instruction.md#put-shipping-instructionid)  |
| GET    | /payments/{paymentId}           | เรียกรายการการชำระเงิน          | [Get payment by id](payment.md#get-paymentspaymentid)                            |
| POST   | /payments/debit-credit          | สร้างการชำระเงิน                | [Post mayments by debit/credit](payment.md#post-paymentsdebit-credit)            |
| POST   | /invoices                       | สร้าง invoice                   | [Post invoices](invoices.md#post-invoices)                                       |
| GET    | /invoices/{id}                  | แสดง invoice อย่างเจาะจง        | [Get invoice by id](invoices.md#get-invoicesid)                                  |
| GET    | /users/{id}                     | แสดง user อย่างเจาะจง           | [Get user by id](users.md#get-useruserid)                                        |
| GET    | /addresses/{userId}             | แสดงที่อยู่ทั้งหมดของผู้ใช้     | [Get addresses by userId](addresses.md#get-addressesuserid)                      |
| GET    | /addresses/{userId}/{addressId} | แสดงที่อยู่อย่างเจาะจงของผู้ใช้ | [Get address by userId and addressId](addresses.md#get-addressesuseridaddressid) |
