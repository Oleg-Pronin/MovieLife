package oleg_pronin.movielife.data.net

import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import oleg_pronin.movielife.domain.entity.Movie
import oleg_pronin.movielife.domain.entity.apiResponse.ResponsePage
import oleg_pronin.movielife.domain.repository.MoviesRepo

class MoviesRepoImpl : MoviesRepo {
    override fun getLatestMovies(): List<Movie> {
        val jsonString = """{
            "page": 1,
            "results": [
                {
                    "adult": false,
                    "backdrop_path": "/cinER0ESG0eJ49kXlExM0MEWGxW.jpg",
                    "genre_ids": [
                        28,
                        12,
                        14
                    ],
                    "id": 566525,
                    "original_language": "en",
                    "original_title": "Shang-Chi and the Legend of the Ten Rings",
                    "overview": "Мастеру боевых искусств Шан-Чи предстоит противостоять призракам из собственного прошлого, по мере того как его втягивают в паутину интриг таинственной организации «Десять колец».",
                    "popularity": 6665.737,
                    "poster_path": "/hn0B1OFQRQnzr0LeLkaUbJxoiol.jpg",
                    "release_date": "2021-09-02",
                    "title": "Шан-Чи и легенда десяти колец",
                    "video": false,
                    "vote_average": 7.9,
                    "vote_count": 3379
                },
                {
                    "adult": false,
                    "backdrop_path": "/70nxSw3mFBsGmtkvcs91PbjerwD.jpg",
                    "genre_ids": [
                        878,
                        28,
                        12
                    ],
                    "id": 580489,
                    "original_language": "en",
                    "original_title": "Venom: Let There Be Carnage",
                    "overview": "Эдди живёт с симбиотом в своём теле уже давно и приспособился к быту. Однако ему придётся столкнуться со злодеем Клетусом Кэссиди, в котором обитает другой внеземной паразит по прозвищу Карнаж.",
                    "popularity": 4141.331,
                    "poster_path": "/lO6TXwP5dKoflEhqfjd0uNWSNhp.jpg",
                    "release_date": "2021-09-30",
                    "title": "Веном 2",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 2039
                },
                {
                    "adult": false,
                    "backdrop_path": "/zBkHCpLmHjW2uVURs5uZkaVmgKR.jpg",
                    "genre_ids": [
                        16,
                        35,
                        10751
                    ],
                    "id": 585245,
                    "original_language": "en",
                    "original_title": "Clifford the Big Red Dog",
                    "overview": "Когда школьница Эмили получает в подарок от спасателя животных очаровательного щенка с красной шерстью, она и представить не может, что на утро обнаружит в своей маленькой нью-йоркской квартирке… огромного 3-метрового пса! Мама в командировке, поэтому самые захватывающие и необыкновенные приключения ждут Эмили и ее веселого и порывистого дядю Кейси. Клиффорд научит их — а заодно и весь мир — любить по-крупному.",
                    "popularity": 3269.139,
                    "poster_path": "/Ah2D98B56MSEWs9B7pyFDmaef0X.jpg",
                    "release_date": "2021-12-02",
                    "title": "Большой красный пес Клиффорд",
                    "video": false,
                    "vote_average": 7.8,
                    "vote_count": 170
                },
                {
                    "adult": false,
                    "backdrop_path": "/u5Fp9GBy9W8fqkuGfLBuuoJf57Z.jpg",
                    "genre_ids": [
                        12,
                        28,
                        53
                    ],
                    "id": 370172,
                    "original_language": "en",
                    "original_title": "No Time to Die",
                    "overview": "Джеймс Бонд оставил оперативную службу и наслаждается спокойной жизнью на Ямайке. Все меняется, когда на острове появляется его старый друг Феликс Лейтер из ЦРУ с просьбой о помощи. Миссия по спасению похищенного ученого оказывается опаснее, чем предполагалось изначально. Бонд попадает в ловушку к таинственному злодею, вооруженному опасным технологическим оружием.",
                    "popularity": 3491.344,
                    "poster_path": "/jycSKuZ4CvgPWRHdhgPA9q1EC8n.jpg",
                    "release_date": "2021-10-07",
                    "title": "Не время умирать",
                    "video": false,
                    "vote_average": 7.6,
                    "vote_count": 2033
                },
                {
                    "adult": false,
                    "backdrop_path": "/4gKxQIW91hOTELjY5lzjMbLoGxB.jpg",
                    "genre_ids": [
                        28,
                        53,
                        878
                    ],
                    "id": 763164,
                    "original_language": "en",
                    "original_title": "Apex",
                    "overview": "Пять охотников покупают элитную услугу — возможность выследить человека на необитаемом острове, но сами становятся добычей.",
                    "popularity": 1863.698,
                    "poster_path": "/chTkFGToW5bsyw3hgLAe4S5Gt3.jpg",
                    "release_date": "2021-12-16",
                    "title": "Преступный квест",
                    "video": false,
                    "vote_average": 5.7,
                    "vote_count": 183
                },
                {
                    "adult": false,
                    "backdrop_path": "/vIPIyTJqcgOKgKcExCvTDpLpTYW.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 634649,
                    "original_language": "en",
                    "original_title": "Spider-Man: No Way Home",
                    "overview": "Жизнь и репутация Питера Паркера оказываются под угрозой, поскольку Мистерио раскрыл всему миру тайну личности Человека-паука. Пытаясь исправить ситуацию, Питер обращается за помощью к Стивену Стрэнджу, но вскоре всё становится намного опаснее.",
                    "popularity": 1782.83,
                    "poster_path": "/zSuZByDQH0TscbE300hsnwksjbo.jpg",
                    "release_date": "2021-12-15",
                    "title": "Человек-паук: Нет пути домой",
                    "video": false,
                    "vote_average": 0,
                    "vote_count": 0
                },
                {
                    "adult": false,
                    "backdrop_path": "/lyvszvJJqqI8aqBJ70XzdCNoK0y.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 524434,
                    "original_language": "en",
                    "original_title": "Eternals",
                    "overview": "Вечные — представители расы генетически улучшенных суперлюдей, тайно живущих на Земле. Они появились на свет 5 миллионов лет назад в результате экспериментов могущественных целестиалов. Наделённые невероятными суперспособностями, на протяжении тысячелетий они скрывались от человеческой цивилизации, втайне защищая людей от монструозных девиантов. Однако, последние события и действия Таноса заставили их выйти на свет.",
                    "popularity": 1835.483,
                    "poster_path": "/iCQTxIgEpNYvPfHvEuZkDcmWItU.jpg",
                    "release_date": "2021-11-08",
                    "title": "Вечные",
                    "video": false,
                    "vote_average": 7.1,
                    "vote_count": 1136
                },
                {
                    "adult": false,
                    "backdrop_path": "/eeijXm3553xvuFbkPFkDG6CLCbQ.jpg",
                    "genre_ids": [
                        878,
                        12
                    ],
                    "id": 438631,
                    "original_language": "en",
                    "original_title": "Dune",
                    "overview": "Наследник знаменитого дома Атрейдесов Пол отправляется вместе с семьёй на одну из самых опасных планет во Вселенной — Арракис. Здесь нет ничего, кроме песка, палящего солнца, гигантских чудовищ и основной причины межгалактических конфликтов — невероятно ценного ресурса, который называется меланж. В результате захвата власти Пол вынужден бежать и скрываться, и это становится началом его эпического путешествия. Враждебный мир Арракиса приготовил для него множество тяжёлых испытаний, но только тот, кто готов взглянуть в глаза своему страху, достоин стать избранным.",
                    "popularity": 1485.963,
                    "poster_path": "/irwFnLniLSu0KkiK7FMAgLounCX.jpg",
                    "release_date": "2021-09-16",
                    "title": "Дюна",
                    "video": false,
                    "vote_average": 8,
                    "vote_count": 4179
                },
                {
                    "adult": false,
                    "backdrop_path": "/lV3UFPPxDIPelh46G9oySXN9Mcz.jpg",
                    "genre_ids": [
                        10749,
                        18
                    ],
                    "id": 744275,
                    "original_language": "en",
                    "original_title": "After We Fell",
                    "overview": "Встреча с притягательным бунтарем Хардином разделила жизнь Тессы на «до» и «после». Их судьбы кажутся неразрывно связанными, но Тесса сталкивается со сложным выбором: согласиться на работу мечты в крупном издательстве или переехать в Лондон вместе с Хардином. Их страстную любовь ждет проверка на прочность: тайны прошлого, новые секреты и ответ на вопрос, что они на самом деле значат друг для друга…",
                    "popularity": 1697.09,
                    "poster_path": "/eRmylmc17IIxKKQrGcQt1723APP.jpg",
                    "release_date": "2021-09-02",
                    "title": "После. Глава 3",
                    "video": false,
                    "vote_average": 7.2,
                    "vote_count": 941
                },
                {
                    "adult": false,
                    "backdrop_path": "/8Y43POKjjKDGI9MH89NW0NAzzp8.jpg",
                    "genre_ids": [
                        35,
                        28,
                        12,
                        878
                    ],
                    "id": 550988,
                    "original_language": "en",
                    "original_title": "Free Guy",
                    "overview": "У сотрудника крупного банка всё идёт по накатанной, пока однажды он не выясняет, что окружающий его мир — это часть огромной видеоигры, а сам он в ней — всего лишь второстепенный персонаж. Хватит ли у него духу переписать свой код, обратить на себя внимание прекрасной девушки и, наконец, спасти мир? Одним словом, получится ли из него главный герой?",
                    "popularity": 1439.169,
                    "poster_path": "/qJZ3UeKAOgz2kFVJPZZFzLtn1Qk.jpg",
                    "release_date": "2021-08-12",
                    "title": "Главный герой",
                    "video": false,
                    "vote_average": 7.8,
                    "vote_count": 3765
                },
                {
                    "adult": false,
                    "backdrop_path": "/HVcza6tJtWFrLriuh3Ano4Vt46.jpg",
                    "genre_ids": [
                        28,
                        12,
                        14
                    ],
                    "id": 1930,
                    "original_language": "en",
                    "original_title": "The Amazing Spider-Man",
                    "overview": "В детстве Питер Паркер был оставлен своими родителями, и поэтому воспитывался дядей и тётей. Шли годы, Питер был обычным примерным школьником, подвергался нападкам хулиганов и был влюблён в свою одноклассницу Гвен Стэйси, которая сама втайне отвечала ему взаимностью. Но после укуса генетически изменённого паука, Питер получает невероятные сверхспособности и его жизнь меняется навсегда.  Однако его не перестаёт мучить вопрос о том, что случилось с его родителями. Он знакомится с давним другом и партнёром своего отца — генетиком Куртом Коннорсом, который вместе с отцом Питера разрабатывал формулу регенерации. Питер помогает её закончить, а Коннорс, всю жизнь мечтавший восстановить свою правую руку, вводит формулу себе и становится Ящером. Осознавая свою вину, Питер начинает новую жизнь в образе таинственного супергероя Человека-паука и становится грозой преступников, одновременно пытаясь найти способ остановить Коннорса.",
                    "popularity": 1150.752,
                    "poster_path": "/kby3x8wic9Lx4qEfstLu2vFHTVj.jpg",
                    "release_date": "2012-07-05",
                    "title": "Новый Человек-паук",
                    "video": false,
                    "vote_average": 6.6,
                    "vote_count": 13609
                },
                {
                    "adult": false,
                    "backdrop_path": "/VuukZLgaCrho2Ar8Scl9HtV3yD.jpg",
                    "genre_ids": [
                        878,
                        28
                    ],
                    "id": 335983,
                    "original_language": "en",
                    "original_title": "Venom",
                    "overview": "Что если в один прекрасный день в тебя вселяется существо-симбиот, которое наделяет тебя сверхчеловеческими способностями? Вот только Веном – симбиот совсем недобрый, и договориться с ним невозможно. Хотя нужно ли договариваться?.. Ведь в какой-то момент ты понимаешь, что быть плохим вовсе не так уж и плохо. Так даже веселее. В мире и так слишком много супергероев! Мы – Веном!",
                    "popularity": 1006.875,
                    "poster_path": "/8Gyl0fknqiZeCLm9XitxCXQmEL9.jpg",
                    "release_date": "2018-10-04",
                    "title": "Веном",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 12271
                },
                {
                    "adult": false,
                    "backdrop_path": "/ng6SSB3JhbcpKTwbPDsRwUYK8Cq.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 429617,
                    "original_language": "en",
                    "original_title": "Spider-Man: Far From Home",
                    "overview": "Питер Паркер вместе с одноклассниками отправляется на летние каникулы в Европу. Однако отдохнуть приятелям вряд ли удастся — по прибытии в Венецию группа попадает в эпицентр сражения. Некое существо, состоящее из воды, появляется из ниоткуда и начинает крушить всё на своём пути, и теперь Питеру придётся спасать европейские архитектурные памятники вместе с загадочным супергероем Мистерио.",
                    "popularity": 772.42,
                    "poster_path": "/5NNAHfyG4Ttu6ED9PpVe9mrRthj.jpg",
                    "release_date": "2019-07-04",
                    "title": "Человек-паук: Вдали от дома",
                    "video": false,
                    "vote_average": 7.5,
                    "vote_count": 11012
                },
                {
                    "adult": false,
                    "backdrop_path": "/hugKriLPeBm3lErSCQiFOgQzpkC.jpg",
                    "genre_ids": [
                        28,
                        53,
                        80
                    ],
                    "id": 574060,
                    "original_language": "en",
                    "original_title": "Gunpowder Milkshake",
                    "overview": "Быть киллером — весело и просто. Особенно для Сэм, которая от матери унаследовала талант к заказным убийствам. Но когда девушке приходится пойти наперекор собственному боссу, она становится мишенью целой армии головорезов. К счастью, мама и её бывшие напарницы готовы помочь угостить недоброжелателей своим фирменным «пороховым коктейлем».",
                    "popularity": 749.184,
                    "poster_path": "/oVB4dtfFDQrSbAsH7zrH8uV1d9G.jpg",
                    "release_date": "2021-07-15",
                    "title": "Пороховой коктейль",
                    "video": false,
                    "vote_average": 6.5,
                    "vote_count": 382
                },
                {
                    "adult": false,
                    "backdrop_path": "/wfrfxivLOBtGMC98tIr2LSOeKSe.jpg",
                    "genre_ids": [
                        16,
                        12,
                        35,
                        10751
                    ],
                    "id": 639721,
                    "original_language": "en",
                    "original_title": "The Addams Family 2",
                    "overview": "Семейка Аддамс вовлекается в ещё более умопомрачительные приключения и оказывается вовлечённой в забавные стычки с самыми разными ничего не подозревающими персонажами.  Продолжение мультфильма 2019 года «Семейка Аддамс».",
                    "popularity": 719.97,
                    "poster_path": "/q9bt09k468PhsCTYybd20FIqfNw.jpg",
                    "release_date": "2021-10-07",
                    "title": "Семейка Аддамс: Горящий тур",
                    "video": false,
                    "vote_average": 7.3,
                    "vote_count": 609
                },
                {
                    "adult": false,
                    "backdrop_path": "/5i3ghCXVLNhewrBjTesMgy4FHT7.jpg",
                    "genre_ids": [
                        12,
                        16,
                        35,
                        10751,
                        14,
                        10402
                    ],
                    "id": 568124,
                    "original_language": "en",
                    "original_title": "Encanto",
                    "overview": "Удивительная семья Мадригалов живет в спрятанном в горах Колумбии волшебном доме, расположенном в чудесном и очаровательном уголке под названием Энканто. Каждого ребёнка в семье Мадригалов магия этого места благословила уникальным даром — от суперсилы до способности исцелять. Увы, магия обошла стороной одну лишь юную Мирабель. Обнаружив, что магия Энканто находится в опасности, Мирабель решает, что именно она может быть последней надеждой на спасение своей особенной семьи.",
                    "popularity": 831.356,
                    "poster_path": "/mIYn3jXppOd5ALMTrhLUOtojez4.jpg",
                    "release_date": "2021-11-25",
                    "title": "Энканто",
                    "video": false,
                    "vote_average": 5.7,
                    "vote_count": 5
                },
                {
                    "adult": false,
                    "backdrop_path": "/dIibeeq4QMay5bTJ2vjr72IFFRo.jpg",
                    "genre_ids": [
                        14,
                        12,
                        35
                    ],
                    "id": 589754,
                    "original_language": "ru",
                    "original_title": "Последний богатырь: Корень зла",
                    "overview": "В Белогорье мир и спокойствие, зло побеждено. Рядом отец Илья Муромец, возлюбленная Василиса в предсвадебных заботах, ставшие друзьями Баба Яга и Водяной и маленькие радости из современного мира, чтоб обеспечить комфортную жизнь — благо Меч-Кладенец даёт возможность регулярно прорубать дыру между мирами и бегать за припасами. Но тоска по родному миру тяготит Ивана. А ещё больше его заботит неминуемое начало Богатырских игр — съезда всех витязей Белогорья, где добры молодцы будут показывать удаль и силу. Той самой Богатырской силушки в себе Иван не чувствует, и опозориться на глазах у отца и невесты ему совсем не хочется. Однако, когда в самый разгар состязаний пробуждается древнее зло и само существование волшебного мира оказывается под угрозой, Ивану приходится объединиться и со старыми друзьями, и с новыми недругами. Им предстоит отправиться в дальнее путешествие, за пределы известного мира, чтобы обнаружить истоки зла и вернуть мир в Белогорье.",
                    "popularity": 693.911,
                    "poster_path": "/9ZH3XulXJPHmXuOgZMqzXCvRB6K.jpg",
                    "release_date": "2021-01-01",
                    "title": "Последний богатырь: Корень зла",
                    "video": false,
                    "vote_average": 7.1,
                    "vote_count": 65
                },
                {
                    "adult": false,
                    "backdrop_path": "/2OFg5p9yarI5zZsUWKCRgBgPctj.jpg",
                    "genre_ids": [
                        28,
                        12
                    ],
                    "id": 568620,
                    "original_language": "en",
                    "original_title": "Snake Eyes: G.I. Joe Origins",
                    "overview": "Загадочный и суровый одиночка Снейк Айз спасает наследника древнего японского клана Арашикаге, и в знак признательности клан открывает ему тайные знания пути ниндзя. Но главное: Снейк Айз обретает то, к чему так долго стремился, — дом. Однако, когда становятся известны секреты его прошлого, на кону оказываются его честь, преданность и доверие самых близких людей.",
                    "popularity": 806.19,
                    "poster_path": "/5ziYvBUoDB95zeGnTEZxxb92Xi1.jpg",
                    "release_date": "2021-07-22",
                    "title": "G.I. Joe: Бросок кобры. Снейк Айз",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 834
                },
                {
                    "adult": false,
                    "backdrop_path": "/xPpXYnCWfjkt3zzE0dpCNME1pXF.jpg",
                    "genre_ids": [
                        16,
                        28,
                        12,
                        14
                    ],
                    "id": 635302,
                    "original_language": "ja",
                    "original_title": "劇場版「鬼滅の刃」無限列車編",
                    "overview": "Тандзиро с друзьями из отряда уничтожителей демонов расследует серию загадочных исчезновений внутри мчащегося поезда. Но компания ещё не знает, что в составе находится один из двенадцати Лунных демонов, и он приготовил для них ловушку.",
                    "popularity": 742.851,
                    "poster_path": "/m9cn5mhW519QKr1YGpGxNWi98VJ.jpg",
                    "release_date": "2021-05-20",
                    "title": "Истребитель демонов: Поезд «Бесконечный»",
                    "video": false,
                    "vote_average": 8.4,
                    "vote_count": 1868
                },
                {
                    "adult": false,
                    "backdrop_path": "/fuuZFPc8x6gQ8mLGoBp9vrmcQMT.jpg",
                    "genre_ids": [
                        27,
                        53
                    ],
                    "id": 610253,
                    "original_language": "en",
                    "original_title": "Halloween Kills",
                    "overview": "Хитроумная ловушка Лори Строуд почти помогла ей победить зловещего убийцу Майкла Майерса. Почти… Он снова на свободе, и кровавый след, который тянется за ним, еще никогда не был таким длинным. Женщины семьи Строуд объединяются с другими выжившими, чтобы остановить Майкла раз и навсегда…",
                    "popularity": 599.788,
                    "poster_path": "/8lr4YPjFtLUkMgRKr7quYwJVpiL.jpg",
                    "release_date": "2021-10-21",
                    "title": "Хэллоуин убивает",
                    "video": false,
                    "vote_average": 6.9,
                    "vote_count": 1247
                }
            ],
            "total_pages": 500,
            "total_results": 10000
        }"""

        val builder = GsonBuilder()
        val objectClass: ResponsePage<Movie> = builder.create().fromJson(
            jsonString,
            object : TypeToken<ResponsePage<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getNowPlayingMovies(): List<Movie> {
        val jsonString = """{
            "page": 1,
            "results": [
                {
                    "adult": false,
                    "backdrop_path": "/cinER0ESG0eJ49kXlExM0MEWGxW.jpg",
                    "genre_ids": [
                        28,
                        12,
                        14
                    ],
                    "id": 566525,
                    "original_language": "en",
                    "original_title": "Shang-Chi and the Legend of the Ten Rings",
                    "overview": "Мастеру боевых искусств Шан-Чи предстоит противостоять призракам из собственного прошлого, по мере того как его втягивают в паутину интриг таинственной организации «Десять колец».",
                    "popularity": 6665.737,
                    "poster_path": "/hn0B1OFQRQnzr0LeLkaUbJxoiol.jpg",
                    "release_date": "2021-09-02",
                    "title": "Шан-Чи и легенда десяти колец",
                    "video": false,
                    "vote_average": 7.9,
                    "vote_count": 3379
                },
                {
                    "adult": false,
                    "backdrop_path": "/70nxSw3mFBsGmtkvcs91PbjerwD.jpg",
                    "genre_ids": [
                        878,
                        28,
                        12
                    ],
                    "id": 580489,
                    "original_language": "en",
                    "original_title": "Venom: Let There Be Carnage",
                    "overview": "Эдди живёт с симбиотом в своём теле уже давно и приспособился к быту. Однако ему придётся столкнуться со злодеем Клетусом Кэссиди, в котором обитает другой внеземной паразит по прозвищу Карнаж.",
                    "popularity": 4141.331,
                    "poster_path": "/lO6TXwP5dKoflEhqfjd0uNWSNhp.jpg",
                    "release_date": "2021-09-30",
                    "title": "Веном 2",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 2039
                },
                {
                    "adult": false,
                    "backdrop_path": "/zBkHCpLmHjW2uVURs5uZkaVmgKR.jpg",
                    "genre_ids": [
                        16,
                        35,
                        10751
                    ],
                    "id": 585245,
                    "original_language": "en",
                    "original_title": "Clifford the Big Red Dog",
                    "overview": "Когда школьница Эмили получает в подарок от спасателя животных очаровательного щенка с красной шерстью, она и представить не может, что на утро обнаружит в своей маленькой нью-йоркской квартирке… огромного 3-метрового пса! Мама в командировке, поэтому самые захватывающие и необыкновенные приключения ждут Эмили и ее веселого и порывистого дядю Кейси. Клиффорд научит их — а заодно и весь мир — любить по-крупному.",
                    "popularity": 3269.139,
                    "poster_path": "/Ah2D98B56MSEWs9B7pyFDmaef0X.jpg",
                    "release_date": "2021-12-02",
                    "title": "Большой красный пес Клиффорд",
                    "video": false,
                    "vote_average": 7.8,
                    "vote_count": 170
                },
                {
                    "adult": false,
                    "backdrop_path": "/u5Fp9GBy9W8fqkuGfLBuuoJf57Z.jpg",
                    "genre_ids": [
                        12,
                        28,
                        53
                    ],
                    "id": 370172,
                    "original_language": "en",
                    "original_title": "No Time to Die",
                    "overview": "Джеймс Бонд оставил оперативную службу и наслаждается спокойной жизнью на Ямайке. Все меняется, когда на острове появляется его старый друг Феликс Лейтер из ЦРУ с просьбой о помощи. Миссия по спасению похищенного ученого оказывается опаснее, чем предполагалось изначально. Бонд попадает в ловушку к таинственному злодею, вооруженному опасным технологическим оружием.",
                    "popularity": 3491.344,
                    "poster_path": "/jycSKuZ4CvgPWRHdhgPA9q1EC8n.jpg",
                    "release_date": "2021-10-07",
                    "title": "Не время умирать",
                    "video": false,
                    "vote_average": 7.6,
                    "vote_count": 2033
                },
                {
                    "adult": false,
                    "backdrop_path": "/4gKxQIW91hOTELjY5lzjMbLoGxB.jpg",
                    "genre_ids": [
                        28,
                        53,
                        878
                    ],
                    "id": 763164,
                    "original_language": "en",
                    "original_title": "Apex",
                    "overview": "Пять охотников покупают элитную услугу — возможность выследить человека на необитаемом острове, но сами становятся добычей.",
                    "popularity": 1863.698,
                    "poster_path": "/chTkFGToW5bsyw3hgLAe4S5Gt3.jpg",
                    "release_date": "2021-12-16",
                    "title": "Преступный квест",
                    "video": false,
                    "vote_average": 5.7,
                    "vote_count": 183
                },
                {
                    "adult": false,
                    "backdrop_path": "/vIPIyTJqcgOKgKcExCvTDpLpTYW.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 634649,
                    "original_language": "en",
                    "original_title": "Spider-Man: No Way Home",
                    "overview": "Жизнь и репутация Питера Паркера оказываются под угрозой, поскольку Мистерио раскрыл всему миру тайну личности Человека-паука. Пытаясь исправить ситуацию, Питер обращается за помощью к Стивену Стрэнджу, но вскоре всё становится намного опаснее.",
                    "popularity": 1782.83,
                    "poster_path": "/zSuZByDQH0TscbE300hsnwksjbo.jpg",
                    "release_date": "2021-12-15",
                    "title": "Человек-паук: Нет пути домой",
                    "video": false,
                    "vote_average": 0,
                    "vote_count": 0
                },
                {
                    "adult": false,
                    "backdrop_path": "/lyvszvJJqqI8aqBJ70XzdCNoK0y.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 524434,
                    "original_language": "en",
                    "original_title": "Eternals",
                    "overview": "Вечные — представители расы генетически улучшенных суперлюдей, тайно живущих на Земле. Они появились на свет 5 миллионов лет назад в результате экспериментов могущественных целестиалов. Наделённые невероятными суперспособностями, на протяжении тысячелетий они скрывались от человеческой цивилизации, втайне защищая людей от монструозных девиантов. Однако, последние события и действия Таноса заставили их выйти на свет.",
                    "popularity": 1835.483,
                    "poster_path": "/iCQTxIgEpNYvPfHvEuZkDcmWItU.jpg",
                    "release_date": "2021-11-08",
                    "title": "Вечные",
                    "video": false,
                    "vote_average": 7.1,
                    "vote_count": 1136
                },
                {
                    "adult": false,
                    "backdrop_path": "/eeijXm3553xvuFbkPFkDG6CLCbQ.jpg",
                    "genre_ids": [
                        878,
                        12
                    ],
                    "id": 438631,
                    "original_language": "en",
                    "original_title": "Dune",
                    "overview": "Наследник знаменитого дома Атрейдесов Пол отправляется вместе с семьёй на одну из самых опасных планет во Вселенной — Арракис. Здесь нет ничего, кроме песка, палящего солнца, гигантских чудовищ и основной причины межгалактических конфликтов — невероятно ценного ресурса, который называется меланж. В результате захвата власти Пол вынужден бежать и скрываться, и это становится началом его эпического путешествия. Враждебный мир Арракиса приготовил для него множество тяжёлых испытаний, но только тот, кто готов взглянуть в глаза своему страху, достоин стать избранным.",
                    "popularity": 1485.963,
                    "poster_path": "/irwFnLniLSu0KkiK7FMAgLounCX.jpg",
                    "release_date": "2021-09-16",
                    "title": "Дюна",
                    "video": false,
                    "vote_average": 8,
                    "vote_count": 4179
                },
                {
                    "adult": false,
                    "backdrop_path": "/lV3UFPPxDIPelh46G9oySXN9Mcz.jpg",
                    "genre_ids": [
                        10749,
                        18
                    ],
                    "id": 744275,
                    "original_language": "en",
                    "original_title": "After We Fell",
                    "overview": "Встреча с притягательным бунтарем Хардином разделила жизнь Тессы на «до» и «после». Их судьбы кажутся неразрывно связанными, но Тесса сталкивается со сложным выбором: согласиться на работу мечты в крупном издательстве или переехать в Лондон вместе с Хардином. Их страстную любовь ждет проверка на прочность: тайны прошлого, новые секреты и ответ на вопрос, что они на самом деле значат друг для друга…",
                    "popularity": 1697.09,
                    "poster_path": "/eRmylmc17IIxKKQrGcQt1723APP.jpg",
                    "release_date": "2021-09-02",
                    "title": "После. Глава 3",
                    "video": false,
                    "vote_average": 7.2,
                    "vote_count": 941
                },
                {
                    "adult": false,
                    "backdrop_path": "/8Y43POKjjKDGI9MH89NW0NAzzp8.jpg",
                    "genre_ids": [
                        35,
                        28,
                        12,
                        878
                    ],
                    "id": 550988,
                    "original_language": "en",
                    "original_title": "Free Guy",
                    "overview": "У сотрудника крупного банка всё идёт по накатанной, пока однажды он не выясняет, что окружающий его мир — это часть огромной видеоигры, а сам он в ней — всего лишь второстепенный персонаж. Хватит ли у него духу переписать свой код, обратить на себя внимание прекрасной девушки и, наконец, спасти мир? Одним словом, получится ли из него главный герой?",
                    "popularity": 1439.169,
                    "poster_path": "/qJZ3UeKAOgz2kFVJPZZFzLtn1Qk.jpg",
                    "release_date": "2021-08-12",
                    "title": "Главный герой",
                    "video": false,
                    "vote_average": 7.8,
                    "vote_count": 3765
                },
                {
                    "adult": false,
                    "backdrop_path": "/HVcza6tJtWFrLriuh3Ano4Vt46.jpg",
                    "genre_ids": [
                        28,
                        12,
                        14
                    ],
                    "id": 1930,
                    "original_language": "en",
                    "original_title": "The Amazing Spider-Man",
                    "overview": "В детстве Питер Паркер был оставлен своими родителями, и поэтому воспитывался дядей и тётей. Шли годы, Питер был обычным примерным школьником, подвергался нападкам хулиганов и был влюблён в свою одноклассницу Гвен Стэйси, которая сама втайне отвечала ему взаимностью. Но после укуса генетически изменённого паука, Питер получает невероятные сверхспособности и его жизнь меняется навсегда.  Однако его не перестаёт мучить вопрос о том, что случилось с его родителями. Он знакомится с давним другом и партнёром своего отца — генетиком Куртом Коннорсом, который вместе с отцом Питера разрабатывал формулу регенерации. Питер помогает её закончить, а Коннорс, всю жизнь мечтавший восстановить свою правую руку, вводит формулу себе и становится Ящером. Осознавая свою вину, Питер начинает новую жизнь в образе таинственного супергероя Человека-паука и становится грозой преступников, одновременно пытаясь найти способ остановить Коннорса.",
                    "popularity": 1150.752,
                    "poster_path": "/kby3x8wic9Lx4qEfstLu2vFHTVj.jpg",
                    "release_date": "2012-07-05",
                    "title": "Новый Человек-паук",
                    "video": false,
                    "vote_average": 6.6,
                    "vote_count": 13609
                },
                {
                    "adult": false,
                    "backdrop_path": "/VuukZLgaCrho2Ar8Scl9HtV3yD.jpg",
                    "genre_ids": [
                        878,
                        28
                    ],
                    "id": 335983,
                    "original_language": "en",
                    "original_title": "Venom",
                    "overview": "Что если в один прекрасный день в тебя вселяется существо-симбиот, которое наделяет тебя сверхчеловеческими способностями? Вот только Веном – симбиот совсем недобрый, и договориться с ним невозможно. Хотя нужно ли договариваться?.. Ведь в какой-то момент ты понимаешь, что быть плохим вовсе не так уж и плохо. Так даже веселее. В мире и так слишком много супергероев! Мы – Веном!",
                    "popularity": 1006.875,
                    "poster_path": "/8Gyl0fknqiZeCLm9XitxCXQmEL9.jpg",
                    "release_date": "2018-10-04",
                    "title": "Веном",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 12271
                },
                {
                    "adult": false,
                    "backdrop_path": "/ng6SSB3JhbcpKTwbPDsRwUYK8Cq.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 429617,
                    "original_language": "en",
                    "original_title": "Spider-Man: Far From Home",
                    "overview": "Питер Паркер вместе с одноклассниками отправляется на летние каникулы в Европу. Однако отдохнуть приятелям вряд ли удастся — по прибытии в Венецию группа попадает в эпицентр сражения. Некое существо, состоящее из воды, появляется из ниоткуда и начинает крушить всё на своём пути, и теперь Питеру придётся спасать европейские архитектурные памятники вместе с загадочным супергероем Мистерио.",
                    "popularity": 772.42,
                    "poster_path": "/5NNAHfyG4Ttu6ED9PpVe9mrRthj.jpg",
                    "release_date": "2019-07-04",
                    "title": "Человек-паук: Вдали от дома",
                    "video": false,
                    "vote_average": 7.5,
                    "vote_count": 11012
                },
                {
                    "adult": false,
                    "backdrop_path": "/hugKriLPeBm3lErSCQiFOgQzpkC.jpg",
                    "genre_ids": [
                        28,
                        53,
                        80
                    ],
                    "id": 574060,
                    "original_language": "en",
                    "original_title": "Gunpowder Milkshake",
                    "overview": "Быть киллером — весело и просто. Особенно для Сэм, которая от матери унаследовала талант к заказным убийствам. Но когда девушке приходится пойти наперекор собственному боссу, она становится мишенью целой армии головорезов. К счастью, мама и её бывшие напарницы готовы помочь угостить недоброжелателей своим фирменным «пороховым коктейлем».",
                    "popularity": 749.184,
                    "poster_path": "/oVB4dtfFDQrSbAsH7zrH8uV1d9G.jpg",
                    "release_date": "2021-07-15",
                    "title": "Пороховой коктейль",
                    "video": false,
                    "vote_average": 6.5,
                    "vote_count": 382
                },
                {
                    "adult": false,
                    "backdrop_path": "/wfrfxivLOBtGMC98tIr2LSOeKSe.jpg",
                    "genre_ids": [
                        16,
                        12,
                        35,
                        10751
                    ],
                    "id": 639721,
                    "original_language": "en",
                    "original_title": "The Addams Family 2",
                    "overview": "Семейка Аддамс вовлекается в ещё более умопомрачительные приключения и оказывается вовлечённой в забавные стычки с самыми разными ничего не подозревающими персонажами.  Продолжение мультфильма 2019 года «Семейка Аддамс».",
                    "popularity": 719.97,
                    "poster_path": "/q9bt09k468PhsCTYybd20FIqfNw.jpg",
                    "release_date": "2021-10-07",
                    "title": "Семейка Аддамс: Горящий тур",
                    "video": false,
                    "vote_average": 7.3,
                    "vote_count": 609
                },
                {
                    "adult": false,
                    "backdrop_path": "/5i3ghCXVLNhewrBjTesMgy4FHT7.jpg",
                    "genre_ids": [
                        12,
                        16,
                        35,
                        10751,
                        14,
                        10402
                    ],
                    "id": 568124,
                    "original_language": "en",
                    "original_title": "Encanto",
                    "overview": "Удивительная семья Мадригалов живет в спрятанном в горах Колумбии волшебном доме, расположенном в чудесном и очаровательном уголке под названием Энканто. Каждого ребёнка в семье Мадригалов магия этого места благословила уникальным даром — от суперсилы до способности исцелять. Увы, магия обошла стороной одну лишь юную Мирабель. Обнаружив, что магия Энканто находится в опасности, Мирабель решает, что именно она может быть последней надеждой на спасение своей особенной семьи.",
                    "popularity": 831.356,
                    "poster_path": "/mIYn3jXppOd5ALMTrhLUOtojez4.jpg",
                    "release_date": "2021-11-25",
                    "title": "Энканто",
                    "video": false,
                    "vote_average": 5.7,
                    "vote_count": 5
                },
                {
                    "adult": false,
                    "backdrop_path": "/dIibeeq4QMay5bTJ2vjr72IFFRo.jpg",
                    "genre_ids": [
                        14,
                        12,
                        35
                    ],
                    "id": 589754,
                    "original_language": "ru",
                    "original_title": "Последний богатырь: Корень зла",
                    "overview": "В Белогорье мир и спокойствие, зло побеждено. Рядом отец Илья Муромец, возлюбленная Василиса в предсвадебных заботах, ставшие друзьями Баба Яга и Водяной и маленькие радости из современного мира, чтоб обеспечить комфортную жизнь — благо Меч-Кладенец даёт возможность регулярно прорубать дыру между мирами и бегать за припасами. Но тоска по родному миру тяготит Ивана. А ещё больше его заботит неминуемое начало Богатырских игр — съезда всех витязей Белогорья, где добры молодцы будут показывать удаль и силу. Той самой Богатырской силушки в себе Иван не чувствует, и опозориться на глазах у отца и невесты ему совсем не хочется. Однако, когда в самый разгар состязаний пробуждается древнее зло и само существование волшебного мира оказывается под угрозой, Ивану приходится объединиться и со старыми друзьями, и с новыми недругами. Им предстоит отправиться в дальнее путешествие, за пределы известного мира, чтобы обнаружить истоки зла и вернуть мир в Белогорье.",
                    "popularity": 693.911,
                    "poster_path": "/9ZH3XulXJPHmXuOgZMqzXCvRB6K.jpg",
                    "release_date": "2021-01-01",
                    "title": "Последний богатырь: Корень зла",
                    "video": false,
                    "vote_average": 7.1,
                    "vote_count": 65
                },
                {
                    "adult": false,
                    "backdrop_path": "/2OFg5p9yarI5zZsUWKCRgBgPctj.jpg",
                    "genre_ids": [
                        28,
                        12
                    ],
                    "id": 568620,
                    "original_language": "en",
                    "original_title": "Snake Eyes: G.I. Joe Origins",
                    "overview": "Загадочный и суровый одиночка Снейк Айз спасает наследника древнего японского клана Арашикаге, и в знак признательности клан открывает ему тайные знания пути ниндзя. Но главное: Снейк Айз обретает то, к чему так долго стремился, — дом. Однако, когда становятся известны секреты его прошлого, на кону оказываются его честь, преданность и доверие самых близких людей.",
                    "popularity": 806.19,
                    "poster_path": "/5ziYvBUoDB95zeGnTEZxxb92Xi1.jpg",
                    "release_date": "2021-07-22",
                    "title": "G.I. Joe: Бросок кобры. Снейк Айз",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 834
                },
                {
                    "adult": false,
                    "backdrop_path": "/xPpXYnCWfjkt3zzE0dpCNME1pXF.jpg",
                    "genre_ids": [
                        16,
                        28,
                        12,
                        14
                    ],
                    "id": 635302,
                    "original_language": "ja",
                    "original_title": "劇場版「鬼滅の刃」無限列車編",
                    "overview": "Тандзиро с друзьями из отряда уничтожителей демонов расследует серию загадочных исчезновений внутри мчащегося поезда. Но компания ещё не знает, что в составе находится один из двенадцати Лунных демонов, и он приготовил для них ловушку.",
                    "popularity": 742.851,
                    "poster_path": "/m9cn5mhW519QKr1YGpGxNWi98VJ.jpg",
                    "release_date": "2021-05-20",
                    "title": "Истребитель демонов: Поезд «Бесконечный»",
                    "video": false,
                    "vote_average": 8.4,
                    "vote_count": 1868
                },
                {
                    "adult": false,
                    "backdrop_path": "/fuuZFPc8x6gQ8mLGoBp9vrmcQMT.jpg",
                    "genre_ids": [
                        27,
                        53
                    ],
                    "id": 610253,
                    "original_language": "en",
                    "original_title": "Halloween Kills",
                    "overview": "Хитроумная ловушка Лори Строуд почти помогла ей победить зловещего убийцу Майкла Майерса. Почти… Он снова на свободе, и кровавый след, который тянется за ним, еще никогда не был таким длинным. Женщины семьи Строуд объединяются с другими выжившими, чтобы остановить Майкла раз и навсегда…",
                    "popularity": 599.788,
                    "poster_path": "/8lr4YPjFtLUkMgRKr7quYwJVpiL.jpg",
                    "release_date": "2021-10-21",
                    "title": "Хэллоуин убивает",
                    "video": false,
                    "vote_average": 6.9,
                    "vote_count": 1247
                }
            ],
            "total_pages": 500,
            "total_results": 10000
        }"""

        val builder = GsonBuilder()
        val objectClass: ResponsePage<Movie> = builder.create().fromJson(
            jsonString,
            object : TypeToken<ResponsePage<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getPopularMovies(): List<Movie> {
        val jsonString = """{
            "page": 1,
            "results": [
                {
                    "adult": false,
                    "backdrop_path": "/cinER0ESG0eJ49kXlExM0MEWGxW.jpg",
                    "genre_ids": [
                        28,
                        12,
                        14
                    ],
                    "id": 566525,
                    "original_language": "en",
                    "original_title": "Shang-Chi and the Legend of the Ten Rings",
                    "overview": "Мастеру боевых искусств Шан-Чи предстоит противостоять призракам из собственного прошлого, по мере того как его втягивают в паутину интриг таинственной организации «Десять колец».",
                    "popularity": 6665.737,
                    "poster_path": "/hn0B1OFQRQnzr0LeLkaUbJxoiol.jpg",
                    "release_date": "2021-09-02",
                    "title": "Шан-Чи и легенда десяти колец",
                    "video": false,
                    "vote_average": 7.9,
                    "vote_count": 3379
                },
                {
                    "adult": false,
                    "backdrop_path": "/70nxSw3mFBsGmtkvcs91PbjerwD.jpg",
                    "genre_ids": [
                        878,
                        28,
                        12
                    ],
                    "id": 580489,
                    "original_language": "en",
                    "original_title": "Venom: Let There Be Carnage",
                    "overview": "Эдди живёт с симбиотом в своём теле уже давно и приспособился к быту. Однако ему придётся столкнуться со злодеем Клетусом Кэссиди, в котором обитает другой внеземной паразит по прозвищу Карнаж.",
                    "popularity": 4141.331,
                    "poster_path": "/lO6TXwP5dKoflEhqfjd0uNWSNhp.jpg",
                    "release_date": "2021-09-30",
                    "title": "Веном 2",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 2039
                },
                {
                    "adult": false,
                    "backdrop_path": "/zBkHCpLmHjW2uVURs5uZkaVmgKR.jpg",
                    "genre_ids": [
                        16,
                        35,
                        10751
                    ],
                    "id": 585245,
                    "original_language": "en",
                    "original_title": "Clifford the Big Red Dog",
                    "overview": "Когда школьница Эмили получает в подарок от спасателя животных очаровательного щенка с красной шерстью, она и представить не может, что на утро обнаружит в своей маленькой нью-йоркской квартирке… огромного 3-метрового пса! Мама в командировке, поэтому самые захватывающие и необыкновенные приключения ждут Эмили и ее веселого и порывистого дядю Кейси. Клиффорд научит их — а заодно и весь мир — любить по-крупному.",
                    "popularity": 3269.139,
                    "poster_path": "/Ah2D98B56MSEWs9B7pyFDmaef0X.jpg",
                    "release_date": "2021-12-02",
                    "title": "Большой красный пес Клиффорд",
                    "video": false,
                    "vote_average": 7.8,
                    "vote_count": 170
                },
                {
                    "adult": false,
                    "backdrop_path": "/u5Fp9GBy9W8fqkuGfLBuuoJf57Z.jpg",
                    "genre_ids": [
                        12,
                        28,
                        53
                    ],
                    "id": 370172,
                    "original_language": "en",
                    "original_title": "No Time to Die",
                    "overview": "Джеймс Бонд оставил оперативную службу и наслаждается спокойной жизнью на Ямайке. Все меняется, когда на острове появляется его старый друг Феликс Лейтер из ЦРУ с просьбой о помощи. Миссия по спасению похищенного ученого оказывается опаснее, чем предполагалось изначально. Бонд попадает в ловушку к таинственному злодею, вооруженному опасным технологическим оружием.",
                    "popularity": 3491.344,
                    "poster_path": "/jycSKuZ4CvgPWRHdhgPA9q1EC8n.jpg",
                    "release_date": "2021-10-07",
                    "title": "Не время умирать",
                    "video": false,
                    "vote_average": 7.6,
                    "vote_count": 2033
                },
                {
                    "adult": false,
                    "backdrop_path": "/4gKxQIW91hOTELjY5lzjMbLoGxB.jpg",
                    "genre_ids": [
                        28,
                        53,
                        878
                    ],
                    "id": 763164,
                    "original_language": "en",
                    "original_title": "Apex",
                    "overview": "Пять охотников покупают элитную услугу — возможность выследить человека на необитаемом острове, но сами становятся добычей.",
                    "popularity": 1863.698,
                    "poster_path": "/chTkFGToW5bsyw3hgLAe4S5Gt3.jpg",
                    "release_date": "2021-12-16",
                    "title": "Преступный квест",
                    "video": false,
                    "vote_average": 5.7,
                    "vote_count": 183
                },
                {
                    "adult": false,
                    "backdrop_path": "/vIPIyTJqcgOKgKcExCvTDpLpTYW.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 634649,
                    "original_language": "en",
                    "original_title": "Spider-Man: No Way Home",
                    "overview": "Жизнь и репутация Питера Паркера оказываются под угрозой, поскольку Мистерио раскрыл всему миру тайну личности Человека-паука. Пытаясь исправить ситуацию, Питер обращается за помощью к Стивену Стрэнджу, но вскоре всё становится намного опаснее.",
                    "popularity": 1782.83,
                    "poster_path": "/zSuZByDQH0TscbE300hsnwksjbo.jpg",
                    "release_date": "2021-12-15",
                    "title": "Человек-паук: Нет пути домой",
                    "video": false,
                    "vote_average": 0,
                    "vote_count": 0
                },
                {
                    "adult": false,
                    "backdrop_path": "/lyvszvJJqqI8aqBJ70XzdCNoK0y.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 524434,
                    "original_language": "en",
                    "original_title": "Eternals",
                    "overview": "Вечные — представители расы генетически улучшенных суперлюдей, тайно живущих на Земле. Они появились на свет 5 миллионов лет назад в результате экспериментов могущественных целестиалов. Наделённые невероятными суперспособностями, на протяжении тысячелетий они скрывались от человеческой цивилизации, втайне защищая людей от монструозных девиантов. Однако, последние события и действия Таноса заставили их выйти на свет.",
                    "popularity": 1835.483,
                    "poster_path": "/iCQTxIgEpNYvPfHvEuZkDcmWItU.jpg",
                    "release_date": "2021-11-08",
                    "title": "Вечные",
                    "video": false,
                    "vote_average": 7.1,
                    "vote_count": 1136
                },
                {
                    "adult": false,
                    "backdrop_path": "/eeijXm3553xvuFbkPFkDG6CLCbQ.jpg",
                    "genre_ids": [
                        878,
                        12
                    ],
                    "id": 438631,
                    "original_language": "en",
                    "original_title": "Dune",
                    "overview": "Наследник знаменитого дома Атрейдесов Пол отправляется вместе с семьёй на одну из самых опасных планет во Вселенной — Арракис. Здесь нет ничего, кроме песка, палящего солнца, гигантских чудовищ и основной причины межгалактических конфликтов — невероятно ценного ресурса, который называется меланж. В результате захвата власти Пол вынужден бежать и скрываться, и это становится началом его эпического путешествия. Враждебный мир Арракиса приготовил для него множество тяжёлых испытаний, но только тот, кто готов взглянуть в глаза своему страху, достоин стать избранным.",
                    "popularity": 1485.963,
                    "poster_path": "/irwFnLniLSu0KkiK7FMAgLounCX.jpg",
                    "release_date": "2021-09-16",
                    "title": "Дюна",
                    "video": false,
                    "vote_average": 8,
                    "vote_count": 4179
                },
                {
                    "adult": false,
                    "backdrop_path": "/lV3UFPPxDIPelh46G9oySXN9Mcz.jpg",
                    "genre_ids": [
                        10749,
                        18
                    ],
                    "id": 744275,
                    "original_language": "en",
                    "original_title": "After We Fell",
                    "overview": "Встреча с притягательным бунтарем Хардином разделила жизнь Тессы на «до» и «после». Их судьбы кажутся неразрывно связанными, но Тесса сталкивается со сложным выбором: согласиться на работу мечты в крупном издательстве или переехать в Лондон вместе с Хардином. Их страстную любовь ждет проверка на прочность: тайны прошлого, новые секреты и ответ на вопрос, что они на самом деле значат друг для друга…",
                    "popularity": 1697.09,
                    "poster_path": "/eRmylmc17IIxKKQrGcQt1723APP.jpg",
                    "release_date": "2021-09-02",
                    "title": "После. Глава 3",
                    "video": false,
                    "vote_average": 7.2,
                    "vote_count": 941
                },
                {
                    "adult": false,
                    "backdrop_path": "/8Y43POKjjKDGI9MH89NW0NAzzp8.jpg",
                    "genre_ids": [
                        35,
                        28,
                        12,
                        878
                    ],
                    "id": 550988,
                    "original_language": "en",
                    "original_title": "Free Guy",
                    "overview": "У сотрудника крупного банка всё идёт по накатанной, пока однажды он не выясняет, что окружающий его мир — это часть огромной видеоигры, а сам он в ней — всего лишь второстепенный персонаж. Хватит ли у него духу переписать свой код, обратить на себя внимание прекрасной девушки и, наконец, спасти мир? Одним словом, получится ли из него главный герой?",
                    "popularity": 1439.169,
                    "poster_path": "/qJZ3UeKAOgz2kFVJPZZFzLtn1Qk.jpg",
                    "release_date": "2021-08-12",
                    "title": "Главный герой",
                    "video": false,
                    "vote_average": 7.8,
                    "vote_count": 3765
                },
                {
                    "adult": false,
                    "backdrop_path": "/HVcza6tJtWFrLriuh3Ano4Vt46.jpg",
                    "genre_ids": [
                        28,
                        12,
                        14
                    ],
                    "id": 1930,
                    "original_language": "en",
                    "original_title": "The Amazing Spider-Man",
                    "overview": "В детстве Питер Паркер был оставлен своими родителями, и поэтому воспитывался дядей и тётей. Шли годы, Питер был обычным примерным школьником, подвергался нападкам хулиганов и был влюблён в свою одноклассницу Гвен Стэйси, которая сама втайне отвечала ему взаимностью. Но после укуса генетически изменённого паука, Питер получает невероятные сверхспособности и его жизнь меняется навсегда.  Однако его не перестаёт мучить вопрос о том, что случилось с его родителями. Он знакомится с давним другом и партнёром своего отца — генетиком Куртом Коннорсом, который вместе с отцом Питера разрабатывал формулу регенерации. Питер помогает её закончить, а Коннорс, всю жизнь мечтавший восстановить свою правую руку, вводит формулу себе и становится Ящером. Осознавая свою вину, Питер начинает новую жизнь в образе таинственного супергероя Человека-паука и становится грозой преступников, одновременно пытаясь найти способ остановить Коннорса.",
                    "popularity": 1150.752,
                    "poster_path": "/kby3x8wic9Lx4qEfstLu2vFHTVj.jpg",
                    "release_date": "2012-07-05",
                    "title": "Новый Человек-паук",
                    "video": false,
                    "vote_average": 6.6,
                    "vote_count": 13609
                },
                {
                    "adult": false,
                    "backdrop_path": "/VuukZLgaCrho2Ar8Scl9HtV3yD.jpg",
                    "genre_ids": [
                        878,
                        28
                    ],
                    "id": 335983,
                    "original_language": "en",
                    "original_title": "Venom",
                    "overview": "Что если в один прекрасный день в тебя вселяется существо-симбиот, которое наделяет тебя сверхчеловеческими способностями? Вот только Веном – симбиот совсем недобрый, и договориться с ним невозможно. Хотя нужно ли договариваться?.. Ведь в какой-то момент ты понимаешь, что быть плохим вовсе не так уж и плохо. Так даже веселее. В мире и так слишком много супергероев! Мы – Веном!",
                    "popularity": 1006.875,
                    "poster_path": "/8Gyl0fknqiZeCLm9XitxCXQmEL9.jpg",
                    "release_date": "2018-10-04",
                    "title": "Веном",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 12271
                },
                {
                    "adult": false,
                    "backdrop_path": "/ng6SSB3JhbcpKTwbPDsRwUYK8Cq.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 429617,
                    "original_language": "en",
                    "original_title": "Spider-Man: Far From Home",
                    "overview": "Питер Паркер вместе с одноклассниками отправляется на летние каникулы в Европу. Однако отдохнуть приятелям вряд ли удастся — по прибытии в Венецию группа попадает в эпицентр сражения. Некое существо, состоящее из воды, появляется из ниоткуда и начинает крушить всё на своём пути, и теперь Питеру придётся спасать европейские архитектурные памятники вместе с загадочным супергероем Мистерио.",
                    "popularity": 772.42,
                    "poster_path": "/5NNAHfyG4Ttu6ED9PpVe9mrRthj.jpg",
                    "release_date": "2019-07-04",
                    "title": "Человек-паук: Вдали от дома",
                    "video": false,
                    "vote_average": 7.5,
                    "vote_count": 11012
                },
                {
                    "adult": false,
                    "backdrop_path": "/hugKriLPeBm3lErSCQiFOgQzpkC.jpg",
                    "genre_ids": [
                        28,
                        53,
                        80
                    ],
                    "id": 574060,
                    "original_language": "en",
                    "original_title": "Gunpowder Milkshake",
                    "overview": "Быть киллером — весело и просто. Особенно для Сэм, которая от матери унаследовала талант к заказным убийствам. Но когда девушке приходится пойти наперекор собственному боссу, она становится мишенью целой армии головорезов. К счастью, мама и её бывшие напарницы готовы помочь угостить недоброжелателей своим фирменным «пороховым коктейлем».",
                    "popularity": 749.184,
                    "poster_path": "/oVB4dtfFDQrSbAsH7zrH8uV1d9G.jpg",
                    "release_date": "2021-07-15",
                    "title": "Пороховой коктейль",
                    "video": false,
                    "vote_average": 6.5,
                    "vote_count": 382
                },
                {
                    "adult": false,
                    "backdrop_path": "/wfrfxivLOBtGMC98tIr2LSOeKSe.jpg",
                    "genre_ids": [
                        16,
                        12,
                        35,
                        10751
                    ],
                    "id": 639721,
                    "original_language": "en",
                    "original_title": "The Addams Family 2",
                    "overview": "Семейка Аддамс вовлекается в ещё более умопомрачительные приключения и оказывается вовлечённой в забавные стычки с самыми разными ничего не подозревающими персонажами.  Продолжение мультфильма 2019 года «Семейка Аддамс».",
                    "popularity": 719.97,
                    "poster_path": "/q9bt09k468PhsCTYybd20FIqfNw.jpg",
                    "release_date": "2021-10-07",
                    "title": "Семейка Аддамс: Горящий тур",
                    "video": false,
                    "vote_average": 7.3,
                    "vote_count": 609
                },
                {
                    "adult": false,
                    "backdrop_path": "/5i3ghCXVLNhewrBjTesMgy4FHT7.jpg",
                    "genre_ids": [
                        12,
                        16,
                        35,
                        10751,
                        14,
                        10402
                    ],
                    "id": 568124,
                    "original_language": "en",
                    "original_title": "Encanto",
                    "overview": "Удивительная семья Мадригалов живет в спрятанном в горах Колумбии волшебном доме, расположенном в чудесном и очаровательном уголке под названием Энканто. Каждого ребёнка в семье Мадригалов магия этого места благословила уникальным даром — от суперсилы до способности исцелять. Увы, магия обошла стороной одну лишь юную Мирабель. Обнаружив, что магия Энканто находится в опасности, Мирабель решает, что именно она может быть последней надеждой на спасение своей особенной семьи.",
                    "popularity": 831.356,
                    "poster_path": "/mIYn3jXppOd5ALMTrhLUOtojez4.jpg",
                    "release_date": "2021-11-25",
                    "title": "Энканто",
                    "video": false,
                    "vote_average": 5.7,
                    "vote_count": 5
                },
                {
                    "adult": false,
                    "backdrop_path": "/dIibeeq4QMay5bTJ2vjr72IFFRo.jpg",
                    "genre_ids": [
                        14,
                        12,
                        35
                    ],
                    "id": 589754,
                    "original_language": "ru",
                    "original_title": "Последний богатырь: Корень зла",
                    "overview": "В Белогорье мир и спокойствие, зло побеждено. Рядом отец Илья Муромец, возлюбленная Василиса в предсвадебных заботах, ставшие друзьями Баба Яга и Водяной и маленькие радости из современного мира, чтоб обеспечить комфортную жизнь — благо Меч-Кладенец даёт возможность регулярно прорубать дыру между мирами и бегать за припасами. Но тоска по родному миру тяготит Ивана. А ещё больше его заботит неминуемое начало Богатырских игр — съезда всех витязей Белогорья, где добры молодцы будут показывать удаль и силу. Той самой Богатырской силушки в себе Иван не чувствует, и опозориться на глазах у отца и невесты ему совсем не хочется. Однако, когда в самый разгар состязаний пробуждается древнее зло и само существование волшебного мира оказывается под угрозой, Ивану приходится объединиться и со старыми друзьями, и с новыми недругами. Им предстоит отправиться в дальнее путешествие, за пределы известного мира, чтобы обнаружить истоки зла и вернуть мир в Белогорье.",
                    "popularity": 693.911,
                    "poster_path": "/9ZH3XulXJPHmXuOgZMqzXCvRB6K.jpg",
                    "release_date": "2021-01-01",
                    "title": "Последний богатырь: Корень зла",
                    "video": false,
                    "vote_average": 7.1,
                    "vote_count": 65
                },
                {
                    "adult": false,
                    "backdrop_path": "/2OFg5p9yarI5zZsUWKCRgBgPctj.jpg",
                    "genre_ids": [
                        28,
                        12
                    ],
                    "id": 568620,
                    "original_language": "en",
                    "original_title": "Snake Eyes: G.I. Joe Origins",
                    "overview": "Загадочный и суровый одиночка Снейк Айз спасает наследника древнего японского клана Арашикаге, и в знак признательности клан открывает ему тайные знания пути ниндзя. Но главное: Снейк Айз обретает то, к чему так долго стремился, — дом. Однако, когда становятся известны секреты его прошлого, на кону оказываются его честь, преданность и доверие самых близких людей.",
                    "popularity": 806.19,
                    "poster_path": "/5ziYvBUoDB95zeGnTEZxxb92Xi1.jpg",
                    "release_date": "2021-07-22",
                    "title": "G.I. Joe: Бросок кобры. Снейк Айз",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 834
                },
                {
                    "adult": false,
                    "backdrop_path": "/xPpXYnCWfjkt3zzE0dpCNME1pXF.jpg",
                    "genre_ids": [
                        16,
                        28,
                        12,
                        14
                    ],
                    "id": 635302,
                    "original_language": "ja",
                    "original_title": "劇場版「鬼滅の刃」無限列車編",
                    "overview": "Тандзиро с друзьями из отряда уничтожителей демонов расследует серию загадочных исчезновений внутри мчащегося поезда. Но компания ещё не знает, что в составе находится один из двенадцати Лунных демонов, и он приготовил для них ловушку.",
                    "popularity": 742.851,
                    "poster_path": "/m9cn5mhW519QKr1YGpGxNWi98VJ.jpg",
                    "release_date": "2021-05-20",
                    "title": "Истребитель демонов: Поезд «Бесконечный»",
                    "video": false,
                    "vote_average": 8.4,
                    "vote_count": 1868
                },
                {
                    "adult": false,
                    "backdrop_path": "/fuuZFPc8x6gQ8mLGoBp9vrmcQMT.jpg",
                    "genre_ids": [
                        27,
                        53
                    ],
                    "id": 610253,
                    "original_language": "en",
                    "original_title": "Halloween Kills",
                    "overview": "Хитроумная ловушка Лори Строуд почти помогла ей победить зловещего убийцу Майкла Майерса. Почти… Он снова на свободе, и кровавый след, который тянется за ним, еще никогда не был таким длинным. Женщины семьи Строуд объединяются с другими выжившими, чтобы остановить Майкла раз и навсегда…",
                    "popularity": 599.788,
                    "poster_path": "/8lr4YPjFtLUkMgRKr7quYwJVpiL.jpg",
                    "release_date": "2021-10-21",
                    "title": "Хэллоуин убивает",
                    "video": false,
                    "vote_average": 6.9,
                    "vote_count": 1247
                }
            ],
            "total_pages": 500,
            "total_results": 10000
        }"""

        val builder = GsonBuilder()
        val objectClass: ResponsePage<Movie> = builder.create().fromJson(
            jsonString,
            object : TypeToken<ResponsePage<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getTopRatedMovies(): List<Movie> {
        val jsonString = """{
            "page": 1,
            "results": [
                {
                    "adult": false,
                    "backdrop_path": "/cinER0ESG0eJ49kXlExM0MEWGxW.jpg",
                    "genre_ids": [
                        28,
                        12,
                        14
                    ],
                    "id": 566525,
                    "original_language": "en",
                    "original_title": "Shang-Chi and the Legend of the Ten Rings",
                    "overview": "Мастеру боевых искусств Шан-Чи предстоит противостоять призракам из собственного прошлого, по мере того как его втягивают в паутину интриг таинственной организации «Десять колец».",
                    "popularity": 6665.737,
                    "poster_path": "/hn0B1OFQRQnzr0LeLkaUbJxoiol.jpg",
                    "release_date": "2021-09-02",
                    "title": "Шан-Чи и легенда десяти колец",
                    "video": false,
                    "vote_average": 7.9,
                    "vote_count": 3379
                },
                {
                    "adult": false,
                    "backdrop_path": "/70nxSw3mFBsGmtkvcs91PbjerwD.jpg",
                    "genre_ids": [
                        878,
                        28,
                        12
                    ],
                    "id": 580489,
                    "original_language": "en",
                    "original_title": "Venom: Let There Be Carnage",
                    "overview": "Эдди живёт с симбиотом в своём теле уже давно и приспособился к быту. Однако ему придётся столкнуться со злодеем Клетусом Кэссиди, в котором обитает другой внеземной паразит по прозвищу Карнаж.",
                    "popularity": 4141.331,
                    "poster_path": "/lO6TXwP5dKoflEhqfjd0uNWSNhp.jpg",
                    "release_date": "2021-09-30",
                    "title": "Веном 2",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 2039
                },
                {
                    "adult": false,
                    "backdrop_path": "/zBkHCpLmHjW2uVURs5uZkaVmgKR.jpg",
                    "genre_ids": [
                        16,
                        35,
                        10751
                    ],
                    "id": 585245,
                    "original_language": "en",
                    "original_title": "Clifford the Big Red Dog",
                    "overview": "Когда школьница Эмили получает в подарок от спасателя животных очаровательного щенка с красной шерстью, она и представить не может, что на утро обнаружит в своей маленькой нью-йоркской квартирке… огромного 3-метрового пса! Мама в командировке, поэтому самые захватывающие и необыкновенные приключения ждут Эмили и ее веселого и порывистого дядю Кейси. Клиффорд научит их — а заодно и весь мир — любить по-крупному.",
                    "popularity": 3269.139,
                    "poster_path": "/Ah2D98B56MSEWs9B7pyFDmaef0X.jpg",
                    "release_date": "2021-12-02",
                    "title": "Большой красный пес Клиффорд",
                    "video": false,
                    "vote_average": 7.8,
                    "vote_count": 170
                },
                {
                    "adult": false,
                    "backdrop_path": "/u5Fp9GBy9W8fqkuGfLBuuoJf57Z.jpg",
                    "genre_ids": [
                        12,
                        28,
                        53
                    ],
                    "id": 370172,
                    "original_language": "en",
                    "original_title": "No Time to Die",
                    "overview": "Джеймс Бонд оставил оперативную службу и наслаждается спокойной жизнью на Ямайке. Все меняется, когда на острове появляется его старый друг Феликс Лейтер из ЦРУ с просьбой о помощи. Миссия по спасению похищенного ученого оказывается опаснее, чем предполагалось изначально. Бонд попадает в ловушку к таинственному злодею, вооруженному опасным технологическим оружием.",
                    "popularity": 3491.344,
                    "poster_path": "/jycSKuZ4CvgPWRHdhgPA9q1EC8n.jpg",
                    "release_date": "2021-10-07",
                    "title": "Не время умирать",
                    "video": false,
                    "vote_average": 7.6,
                    "vote_count": 2033
                },
                {
                    "adult": false,
                    "backdrop_path": "/4gKxQIW91hOTELjY5lzjMbLoGxB.jpg",
                    "genre_ids": [
                        28,
                        53,
                        878
                    ],
                    "id": 763164,
                    "original_language": "en",
                    "original_title": "Apex",
                    "overview": "Пять охотников покупают элитную услугу — возможность выследить человека на необитаемом острове, но сами становятся добычей.",
                    "popularity": 1863.698,
                    "poster_path": "/chTkFGToW5bsyw3hgLAe4S5Gt3.jpg",
                    "release_date": "2021-12-16",
                    "title": "Преступный квест",
                    "video": false,
                    "vote_average": 5.7,
                    "vote_count": 183
                },
                {
                    "adult": false,
                    "backdrop_path": "/vIPIyTJqcgOKgKcExCvTDpLpTYW.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 634649,
                    "original_language": "en",
                    "original_title": "Spider-Man: No Way Home",
                    "overview": "Жизнь и репутация Питера Паркера оказываются под угрозой, поскольку Мистерио раскрыл всему миру тайну личности Человека-паука. Пытаясь исправить ситуацию, Питер обращается за помощью к Стивену Стрэнджу, но вскоре всё становится намного опаснее.",
                    "popularity": 1782.83,
                    "poster_path": "/zSuZByDQH0TscbE300hsnwksjbo.jpg",
                    "release_date": "2021-12-15",
                    "title": "Человек-паук: Нет пути домой",
                    "video": false,
                    "vote_average": 0,
                    "vote_count": 0
                },
                {
                    "adult": false,
                    "backdrop_path": "/lyvszvJJqqI8aqBJ70XzdCNoK0y.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 524434,
                    "original_language": "en",
                    "original_title": "Eternals",
                    "overview": "Вечные — представители расы генетически улучшенных суперлюдей, тайно живущих на Земле. Они появились на свет 5 миллионов лет назад в результате экспериментов могущественных целестиалов. Наделённые невероятными суперспособностями, на протяжении тысячелетий они скрывались от человеческой цивилизации, втайне защищая людей от монструозных девиантов. Однако, последние события и действия Таноса заставили их выйти на свет.",
                    "popularity": 1835.483,
                    "poster_path": "/iCQTxIgEpNYvPfHvEuZkDcmWItU.jpg",
                    "release_date": "2021-11-08",
                    "title": "Вечные",
                    "video": false,
                    "vote_average": 7.1,
                    "vote_count": 1136
                },
                {
                    "adult": false,
                    "backdrop_path": "/eeijXm3553xvuFbkPFkDG6CLCbQ.jpg",
                    "genre_ids": [
                        878,
                        12
                    ],
                    "id": 438631,
                    "original_language": "en",
                    "original_title": "Dune",
                    "overview": "Наследник знаменитого дома Атрейдесов Пол отправляется вместе с семьёй на одну из самых опасных планет во Вселенной — Арракис. Здесь нет ничего, кроме песка, палящего солнца, гигантских чудовищ и основной причины межгалактических конфликтов — невероятно ценного ресурса, который называется меланж. В результате захвата власти Пол вынужден бежать и скрываться, и это становится началом его эпического путешествия. Враждебный мир Арракиса приготовил для него множество тяжёлых испытаний, но только тот, кто готов взглянуть в глаза своему страху, достоин стать избранным.",
                    "popularity": 1485.963,
                    "poster_path": "/irwFnLniLSu0KkiK7FMAgLounCX.jpg",
                    "release_date": "2021-09-16",
                    "title": "Дюна",
                    "video": false,
                    "vote_average": 8,
                    "vote_count": 4179
                },
                {
                    "adult": false,
                    "backdrop_path": "/lV3UFPPxDIPelh46G9oySXN9Mcz.jpg",
                    "genre_ids": [
                        10749,
                        18
                    ],
                    "id": 744275,
                    "original_language": "en",
                    "original_title": "After We Fell",
                    "overview": "Встреча с притягательным бунтарем Хардином разделила жизнь Тессы на «до» и «после». Их судьбы кажутся неразрывно связанными, но Тесса сталкивается со сложным выбором: согласиться на работу мечты в крупном издательстве или переехать в Лондон вместе с Хардином. Их страстную любовь ждет проверка на прочность: тайны прошлого, новые секреты и ответ на вопрос, что они на самом деле значат друг для друга…",
                    "popularity": 1697.09,
                    "poster_path": "/eRmylmc17IIxKKQrGcQt1723APP.jpg",
                    "release_date": "2021-09-02",
                    "title": "После. Глава 3",
                    "video": false,
                    "vote_average": 7.2,
                    "vote_count": 941
                },
                {
                    "adult": false,
                    "backdrop_path": "/8Y43POKjjKDGI9MH89NW0NAzzp8.jpg",
                    "genre_ids": [
                        35,
                        28,
                        12,
                        878
                    ],
                    "id": 550988,
                    "original_language": "en",
                    "original_title": "Free Guy",
                    "overview": "У сотрудника крупного банка всё идёт по накатанной, пока однажды он не выясняет, что окружающий его мир — это часть огромной видеоигры, а сам он в ней — всего лишь второстепенный персонаж. Хватит ли у него духу переписать свой код, обратить на себя внимание прекрасной девушки и, наконец, спасти мир? Одним словом, получится ли из него главный герой?",
                    "popularity": 1439.169,
                    "poster_path": "/qJZ3UeKAOgz2kFVJPZZFzLtn1Qk.jpg",
                    "release_date": "2021-08-12",
                    "title": "Главный герой",
                    "video": false,
                    "vote_average": 7.8,
                    "vote_count": 3765
                },
                {
                    "adult": false,
                    "backdrop_path": "/HVcza6tJtWFrLriuh3Ano4Vt46.jpg",
                    "genre_ids": [
                        28,
                        12,
                        14
                    ],
                    "id": 1930,
                    "original_language": "en",
                    "original_title": "The Amazing Spider-Man",
                    "overview": "В детстве Питер Паркер был оставлен своими родителями, и поэтому воспитывался дядей и тётей. Шли годы, Питер был обычным примерным школьником, подвергался нападкам хулиганов и был влюблён в свою одноклассницу Гвен Стэйси, которая сама втайне отвечала ему взаимностью. Но после укуса генетически изменённого паука, Питер получает невероятные сверхспособности и его жизнь меняется навсегда.  Однако его не перестаёт мучить вопрос о том, что случилось с его родителями. Он знакомится с давним другом и партнёром своего отца — генетиком Куртом Коннорсом, который вместе с отцом Питера разрабатывал формулу регенерации. Питер помогает её закончить, а Коннорс, всю жизнь мечтавший восстановить свою правую руку, вводит формулу себе и становится Ящером. Осознавая свою вину, Питер начинает новую жизнь в образе таинственного супергероя Человека-паука и становится грозой преступников, одновременно пытаясь найти способ остановить Коннорса.",
                    "popularity": 1150.752,
                    "poster_path": "/kby3x8wic9Lx4qEfstLu2vFHTVj.jpg",
                    "release_date": "2012-07-05",
                    "title": "Новый Человек-паук",
                    "video": false,
                    "vote_average": 6.6,
                    "vote_count": 13609
                },
                {
                    "adult": false,
                    "backdrop_path": "/VuukZLgaCrho2Ar8Scl9HtV3yD.jpg",
                    "genre_ids": [
                        878,
                        28
                    ],
                    "id": 335983,
                    "original_language": "en",
                    "original_title": "Venom",
                    "overview": "Что если в один прекрасный день в тебя вселяется существо-симбиот, которое наделяет тебя сверхчеловеческими способностями? Вот только Веном – симбиот совсем недобрый, и договориться с ним невозможно. Хотя нужно ли договариваться?.. Ведь в какой-то момент ты понимаешь, что быть плохим вовсе не так уж и плохо. Так даже веселее. В мире и так слишком много супергероев! Мы – Веном!",
                    "popularity": 1006.875,
                    "poster_path": "/8Gyl0fknqiZeCLm9XitxCXQmEL9.jpg",
                    "release_date": "2018-10-04",
                    "title": "Веном",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 12271
                },
                {
                    "adult": false,
                    "backdrop_path": "/ng6SSB3JhbcpKTwbPDsRwUYK8Cq.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 429617,
                    "original_language": "en",
                    "original_title": "Spider-Man: Far From Home",
                    "overview": "Питер Паркер вместе с одноклассниками отправляется на летние каникулы в Европу. Однако отдохнуть приятелям вряд ли удастся — по прибытии в Венецию группа попадает в эпицентр сражения. Некое существо, состоящее из воды, появляется из ниоткуда и начинает крушить всё на своём пути, и теперь Питеру придётся спасать европейские архитектурные памятники вместе с загадочным супергероем Мистерио.",
                    "popularity": 772.42,
                    "poster_path": "/5NNAHfyG4Ttu6ED9PpVe9mrRthj.jpg",
                    "release_date": "2019-07-04",
                    "title": "Человек-паук: Вдали от дома",
                    "video": false,
                    "vote_average": 7.5,
                    "vote_count": 11012
                },
                {
                    "adult": false,
                    "backdrop_path": "/hugKriLPeBm3lErSCQiFOgQzpkC.jpg",
                    "genre_ids": [
                        28,
                        53,
                        80
                    ],
                    "id": 574060,
                    "original_language": "en",
                    "original_title": "Gunpowder Milkshake",
                    "overview": "Быть киллером — весело и просто. Особенно для Сэм, которая от матери унаследовала талант к заказным убийствам. Но когда девушке приходится пойти наперекор собственному боссу, она становится мишенью целой армии головорезов. К счастью, мама и её бывшие напарницы готовы помочь угостить недоброжелателей своим фирменным «пороховым коктейлем».",
                    "popularity": 749.184,
                    "poster_path": "/oVB4dtfFDQrSbAsH7zrH8uV1d9G.jpg",
                    "release_date": "2021-07-15",
                    "title": "Пороховой коктейль",
                    "video": false,
                    "vote_average": 6.5,
                    "vote_count": 382
                },
                {
                    "adult": false,
                    "backdrop_path": "/wfrfxivLOBtGMC98tIr2LSOeKSe.jpg",
                    "genre_ids": [
                        16,
                        12,
                        35,
                        10751
                    ],
                    "id": 639721,
                    "original_language": "en",
                    "original_title": "The Addams Family 2",
                    "overview": "Семейка Аддамс вовлекается в ещё более умопомрачительные приключения и оказывается вовлечённой в забавные стычки с самыми разными ничего не подозревающими персонажами.  Продолжение мультфильма 2019 года «Семейка Аддамс».",
                    "popularity": 719.97,
                    "poster_path": "/q9bt09k468PhsCTYybd20FIqfNw.jpg",
                    "release_date": "2021-10-07",
                    "title": "Семейка Аддамс: Горящий тур",
                    "video": false,
                    "vote_average": 7.3,
                    "vote_count": 609
                },
                {
                    "adult": false,
                    "backdrop_path": "/5i3ghCXVLNhewrBjTesMgy4FHT7.jpg",
                    "genre_ids": [
                        12,
                        16,
                        35,
                        10751,
                        14,
                        10402
                    ],
                    "id": 568124,
                    "original_language": "en",
                    "original_title": "Encanto",
                    "overview": "Удивительная семья Мадригалов живет в спрятанном в горах Колумбии волшебном доме, расположенном в чудесном и очаровательном уголке под названием Энканто. Каждого ребёнка в семье Мадригалов магия этого места благословила уникальным даром — от суперсилы до способности исцелять. Увы, магия обошла стороной одну лишь юную Мирабель. Обнаружив, что магия Энканто находится в опасности, Мирабель решает, что именно она может быть последней надеждой на спасение своей особенной семьи.",
                    "popularity": 831.356,
                    "poster_path": "/mIYn3jXppOd5ALMTrhLUOtojez4.jpg",
                    "release_date": "2021-11-25",
                    "title": "Энканто",
                    "video": false,
                    "vote_average": 5.7,
                    "vote_count": 5
                },
                {
                    "adult": false,
                    "backdrop_path": "/dIibeeq4QMay5bTJ2vjr72IFFRo.jpg",
                    "genre_ids": [
                        14,
                        12,
                        35
                    ],
                    "id": 589754,
                    "original_language": "ru",
                    "original_title": "Последний богатырь: Корень зла",
                    "overview": "В Белогорье мир и спокойствие, зло побеждено. Рядом отец Илья Муромец, возлюбленная Василиса в предсвадебных заботах, ставшие друзьями Баба Яга и Водяной и маленькие радости из современного мира, чтоб обеспечить комфортную жизнь — благо Меч-Кладенец даёт возможность регулярно прорубать дыру между мирами и бегать за припасами. Но тоска по родному миру тяготит Ивана. А ещё больше его заботит неминуемое начало Богатырских игр — съезда всех витязей Белогорья, где добры молодцы будут показывать удаль и силу. Той самой Богатырской силушки в себе Иван не чувствует, и опозориться на глазах у отца и невесты ему совсем не хочется. Однако, когда в самый разгар состязаний пробуждается древнее зло и само существование волшебного мира оказывается под угрозой, Ивану приходится объединиться и со старыми друзьями, и с новыми недругами. Им предстоит отправиться в дальнее путешествие, за пределы известного мира, чтобы обнаружить истоки зла и вернуть мир в Белогорье.",
                    "popularity": 693.911,
                    "poster_path": "/9ZH3XulXJPHmXuOgZMqzXCvRB6K.jpg",
                    "release_date": "2021-01-01",
                    "title": "Последний богатырь: Корень зла",
                    "video": false,
                    "vote_average": 7.1,
                    "vote_count": 65
                },
                {
                    "adult": false,
                    "backdrop_path": "/2OFg5p9yarI5zZsUWKCRgBgPctj.jpg",
                    "genre_ids": [
                        28,
                        12
                    ],
                    "id": 568620,
                    "original_language": "en",
                    "original_title": "Snake Eyes: G.I. Joe Origins",
                    "overview": "Загадочный и суровый одиночка Снейк Айз спасает наследника древнего японского клана Арашикаге, и в знак признательности клан открывает ему тайные знания пути ниндзя. Но главное: Снейк Айз обретает то, к чему так долго стремился, — дом. Однако, когда становятся известны секреты его прошлого, на кону оказываются его честь, преданность и доверие самых близких людей.",
                    "popularity": 806.19,
                    "poster_path": "/5ziYvBUoDB95zeGnTEZxxb92Xi1.jpg",
                    "release_date": "2021-07-22",
                    "title": "G.I. Joe: Бросок кобры. Снейк Айз",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 834
                },
                {
                    "adult": false,
                    "backdrop_path": "/xPpXYnCWfjkt3zzE0dpCNME1pXF.jpg",
                    "genre_ids": [
                        16,
                        28,
                        12,
                        14
                    ],
                    "id": 635302,
                    "original_language": "ja",
                    "original_title": "劇場版「鬼滅の刃」無限列車編",
                    "overview": "Тандзиро с друзьями из отряда уничтожителей демонов расследует серию загадочных исчезновений внутри мчащегося поезда. Но компания ещё не знает, что в составе находится один из двенадцати Лунных демонов, и он приготовил для них ловушку.",
                    "popularity": 742.851,
                    "poster_path": "/m9cn5mhW519QKr1YGpGxNWi98VJ.jpg",
                    "release_date": "2021-05-20",
                    "title": "Истребитель демонов: Поезд «Бесконечный»",
                    "video": false,
                    "vote_average": 8.4,
                    "vote_count": 1868
                },
                {
                    "adult": false,
                    "backdrop_path": "/fuuZFPc8x6gQ8mLGoBp9vrmcQMT.jpg",
                    "genre_ids": [
                        27,
                        53
                    ],
                    "id": 610253,
                    "original_language": "en",
                    "original_title": "Halloween Kills",
                    "overview": "Хитроумная ловушка Лори Строуд почти помогла ей победить зловещего убийцу Майкла Майерса. Почти… Он снова на свободе, и кровавый след, который тянется за ним, еще никогда не был таким длинным. Женщины семьи Строуд объединяются с другими выжившими, чтобы остановить Майкла раз и навсегда…",
                    "popularity": 599.788,
                    "poster_path": "/8lr4YPjFtLUkMgRKr7quYwJVpiL.jpg",
                    "release_date": "2021-10-21",
                    "title": "Хэллоуин убивает",
                    "video": false,
                    "vote_average": 6.9,
                    "vote_count": 1247
                }
            ],
            "total_pages": 500,
            "total_results": 10000
        }"""

        val builder = GsonBuilder()
        val objectClass: ResponsePage<Movie> = builder.create().fromJson(
            jsonString,
            object : TypeToken<ResponsePage<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getUpcomingMovies(): List<Movie> {
        val jsonString = """{
            "page": 1,
            "results": [
                {
                    "adult": false,
                    "backdrop_path": "/cinER0ESG0eJ49kXlExM0MEWGxW.jpg",
                    "genre_ids": [
                        28,
                        12,
                        14
                    ],
                    "id": 566525,
                    "original_language": "en",
                    "original_title": "Shang-Chi and the Legend of the Ten Rings",
                    "overview": "Мастеру боевых искусств Шан-Чи предстоит противостоять призракам из собственного прошлого, по мере того как его втягивают в паутину интриг таинственной организации «Десять колец».",
                    "popularity": 6665.737,
                    "poster_path": "/hn0B1OFQRQnzr0LeLkaUbJxoiol.jpg",
                    "release_date": "2021-09-02",
                    "title": "Шан-Чи и легенда десяти колец",
                    "video": false,
                    "vote_average": 7.9,
                    "vote_count": 3379
                },
                {
                    "adult": false,
                    "backdrop_path": "/70nxSw3mFBsGmtkvcs91PbjerwD.jpg",
                    "genre_ids": [
                        878,
                        28,
                        12
                    ],
                    "id": 580489,
                    "original_language": "en",
                    "original_title": "Venom: Let There Be Carnage",
                    "overview": "Эдди живёт с симбиотом в своём теле уже давно и приспособился к быту. Однако ему придётся столкнуться со злодеем Клетусом Кэссиди, в котором обитает другой внеземной паразит по прозвищу Карнаж.",
                    "popularity": 4141.331,
                    "poster_path": "/lO6TXwP5dKoflEhqfjd0uNWSNhp.jpg",
                    "release_date": "2021-09-30",
                    "title": "Веном 2",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 2039
                },
                {
                    "adult": false,
                    "backdrop_path": "/zBkHCpLmHjW2uVURs5uZkaVmgKR.jpg",
                    "genre_ids": [
                        16,
                        35,
                        10751
                    ],
                    "id": 585245,
                    "original_language": "en",
                    "original_title": "Clifford the Big Red Dog",
                    "overview": "Когда школьница Эмили получает в подарок от спасателя животных очаровательного щенка с красной шерстью, она и представить не может, что на утро обнаружит в своей маленькой нью-йоркской квартирке… огромного 3-метрового пса! Мама в командировке, поэтому самые захватывающие и необыкновенные приключения ждут Эмили и ее веселого и порывистого дядю Кейси. Клиффорд научит их — а заодно и весь мир — любить по-крупному.",
                    "popularity": 3269.139,
                    "poster_path": "/Ah2D98B56MSEWs9B7pyFDmaef0X.jpg",
                    "release_date": "2021-12-02",
                    "title": "Большой красный пес Клиффорд",
                    "video": false,
                    "vote_average": 7.8,
                    "vote_count": 170
                },
                {
                    "adult": false,
                    "backdrop_path": "/u5Fp9GBy9W8fqkuGfLBuuoJf57Z.jpg",
                    "genre_ids": [
                        12,
                        28,
                        53
                    ],
                    "id": 370172,
                    "original_language": "en",
                    "original_title": "No Time to Die",
                    "overview": "Джеймс Бонд оставил оперативную службу и наслаждается спокойной жизнью на Ямайке. Все меняется, когда на острове появляется его старый друг Феликс Лейтер из ЦРУ с просьбой о помощи. Миссия по спасению похищенного ученого оказывается опаснее, чем предполагалось изначально. Бонд попадает в ловушку к таинственному злодею, вооруженному опасным технологическим оружием.",
                    "popularity": 3491.344,
                    "poster_path": "/jycSKuZ4CvgPWRHdhgPA9q1EC8n.jpg",
                    "release_date": "2021-10-07",
                    "title": "Не время умирать",
                    "video": false,
                    "vote_average": 7.6,
                    "vote_count": 2033
                },
                {
                    "adult": false,
                    "backdrop_path": "/4gKxQIW91hOTELjY5lzjMbLoGxB.jpg",
                    "genre_ids": [
                        28,
                        53,
                        878
                    ],
                    "id": 763164,
                    "original_language": "en",
                    "original_title": "Apex",
                    "overview": "Пять охотников покупают элитную услугу — возможность выследить человека на необитаемом острове, но сами становятся добычей.",
                    "popularity": 1863.698,
                    "poster_path": "/chTkFGToW5bsyw3hgLAe4S5Gt3.jpg",
                    "release_date": "2021-12-16",
                    "title": "Преступный квест",
                    "video": false,
                    "vote_average": 5.7,
                    "vote_count": 183
                },
                {
                    "adult": false,
                    "backdrop_path": "/vIPIyTJqcgOKgKcExCvTDpLpTYW.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 634649,
                    "original_language": "en",
                    "original_title": "Spider-Man: No Way Home",
                    "overview": "Жизнь и репутация Питера Паркера оказываются под угрозой, поскольку Мистерио раскрыл всему миру тайну личности Человека-паука. Пытаясь исправить ситуацию, Питер обращается за помощью к Стивену Стрэнджу, но вскоре всё становится намного опаснее.",
                    "popularity": 1782.83,
                    "poster_path": "/zSuZByDQH0TscbE300hsnwksjbo.jpg",
                    "release_date": "2021-12-15",
                    "title": "Человек-паук: Нет пути домой",
                    "video": false,
                    "vote_average": 0,
                    "vote_count": 0
                },
                {
                    "adult": false,
                    "backdrop_path": "/lyvszvJJqqI8aqBJ70XzdCNoK0y.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 524434,
                    "original_language": "en",
                    "original_title": "Eternals",
                    "overview": "Вечные — представители расы генетически улучшенных суперлюдей, тайно живущих на Земле. Они появились на свет 5 миллионов лет назад в результате экспериментов могущественных целестиалов. Наделённые невероятными суперспособностями, на протяжении тысячелетий они скрывались от человеческой цивилизации, втайне защищая людей от монструозных девиантов. Однако, последние события и действия Таноса заставили их выйти на свет.",
                    "popularity": 1835.483,
                    "poster_path": "/iCQTxIgEpNYvPfHvEuZkDcmWItU.jpg",
                    "release_date": "2021-11-08",
                    "title": "Вечные",
                    "video": false,
                    "vote_average": 7.1,
                    "vote_count": 1136
                },
                {
                    "adult": false,
                    "backdrop_path": "/eeijXm3553xvuFbkPFkDG6CLCbQ.jpg",
                    "genre_ids": [
                        878,
                        12
                    ],
                    "id": 438631,
                    "original_language": "en",
                    "original_title": "Dune",
                    "overview": "Наследник знаменитого дома Атрейдесов Пол отправляется вместе с семьёй на одну из самых опасных планет во Вселенной — Арракис. Здесь нет ничего, кроме песка, палящего солнца, гигантских чудовищ и основной причины межгалактических конфликтов — невероятно ценного ресурса, который называется меланж. В результате захвата власти Пол вынужден бежать и скрываться, и это становится началом его эпического путешествия. Враждебный мир Арракиса приготовил для него множество тяжёлых испытаний, но только тот, кто готов взглянуть в глаза своему страху, достоин стать избранным.",
                    "popularity": 1485.963,
                    "poster_path": "/irwFnLniLSu0KkiK7FMAgLounCX.jpg",
                    "release_date": "2021-09-16",
                    "title": "Дюна",
                    "video": false,
                    "vote_average": 8,
                    "vote_count": 4179
                },
                {
                    "adult": false,
                    "backdrop_path": "/lV3UFPPxDIPelh46G9oySXN9Mcz.jpg",
                    "genre_ids": [
                        10749,
                        18
                    ],
                    "id": 744275,
                    "original_language": "en",
                    "original_title": "After We Fell",
                    "overview": "Встреча с притягательным бунтарем Хардином разделила жизнь Тессы на «до» и «после». Их судьбы кажутся неразрывно связанными, но Тесса сталкивается со сложным выбором: согласиться на работу мечты в крупном издательстве или переехать в Лондон вместе с Хардином. Их страстную любовь ждет проверка на прочность: тайны прошлого, новые секреты и ответ на вопрос, что они на самом деле значат друг для друга…",
                    "popularity": 1697.09,
                    "poster_path": "/eRmylmc17IIxKKQrGcQt1723APP.jpg",
                    "release_date": "2021-09-02",
                    "title": "После. Глава 3",
                    "video": false,
                    "vote_average": 7.2,
                    "vote_count": 941
                },
                {
                    "adult": false,
                    "backdrop_path": "/8Y43POKjjKDGI9MH89NW0NAzzp8.jpg",
                    "genre_ids": [
                        35,
                        28,
                        12,
                        878
                    ],
                    "id": 550988,
                    "original_language": "en",
                    "original_title": "Free Guy",
                    "overview": "У сотрудника крупного банка всё идёт по накатанной, пока однажды он не выясняет, что окружающий его мир — это часть огромной видеоигры, а сам он в ней — всего лишь второстепенный персонаж. Хватит ли у него духу переписать свой код, обратить на себя внимание прекрасной девушки и, наконец, спасти мир? Одним словом, получится ли из него главный герой?",
                    "popularity": 1439.169,
                    "poster_path": "/qJZ3UeKAOgz2kFVJPZZFzLtn1Qk.jpg",
                    "release_date": "2021-08-12",
                    "title": "Главный герой",
                    "video": false,
                    "vote_average": 7.8,
                    "vote_count": 3765
                },
                {
                    "adult": false,
                    "backdrop_path": "/HVcza6tJtWFrLriuh3Ano4Vt46.jpg",
                    "genre_ids": [
                        28,
                        12,
                        14
                    ],
                    "id": 1930,
                    "original_language": "en",
                    "original_title": "The Amazing Spider-Man",
                    "overview": "В детстве Питер Паркер был оставлен своими родителями, и поэтому воспитывался дядей и тётей. Шли годы, Питер был обычным примерным школьником, подвергался нападкам хулиганов и был влюблён в свою одноклассницу Гвен Стэйси, которая сама втайне отвечала ему взаимностью. Но после укуса генетически изменённого паука, Питер получает невероятные сверхспособности и его жизнь меняется навсегда.  Однако его не перестаёт мучить вопрос о том, что случилось с его родителями. Он знакомится с давним другом и партнёром своего отца — генетиком Куртом Коннорсом, который вместе с отцом Питера разрабатывал формулу регенерации. Питер помогает её закончить, а Коннорс, всю жизнь мечтавший восстановить свою правую руку, вводит формулу себе и становится Ящером. Осознавая свою вину, Питер начинает новую жизнь в образе таинственного супергероя Человека-паука и становится грозой преступников, одновременно пытаясь найти способ остановить Коннорса.",
                    "popularity": 1150.752,
                    "poster_path": "/kby3x8wic9Lx4qEfstLu2vFHTVj.jpg",
                    "release_date": "2012-07-05",
                    "title": "Новый Человек-паук",
                    "video": false,
                    "vote_average": 6.6,
                    "vote_count": 13609
                },
                {
                    "adult": false,
                    "backdrop_path": "/VuukZLgaCrho2Ar8Scl9HtV3yD.jpg",
                    "genre_ids": [
                        878,
                        28
                    ],
                    "id": 335983,
                    "original_language": "en",
                    "original_title": "Venom",
                    "overview": "Что если в один прекрасный день в тебя вселяется существо-симбиот, которое наделяет тебя сверхчеловеческими способностями? Вот только Веном – симбиот совсем недобрый, и договориться с ним невозможно. Хотя нужно ли договариваться?.. Ведь в какой-то момент ты понимаешь, что быть плохим вовсе не так уж и плохо. Так даже веселее. В мире и так слишком много супергероев! Мы – Веном!",
                    "popularity": 1006.875,
                    "poster_path": "/8Gyl0fknqiZeCLm9XitxCXQmEL9.jpg",
                    "release_date": "2018-10-04",
                    "title": "Веном",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 12271
                },
                {
                    "adult": false,
                    "backdrop_path": "/ng6SSB3JhbcpKTwbPDsRwUYK8Cq.jpg",
                    "genre_ids": [
                        28,
                        12,
                        878
                    ],
                    "id": 429617,
                    "original_language": "en",
                    "original_title": "Spider-Man: Far From Home",
                    "overview": "Питер Паркер вместе с одноклассниками отправляется на летние каникулы в Европу. Однако отдохнуть приятелям вряд ли удастся — по прибытии в Венецию группа попадает в эпицентр сражения. Некое существо, состоящее из воды, появляется из ниоткуда и начинает крушить всё на своём пути, и теперь Питеру придётся спасать европейские архитектурные памятники вместе с загадочным супергероем Мистерио.",
                    "popularity": 772.42,
                    "poster_path": "/5NNAHfyG4Ttu6ED9PpVe9mrRthj.jpg",
                    "release_date": "2019-07-04",
                    "title": "Человек-паук: Вдали от дома",
                    "video": false,
                    "vote_average": 7.5,
                    "vote_count": 11012
                },
                {
                    "adult": false,
                    "backdrop_path": "/hugKriLPeBm3lErSCQiFOgQzpkC.jpg",
                    "genre_ids": [
                        28,
                        53,
                        80
                    ],
                    "id": 574060,
                    "original_language": "en",
                    "original_title": "Gunpowder Milkshake",
                    "overview": "Быть киллером — весело и просто. Особенно для Сэм, которая от матери унаследовала талант к заказным убийствам. Но когда девушке приходится пойти наперекор собственному боссу, она становится мишенью целой армии головорезов. К счастью, мама и её бывшие напарницы готовы помочь угостить недоброжелателей своим фирменным «пороховым коктейлем».",
                    "popularity": 749.184,
                    "poster_path": "/oVB4dtfFDQrSbAsH7zrH8uV1d9G.jpg",
                    "release_date": "2021-07-15",
                    "title": "Пороховой коктейль",
                    "video": false,
                    "vote_average": 6.5,
                    "vote_count": 382
                },
                {
                    "adult": false,
                    "backdrop_path": "/wfrfxivLOBtGMC98tIr2LSOeKSe.jpg",
                    "genre_ids": [
                        16,
                        12,
                        35,
                        10751
                    ],
                    "id": 639721,
                    "original_language": "en",
                    "original_title": "The Addams Family 2",
                    "overview": "Семейка Аддамс вовлекается в ещё более умопомрачительные приключения и оказывается вовлечённой в забавные стычки с самыми разными ничего не подозревающими персонажами.  Продолжение мультфильма 2019 года «Семейка Аддамс».",
                    "popularity": 719.97,
                    "poster_path": "/q9bt09k468PhsCTYybd20FIqfNw.jpg",
                    "release_date": "2021-10-07",
                    "title": "Семейка Аддамс: Горящий тур",
                    "video": false,
                    "vote_average": 7.3,
                    "vote_count": 609
                },
                {
                    "adult": false,
                    "backdrop_path": "/5i3ghCXVLNhewrBjTesMgy4FHT7.jpg",
                    "genre_ids": [
                        12,
                        16,
                        35,
                        10751,
                        14,
                        10402
                    ],
                    "id": 568124,
                    "original_language": "en",
                    "original_title": "Encanto",
                    "overview": "Удивительная семья Мадригалов живет в спрятанном в горах Колумбии волшебном доме, расположенном в чудесном и очаровательном уголке под названием Энканто. Каждого ребёнка в семье Мадригалов магия этого места благословила уникальным даром — от суперсилы до способности исцелять. Увы, магия обошла стороной одну лишь юную Мирабель. Обнаружив, что магия Энканто находится в опасности, Мирабель решает, что именно она может быть последней надеждой на спасение своей особенной семьи.",
                    "popularity": 831.356,
                    "poster_path": "/mIYn3jXppOd5ALMTrhLUOtojez4.jpg",
                    "release_date": "2021-11-25",
                    "title": "Энканто",
                    "video": false,
                    "vote_average": 5.7,
                    "vote_count": 5
                },
                {
                    "adult": false,
                    "backdrop_path": "/dIibeeq4QMay5bTJ2vjr72IFFRo.jpg",
                    "genre_ids": [
                        14,
                        12,
                        35
                    ],
                    "id": 589754,
                    "original_language": "ru",
                    "original_title": "Последний богатырь: Корень зла",
                    "overview": "В Белогорье мир и спокойствие, зло побеждено. Рядом отец Илья Муромец, возлюбленная Василиса в предсвадебных заботах, ставшие друзьями Баба Яга и Водяной и маленькие радости из современного мира, чтоб обеспечить комфортную жизнь — благо Меч-Кладенец даёт возможность регулярно прорубать дыру между мирами и бегать за припасами. Но тоска по родному миру тяготит Ивана. А ещё больше его заботит неминуемое начало Богатырских игр — съезда всех витязей Белогорья, где добры молодцы будут показывать удаль и силу. Той самой Богатырской силушки в себе Иван не чувствует, и опозориться на глазах у отца и невесты ему совсем не хочется. Однако, когда в самый разгар состязаний пробуждается древнее зло и само существование волшебного мира оказывается под угрозой, Ивану приходится объединиться и со старыми друзьями, и с новыми недругами. Им предстоит отправиться в дальнее путешествие, за пределы известного мира, чтобы обнаружить истоки зла и вернуть мир в Белогорье.",
                    "popularity": 693.911,
                    "poster_path": "/9ZH3XulXJPHmXuOgZMqzXCvRB6K.jpg",
                    "release_date": "2021-01-01",
                    "title": "Последний богатырь: Корень зла",
                    "video": false,
                    "vote_average": 7.1,
                    "vote_count": 65
                },
                {
                    "adult": false,
                    "backdrop_path": "/2OFg5p9yarI5zZsUWKCRgBgPctj.jpg",
                    "genre_ids": [
                        28,
                        12
                    ],
                    "id": 568620,
                    "original_language": "en",
                    "original_title": "Snake Eyes: G.I. Joe Origins",
                    "overview": "Загадочный и суровый одиночка Снейк Айз спасает наследника древнего японского клана Арашикаге, и в знак признательности клан открывает ему тайные знания пути ниндзя. Но главное: Снейк Айз обретает то, к чему так долго стремился, — дом. Однако, когда становятся известны секреты его прошлого, на кону оказываются его честь, преданность и доверие самых близких людей.",
                    "popularity": 806.19,
                    "poster_path": "/5ziYvBUoDB95zeGnTEZxxb92Xi1.jpg",
                    "release_date": "2021-07-22",
                    "title": "G.I. Joe: Бросок кобры. Снейк Айз",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 834
                },
                {
                    "adult": false,
                    "backdrop_path": "/xPpXYnCWfjkt3zzE0dpCNME1pXF.jpg",
                    "genre_ids": [
                        16,
                        28,
                        12,
                        14
                    ],
                    "id": 635302,
                    "original_language": "ja",
                    "original_title": "劇場版「鬼滅の刃」無限列車編",
                    "overview": "Тандзиро с друзьями из отряда уничтожителей демонов расследует серию загадочных исчезновений внутри мчащегося поезда. Но компания ещё не знает, что в составе находится один из двенадцати Лунных демонов, и он приготовил для них ловушку.",
                    "popularity": 742.851,
                    "poster_path": "/m9cn5mhW519QKr1YGpGxNWi98VJ.jpg",
                    "release_date": "2021-05-20",
                    "title": "Истребитель демонов: Поезд «Бесконечный»",
                    "video": false,
                    "vote_average": 8.4,
                    "vote_count": 1868
                },
                {
                    "adult": false,
                    "backdrop_path": "/fuuZFPc8x6gQ8mLGoBp9vrmcQMT.jpg",
                    "genre_ids": [
                        27,
                        53
                    ],
                    "id": 610253,
                    "original_language": "en",
                    "original_title": "Halloween Kills",
                    "overview": "Хитроумная ловушка Лори Строуд почти помогла ей победить зловещего убийцу Майкла Майерса. Почти… Он снова на свободе, и кровавый след, который тянется за ним, еще никогда не был таким длинным. Женщины семьи Строуд объединяются с другими выжившими, чтобы остановить Майкла раз и навсегда…",
                    "popularity": 599.788,
                    "poster_path": "/8lr4YPjFtLUkMgRKr7quYwJVpiL.jpg",
                    "release_date": "2021-10-21",
                    "title": "Хэллоуин убивает",
                    "video": false,
                    "vote_average": 6.9,
                    "vote_count": 1247
                }
            ],
            "total_pages": 500,
            "total_results": 10000
        }"""

        val builder = GsonBuilder()
        val objectClass: ResponsePage<Movie> = builder.create().fromJson(
            jsonString,
            object : TypeToken<ResponsePage<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getDetailMovie(id: Int): Movie {
        val jsonString = """{
            "adult": false,
            "backdrop_path": "/cinER0ESG0eJ49kXlExM0MEWGxW.jpg",
            "belongs_to_collection": null,
            "budget": 150000000,
            "genres": [
                {
                    "id": 28,
                    "name": "боевик"
                },
                {
                    "id": 12,
                    "name": "приключения"
                },
                {
                    "id": 14,
                    "name": "фэнтези"
                }
            ],
            "homepage": "https://www.marvel.com/movies/shang-chi-and-the-legend-of-the-ten-rings",
            "id": 566525,
            "imdb_id": "tt9376612",
            "original_language": "en",
            "original_title": "Shang-Chi and the Legend of the Ten Rings",
            "overview": "Мастеру боевых искусств Шан-Чи предстоит противостоять призракам из собственного прошлого, по мере того как его втягивают в паутину интриг таинственной организации «Десять колец».",
            "popularity": 6665.737,
            "poster_path": "/hn0B1OFQRQnzr0LeLkaUbJxoiol.jpg",
            "production_companies": [
                {
                    "id": 420,
                    "logo_path": "/hUzeosd33nzE5MCNsZxCGEKTXaQ.png",
                    "name": "Marvel Studios",
                    "origin_country": "US"
                }
            ],
            "production_countries": [
                {
                    "iso_3166_1": "US",
                    "name": "United States of America"
                }
            ],
            "release_date": "2021-09-01",
            "revenue": 430238384,
            "runtime": 132,
            "spoken_languages": [
                {
                    "english_name": "English",
                    "iso_639_1": "en",
                    "name": "English"
                },
                {
                    "english_name": "Mandarin",
                    "iso_639_1": "zh",
                    "name": "普通话"
                }
            ],
            "status": "Released",
            "tagline": "«Легенда Marvel воскреснет»",
            "title": "Шан-Чи и легенда десяти колец",
            "video": false,
            "vote_average": 7.9,
            "vote_count": 3406
        }"""

        val builder = GsonBuilder()

        return builder.create().fromJson(
            jsonString,
            Movie::class.java
        )
    }
}