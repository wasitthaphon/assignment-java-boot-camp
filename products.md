# Api /products

## รายการ Api

- [GET /products](#get-products)
  - [Request](#request)
  - [Response](#response)
- [GET /products/{id}](#get-productsid)
  - [Request](#request-1)
  - [Response](#response-1)

## รายละเอียดของแต่ละ Api

### GET /products

**เรียกสินค้าที่มี**<br>
**แสดงรายการสินค้าที่มี**

#### Request

พารามิเตอร์ที่ใช้งานได้

Query parameters

| Name         | Type    | Description                         |
| ------------ | ------- | ----------------------------------- |
| search_query | String  | หารายการสินค้าด้วย contains keyword |
| limit        | Integer | รายการสูงสุดที่ต้องการส่งข้อมูลกลับ |

#### Response

Status code - 200

Response model - application/json <br>
ส่งกลับในรูปแบบอาร์เรย์ที่ไอเท็มมีโครงสร้างตามตาราง

| Name                                                | Type     | Description                   |
| --------------------------------------------------- | -------- | ----------------------------- |
| id                                                  | Integer  | ไอดีสินค้า                    |
| storeId                                             | Integer  | เลขร้านค้า                    |
| title                                               | String   | ชื่อสินค้า                    |
| price                                               | Double   | ราคาของสินค้า                 |
| hasDiscount                                         | Boolean  | Flag ว่ามี discount ไหม       |
| discount                                            | Integer  | เปอร์เซ็นต์ลดราคา             |
| discountExpiredDate                                 | String   | วันหมดเขตลดราคา               |
| rating                                              | Double   | เรตติ้ง                       |
| reviewerCount                                       | Integer  | จำนวนรีวิว                    |
| sellCity                                            | String   | เมืองที่จำหน่าย               |
| productProfileImageUrl                              | String   | ที่อยู่ของภาพโปรไฟล์ของสินค้า |
| onhandQuantity                                      | Integer  | จำนวนสินค้าคงเหลือ            |
| features                                            | object[] | รายการคุณสมบัติ               |
| &nbsp;&nbsp;&nbsp;id                                | Integer  | รหัสฟีเจอร์                   |
| &nbsp;&nbsp;&nbsp;name                              | String   | ชื่อของฟีเจอร์                |
| &nbsp;&nbsp;&nbsp;isRequired                        | Boolean  | ตัวกำกับว่าบังคับหรือไม่      |
| &nbsp;&nbsp;&nbsp;selectedOption                    | Integer  | ตัวเลือกที่เลือก              |
| &nbsp;&nbsp;&nbsp;featureOptions                    | object[] | ลิสต์ตัวเลือกของคุณสมบัติ     |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;featureOptionId | Integer  | ไอดีตัวเลือกของคุณสมบัติ      |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;optionName      | String   | ชื่อตัวเลือก                  |
| productImages                                       | Object[] | ภาพสินค้า                     |
| &nbsp;&nbsp;&nbsp;id                                | Integer  | ไอดีไฟล์ภาพสินค้า             |
| &nbsp;&nbsp;&nbsp;productImageUrl                   | String   | ที่อยู่ของไฟล์ภาพสินค้า       |

### GET /products/{id}

**เรียกสินค้าตามไอดี** <br>
**ส่งกลับ object ของสินค้าไอดีนั้น ๆ**

#### Request

พารามิเตอร์ที่ใช้งานได้

Path parameters

| Name | Type    | Description   |
| ---- | ------- | ------------- |
| id   | Integer | หมายเลขสินค้า |

#### Response

Status code - 200

Response model - application/json <br>
ส่งกลับในรูปแบบโครงสร้างตามตาราง

| Name                                                | Type     | Description                   |
| --------------------------------------------------- | -------- | ----------------------------- |
| id                                                  | Integer  | ไอดีสินค้า                    |
| storeId                                             | Integer  | เลขร้านค้า                    |
| title                                               | String   | ชื่อสินค้า                    |
| price                                               | Double   | ราคาของสินค้า                 |
| hasDiscount                                         | Boolean  | Flag ว่ามี discount ไหม       |
| discount                                            | Integer  | เปอร์เซ็นต์ลดราคา             |
| discountExpiredDate                                 | String   | วันหมดเขตลดราคา               |
| rating                                              | Double   | เรตติ้ง                       |
| reviewerCount                                       | Integer  | จำนวนรีวิว                    |
| sellCity                                            | String   | เมืองที่จำหน่าย               |
| productProfileImageUrl                              | String   | ที่อยู่ของภาพโปรไฟล์ของสินค้า |
| onhandQuantity                                      | Integer  | จำนวนสินค้าคงเหลือ            |
| features                                            | object[] | รายการคุณสมบัติ               |
| &nbsp;&nbsp;&nbsp;id                                | Integer  | รหัสฟีเจอร์                   |
| &nbsp;&nbsp;&nbsp;name                              | String   | ชื่อของฟีเจอร์                |
| &nbsp;&nbsp;&nbsp;isRequired                        | Boolean  | ตัวกำกับว่าบังคับหรือไม่      |
| &nbsp;&nbsp;&nbsp;selectedOption                    | Integer  | ตัวเลือกที่เลือก              |
| &nbsp;&nbsp;&nbsp;featureOptions                    | object[] | ลิสต์ตัวเลือกของคุณสมบัติ     |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;featureOptionId | Integer  | ไอดีตัวเลือกของคุณสมบัติ      |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;optionName      | String   | ชื่อตัวเลือก                  |
| productImages                                       | Object[] | ภาพสินค้า                     |
| &nbsp;&nbsp;&nbsp;id                                | Integer  | ไอดีไฟล์ภาพสินค้า             |
| &nbsp;&nbsp;&nbsp;productImageUrl                   | String   | ที่อยู่ของไฟล์ภาพสินค้า       |
