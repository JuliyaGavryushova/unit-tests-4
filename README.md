## Задание 1
1. Почему использование тестовых заглушек может быть
полезным при написании модульных тестов?

*Ответ:*
- Тестовые заглушки позволяют изолировать модуль, который мы тестируем, от его зависимостей.
- Некоторые модули могут зависеть от внешних ресурсов (БД, API), использование заглушек позволяет избежать реального взаимодействия с такими ресурсами, что может существенно ускорить процесс тестирования.
- При возникновении ошибок в тестируемом модуле, использование заглушек позволит точно идентифицировать, где возникла проблема.

2. Какой тип тестовой заглушки следует использовать,
если вам нужно проверить, что метод был вызван
с определенными аргументами?

*Ответ:*

Для проверки того, что метод был вызван с определенными
аргументами, следует использовать заглушки типа "Spy"
(сохраняют информацию о вызовах методов, включая 
переданные аргументы) "Mock" (моковые объекты с функционалом проверки аргументов позволяют создавать имитации реальных объектов и проверять переданные им аргументы во время вызова методов, можно настроить мок таким образом, чтобы он проверял, что метод вызывается с определенными аргументами).

3. Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

*Ответ:*

Для того, чтобы вернуть определенное значение или исключение в ответ на вызов метода, следует использовать заглушки типа "Stub" (заменяют реальные объекты во время тестирования, могут имитировать поведение реального объекта, возвращая заранее заданные значения или генерируя исключения при вызове методов) или "Mock" (имитируют поведение реальных объектов и позволяют нам управлять возвращаемыми значениями или исключениями при вызове методов).

4. Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?

*Ответ:*

Для имитации взаимодействия с внешним API или БД следует использовать заглушки типа "Fake" (создаются с целью заменить реальные объекты, такие как API или БД, и имитировать их поведение) или "Mock" (т.к. моковые объекты позволяют нам создавать имитации реальных объектов и управлять их поведением при вызове методов). 