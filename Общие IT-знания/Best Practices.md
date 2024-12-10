-   ### Качество кода

    Паттерны/принципы/подходы для написания качественного кода:

    - [DRY (Don't Repeat Yourself)](https://ru.wikipedia.org/wiki/Don%E2%80%99t_repeat_yourself) - принцип разработки, нацеленный на снижение повторения информации различного рода.
    - [KISS (Keep It Simple, Stupid)](https://ru.wikipedia.org/wiki/KISS_(%D0%BF%D1%80%D0%B8%D0%BD%D1%86%D0%B8%D0%BF)) - принцип проектирования, запрещающий использование более сложных средств, чем необходимо.
    - [YAGNI (You Aren't Gonna Need It)](https://ru.wikipedia.org/wiki/YAGNI) - принцип проектирования, при котором следует отказываться от добавления избыточной функциональности.
    - [SOLID принципы](https://ru.wikipedia.org/wiki/SOLID_(%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D0%BD%D0%BE-%D0%BE%D1%80%D0%B8%D0%B5%D0%BD%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5_%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5)):
        - Принцип единственной ответственности - класс должен отвечать только за одну вещь
        - Принцип открытости/закрытости - классы должны быть открыты для расширения, но закрыты для изменения
        - Принцип подстановки Лисков - должна быть возможность использовать класс наследника вместо базового типа
        - Принцип разделения интерфейса - следует разбивать большие интерфейсы на маленькие
        - Принцип инверсии зависимостей - должна быть зависимость от абстракций, а не от конкретных реализаций
    - [GRASP (General Responsibility Assignment Software Patterns)](https://ru.wikipedia.org/wiki/GRASP) - шаблоны, используемые в объектно-ориентированном проектировании для решения общих задач по назначению ответственностей классам и объектам.

    Руководства по стилю и соглашения по написанию кода:

    -   [Kotlin официальные соглашения по написанию кода](https://kotlinlang.org/docs/coding-conventions.html)

<details>
    <summary>🔗 <b>Ссылки на материалы</b></summary>

1. 📄 [**Практика хорошего кода** – habr.com](https://habr.com/ru/post/206868/)
2. 📄 [**Принципы для разработки: KISS, DRY, YAGNI...** – habr.com](https://habr.com/ru/company/itelma/blog/546372/)
3. 📺 [**SOLID принципы простым языком (много примеров)** – YouTube](https://youtu.be/TxZwqVTaCmA)
4. 📄 [**Простое объяснение принципов SOLID** – habr.com](https://habr.com/ru/company/vk/blog/412699/)
5. 📄 [**Принципы SOLID, о которых должен знать каждый разработчик** – medium.com](https://medium.com/webbdev/solid-4ffc018077da)
6. 📄 [**GRASP паттерны проектирования** – habr.com](https://habr.com/ru/post/92570/)
7. 📄 [**Google style guides** – GitHub](https://github.com/google/styleguide)
</details>

-   ### Паттерны проектирования

    -   Порождающие паттерны
        > Отвечают за удобное и безопасное создание новых объектов или даже целых семейств объектов
        -   [Factory (Фабрика)](https://refactoring.guru/ru/design-patterns/factory-method)
        -   [Abstract factory (Абстрактная фабрика)](https://refactoring.guru/ru/design-patterns/abstract-factory)
        -   [Builder (Строитель)](https://refactoring.guru/ru/design-patterns/builder)
        -   [Prototype (Прототип)](https://refactoring.guru/ru/design-patterns/prototype)
        -   [Singleton (Одиночка)](https://refactoring.guru/ru/design-patterns/singleton)
    -   Структурные паттерны
        > Отвечают за построение удобных в поддержке иерархий классов
        -   [Adapter (Адаптер)](https://refactoring.guru/ru/design-patterns/adapter)
        -   [Bridge (Мост)](https://refactoring.guru/ru/design-patterns/bridge)
        -   [Composite (Компоновщик)](https://refactoring.guru/ru/design-patterns/composite)
        -   [Decorator (Декоратор)](https://refactoring.guru/ru/design-patterns/decorator)
        -   [Facade (Фасад)](https://refactoring.guru/ru/design-patterns/facade)
        -   [Flyweight (Легковес)](https://refactoring.guru/ru/design-patterns/flyweight)
        -   [Proxy (Заместитель)](https://refactoring.guru/ru/design-patterns/proxy)
    -   Поведенческие паттерны
        > Решают задачи эффективного и безопасного взаимодействия между объектами программы
        -   [Chain of Responsibility (Цепочка обязонностей)](https://refactoring.guru/ru/design-patterns/chain-of-responsibility)
        -   [Command (Команда)](https://refactoring.guru/ru/design-patterns/command)
        -   [Iterator (Итератор)](https://refactoring.guru/ru/design-patterns/iterator)
        -   [Mediator (Посредник)](https://refactoring.guru/ru/design-patterns/mediator)
        -   [Memento (Снимок)](https://refactoring.guru/ru/design-patterns/memento)
        -   [Observer (Наблюдатель)](https://refactoring.guru/ru/design-patterns/observer)
        -   [State (Состояние)](https://refactoring.guru/ru/design-patterns/state)
        -   [Strategy (Стратегия)](https://refactoring.guru/ru/design-patterns/strategy)
        -   [Template (Шаблон)](https://refactoring.guru/ru/design-patterns/template-method)
        -   [Visitor (Посетитель)](https://refactoring.guru/ru/design-patterns/visitor)
<details>
    <summary>🔗 <b>Ссылки на материалы</b></summary>

1. 📄 [**Паттерны ООП в метафорах** – habr.com](https://habr.com/ru/post/136766/)
2. 📄 [**Шпаргалка по шаблонам проектирования** – habr.com](https://habr.com/ru/post/210288/)
3. 📄 [**Паттерны проектирования** – metanit.com](https://metanit.com/sharp/patterns/)
</details>