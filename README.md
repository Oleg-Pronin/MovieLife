<h1 align="center">КиноLife</h1>

<p align="center"> Автор: Пронин Олег. Дата создания: 07.11.2021 г.</p>

## Описание
Приложение **КиноLife**, предназначено для взаимодействия и представления контента с базы данных фильмов [TMDB ![TMDB](https://www.themoviedb.org/assets/2/favicon-16x16-b362d267873ce9c5a39f686a11fe67fec2a72ed25fa8396c11b71aa43c938b11.png)](https://www.themoviedb.org/about)
Взаимодействие с TMDB происходит через [API](https://developers.themoviedb.org/3/getting-started/introduction), предоставленное самим ресурсом.
## Функциональность
`Добавляется по мере реализации с указанием даты реализации и рабочей ветки`

1. 22.11.2021 [feature/lesson-2](https://github.com/Oleg-Pronin/MovieLife/pull/1)

Создан каркас приложения. В виде шаблона проектирования архитектуры приложения, выбрано MVVM. Приложение, в текущей версии, состоит из экранов: лента фильмов, лента будущих премьер, детальная страница для фильма и (пока в виде заглушки) личный кабинет. Для навигации приложения используется Navigation Architecture Component.

2. 26.11.2021 [feature/lesson-4. Commit#1](https://github.com/Oleg-Pronin/MovieLife/pull/3/commits/594508b7963da47e55babc69d8b53b00a8e5d0f8)

Добавлены сущности для ответов api, переписаны методы в MoviesRepoImpl в которые добавлены примеры ответов в формате json и их десериализация в объекты с помощью библиотеки Gson

3. 26.11.2021 [feature/lesson-4. Commit#1](https://github.com/Oleg-Pronin/MovieLife/pull/3/commits/dd8017b20189f7e94586c178183c016c6fbfc82b)

Добавлены дополнительные extension-функции для Snackbar: View.createSnackbarAndShow - принимает текст, без вызова action, а View.createSnackbarResAndShow - принимает строковый ресурс в качестве текста


## Исправленные ошибки
`Описание устраненных замечаний с указанием даты и кратко причина бага`

## Дополнительная функциональность
`Описание дополнительно реализуемой функциональности с указанием даты реализации и рабочей ветки`
