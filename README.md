# 🚀 Enterprise Cloud Architecture - Practical Microservices & Multi-Cloud Patterns

**Author:** Kavindu Thareen  
**Student ID:** 2301682064  
**Email:** kavindutharin@gmail.com

---

## 🔗 Quick Reference

- **Course Backend Service - GCP DB instance record:**  
  https://drive.google.com/file/d/1aDMNuJfpR2ff9RrGI1cAY-3CaXaTcr_O/view?usp=sharing



---



A hands-on, practical collection demonstrating how to containerize, build, and deploy microservices across local Docker and cloud environments (AWS & GCP).

**Focus Areas:**
- Spring Boot backends
- React frontend
- MySQL & MongoDB
- Media storage patterns (local → S3/GCS)

---



---

## 🗂 Repository Overview

This repository contains two main, ready-to-use project suites:

### 1. `01) docker-intro-app` - Docker Containerization Hands-on

A full-stack demo showing containerization of a microservice system for local development.

- **Spring Boot backends** and **React frontend** packaged for Docker
- **MySQL** and **MongoDB** containerized (latest LTS images recommended)
- `docker-compose.yml` to orchestrate services for local development and testing
- Updated backend configs to connect to containerized DBs

### 2. `02) cloud-enabled-deployment-in-action-with-aws` - Cloud Deployment Patterns

An introductory multi-cloud deployment blueprint with configs.

- **course-service** (Spring Boot + MySQL): Cloud deployment scaffolding for AWS & GCP
- **student-service** (Spring Boot + MongoDB): Infra & deployment notes (AWS/GCP pending)
- **media-service**: Local file storage, with instructions/code to integrate S3/MinIO
- **frontend-app**: React + TypeScript build & cloud hosting patterns
- Build scripts and sample deployment configs

---

## 📁 Repo Structure

```
Enterprise-Cloud-Architecture/
├─ 01) docker-intro-app/
│  ├─ course-service/
│  ├─ student-service/
│  ├─ media-service/
│  ├─ frontend/
│  └─ docker-compose.yml
├─ 02) cloud-enabled-deployment-in-action-with-aws/
│  ├─ course-service/
│  ├─ student-service/
│  ├─ media-service/
│  ├─ frontend-app/
│  └─ deployment-configs/ (k8s / IaC / templates)
├─ LICENSE
└─ README.md (this file)
```

---

## ⚡ Quickstart: Run Locally with Docker Compose

**Prerequisites:**
- Docker & Docker Compose installed
- (Java, Node.js optional for local builds)

**Steps:**

```sh
# Clone the repository
git clone https://github.com/gayanukabulegoda/Enterprise-Cloud-Architecture.git
cd "01) docker-intro-app"

# Review docker-compose.yml and .env.example
# Start the local environment
docker compose up --build
```

- **Frontend:** http://localhost:3000
- **Backend APIs:** Exposed per service (see each service's README or `application.properties`)

**To stop services:**

```sh
docker compose down --volumes
```

---

## ☁️ Cloud Deployment Guidance

**GCP (equivalent patterns):**
- Cloud SQL for MySQL
- GCS for object storage
- Cloud Run (serverless) or GKE for containers
- Secret Manager, Artifact Registry, Cloud Build or GitHub Actions for CI

---

## 🧭 Architecture

- Microservices built with Spring Boot
- React frontend
- MySQL & MongoDB database containers
- Media service with local & cloud storage
- Cloud deployment blueprints for AWS & GCP

---

## 🤝 Contributing

Contributions are welcome!

- Open issues for bugs or feature requests
- Use pull requests with clear descriptions
- **Never commit secrets** — use `.env.example` for sample variables

---

## 📜 License

This repository is provided under the terms of the [LICENSE](LICENSE) file in the root directory.

---

## 💡 Found this project useful?

Consider giving it a ⭐ on GitHub!

---

**© 2025 Kavindu Thareen**  
Thank you for visiting! Stay connected & keep innovating! 🎉