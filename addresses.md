# Api /addresses

## รายละเอียด Api

- [GET /addresses/{userId}](#get-addressesuserid)
  - [Request](#request)
  - [Response](#response)
- [GET /addresses/{userId}/{addressId}](#get-addressesuseridaddressid)
  - [Request](#request-1)
  - [Response](#response-1)

### GET /addresses/{userId}

**เรียกรายการที่อยู่ของผู้ใช้ด้วยไอดีผู้ใช้** <br>
**ส่งกลับรายการที่อยู่ทั้งหมดของผู้ใช้นั้น**

#### Request

Path parameters

| Name   | Type    | Description |
| ------ | ------- | ----------- |
| userId | Integer | ไอดีผู้ใช้  |

#### Response

Response model - application/json
ส่งกลับในรูปแบบอาร์เรย์ของที่อยู่ทั้งหมดของผู้ใช้นั้น ๆ ตามโครงสร้างตามตาราง

| Name       | Type    | Description    |
| ---------- | ------- | -------------- |
| addressId  | Integer | ไอดีที่อยู่    |
| userId     | Integer | ไอดีผู้ใช้     |
| email      | String  | อีเมล          |
| address    | String  | ที่อยู่        |
| name       | String  | ชื่อเต็ม       |
| postalCode | String  | รหัสไปรษณีย์   |
| zone       | String  | เขต            |
| city       | String  | จังหวัด        |
| telephone  | String  | โทรศัพท์มือถือ |

Status Code - 200

### GET /addresses/{userId}/{addressId}

**เรียกข้อมูลที่อยู่อย่างเจาะจงด้วยไอดีผู้ใช้ และไอดีของที่อยู่นั้น** <br>
**ส่งกลับข้อมูลที่อยู่**

#### Request

Path parameters

| Name      | Type    | Description |
| --------- | ------- | ----------- |
| userId    | Integer | ไอดีผู้ใช้  |
| addressId | Integer | ไอดีที่อยู่ |

#### Response

Response model - application/json
ส่งกลับในรูปของที่อยู่ตามโครงสร้างตามตารางของผู้ใช้นั้น ๆ

| Name       | Type    | Description    |
| ---------- | ------- | -------------- |
| addressId  | Integer | ไอดีที่อยู่    |
| userId     | Integer | ไอดีผู้ใช้     |
| email      | String  | อีเมล          |
| address    | String  | ที่อยู่        |
| name       | String  | ชื่อเต็ม       |
| postalCode | String  | รหัสไปรษณีย์   |
| zone       | String  | เขต            |
| city       | String  | จังหวัด        |
| telephone  | String  | โทรศัพท์มือถือ |

Status code - 200
