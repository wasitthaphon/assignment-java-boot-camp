# Api /baskets

## รายการ Api

- [GET /baskets/{userId}/{orderId}](#get-basketsuseridorderid)
  - [Request](#request)
  - [Response](#response)
- [POST /baskets/{userId}](#post-basketuserid)
  - [Request](#request-1)
  - [Response](#response-1)
- [PUT /baskets/{userId}/{orderId}](#put-basketuseridorderid)
  - [Request](#request-2)
  - [Response](#response-2)
- [DELETE /baskets/{userId}/{orderId}](#delete-basketuseridorderid)
  - [Request](#request-3)
  - [Response](#response-3)

## รายละเอียดของแต่ละ Api

### GET /baskets/{userId}/{orderId}

**เรียกสินค้าในตระกร้าของผู้ใช้**
**แสดงสินค้าที่เรียก**

#### Request

พารามิเตอร์ที่ใช้งานได้

Path parameters

| Name    | Type    | Description                |
| ------- | ------- | -------------------------- |
| userId  | Integer | ไอดีผู้ใช้                 |
| orderId | Integer | เลขไอดีสินค้าที่เตรียมซื้อ |

#### Response

Status code - 200

Response model - application/json
ส่งกลับรูปแบบอาร์เรย์ของไอเท็มที่มีโครงสร้างตามตาราง

| Name                                | Tpye     | Description             |
| ----------------------------------- | -------- | ----------------------- |
| orderId                             | Integer  | ไอดีสินค้าที่เตรียมซื้อ |
| userId                              | Integer  | ไอดีผู้ใช้              |
| productId                           | Integer  | สินค้าที่นำเข้าตระกร้า  |
| orderQuantity                       | Integer  | จำนวนที่ซื้อ            |
| featureSelected                     | Object[] | รายการคุณสมบัติที่เลือก |
| &nbsp;&nbsp;&nbsp;featureSelectedId | Integer  | ไอดีฟีเจอร์             |
| &nbsp;&nbsp;&nbsp;featureName       | String   | ชื่อฟีเจอร์             |
| &nbsp;&nbsp;&nbsp;selectedValue     | String   | ค่าที่เลือกในฟีเจอร์    |

### POST /baskets/{userId}

**สร้างสินค้าเตรียมซื้อ**
**ส่งกลับสถานะการสร้าง**

#### Request

พารามิเตอร์ที่ใช้งานได้

Path parameters

| Name   | Type    | Description |
| ------ | ------- | ----------- |
| userId | Integer | ไอดีผู้ใช้  |

Request body

| Name                                | Type     | Description             |
| ----------------------------------- | -------- | ----------------------- |
| userId                              | Integer  | ไอดีผู้ใช้              |
| productId                           | Integer  | ไอดีสินค้า              |
| orderQuantity                       | Integer  | จำนวนที่ซื้อ            |
| featureSelected                     | Object[] | รายการคุณสมบัติที่เลือก |
| &nbsp;&nbsp;&nbsp;featureSelectedId | Integer  | ไอดีฟีเจอร์             |
| &nbsp;&nbsp;&nbsp;featureName       | String   | ชื่อฟีเจอร์             |
| &nbsp;&nbsp;&nbsp;selectedValue     | String   | ค่าที่เลือกในฟีเจอร์    |

#### Response

Status code - 201

### PUT /baskets/{userId}/{orderId}

**อัปเดตตระกร้าของผู้ใช้**
**ส่งกลับสถานะการแัปเดต**

#### Request

พารามิเตอร์ที่ใช้งานได้

Path parameters

| Name    | Type    | Description                |
| ------- | ------- | -------------------------- |
| userId  | Integer | ไอดีผู้ใช้                 |
| orderId | Integer | เลขไอดีสินค้าที่เตรียมซื้อ |

Request body

| Name                                | Type     | Description             |
| ----------------------------------- | -------- | ----------------------- |
| userId                              | Integer  | ไอดีผู้ใช้              |
| productId                           | Integer  | ไอดีสินค้า              |
| orderQuantity                       | Integer  | จำนวนที่ซื้อ            |
| featureSelected                     | Object[] | รายการคุณสมบัติที่เลือก |
| &nbsp;&nbsp;&nbsp;featureSelectedId | Integer  | ไอดีฟีเจอร์             |
| &nbsp;&nbsp;&nbsp;featureName       | String   | ชื่อฟีเจอร์             |
| &nbsp;&nbsp;&nbsp;selectedValue     | String   | ค่าที่เลือกในฟีเจอร์    |

#### Response

Status code - 200

### DELETE /baskets/{userId}/{orderId}

**ลบรายการสินค้า**
**ส่งกลับสถานะการลบ**

#### Request

พารามิเตอร์ที่ใช้งานได้

Path parameters

| Name    | Type    | Description                |
| ------- | ------- | -------------------------- |
| userId  | Integer | ไอดีผู้ใช้                 |
| orderId | Integer | เลขไอดีสินค้าที่เตรียมซื้อ |

#### Response

Status code - 204
