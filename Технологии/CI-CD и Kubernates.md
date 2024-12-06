-   ### Облачные сервисы

    Прежде чем запустить приложение в сети, необходимо решить, где вы хотите его разместить. Вы можете арендовать собственный сервер или воспользоваться услугами облачных провайдеров, которые обладают большими функционалом для автоматизации процессов, мониторинга, балансировки нагрузки, хранения данных и так далее.

    -   [AWS (Amazon Web Services)](https://docs.aws.amazon.com/whitepapers/latest/aws-overview/introduction.html)
        > Предоставляет широкий спектр услуг: хранение данных, управление базами данных, создание сетей, обеспечение безопасности и т.д. AWS - один из старейших и наиболее авторитетных поставщиков облачных услуг.
    -   [Google Cloud](https://cloud.google.com/docs/overview)
        > Ориентирован на машинное обучение и искусственный интеллект, имеет интеграции с другими сервисами Google, такими как Google Analytics и Google Maps.
    -   [Microsoft Azure](https://azure.microsoft.com/en-us/explore)
        > Azure известен своей интеграцией с другими сервисами Microsoft, такими как Office 365 и Dynamics 365, а также поддержкой широкого спектра языков программирования и фреймворков.
    -   [Digital Ocean](https://www.digitalocean.com/)
        > Предоставляет виртуальные частные серверы (VPS) для разработчиков и малого бизнеса. Известен своей простотой и удобством использования, а также низкими ценами.
    -   [Heroku](https://www.heroku.com/what)
        > Одна из первых PaaS-платформ. Поддерживает большой спектр языков программирования. До недавнего времени Heroku являлся наиболее популярным сервисом для размещения open-source проектов, поскольку имел бесплатный тарифный план (сейчас его убрали).

    Как правило, все эти сервисы имеют интуитивно понятный простой интерфейс, подробную документацию, а также множество видеоуроков на YouTube.

<details>
    <summary>🔗 <b>Ссылки на материалы</b></summary>

1. 📺 [**AWS на русском языке (playlist)** – YouTube](https://youtube.com/playlist?list=PLg5SS_4L6LYsxrZ_4xE_U95AtGsIB96k9)
2. 📄 [**Подкасты об AWS на русском языке** – Google](https://podcasts.google.com/feed/aHR0cHM6Ly9mZWVkLnBvZGJlYW4uY29tL2F3c25hcnVzc2tvbS9mZWVkLnhtbA)
3. 📺 [**Google cloud на русском языке (playlist)** – YouTube](https://youtube.com/playlist?list=PLg5SS_4L6LYs5IZZSY0viHRQFPa2P-R8H)
4. 📺 [**Уроки по Microsoft Azure (playlist)** – YouTube](https://youtube.com/playlist?list=PL_1ck0dfZvvCk7QCuYNCE_fWZIEY-Xae8)
 </details>

-   ### Управление контейнерами

    Оркестровка контейнеров (container orchestration) - это процесс управления, автоматизации развертывания, масштабирования и обслуживания контейнерных приложений и зависимостей в кластере серверов.

    -   Docker в рабочей среде
        > Самый простой способ управления контейнерами - использовать непосредственно Docker, следуя списку правил для обеспечения стабильности и безопасности приложений.
        > - Храните свои образы Docker в частном реестре для предотвращения несанкционированного доступа.
        > - Используйте надежные механизмы аутентификации для доступа к реестру Docker и применяйте меры безопасности, такие как правила брандмауэра.
        > - Ужимайте размер контейнеров до минимума, убирая ненужные пакеты и зависимости.
        > - Используйте отдельные контейнеры для различных служб (например для сервера приложения, базы данных, хранилища кэша, метрики и т.д.).
        > - Используйте Docker Volumes для хранения постоянных данных, таких как файлы баз данных, журналы и файлы конфигурации.
    -   [Docker swarm](https://docs.docker.com/engine/swarm/)
        > Это собственный инструмент оркестровки Docker для управления, масштабирования и автоматизации таких задач, как обновление контейнеров, восстановление, балансировка трафика, [service discovery](https://devopscube.com/service-discovery-explained/) и так далее.
    -   [Kubernetes](https://en.wikipedia.org/wiki/Kubernetes) (K8s)
        > Это очень популярная платформа оркестровки, которая может работать с различными [контейнерными рантаймами](https://kubernetes.io/docs/setup/production-environment/container-runtimes/), включая Docker. Kubernetes предлагает более обширный набор функций (чем Docker swarm), включая расширенное планирование, оркестровку хранилищ и возможности продвинутого самовосстановления.

<details>
    <summary>🔗 <b>Ссылки на материалы</b></summary>

1. 📄 [**Docker Swarm для самых маленьких** – habr.com](https://habr.com/ru/articles/659813/)
2. 📺 [**Запускаем Docker Swarm в продакшене** – YouTube](https://www.youtube.com/live/2FPL6jfXqOM?feature=share)
3. 📺 [**Вебинар «Docker Swarm vs K8s. Уйти нельзя остаться** – YouTube](https://youtu.be/NX2OGJLJP6Y)
4. 📄 [**K8S для начинающих** – habr.com](https://habr.com/ru/articles/589415/)
5. 📺 [**Введение в Kubernetes на примере Minikube** – YouTube](https://youtu.be/sLQefhPfwWE)
6. 📺 [**Kubernetes на русском языке (playlist)** – YouTube](https://youtube.com/playlist?list=PLg5SS_4L6LYvN1RqaVesof8KAf-02fJSi)
</details>