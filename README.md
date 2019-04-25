# CS3704 project

## Use Cases

1. click sign up button to create author
2. sign with username and password (admin, 123456)
3. click delete button to delete author
4. click update button to update author's profile
5. click Add Novel button to add a novel to current author

## ER Diagram

[![ER diagram](https://github.com/LMCNN/cs3704/raw/master/diagrams/ERdiagram.png)](https://github.com/LMCNN/cs3704/blob/master/diagrams/ERdiagram.png)

## Relational Diagram

[![relational](https://github.com/LMCNN/cs3704/raw/master/diagrams/relational.png)](https://github.com/LMCNN/cs3704/blob/master/diagrams/relational.png)

## How to open and edit

### Intellij IDEA:

1. Run the code: `git clone https://github.com/LMCNN/cs3704.git` to copy the code to your local machine.
2. Using Intellij IDEA to open the pom.xml file in the code directory as a project

#### Run the program with the terminal/gitbash:

1. Go to the code directory
2. run: `./mvnw spring-boot:run`
3. Browser address: localhost:8080

Unit tests inside the `/code/src/test/java/com/cs3704/novel` directory

#### Validation test cases

1. Click the sign up button to register a user author (username: test, password: 123) .
2. Enter the username test on the login page and enter a wrong password. The web page will display an error message.
3. Entering the correct password will go to the profile page.
4. Click the Update button to update the password. Go back to the login page and log in using the original password. The page will show an error message. Re-login with a new password.
5. Click the delete button and you will be returned to the login page. The original account could not be logged in.