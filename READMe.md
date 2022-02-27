# Api assignment

## Story

นายรามี่ต้องการซื้อรองเท้า Adidas NMD โดยเขาพิมพ์ค้นหาว่า "Adidas NMD" จากนั้น
ผลการค้นหาแสดงรายการรองเท้า Adidas NMD มา 5 รายการ นายรามี่เลือกรายการที่ 4

หลังจากคลิ้กเลือกแล้ว เว็บไซต์แสดงข้อมูลรองเท้า Adidas NMD รายการที่ 4 ในหน้าถัดไป
นายรามี่กด "ใส่ตระกร้า" หลังจากนั้นเว็บพาไปยังหน้าแสดงรายการสินค้าในตระกร้า
ที่มีรองเท้า Adidas NMD รายการที่ 4 ที่ต้องการซื้อไว้ พร้อมทั้งคำนวณยอดสุทธิในตระกร้าไว้ด้วย

นายรามี่กดชำระค่าสินค้า จากนั้นเว็บไซต์พาไปยังหน้าให้ใส่ที่อยู่จัดส่งที่มีรายการสรุปการสั่งซื้อ
รองเท้า Adidas NMD รายการที่ 4 อยู่ แต่ส่วนรายละเอียดที่อยู่นั้น
เว็บดึงที่อยู่ที่นายรามีเคยบันทึกไว้มาใส่ให้เลย

จากนั้นนายรามี่กดดำเนินการต่อ นายรามี่เลือกชำระเงินด้วยบัตรเครดิต โดยใส่หมายเลขบัตรของนายรามี่เองและบัตรเครดิตของนารามี่
มีวงเงินเพียงพอสำหรับซื้อรองเท้า Adidas NMD นายรามี่กรอกเลขบัตร "1234-5678-9012-3456"
ชื่อบนบัตร Rami Abdulla วันที่บัตรหมดอายุ 09/25 CCV 777
นายรามี่ตรวจสอบที่อยู่ และสรุปการสั่งซื้อที่ปรากฏบนหน้า Payment อีกครั้ง

จากนั้นนายรามี่กดสั่งสินค้าแล้วตัวเว็บพาไปยังหน้าใบแจ้งการชำระเงินให้นายรามี่

## ตารางแสดง Api ที่จำเป็นต้องใช้

| Method   | Url                            | Description                       | Request/response <br />reference                                                    |
| -------- | ------------------------------ | --------------------------------- | ----------------------------------------------------------------------------------- |
| GET      | /products                      | แสดงรายการ product ที่มี          | [Get products](products.md#get-products)                                            |
| GET      | /products/{id}                 | แสดงรายการ product อย่างเจาะจง    | [Get product by id](products.md#get-productsid)                                     |
| GET      | /baskets/{basketId}            | แสดงรายการสินค้าในตะกร้า          | [Get baskets](baskets.md#get-basketsuserid)                                         |
| POST     | /baskets                       | สร้างสินค้าเตรียมซื้อ             | [Post basket](baskets.md#post-basketsuserid)                                        |
| ~~POST~~ | ~~/shipping-instruction~~      | ~~สร้างคำสั่งซื้อ~~               | ~~[Post shipping-instruction](shipping-instruction.md#post-shipping-instruction)~~  |
| ~~GET~~  | ~~/shipping-instruction/{id}~~ | ~~แสดงรายการสั่งซื้ออย่างเจาะจง~~ | ~~[Get shipping-instruction](shipping-instruction.md#get-shipping-instructionid)~~  |
| ~~PUT~~  | ~~/shipping-instruction/{id}~~ | ~~อัปเดตรายการสั่งซื้อ~~          | ~~[Put shipping-insstruction](shipping-instruction.md#put-shipping-instructionid)~~ |
| ~~GET~~  | ~~/payments/{paymentId}~~      | ~~เรียกรายการการชำระเงิน~~        | ~~[Get payment by id](payment.md#get-paymentspaymentid)~~                           |
| ~~POST~~ | ~~/payments/debit-credit~~     | ~~สร้างการชำระเงิน~~              | ~~[Post mayments by debit/credit](payment.md#post-paymentsdebit-credit)~~           |
| ~~POST~~ | ~~/invoices~~                  | ~~สร้าง invoice~~                 | ~~[Post invoices](invoices.md#post-invoices)~~                                      |
| ~~GET~~  | ~~/invoices/{id}~~             | ~~แสดง invoice อย่างเจาะจง~~      | ~~[Get invoice by id](invoices.md#get-invoicesid)~~                                 |
