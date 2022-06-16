Данный проект является ничем инным, как моим видением на выполнение указанной ниже задачи. 

Я старался по-максимуму и, в то же время, лаконично описать все свои действия и почему я так сделал в java doc.
Если возникнут вопросы / сомнения или что-либо еще по данному решению задачи и Вы пожелаете мне их задать - 
буду рад обсудить. 

Задача заняла чуть более 4-ех часов. По причине того, что изучал новую версию Актуатора (около часа-полутора) читал доку
в надежде выяснить: почему я не могу параметры из тела запроса и тела отвева отобраить с помощью актуатора. 
Так как это показалось мне элегантным и верным решением. Взаимен был использован Filter, ренешение не такое элегантное
и лаконичное как Actuator. Но, к сожалению, не было слишком много времени на внедрение старой версии актуатора.

P.S. надеюсь, что задачу понял правильно. 


Тестовое задание: REST API (Middle Java Developer, Конкорд банк)
Необходимо реализовать REST API на Java, позволяющее отправить на него http POST запрос и получить ответ.

Требования:
1. Запрос и ответ в формате JSON.
2. Запрос, ответ и дату/время необходимо залогировать в отдельный файл.
3. Проект должен собираться в war, для установки на Tomcat.
4. Если в запросе содержится поле "id" со значением = 1, то ответ должен быть по примеру ниже, иначе ответ должен быть NULL.
5. Формат запроса POST.
6. Реализовать шифрование и дешифрование AES-256 входящего запроса и ответа. Эту часть необходимо только залогировать. Например (часть лога):
   === encryption: sfdjnva9sfv87say9hdfow3
   === decryption: {"fio": "Test Testov"}

Пример запроса BODY:
{"id": 1}

Пример ответа BODY:
{"fio": "Test Testov"}

Рекомендуется использовать Maven, Spring (Rest Controller), Log4j. Остальное на усмотрение разработчика. Желательно выполнить максимальное количество требований :)









Поставленная задача: 

Тестовое задание: REST API (Middle Java Developer, Конкорд банк)

Необходимо реализовать REST API на Java, позволяющее отправить на него http POST запрос и получить ответ.

Требования:
1. Запрос и ответ в формате JSON.
2. Запрос, ответ и дату/время необходимо залогировать в отдельный файл.
3. Проект должен собираться в war, для установки на Tomcat.
4. Если в запросе содержится поле "id" со значением = 1, то ответ должен быть по примеру ниже, иначе ответ должен быть NULL.
5. Формат запроса POST.
6. Реализовать шифрование и дешифрование AES-256 входящего запроса и ответа. Эту часть необходимо только залогировать. Например (часть лога):
   === encryption: sfdjnva9sfv87say9hdfow3
   === decryption: {"fio": "Test Testov"}

Пример запроса BODY:
{"id": 1}

Пример ответа BODY:
{"fio": "Test Testov"}

Рекомендуется использовать Maven, Spring (Rest Controller), Log4j. Остальное на усмотрение разработчика. Желательно выполнить максимальное количество требований :)