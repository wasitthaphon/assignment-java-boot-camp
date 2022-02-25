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

| Name                         | Type     | Description            |
| ---------------------------- | -------- | ---------------------- |
| userId                       | Integer  | ไอดี user              |
| name                         | String   | ชื่อเต็ม               |
| email                        | String   | อีเมล                  |
| addresses                    | Object[] | รายการที่อยู่ของผู้ใช้ |
| &nbsp;&nbsp;&nbsp;addressId  | Integer  | ไอดีที่อยู่            |
| &nbsp;&nbsp;&nbsp;userId     | Integer  | ไอดีผู้ใช้             |
| &nbsp;&nbsp;&nbsp;address    | String   | ที่อยู่                |
| &nbsp;&nbsp;&nbsp;postalCode | String   | รหัสไปรษณีย์           |
| &nbsp;&nbsp;&nbsp;zone       | String   | เขต                    |
| &nbsp;&nbsp;&nbsp;city       | String   | จังหวัด                |
| &nbsp;&nbsp;&nbsp;telephone  | String   | โทรศัพท์มือถือ         |

Status code - 200
