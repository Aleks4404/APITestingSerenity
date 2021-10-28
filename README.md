# APITestingSerenity


Необходимо реализовать автотесты на основе шаблона тестового проекта [java-serenity](https://github.com/serenity-bdd/serenity-junit-starter). Использовать сборщик Gradle.  

**Постановка:**
* Реализовать несколько тест-кейсов по проверке любого web-сервиса (например, [этого](https://www.postman.com/postman/workspace/published-postman-templates/documentation/631643-f695cab7-6878-eb55-7943-ad88e1ccfd65?ctx=documentation))
* Подготовить дистрибутив тестового проекта с расширением (.tgz)
* Тесты должны запускаться командой ./gradlew test


### Что сделано:
1. Создан проект на сборщике "Gradle";
2. Подключены билиотеки: "Serenity-junit", "Serenity-cucumber", "lombok" и др.;
3. Добавлен файл ".gitignore";
4. Созданы объекты "OrderModel" и "UserModel";
5. Созданы классы для запуска тестов "WhenAddingOrder", "WhenAddingUser";
6. Добавлены классы "Steps", в которых узанны параметры, которые будут передаваться в методы при запуске тестов
7. Созданы файлы с расширением .feature, где содержатся описания функций и сценария;
8. Проект залит на [GitNub](https://github.com/Aleks4404/APITestingSerenity.git);
9. Настроен и установлен Java CI with Gradle;


### Запуск тестов

Ввести команду в терминале.  
> ./gradlew test 