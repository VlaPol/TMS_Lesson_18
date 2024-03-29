🟢
– Объяви интерфейс IntList
– Объяви в нём методы в соответствии с UML-диаграммой

🟢
– Первой реализацией твоего интерфейса будет класс IntList, который ты писал в ДЗ 13. Переименуй его в IntArrayList
– Добавь implements IntList в объявление класса
– Расставь аннотации @Override над методами, которые реализуют абстрактные методы интерфейса и над String toString()

Прошлая реализация списка использует для хранения массив. Ты напишешь ещё одну реализацию списка – связный список 
(linked list). Эта реализация не использует массивы для хранения элементов. Она использует вспомогательный класс, 
объекты которого оборачивают каждый элемент списка

🟢
– Объяви класс IntLinkedNode в соответствии с UML-диаграммой
– Поле int element хранит один элемента списка
– Поле IntLinkedNode nextNode хранит адрес следующего элемента списка. IntLinkedNode объект последнего 
элемента в списке будет иметь значение nextNode = null

🟡
– Объяви класс IntLinkedList (связный список) в соответствии с UML-диаграммой
– Поле headNode хранит IntLinkedNode нулевого элемента в списке. Получить доступ к остальным элементам списка можно 
переходя по полю nextNode в цикле, каждый раз получая следующий IntLinkedNode. Признаком последнего элемента будет 
nextNode == null.  Для пустого списка headNode = null
– Объяви конструктор без параметров, который создаёт пустой список
– Добавь implements IntList в объявление класса. Реализуй все методы интерфейса с заданным способом хранения элементов

🛟 При реализации каждого метода IntLinkedList продумай особенности для пустого списка. Продумай отдельно ситуации, 
когда мы работаем с первым, последним и средним элементами