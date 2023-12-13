# Spring-MVC-Register-form

Spring MVC Registration Form with Thymeleaf
This project demonstrates a simple registration form built with Spring MVC and Thymeleaf.

Features:

This project showcases a registration form developed with Spring MVC and Thymeleaf templates. The form prompts users to provide details such as first name, last name, country, state, address, and gender. Additionally, users can select their favorite programming languages using checkboxes (implemented with HTML).

in mode package have Student class acting as a Java POJO with fields for first name, last name, country, state, address, gender, and programming languages. The class provides setter and getter methods.

Controller Class : The RegistrationController manages HTTP requests. The regForm() method accepts model and model attributes, directing to the "reg-form" HTML page.

reg-form.html: This Thymeleaf template contains the registration form. Upon form submission, the processForm() method in the controller is invoked it will return process-form.html

process-form.html: This Thymeleaf template presents the registered data in table format. It is the page returned by the processForm() method in the controller.

Technologies Used:

Spring MVC
Thymeleaf
Java
Project Structure:

src/main/java/com.example.eclipsmvcdemo.Model 
	Student.java (Model class)

com.example.eclipsmvcdemo.Controller
	StudentController.java (Controller class)

src/main/resources/templates
	reg-form.html      (Registration form)
	process-form.html  (Confirmation page)
 
![Screenshot 2023-12-13 233003](https://github.com/Siddeshob/Spring-MVC-Registration-Form-with-Thymeleaf/assets/130699981/708978e8-1f0c-4ffc-b3a3-3d894d310e1c)

![Screenshot 2023-12-13 233202](https://github.com/Siddeshob/Spring-MVC-Registration-Form-with-Thymeleaf/assets/130699981/a9213a5b-bf72-481f-8a68-2d694f3d5381)


![Screenshot 2023-12-13 233244](https://github.com/Siddeshob/Spring-MVC-Registration-Form-with-Thymeleaf/assets/130699981/4f5211eb-18c7-4be4-9fbe-1898f7a5e67c)


 
