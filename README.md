# Service Structure (API)

## Table of Contents
- [Prerequisites](#prerequisites)
- [Description](#description)
- [Endpoints](#endpoints)
- [Roles and Security](#roles-and-security)

## Prerequisites
- Computer programming knowledge
- Familiarity with Java programming language
- Familiarity with the Spring Boot Framework

## Description
Welcome to our Service Structure (API) project! In this project, we will be planning the architecture and defining the functions of our service. A well-thought-out plan is crucial for the success of any project, and we aim to achieve that by organizing our service functions and designing appropriate endpoints adhering to the principles of the REST API.

## Endpoints
Here are the endpoints that we will be working with:

### Authentication
- `POST api/auth/signup`: Allows users to register on the service.
- `POST api/auth/changepass`: Allows users to change their passwords.

### Business Functionality
- `GET api/empl/payment`: Gives access to the employee's payrolls.
- `POST api/acct/payments`: Uploads payrolls.
- `PUT api/acct/payments`: Updates payment information.

### Service Functionality
- `PUT api/admin/user/role`: Changes user roles.
- `DELETE api/admin/user`: Deletes a user.
- `GET api/admin/user`: Displays information about all users.

## Roles and Security
To ensure the security of our service, we have planned the distribution of roles as follows:

| Endpoint                 | Anonymous | User | Accountant | Administrator |
|--------------------------|-----------|------|------------|---------------|
| POST api/auth/signup     |     +     |  +   |     +      |       +       |
| POST api/auth/changepass |           |  +   |     +      |       +       |
| GET api/empl/payment     |           |  +   |     +      |               |
| POST api/acct/payments   |           |      |     +      |               |
| PUT api/acct/payments    |           |      |     +      |               |
| GET api/admin/user       |           |      |            |       +       |
| DELETE api/admin/user    |           |      |            |       +       |
| PUT api/admin/user/role  |           |      |            |       +       |

