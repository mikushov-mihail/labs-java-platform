Многопоточный supermarket simulator, реализованный с использованием идиомы Producer - Consumer.
В потоке Producer выполняются действия пользователя.
В потоке Consumer выполняется обработка (оплата) покупок пользователей.

Использование:
Запустить clean-run.bat предправительно установив менеджер пакетов maven, java 8 jdk. [Download page](https://maven.apache.org/download.cgi) .
 
[Installation guide on windows](https://maven.apache.org/guides/getting-started/windows-prerequisites.html)

Запуск
```bat
mvn clean package && java -jar target/supermarket-1.1-SNAPSHOT.jar <workMilliseconds> <countOrderProducer> <countCashBox>
```
