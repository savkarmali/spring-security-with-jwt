# Spring Security with JWT 🔐

A Spring Boot project demonstrating **JWT-based authentication and authorization** for insurance claim management.

---

## 📌 Features
- User login with JWT token generation
- Stateless authentication using Spring Security
- Custom JWT filter for request validation
- Secure endpoints for claim management
- Role-based access control ready for extension

---

## 🛠 Tech Stack
- **Java 17**
- **Spring Boot 3.5.10**
- **Spring Security**
- **JJWT 0.11.5**
- **H2 Database** (in-memory for demo)

---

## ⚙️ Setup
1. **Clone the repository:** git clone https://github.com/savkarmali/spring-security-with-jwt.git
2. **Build and run:** mvn spring-boot:run
3. **The application will start at:** http://localhost:8080

---

🔑 JWT Details- Algorithm: HS256
- Secret: Defined in JwtUtil (insurance-secret-insurance-secret-insurance-secret)
- Expiration: 10 minutes

---
# 📬 API Endpoints

This project exposes three main endpoints for authentication and claim management.



## 1. Login (Generate JWT)

**Request**

POST http://localhost:8080/auth/login?username=testuser


   Response:(jwt token)
      "eyJhbGciOiJIUzI1NiJ9..."
   
## 2. Raise Claim (Authenticated)

      POST http://localhost:8080/auth/claims
      Authorization: Bearer <JWT_TOKEN>
      Content-Type: application/json

      {
          "policyNumber": "POL111",
          "customerId": "CUST101",
          "claimAmount": 27000
      }
   
## 3. Get All Claims (Authenticated)

      GET http://localhost:8080/auth/claims
      Authorization: Bearer <JWT_TOKEN>


---

   
