# Api /users

## รายการ Api

- [GET /user/{userId}](#get-useruserid)
  - [Request](#request)
  - [Response](#response)

### GET /user/{userId}

**เรียกข้อมูลผู้ใช้ด้วยไอดี**
**ส่งกลับข้อมูลผู้ใช้**

#### Request

พารามิเตอร์ฺที่ใช้งานได้

Path paramets

| Name   | Type    | Description |
| ------ | ------- | ----------- |
| userId | Integer | ไอดี user   |

#### Response

Response model - application/json
ส่งกลับในรูปแบบโครงสร้างตามตาราง

| Name       | Type     | Description            |
| ---------- | -------- | ---------------------- |
| userId     | Integer  | ไอดี user              |
| addresses  | Object[] | รายการที่อยู่ของผู้ใช้ |
| addressId  | Integer  | ไอดีที่อยู่            |
| userId     | Integer  | ไอดีผู้ใช้             |
| email      | String   | อีเมล                  |
| address    | String   | ที่อยู่                |
| name       | String   | ชื่อเต็ม               |
| postalCode | String   | รหัสไปรษณีย์           |
| zone       | String   | เขต                    |
| city       | String   | จังหวัด                |
| telephone  | String   | โทรศัพท์มือถือ         |

Status code - 200
