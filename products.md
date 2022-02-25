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
| productId                                           | Integer  | ไอดีสินค้า                    |
| storeId                                             | Integer  | เลขร้านค้า                    |
| title                                               | String   | ชื่อสินค้า                    |
| features                                            | object[] | รายการคุณสมบัติ               |
| &nbsp;&nbsp;&nbsp;featuresId                        | Integer  | รหัสฟีเจอร์                   |
| &nbsp;&nbsp;&nbsp;name                              | String   | ชื่อของฟีเจอร์                |
| &nbsp;&nbsp;&nbsp;isRequired                        | Boolean  | ตัวกำกับว่าบังคับหรือไม่      |
| &nbsp;&nbsp;&nbsp;featureOptions                    | object[] | ลิสต์ตัวเลือกของคุณสมบัติ     |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;featureOptionId | Integer  | ไอดีตัวเลือกของคุณสมบัติ      |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;featuresId      | Integer  | ไอดีคุณสมบัติ                 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;optionName      | String   | ชื่อตัวเลือก                  |
| price                                               | Double   | ราคาของสินค้า                 |
| priceAfterDiscount                                  | Double   | ราคาหลังหักส่วนลด             |
| discountPercent                                     | Integer  | เปอร์เซ็นต์ลดราคา             |
| ratingStar                                          | Integer  | เรตติ้งเป็นเปอร์เซ็นต์        |
| reviewerCount                                       | Integer  | จำนวนคนให้คะแนน               |
| originSellCity                                      | String   | เมืองที่จำหน่าย               |
| productProfileImageUrl                              | String   | ที่อยู่ของภาพโปรไฟล์ของสินค้า |
| productImages                                       | Object[] | ภาพสินค้า                     |
| &nbsp;&nbsp;&nbsp;productImageId                    | Integer  | ไอดีไฟล์ภาพสินค้า             |
| &nbsp;&nbsp;&nbsp;productId                         | Integer  | รหัสสินค้า                    |
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
| productId                                           | Integer  | ไอดีสินค้า                    |
| storeId                                             | Integer  | เลขร้านค้า                    |
| title                                               | String   | ชื่อสินค้า                    |
| features                                            | object[] | รายการคุณสมบัติ               |
| &nbsp;&nbsp;&nbsp;featuresId                        | Integer  | รหัสฟีเจอร์                   |
| &nbsp;&nbsp;&nbsp;name                              | String   | ชื่อของฟีเจอร์                |
| &nbsp;&nbsp;&nbsp;isRequired                        | Boolean  | ตัวกำกับว่าบังคับหรือไม่      |
| &nbsp;&nbsp;&nbsp;featureOptions                    | object[] | ลิสต์ตัวเลือกของคุณสมบัติ     |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;featureOptionId | Integer  | ไอดีตัวเลือกของคุณสมบัติ      |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;featuresId      | Integer  | ไอดีคุณสมบัติ                 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;optionName      | String   | ชื่อตัวเลือก                  |
| price                                               | Double   | ราคาของสินค้า                 |
| priceAfterDiscount                                  | Double   | ราคาหลังหักส่วนลด             |
| discountPercent                                     | Integer  | เปอร์เซ็นต์ลดราคา             |
| ratingStar                                          | Integer  | เรตติ้งเป็นเปอร์เซ็นต์        |
| reviewerCount                                       | Integer  | จำนวนคนให้คะแนน               |
| originSellCity                                      | String   | เมืองที่จำหน่าย               |
| productProfileImageUrl                              | String   | ที่อยู่ของภาพโปรไฟล์ของสินค้า |
| productImages                                       | Object[] | ภาพสินค้า                     |
| &nbsp;&nbsp;&nbsp;productImageId                    | Integer  | ไอดีไฟล์ภาพสินค้า             |
| &nbsp;&nbsp;&nbsp;productId                         | Integer  | รหัสสินค้า                    |
| &nbsp;&nbsp;&nbsp;productImageUrl                   | String   | ที่อยู่ของไฟล์ภาพสินค้า       |
