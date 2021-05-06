# Expense Reimbursement System

The Expense Reimbursement System (ERS) will manage the process of reimbursing employees for expenses incurred while on company time. All employees in the company can login and submit requests for reimbursement and view their past tickets and pending requests. Finance managers can log in and view all reimbursement requests and past history for all employees in the company. Finance managers are authorized to approve and deny requests for expense reimbursement.

## Getting Started

git clone https://github.com/ManteshSandhu/Expense_Reimbursement_System.git

1.Be sure to have Apache Tomcat 9.0 installed.

2.Be sure to have the Java 8 runtime environment installed.

3.Open the web browser and type "http://localhost:8080/ERS_Mantesh/login.html" in the address bar. It will open Login page.

## Technologies
- Apache Tomcat 9.0
- Bootstrap 4
- Jackson Databind
- Jackson Core
- Java Servlet API
- JUnit
- Log4j API 1.2.17
- PostgreSQL 42.2.18
- Mockito 3.6.0


## Features
**Reimbursement Types**

Employees must select the type of reimbursement as: LODGING, TRAVEL, FOOD, or OTHER.

* User/Employee can login
* After logging in, user can make a new reimbursement request
* Regular employees can view all of their pending requests, as well as all of their previous requests
* Managers can view all pending requests, as well as all requests for the company
* User's name and role in the company is displayed in the single page application (SPA)
* User can log out, which invalidates the session

## License
* The GNU Lesser General Public License.

```
## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
