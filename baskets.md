# Api /baskets

## รายการ Api

- [GET /baskets/{basketId}](#get-basketsuserid)
  - [Request](#request)
  - [Response](#response)
- [POST /baskets/{userId}](#post-basketuserid)
  - [Request](#request-2)
  - [Response](#response-2)

## รายละเอียดของแต่ละ Api

### GET /baskets/{basketId}

**เรียกสินค้าเตรียมซื้อทั้งหมดในตระกร้าของผู้ใช้นั้น ๆ**
**ส่งกลับรายการสินค้าเตรียมซื้อทั้งหมด**

#### Request

พารามิเตอร์ที่ใช้งานได้

Path parameters

| Name     | Type    | Description      |
| -------- | ------- | ---------------- |
| basketId | Integer | ไอดีตะกร้าสินค้า |

#### Response

Response model - application/json
ส่งกลับรูปแบบอาร์เรย์ของไอเท็มที่มีโครงสร้างตามตาราง

| Name          | Tpye    | Description  |
| ------------- | ------- | ------------ |
| basketId      | Integer | ไอดีตะกร้า   |
| user          | User    | ผู้ใช้       |
| product       | Product | สินค้า       |
| orderQuantity | Integer | จำนวนที่ซื้อ |

### POST /baskets

**สร้างสินค้าเตรียมซื้อ**
**ส่งกลับสถานะการสร้าง**

#### Request

พารามิเตอร์ที่ใช้งานได้

ไม่มีพารามิเตอร์ที่ใช้งานได้

Request body

| Name                              | Type     | Description             |
| --------------------------------- | -------- | ----------------------- |
| userId                            | Integer  | ไอดีผู้ใช้              |
| productId                         | Integer  | ไอดีสินค้า              |
| orderQuantity                     | Integer  | จำนวนที่ซื้อ            |
| featureSelected                   | Object[] | รายการคุณสมบัติที่เลือก |
| &nbsp;&nbsp;&nbsp;featureId       | Ineger   | ไอดีฟีเจอร์             |
| &nbsp;&nbsp;&nbsp;featureOptionId | Ineger   | ไอดีตัวเลือก            |

#### Response

Response model - application/json
ส่งกลับรูปแบบอาร์เรย์ของไอเท็มที่มีโครงสร้างตามตาราง

| Name          | Tpye    | Description  |
| ------------- | ------- | ------------ |
| basketId      | Integer | ไอดีตะกร้า   |
| user          | User    | ผู้ใช้       |
| product       | Product | สินค้า       |
| orderQuantity | Integer | จำนวนที่ซื้อ |

Status code - 200
