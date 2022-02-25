# Api payments

## รายการ Api

- [POST /payments/debit-credit](#post-paymentsdebit-credit)
  - [Request](#request)
  - [Response](#response)
- [GET /payments/{paymentId}](#get-paymentspaymentid)
  - [Request](#request-1)
  - [Response](#response-1)

## รายละเอียดของแต่ละ Api

### POST /payments/debit-credit

**สร้างการชำระเงิน**
**ส่งกลับสถานะการชำระเงิน**

#### Request

Request body - application/json

| Name                  | Type    | Description        |
| --------------------- | ------- | ------------------ |
| cardNumber            | String  | หมายเลขบัตร        |
| holderName            | String  | ชื่อบนบัตร         |
| expireYear            | String  | ปีที่หมดอายุ       |
| expireMonth           | String  | เดือนที่หมดอายุ    |
| ccvCvv                | String  | รหัสหลังบัตร       |
| shippingInstructionId | Integer | ไอดีใบคำสั่งส่งของ |

#### Response

Response model - 201

### GET /payments/{paymentId}

#### Request

Path parameters

| Name      | Type    | Description  |
| --------- | ------- | ------------ |
| paymentId | Integer | ไอดี payment |

#### Response

Response model - application/json

| Name                  | Type    | Description              |
| --------------------- | ------- | ------------------------ |
| paymentId             | Integer | ไอดี payment             |
| paymentMethod         | String  | วิธีจ่ายเงิน             |
| shippingInstructionId | Integer | ไอดี ShippingInstruction |
