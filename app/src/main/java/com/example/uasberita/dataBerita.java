package com.example.uasberita;

import java.util.ArrayList;

public class dataBerita {

    //membuat list data untuk setiap kategori, dari judul, nama author, dan isi berita
    //film
    private static final String[] titleMovie = {
        "Review Film: Smile",
        "Christian Bale Mengeluh Soal Syuting di Thor: Love and Thunder",
        "Sinopsis Serial Dahmer, Kisah Nyata Pembunuh Berdarah Dingin di AS",
        "Jonathan Majors Besarkan Otot demi Jadi Kang the Conqueror"
    };

    private static final String[] authorMovie = {
        "Christie Stefanie",
        "far | CNN Indonesia",
        "Tim | CNN Indonesia",
        "CNN Indonesia"
    };

    private static final String[] contentMovie = {
        "Jakarta, CNN Indonesia -- Smile merupakan tayangan tahun ini yang bisa membuat pencinta film horor sedikit bernostalgia dengan film-film horor lawas, seperti The Ring atau Drag Me To Hell.\n" +
                "\n" +
                "Tone warna, plot minim kejutan yang biasanya dipakai film horor 2000-an, dihidupkan kembali dalam film Smile.\n" +
                "\n" +
                "Ada adegan-adegan yang saya harapkan bisa diperdalam di pertengahan film atau menjadi plot twist di akhir cerita, tapi Smile memilih tidak mewujudkan angan saya.\n" +
                "\n" +
                "Namun, saya sebagai penonton masih sangat bisa menikmati ketidaknyamanan dari teror yang diberikan film berdurasi 115 menit tersebut.\n" +
                "\n" +
                "Teror diberikan lewat jump scare dan adegan gore bertubi-tubi. Namun, sebagian besar kengerian tidak ditampilkan lewat keberadaan hantu, setan, atau monster, melainkan hal-hal keseharian, seperti bunyi telepon.\n" +
                "\n" +
                "Oleh sebab itu, film ini tidak dianjurkan disaksikan oleh orang yang memiliki permasalahan jantung.\n" +
                "\n" +
                "Penonton semacam diberikan kode bahwa detik-detik jump scare tersebut akan muncul. Namun, jump scare itu malah muncul pada saat yang lain.\n" +
                "\n" +
                "Hal itu lah yang kemudian membuat saya sebagai penonton semakin merasa tidak nyaman menantikan jump scare itu muncul.\n" +
                "\n" +
                "Tak hanya itu, rasa tidak nyaman tersebut juga diperkuat dengan backsound serta sound effect yang benar-benar mengganggu.\n" +
                "\n" +
                "Rasa takut atau seram itu sendiri muncul bukan dari jump scare yang diberikan, melainkan dari hal-hal yang sesungguhnya sangat bisa mungkin terjadi, seperti melihat sosok yang dikenal tapi sesungguhnya tidak ada.\n" +
                "\n" +
                "Kondisi tersebut yang membuat karakter utama dan penonton bermain dengan pikiran mengenai kondisi yang terjadi.\n" +
                "\n" +
                "Smile sejatinya mengisahkan psikiater Rose Cotter (Sosie Bacon) yang menjadi saksi pasiennya bunuh diri. Tanpa ia sadari, hal itu benar-benar mengubah kehidupannya, termasuk memperkuat trauma masa lalu.\n" +
                "\n" +
                "Rose sejatinya menggambarkan kondisi banyak orang di dunia nyata, yaitu mereka yang mengalihkan mimpi buruk atau trauma dengan kerja, atau mereka yang pura-pura empati, hingga mereka yang frustrasi untuk bisa dipercaya bukan untuk dinilai gila.\n" +
                "\n" +
                "Sementara itu, lewat karakter Smile lainnya, penonton diingatkan bahwa pertolongan bisa datang dari siapa saja. Termasuk, dari seseorang yang mungkin tidak pernah dibayangkan sebelumnya.\n" +
                "\n" +
                "Oleh sebab itu, benar rasanya omongan sang sutradara sekaligus penulis, Parker Finn, bahwa Smile bisa terhubung dengan penonton, tergantung mau menitikberatkannya pada hal yang mana.\n" +
                "\n" +
                "Pada akhirnya, Smile merupakan film yang secara gamblang memberikan pesan sulitnya dan butuh keberanian untuk menghadapi kecemasan atau trauma masa lalu.\n" +
                "\n" +
                "Smile merupakan kelanjutan sekaligus pengembangan dari film pendek bertajuk Laura Hasn't Slept (2020) yang dibintangi Caitlin Stasey. Dalam Smile, Stasey hadir sebagai Laura, pasien dari Rose.\n" +
                "\n" +
                "Smile masih tayang di beberapa bioskop di Indonesia.",
        "Jakarta, CNN Indonesia -- Aktor Christian Bale mengaku sangat membenci penggunaan layar hijau yang berlebihan untuk syuting film MCU Thor: Love and Thunder.\n" +
                "\n" +
                "Merefleksikan debutnya dalam MCU di film tersebut, Bale turut menceritakan pengalaman syuting menggunakan layar hijau yang dinilainya membuat situasi menjadi monoton.\n" +
                "\n" +
                "\"Itu pertama kali aku melakukannya. Dan itu adalah definisi monoton,\" kata Bale saat berbincang dengan GQ, seperti dirilis Rabu (5/10).\n" +
                "\n" +
                "\"Maksudku, kalian punya banyak orang hebat. Kamu punya aktor-aktor yang jauh lebih berpengalaman menggunakan itu daripada aku,\" lanjutnya.\n" +
                "\n" +
                "Untuk diketahui, penggunaan teknologi layar hijau umum digunakan untuk film yang memiliki kebutuhan efek visual. Tetapi, tak semua aktor Hollywood dapat menikmati penggunaan latar syuting polos yang ditempatkan dalam studio itu.\n" +
                "\n" +
                "Seorang Christian Bale yang begitu berpengalaman, mengaku tak menikmati pengalaman tersebut. Bahkan ia merasa bahwa layar hijau membuat pekerjaannya menjadi lebih sulit.\n" +
                "\n" +
                "\"Dapatkah kalian membedakan satu hati dengan yang lain? Tidak. Sama sekali tidak. Kamu tidak akan tahu apa yang akan dilakukan. Aku bahkan tidak bisa membedakan tahapan lain dengan tahap berikutnya,\" kata Bale.\n" +
                "\n" +
                "\"Mereka [kru] terus berkata, 'kamu sedang ada di Tahap Ketiga'. Lalu aku berkata, 'Yang mana itu' \"Yang warna biru'. Mereka lalu berkata 'Iya. Tapi kamu ada di Tahap Ketujuh.' 'Itu yang mana lagi?' 'Yang berwarna biru',\" cerita Bale tentang kebingungannya memakai layar hijau.\n" +
                "\n" +
                "\"Aku hanya bisa berkata, 'Aduh, di mana ya itu?',\" keluhnya.\n" +
                "\n" +
                "Dalam Love and Thunder, Bale memainkan peran Gorr the God Butcher, seorang villain yang sakit hati dengan para Dewa usai anaknya, Love, meninggal dunia karena dehidrasi.\n" +
                "\n" +
                "Usai membunuh Dewa bernama Rapu, Gorr mendapatkan kutukan dari pedang hitam kematian bernama Necrosword dan segera memperoleh kekuatan yang amat besar.\n" +
                "\n" +
                "Sejak itu, Gorr bersumpah kepada dirinya sendiri untuk menumpas Dewa di seluruh alam semesta dan mendapatkan namanya sebagai Gorr the God Butcher.\n" +
                "\n" +
                "Thor: Love and Thunder merupakan saga keempat Thor sekaligus bagian dari Marvel Cinematic Universe (MCU) fase keempat. Film ini melanjutkan kehidupan bangsa Asgard yang kehilangan tempat tinggal usai peristiwa Ragnarok (2017).\n" +
                "\n" +
                "Selain Bale, Love and Thunder dibintangi oleh Chris Hemsworth, Tessa Thompson, Russell Crowe, dan Natalie Portman.",
        "Jakarta, CNN Indonesia -- Dahmer - Monster: The Jeffrey Dahmer Story menjadi serial terbaru yang menyoroti pembunuhan berantai. Serial tersebut fokus pada Jeffrey Dahmer, pembunuh berantai sekaligus pelaku pelecehan seksual asal AS.\n" +
                "\n" +
                "Serial ini fokus pada Jeffrey Dahmer (Evan Peters) yang dikenal sebagai monster. Ia merupakan pelaku pelecehan seksual bahkan terhadap anak-anak, pembunuh berdarah dingin karena menghabiskan para korban secara bengis.\n" +
                "\n" +
                "Tak hanya membunuh, ia juga mengawetkan bagian tubuh hingga memakan daging korbannya.\n" +
                "\n" +
                "Dalam periode 1978 dan 1991, Jeffrey Dahmer membunuh 17 pria dewasa dan anak-anak, meski sebagian besar terjadi antara 1987-1991.\n" +
                "\n" +
                "Sebagian besar korban Dahmer adalah mereka yang terdampak rasisme sistemik. Jumlah korban itu juga semakin bertambah akibat kurang ketat dan cekatannya kelembagaan polisi di AS dalam memproses laporan saksi.\n" +
                "\n" +
                "Salah satu yang disoroti adalah ketika salah satu korban Dahmer, Konerak Sinthasomphone, salah satu korban yang sempat berhasil kabur.\n" +
                "\n" +
                "Konerak kala itu berusia 14 tahun dan berada di apartemen Dahmer dengan kedok bayaran untuk pengambilan gambar. Namun, setibanya di sana, ia dibius Dahmer. Konerak yang tak sadarkan diri langsung menjadi kelinci percobaan kegilaan Dahmer.\n" +
                "\n" +
                "Pada satu titik, Dahmer hendak membeli lebih banyak alkohol sehingga meninggalkan apartemen itu. Pada saat itu, Konerak yang bersimbah darah terbangun dan mencoba melarikan diri.\n" +
                "\n" +
                "Namun, kondisinya membuat Konerak terkapar di tangga dekat pemilik unit lain. Ia ditemukan perempuan di sekitar flat tersebut. Perempuan itu menelepon polisi untuk meminta bantuan. Polisi kemudian datang dan meminta keterangan Dahmer.\n" +
                "\n" +
                "Di hadapan polisi, Dahmer dengan tenang mengatakan Konerak adalah kekasihnya dan mereka hanya mengalami perselisihan layaknya kekasih pada umumnya. Keterangan itu pun diterima polisi.\n" +
                "\n" +
                "Alih-alih mencari tahu lebih lanjut, polisi langsung mengembalikan Konerak ke flat Dahmer. Tak lama setelah itu, Konerak sudah ditemukan tewas akibat dibunuh Dahmer.\n" +
                "\n" +
                "Selain kebengisan Dahmer, Monster: The Jeffrey Dahmer Story juga mengeksplorasi masa kecil hingga remaja sosok itu yang tumbuh bersama ibu pencandu narkotika dan peran sang ayah.\n" +
                "\n" +
                "Dahmer muda mulai tertarik dengan membedah hewan-hewan mati, termasuk ketertarikannya terhadap orang lain. \n" +
                "\n" +
                "Dahmer - Monster: The Jeffrey Dahmer Story dibuat Ryan Murphy bersama Ian Brennan. Selain Evan Peters, serial ini juga dibintangi Richard Jenkins, Molly Ringwald, Niecy Nash, dan Michael Learned.\n" +
                "\n" +
                "Dahmer - Monster: The Jeffrey Dahmer Story tayang di Netflix sejak 21 September.",
        "Jakarta, CNN Indonesia -- Jonathan Majors mengubah penampilannya demi memerankan Kang the Conqueror versi prajurit di semesta Marvel Cinematic Universe (MCU). Villain utama dari fase kelima MCU itu bakal tampil dalam Ant-Man and the Wasp: Quantumania (2023).\n" +
                "\n" +
                "Penampilan fisik terbaru Jonathan Majors baru-baru ini terungkap kala dirinya muncul sebagai sampul majalah Men's Health. Ia tampak memiliki tubuh yang lebih atletis dengan otot besar.\n" +
                "\n" +
                "Majors dan timnya bahkan mengungkapkan bahwa sang aktor meningkatkan \"otot hingga 10 pounds atau sekitar 4,5 kilogram\" demi memerankan villain utama pengganti Thanos.\n" +
                "\n" +
                "Jamie Sawyer selaku pelatih fisik Jonathan Majors mengungkapkan sang aktor berlatih keras demi meningkatkan otot dan tampilan fisiknya sebagai Kang the Conqueror.\n" +
                "\n" +
                "\"Dia adalah Kang versi prajurit, jadi ada fokus terhadap seperti apa gambaran seorang prajurit yang telah berkelana sepanjang zaman dan mengembangkan setiap jenis keterampilan bertarung,\" kata Sawyer, seperti diberitakan Variety pada Selasa (11/10).\n" +
                "\n" +
                "\"Ini tentang membuat dirinya terlihat sebagai sosok yang mengesankan,\" lanjutnya.\n" +
                "\n" +
                "Selain soal fisik, Jonathan Majors juga diakui memiliki etos kerja yang tinggi selama berada di lokasi syuting. Hal itu bahkan diungkapkan oleh Presiden Marvel Studios Kevin Feige.\n" +
                "\n" +
                "\"Jonathan adalah aktor yang sangat menarik yang begitu semangat dalam bekerja hingga membuatnya terlihat mudah,\" kata Feige.\n" +
                "\n" +
                "\"Dia juga keren - semua orang menaruh perhatian terhadap dirinya ketika dia masuk ruangan,\" lanjutnya.\n" +
                "\n" +
                "Sementara itu, trailer pertama Ant-Man 3 telah ditayangkan di Comic-Con pada pertengahan tahun lalu. Namun, Marvel Studios hingga kini belum merilisnya secara online.\n" +
                "\n" +
                "Jonathan Majors sebagai Kang the Conqueror bakal memiliki peran sentral dalam semesta MCU mendatang. Ia sebelumnya juga telah muncul dalam serial Loki (2021) sebagai karakter He Who Remains.\n" +
                "\n" +
                "Puncaknya, Kang the Conqueror akan berhadapan dengan superhero Marvel dalam dua film Avengers, yakni Avengers: The Kang Dynasty dan Avengers: Secret Wars.\n" +
                "\n" +
                "\"[Kedua film Avengers] itu akan melengkapi saga kedua MCU, yaitu tentu saja The Multiverse Saga,\" ungkap Kevin Feige di gelaran San Diego Comic Con 2022, pada Sabtu (23/7) waktu setempat, dikutip dari AFP.\n" +
                "\n" +
                "Avengers: The Kang Dynasty dan Avengers: Secret Wars akan melanjutkan kisah Avengers: Endgame yang telah rilis pada 2019 lalu. Dikutip dari Deadline, film terakhir Avengers itu menjadi film terlaris sepanjang masa dengan keuntungan lebih dari US$2,79 miliar atau setara Rp418 triliun (US$1= Rp14.798)."
    };

    private static final String[] titleMovieUnder17 = {
        "Teaser Super Mario Bros Movie, Mario Tiba di Kerajaan Jamur",
        "Trailer Black Panther 2, Kemunculan Sosok Penerus T'Challa",
        "Tom Cruise Siapkan Film Baru yang Bakal Syuting di Luar Angkasa",
        "Festival Sinema Prancis 'Generation' Digelar Hybrid, Tayangkan 24 Film"
    };

    private static final String[] authorMovieUnder17 = {
        "tim | CNN Indonesia",
        "tim | CNN Indonesia",
        "CNN Indonesia",
        "Mola | CNN Indonesia"
    };

    private static final String[] contentMovieUnder17 = {
        "Jakarta, CNN Indonesia -- The Super Mario Bros. Movie telah mengeluarkan teaser pertamanya. Dalam teaser dengan durasi 2 menit 29 detik itu, penonton diperkenalkan dengan para tokoh utama.\n" +
                "\n" +
                "Pertama-tama, ada Bowser yang diisi suara olehnya oleh Jack Black. Ia tampak mendarat bersama para anak buahnya di sebuah wilayah es yang ditinggali oleh sekumpulan pinguin.\n" +
                "\n" +
                "Ia pun menyerang pinguin itu dan mengembuskan napas api ke istana es di hadapannya.\n" +
                "\n" +
                "Kemudian, teaser berpindah adegan ke sebuah pemandangan yang sudah tidak asing lagi bagi para penggemar Super Mario Bros.\n" +
                "\n" +
                "Tukang ledeng bernama Mario mendarat di Kerajaan Jamur yang subur dan cerah. Adegan ini mengingatkan para penggemar akan level 1 dari gim Super Mario Bros.\n" +
                "\n" +
                "Mario, dengan pengisi suara Chris Pratt, bertemu dengan Toad yang memberi peringatan salah tentang jamur beracun.\n" +
                "\n" +
                "\"Kerajaan Jamur, kami datang!\" kata Mario yang mulai bertualang dengan Toad.\n" +
                "\n" +
                "Teaser pun diakhiri dengan kemunculan Luigi yang sedang dalam pelarian. Ia tengah dikejar-kejar oleh segerombolan Dry Bones.\n" +
                "\n" +
                "Selain karakter-karakter yang telah disebutkan, teaser ini juga menampilkan Koopa dan Kamek.\n" +
                "\n" +
                "Pada September 2021, Nintendo mengumumkan jajaran pengisi suara untuk The Super Mario Bros. Movie. Chris Pratt terpilih untuk mengisi suara pemeran utama, Mario.\n" +
                "\n" +
                "Jajaran pengisi suara lainnya juga bertabur bintang, seperti Anya Taylor-Joy sebagai Princess Peach, Charlie Day sebagai Luigi, Jack Black sebagai Bowser, Keegan-Michael Key sebagai Toad, hingga Seth Rogen sebagai Donkey Kong.\n" +
                "\n" +
                "Selain itu, Charles Martinet yang merupakan pengisi suara asli Mario bakal muncul sebagai cameo dalam film tersebut.\n" +
                "\n" +
                "Aaron Horvath dan Michael Jelenic bertindak sebagai sutradara film ini. Sedangkan skenario ditulis oleh Matthew Fogel.\n" +
                "\n" +
                "Shigeru Miyamoto, kreator Mario Bros., menjadi produser film tersebut bersama Chris Meledandri.\n" +
                "\n" +
                "Awalnya The Super Mario Bros. Movie direncanakan tayang pada 21 Desember tahun ini. Namun, Miyamoto mengumumkan jadwal tayang filmnya mesti diundur hingga 2023.\n" +
                "\n" +
                "The Super Mario Bros. Movie bakal tayang pada 7 April 2023 di Amerika, disusul oleh perilisan di Jepang pada 28 April 2023.",
        "Jakarta, CNN Indonesia -- Black Panther: Wakanda Forever mengeluarkan trailer terbaru jelang perilisannya pada 11 November mendatang. Dalam trailer kali ini, mereka memberikan sedikit bocoran tentang sosok Black Panther baru.\n" +
                "\n" +
                "Trailer dibuka dengan para masyarakat Wakanda yang sedang berduka setelah kematian T'Challa (Chadwick Boseman). Ramonda (Angela Bassett) dan Shuri (Letitia Wright) tampak menggelar pemakaman untuk sang Raja.\n" +
                "\n" +
                "Kemudian, penonton diperkenalkan dengan karakter bernama Namor (Tenoch Huerta). Namor merupakan pemimpin suku Talokan yang merupakan penghuni bawah laut.\n" +
                "\n" +
                "\"Hanya orang-orang yang paling hancur yang bisa menjadi pemimpin hebat,\" kata Namor.\n" +
                "\n" +
                "M'Baku (Winston Duke) menjelaskan lebih lanjut soal sosok Namor. Ia mengatakan Namor tidak dipanggil raja atau jenderal oleh pengikutnya.\n" +
                "\n" +
                "\"Mereka memanggilnya K'uk'ulkan, dewa ular dengan bulu,\" kata M'Baku.\n" +
                "\n" +
                "\"Membunuhnya bakal akan menimbulkan perang abadi,\" lanjutnya.\n" +
                "\n" +
                "Kehadiran Namor pun mengancam Wakanda. Ia dan pengikutnya menyeruak dari bawah laut ke daratan.\n" +
                "\n" +
                "Ramonda terlihat meminta bantuan setelah mereka kehilangan T'Challa untuk melindungi Wakanda dari marabahaya.\n" +
                "\n" +
                "\"Mereka telah kehilangan pelindung mereka. Sekarang saatnya bagi kita untuk menyerang,\" kata Ramonda.\n" +
                "\n" +
                "\"Tunjukkan pada mereka siapa kita,\" serunya.\n" +
                "\n" +
                "Di akhir trailer, muncullah sosok Black Panther pengganti T'Challa. Jika menilik postur tubuhnya, Black Panther baru ini sudah dapat dipastikan perempuan bertubuh kecil.\n" +
                "\n" +
                "Ada tiga kandidat yang berpotensi menjadi Black Panther, yaitu Shuri, Okoye (Danai Gurira), dan Nakia (Lupita Nyong'o). Namun, jika dilihat dari besarnya potensi, tampaknya penerus Black Panther jatuh kepada Shuri.\n" +
                "\n" +
                "Selain kehadiran penerus Black Panther, trailer ini juga memperkenalkan karakter baru. Ia adalah Riri Williams alias Ironheart yang diperankan oleh Dominique Thorne.\n" +
                "\n" +
                "Black Panther: Wakanda Forever masih ditulis dan disutradarai oleh Ryan Coogler. Sekuel ini bakal dibintangi oleh Letitia Wright, Lupita Nyong'o, Danai Gurira, Winston Duke, dan Angela Bassett.\n" +
                "\n" +
                "Selain itu, film sekuel ini juga turut dimeriahkan oleh Dominique Thorne, Tenoch Huerta, Martin Freeman, hingga Florence Kasumba.\n" +
                "\n" +
                "Saat diperkenalkan oleh produser Marvel Cinematic Universe (MCU) Kevin Feige pada San Diego Comic-Con Juli lalu, Black Panther 2: Wakanda Forever bukanlah sekadar menjadi kelanjutan film superhero, tetapi juga tribut untuk Chadwick Boseman.",
        "Jakarta, CNN Indonesia -- Tom Cruise diklaim bakal jadi aktor Hollywood pertama yang akan menjalani syuting di luar angkasa. Rencananya, ide itu akan dilaksanakan untuk film yang ia garap bersama sutradara Doug Liman.\n" +
                "\n" +
                "Dilaporkan New York Post pada Minggu (9/10), Cruise bersama kreator trilogi The Bourne Identity tersebut sudah menghubungi Universal Filmed Entertainment Group (UFEG) soal ide itu.\n" +
                "\n" +
                "\"Saya rasa Tom Cruise akan membawa kita ke luar angkasa, dia mau membawa dunia ke luar,\" kata Pimpinan UFEG, Donna Langley seperti diberitakan BBC.\n" +
                "\n" +
                "\"Itu rencananya. Kami punya proyek luar biasa yang berada dalam pengembangan bersama Tom... Naik roket ke Stasiun Luar Angkasa Internasional dan syuting di angkasa,\" lanjutnya.\n" +
                "\n" +
                "Namun Langley juga mengatakan, meskipun film tersebut bertemakan angkasa luar, bukan berarti keseluruhan proses syuting akan dilakukan di sana. Ia mengungkap jika sebagian besar syuting filmnya tetap dilakukan di Bumi.\n" +
                "\n" +
                "\"Karakternya akan [pergi] menuju angkasa luar untuk menyelamatkan Bumi,\" kata Langley. \"Semoga Cruise jadi orang sipil pertama yang berjalan di luar angkasa di luar Stasiun Luar Angkasa,\"\n" +
                "\n" +
                "Meski begitu, film baru Tom Cruise ini bukanlah film pertama yang syuting di luar angkasa. Pada 2021, sekelompok kru film asal Rusia berhasil syuting di luar angkasa, tepatnya di Stasiun Luar Angkasa Internasional.\n" +
                "\n" +
                "Kala itu, kru dari film yang bertajuk Challenge tersebut melakukan syuting selama beberapa waktu di stasiun luar angkasa itu hingga tiba lagi di Bumi pada 17 Oktober.\n" +
                "\n" +
                "Pada masa itu pula, Tom Cruise juga berencana membuat film di luar angkasa dengan menggandeng NASA dan SpaceX. Namun rencana itu tak terdengar lagi hingga muncul kabar teranyar ini.\n" +
                "\n" +
                "Kini telah memasuki usia yang ke-60, Tom Cruise sebagai aktor kawakan masih produktif dalam memupuk portofolio karier beraktingnya.\n" +
                "\n" +
                "Setelah merengkuh kesuksesan besar bersama sekuel Top Gun: Maverick awal tahun lalu, Tom Cruise kini tengah menjajaki proyek sekuel besar selanjutnya.\n" +
                "\n" +
                "Bersama waralaba Mission Impossible, Tom Cruise memastikan akan segera kembali menjajaki karakter Ethan Hunt yang ikonis dalam film Mission: Impossible: Dead Reckoning Part 1.\n" +
                "\n" +
                "Dalam aksi laga mendatang, Ethan Hunt (Tom Cruise) menjalani misi bersama Ilsa Faust, Benji Dunn (Simon Pegg), dan Luther Stickell (Ving Rhames). Sedangkan, karakter antagonis utama diperankan Esai Morales dan Pom Klementieff yang belum diketahui nama tokohnya.\n" +
                "\n" +
                "Film tersebut juga turut dibintangi Hayley Atwell, Shea Whigham sebagai Jasper Briggs, dan Frederick Schmidt sebagai Zola Mitsopolis.\n" +
                "\n" +
                "Mission: Impossible: Dead Reckoning Part 1 dijadwalkan tayang di bioskop 14 Juli 2023 dan Dead Reckoning Part 2 menyusul pada 28 Juni 2024.",
        "Jakarta, CNN Indonesia -- Institute France Indonesia (IFI) kembali menggelar Festival Sinema Prancis yang digelar pada 6 sampai 21 Oktober. Festival ke-24 pada tahun ini digelar untuk pertama kalinya secara hybrid, yakni offline dan online.\n" +
                "\n" +
                "Untuk offline, IFI akan menayangkan 19 film berbahasa Prancis yang bisa ditonton secara gratis di 21 lokasi di 13 kota di Indonesia, yakni Jakarta, Tangerang, Bandung, Yogyakarta, Surabaya, Bali, Medan, Pontianak, Lampung, Samarinda, Kendari, Makassar, dan Ambon.\n" +
                "\n" +
                "Selain itu, ada 5 film Prancis yang bisa disaksikan secara online melalui layanan streaming Mola dalam festival bertemakan 'Generation' ini. Mola akan menayangkan 5 film ini mulai 14 Oktober hingga 21 Oktober.\n" +
                "\n" +
                "Adapun film-film yang disajikan secara offline maupun online ini hadir dengan beberapa genre. Mulai dari fiksi, serial pendek, animasi, hingga dokumenter.\n" +
                "\n" +
                "\"Ada 24 film yang menakjubkan akan menyatukan puluhan ribu orang di dalam Festival Sinema Prancis (FSP). Festival ini amat penting dicatat dalam kalender budaya, karena di sinilah film-film Prancis terbaik dan teranyar disuguhkan secara cuma-cuma, di berbagai penjuru nusantara Indonesia,\" ujar Direktur IFI, Stephane Dovert.\n" +
                "\n" +
                "Stephane menjelaskan, IFI memilih tema Generation karena film-film yang disajikan berhubungan dengan permasalahan generasi saat ini. Mulai dari perubahan iklim, pelestarian lingkungan, kepunahan massal spesies, termasuk hak asasi manusia, inklusi, dan lain-lain.\n" +
                "\n" +
                "\"Anda menyusuri perjalanan keliling dunia guna memahami keprihatinan dan tantangan generasi kita hari ini. Maksud dan tujuan program film-film ini adalah untuk mengantarkan pesan harapan, yang akan membantu memetakan sejarah di kemudian hari. Harapan dan cita, kita sangat memerlukannya,\" tambah Stephane.\n" +
                "\n" +
                "Selain rangkaian pemutaran film, festival tahun ini juga akan menggelar sejumlah kegiatan lain, seperti diskusi, kuliah umum, dan ciné-moi spesial Festival Sinema Prancis.\n" +
                "\n" +
                "Festival ini dibuka dengan penayangan film dokumenter berjudul Animal karya Cyril Dion pada Kamis 6 Oktober. Film ini diputar secara offline di Gedung Pusat Perfilman Haji Usmar Ismail, Jakarta Selatan.\n" +
                "\n" +
                "Setelah itu, hingga 21 Oktober mendatang 23 film akan ditayangkan sesuai jadwal yang sudah ditentukan. Beberapa di antaranya Bonne Mère, Ouistreham, Mon Lègionnaire, Les Choses qu'on Dit Les Chose qu'on Fait, une Jeune Fille qui Va Bien, Les 2 Alfred, Petite Fille, Adolescentes, dan Mal de Pierres.\n" +
                "\n" +
                "Festival kemudian ditutup dengan pemutaran film Illusions Perdues yang disutradarai Xavier Giannoli. Film ini akan ditayangkan di Auditorium IFI Thamrin, Jakarta Pusat pada Jumat 21 Oktober."
    };

    //game
    private static final String[] titleGame = {
        "2K Games Benarkan Data Pelanggan Dicuri Hacker, Bakal Dijual Online",
        "Baru Rilis, Overwatch 2 Sudah Kena Serangan DDoS",
        "Square Enix Suntik Mati Game Final Fantasy 7 The First Soldier 11 Januari 2022",
        "Among Us VR Siap Meluncur 10 November 2022"
    };

    private static final String[] authorGame = {
        "Agustinus Mario Damar",
        "Giovani Dio Prasasti",
        "Yuslianson",
        "Iskandar"
    };

    private static final String[] contentGame = {
            "Liputan6.com, Jakarta - Bulan lalu, publisher 2K Games mengumumkan ada hacker yang telah menyusup ke platform help desk mereka secara ilegal. Hacker tersebut memanfaatkan platform help desk 2K Games untuk mengirimkan tautan berbahaya ke pelanggan.\n" +
                    "\n" +
                    "Setelah informasi mengenai dampak serangan tersebut belum dipastikan, dari laporan terbaru VGC, 2K Games memastikan ada sejumlah pelanggan yang terdampak.\n" +
                    "\n" +
                    "Karenanya, seperti dikutip dari Kotaku, Rabu (12/10/2022), perusahaan telah mengirimkan email pada para pelanggan tersebut.\n" +
                    "\n" +
                    "Kendati demikian, 2K Games menyebut tidak ada indikasi bahwa informasi finansial atau password pelanggan yang ada di sistem mereka telah dibobol. Namun, beberapa data pribadi yang diberikan pelanggan saat menghubungi help desk kemungkinan berhasil diambil hacker.\n" +
                    "\n" +
                    "Beberapa data tersebut di antaranya adalah alamat email, nomor helpdesk ID, gamertag, hingga informasi soal konsol. Data-data itu pun disebut akan dijual oleh para hacker secara online.\n" +
                    "\n" +
                    "Untuk itu, 2K Games mengingatkan para pelanggan yang menerima email dari help desk mulai 6 Oktober 2022 untuk melakukan sejumlah hal agar memastikan keamanan akun mereka, mulai dari mengatur ulang password dan mengawasi aktivitas akun mereka.\n" +
                    "\n" +
                    "Selain itu, perusahaan juga meminta para pelanggan melakukan restart komputer mereka. Alasannya, berdasarkan investigasi dan uji coba internal perusahaan, mematikan dan menyalakan perangkat akan memberikan perlindungan tambahan dari malware.\n" +
                    "\n" +
                    "Sebagai informasi, beberapa waktu lalu, publisher 2K Games mengumumkan ke publik ada pihak ketiga telah menyusupi platform help desk-nya secara ilegal.\n" +
                    "\n" +
                    "Rupanya, hacker tersebut memanfaatkan platform help desk 2K Games untuk mengirim tautan berbahaya ke pelanggan.\n" +
                    "\n" +
                    "Laporan Bleeping Computer menyebut, sejumlah besar gamer 2K Games mendapatkan email dari dukungan Zendesk yang tidak dibuatnya.\n" +
                    "\n" +
                    "Bersama email tersebut, ada lampiran file zip berisi program yang dapat dieskekusi, berupa launcher baru untuk 2K Games. Padahal, sebenarnya isinya adalah malware pencuri informasi yang dijuluki sebagai RedLine.\n" +
                    "\n" +
                    "Malware RedLine yang dikirimkan ke pelanggan ini biasanya dijual di darkweb dan bisa melacak dan mentransmisikan data sensitif. Mulai dari password yang disimpan di browser, detail login email, informasi kartu kredit dan dompet kripto, dan lain-lain.\n" +
                    "\n" +
                    "Sejauh ini, 2K tidak memberi informasi tambahan tentang jumlah pelanggan yang mungkin telah terdampak. Akun Twitter perusahaan pun tidak mengunggah informasi detail terkait hal ini.\n" +
                    "\n" +
                    "Para pelanggan yang telah berinteraksi dengan link jahat tersebut disarankan untuk menginstal dan menjalankan program antivirus, mengecek akun email untuk adanya perubahan yang tidak dilakukan pengguna, dan mereset password yang disimpan di browser.\n" +
                    "\n" +
                    "Sebelumnya, gamer dibuat terkejut dengan beredarnya screenshot (tangkapan layar) dan video gameplay singkat gim Grand Theft Auto 6 (GTA 6) buatan Rockstar Games.\n" +
                    "\n" +
                    "Disebutkan, aset game GTA VI tersebut diambil dari server Rockstar oleh hacker yang menyebut diri mereka \"teapotuberhacker\".\n" +
                    "\n" +
                    "Mengutip Gamespot, Senin (19/9/2022), grup hacker ini mengklaim telah mencuri source code dan aset gim GTA 5 dan 6, juga GTA 6 versi pengembangan.\n" +
                    "\n" +
                    "Dari 90 lebih video yang saat ini beredar di internet, terlihat bagaimana karakter di dalam gim ini melakukan aksi perampokan hingga tembak-menembak.\n" +
                    "\n" +
                    "Video tersebut dikonfirmasi oleh laporan Jason Schreier dari Bloomberg, mengatakan GTA 6 berlatar di kota fiksi Miami--lanjutan cerita Vice City.\n" +
                    "\n" +
                    "Selain itu, game baru Rockstar ini juga menampilkan karakter utama wanita untuk pertama kalinya.\n" +
                    "\n" +
                    "Walau video tersebut masih sebatas gim dalam pengembangan, tetapi banyak fitur yang sudah berfungsi dan memperlihatkan lebih awal seperti apa game GTA 6.\n" +
                    "\n" +
                    "Adapun bocoran video ini pertama kali muncul di GTAForums, dengan dugaan peretas mencari source code apa pun yang diminta anggota forum tersebut.\n" +
                    "\n" +
                    "Salah satu permintaan terkait dengan kasus pengadilan melibatkan Take-Two, dengan permintaan yang diduga dibuat oleh salah satu terdakwa dalam kasus tersebut.\n" +
                    "\n" +
                    "Informasi, Rockstar Games sudah mengonfirmasi Grand Theft Auto 6 sedang dalam proses pengembangan berdasarkan postingan di blog resmi perusahaan.\n" +
                    "\n" +
                    "Hingga kabar ini marak beredar di internet, baik Rockstar Games dan Take-Two masih belum memberikan komentar terhadap aksi kebocoran tersebut.",
            "Liputan6.com, Jakarta - Blizzard baru saja meluncurkan sekuel dari salah satu game multiplayer shooter populer mereka Overwatch, yaitu Overwatch 2, di mana game ini banyak ditunggu oleh para penggemarnya.\n" +
                    "\n" +
                    "Namun, saat dirilis pada Selasa pekan ini waktu setempat, Overwatch 2 sudah mengalami beberapa masalah, termasuk serangan siber DDoS yang merusak permainan di hari peluncurannya.\n" +
                    "\n" +
                    "\"Sayang sekali kami mengalami serangan DDoS massal di server kami,\" kata Presiden Blizzard Entertainment Mike Ybarra mengonfirmasi serangan tersebut di Twitter.\n" +
                    "\n" +
                    "Dikutip dari Tech Crunch, Kamis (6/10/2022), beberapa pemain yang berhasil masuk ke server mengalami masalah seperti dikeluarkan dari pertandingan, serta ketidakstabilan yang membuat permainan jadi semakin sulit.\n" +
                    "\n" +
                    "Aaron Keller, Game Director Overwatch pun mengungkapkan di hari Rabu, serangan DDoS kedua sedang terjadi dan server masih belum stabil.\n" +
                    "\n" +
                    "Overwatch 2 sendiri dirilis secara free-to-play alias gratis, untuk PlayStation 4, PlayStation 5, Xbox One, Xbox Series X/S, Nintendo Switch, dan PC, serta menawarkan fitur cross-play.\n" +
                    "\n" +
                    "Dengan fitur cross-play, pemain pun dapat saling bertemu dan memainkan game ini dengan pemain lain yang bermain memakai perangkat berbeda.\n" +
                    "\n" +
                    "Ada beberapa perubahan yang dibawa Blizzard di Overwatch 2, yang berbeda dari pendahulunya. Misalnya, tim saat ini terdiri dari lima hero bukan enam, sehingga mengubah komposisi tim pemain.\n" +
                    "\n" +
                    "Meski dapat dimainkan secara gratis, sama seperti game semacam ini yang lain, Blizzard bakal mengharuskan pemain untuk membayar berbagai konten seperti battle pass, maupun kosmetik untuk karakter.\n" +
                    "\n" +
                    "Seiring dengan dirilisnya Overwatch 2, Blizzard pun secara resmi mematikan server Overwatch 1 alias versi aslinya, yang sudah diluncurkan di tahun 2016 lalu.\n" +
                    "\n" +
                    "Mengutip Gamerant, Overwatch menjadi salah satu game tersukses Blizzard saat pertama kali diluncurkan, mendapatkan banyak pujian, penghargaan Game of the Year, serta respon publik yang antusias.\n" +
                    "\n" +
                    "Blizzard mempertahankan para pemain Overwatch dengan terus menghadirkan konten. Namun, minat gamers pada game tersebut tercatat mulai berkurang karena melambatnya karakter, peta, dan mode baru. \n" +
                    "\n" +
                    "Dikutip dari situs battle.net Blizzard, berikut spesifikasi yang dibutuhkan PC apabila kamu berniat untuk memainkan Overwatch 2 di perangkat komputer. Kamu juga dapat mengunduhnya secara gratis di situs battle.net.\n" +
                    "\n" +
                    "Minimal\n" +
                    "\n" +
                    "OS:Windows 10 64-bit\n" +
                    "Prosesor: Intel Core i3 atau AMD Phenom X3 8650\n" +
                    "Video: NVIDIA GeForce GTX 600 series, AMD Radeon HD 7000 series\n" +
                    "Memori: 6 GB RAM\n" +
                    "Penyimpanan: 50 GB\n" +
                    "Resolusi: layar minimal 1024 x 768\n" +
                    "\n" +
                    "Direkomendasikan\n" +
                    "\n" +
                    "OS:Windows 10 64-bit\n" +
                    "Prosesor: Intel Core i7 atau AMD Ryzen 5\n" +
                    "Video: NVIDIA GeForce GTX 1060/GeForce GTX 1650 atau AMD R9 380/AMD RX 6400\n" +
                    "Memori: 8 GB RAM\n" +
                    "Penyimpanan: 50 GB\n" +
                    "Resolusi:layar minimal 1024 x 768",
            "Liputan6.com, Jakarta - Square Enix baru saja mengumumkan akan menutup layanan game mobile battle royale mereka, yaitu Final Fantasy 7 The First Soldier.\n" +
                    "\n" +
                    "Diketahui, game battle royale ini akan disuntik mati atau setop beroperasi pada 11 Januari 2022.\n" +
                    "\n" +
                    "Kabar ini diumumkan lewat postingan di akun Twitter mereka dengan mengatakan, Square Enix tidak dapat memberikan layanan yang diinginkan meskipun merilis konten terkini secara teratur.\n" +
                    "\n" +
                    "Karena hal tersebut, perusahaan berbasis di Jepang itu memutuskan untuk menyetop seluruh layanan game Final Fantasy 7 The First Soldier awal tahun depan.\n" +
                    "\n" +
                    "\"Terlepas dari semua upaya memberikan konten baru secara rutin dan menarik, kami tidak dapat memberikan pengalaman yang diharapkan,\" tulis Square Enix.\n" +
                    "\n" +
                    "\"Karena hal itu, kami harus membuat keputusan sangat sulit untuk mengakhiri layanan Final Fantasy 7 The First Soldier.\"\n" +
                    "\n" +
                    "Informasi, Square Enix pertama kali mengumumkan game battle royale ini pada awal 2021 dan diluncurkan pada 17 November tahun yang sama.\n" +
                    "\n" +
                    "Seperti Free Fire, PUBG Mobile, Apex Legends Mobile, dan CoD Mobile, game milik Square Enix ini memperkenalkan season baru secara rutin.\n" +
                    "\n" +
                    "Bersamaan dengan season baru, pengembang juga menyertakan update atau memperkenalkan fitur baru ke dalam gim.\n" +
                    "\n" +
                    "Di sisi lain, Square Enix mengumumkan kehadiran Final Fantasy 7 Remake bagian kedua dalam live streaming yang digelar beberapa hari lalu. Seri kedua proyek Final Fantasy 7 Remake ini memiliki judul Final Fantasy 7 Rebirth.\n" +
                    "\n" +
                    "Dikutip dari Polygon, Minggu (19/6/2022), game ini akan rilis di PlayStation 5 pada musim dingin tahun depan. Dengan kata lain, game ini kemungkinan akan diluncurkan pada akhir 2023 atau paling lambat awal 2024.\n" +
                    "\n" +
                    "Menurut Square Enix, Final Fantasy 7 Rebirth merupakan bagian kedua dari trilogi yang sedang direncanakan. Namun, judul untuk bagian ketiga dari remake Final Fantasy 7 ini belum diungkap.\n" +
                    "\n" +
                    "\"Final Fantasy VII Rebirth dirancang agar orang-orang dapat menikmati game ini, terlepas dari apakah mereka mengetahui game aslinya atau tidak,\" ujar creative director Tetsuya Nomura saat pengumuman game ini.\n" +
                    "\n" +
                    "Bahkan, menurut Tetsuya, pemain baru bisa menikmati perjalanan mereka dengan kehadiran game ini. Terlebih, Cloud dan teman-temannya memulai perjalanan baru dalam game ini dan kisah setelah meninggalkan Midgar memberi pengalaman baru yang segar bagi para pemain.\n" +
                    "\n" +
                    "Lebih lanjut Tetsuya juga menuturkan, pengembangan game Final Fantasy 7 Rebirth juga berjalan dengan pesat. Game Director Naoki Hamaguchi juga menyebut pengembangan game ini telah memasuki tahap produksi penuh.\n" +
                    "\n" +
                    "Bersama dengan pengumuman ini, Square Enix juga merilis trailer pertama dari Final Fantasy 7 Rebirth. Sebagai informasi, Final Fantasy 7 Remake sendiri rilis pada April 2022, sekitar lima tahun setelah pertama kali diumumkan.\n" +
                    "\n" +
                    "Perlu diketahui, Square Enix telah merilis laporan tentang penjualan salah satu gim paling ditunggu tahun ini, yakni Final Fantasy VII Remake.\n" +
                    "\n" +
                    "Sempat mengalami kendala beberapa kali mengalami kendala, gim Final Fantasy VII Remake resmi dirilis pada 10 April.\n" +
                    "\n" +
                    "Sisi baiknya, gim remake dari seri original yang dirilis pada 1997 itupun langsung ludes di pasaran hanya dalam beberapa hari pertama peluncurannya.\n" +
                    "\n" +
                    "Dikutip dari laporan Square Enix via Gamerant, Kamis (23/4/2020), gim fisik dan digital Final Fantasy VII Remake berhasil terjual lebih dari 3,5 juta kopi hanya dalam tiga hari pertama.\n" +
                    "\n" +
                    "Tampil sebagai gim eksklusif di PlayStation 4 (PS4), angka penjualan Final Fantasy 7 Remake melampaui judul gim PS4 eksklusif sebelumnya, Spider-Man PS4.\n" +
                    "\n" +
                    "Dalam rentang waktu yang sama, Spider-Man di PS4 hanya menjual 3,3 juta kopi secara global.\n" +
                    "\n" +
                    "Angka penjualan untuk penjualan gim di PS4 sepanjang masa ini sebenarnya cukup wajar, mengingat seri Final Fantasy VII Remake ini sudah laman dinanti gamer di berbagai dunia.\n" +
                    "\n" +
                    "Selain ditunggu oleh gamer lawas untuk bernostalgia, pemain baru pun menaruh minat ke dalam gim ini karena hype dan tampilan grafis yang indah.\n" +
                    "\n" +
                    "Berhubung Square Enix akan merilis gim Final Fantasy VII Remake meluncur eksklusif di PS4 selama setahun, tak menutup kemungkinan gim ini akan meraup angka yang lebih tinggi lagi.\n" +
                    "\n" +
                    "Final Fantasy 7 Remake saat ini sudah tersedia di PlayStation 4.\n" +
                    "\n" +
                    "Pada Maret 2021, Sony juga membagikan satu judul gim paling populer tahun lalu buatan Square Enix, yaitu Final Fantasy VII Remake.\n" +
                    "\n" +
                    "Belum satu tahun sejak dirilis pada 10 April 2020, Final Fantasy VII Remake akan menjadi satu judul gim wajib diklaim bagi kamu yang sudah berlangganan PS Plus.\n" +
                    "\n" +
                    "Sayangnya, bagian pertama dari trilogi seri Final Fantasy VII Remake ini tidak dapat di upgrade ke versi PS5 dan memainkan DLC pertama gim yang berjudul FF7 Remake Intergrade.",
            "Liputan6.com, Jakarta - Innersloth, Schell Games, dan Robot Teddy telah mengkonfirmasi bahwa game Among Us VR akan meluncur pada 10 November 2022 di Meta Quest 2 dan Steam.\n" +
                    "\n" +
                    "Sayangnya, dalam pengumuman ini tidak disebutkan soal versi PlayStation VR. Innersloth bahkan belum menginformasikan soal ini.\n" +
                    "\n" +
                    "Seperti dalam versi 2D, Among Us VR mengharuskan pemain untuk mengidentifikasi impostors (penipu) sebelum mereka membunuh seluruh pemain.\n" +
                    "\n" +
                    "Mengutip laman Engadget, Kamis (13/10/2022), penipu sekarang akan lebih mudah menyelinap, dan kamu bisa menggunakan 'ekspresi' tangan ketika menuduh orang lain atau memprotes ketidakbersalahan kamu.\n" +
                    "\n" +
                    "Game Among Us sendiri berkembang sangat pesat saat awal pandemi, menjadi pilihan banyak orang untuk lebih menghibur diri dalam bermain dan terhubung dengan teman-teman yang terisolasi.\n" +
                    "\n" +
                    "Dalam hal ini game VR mungkin bisa dijadikan pilihan untuk bersosialisasi dengan teman-teman di kehidupan virtual.\n" +
                    "\n" +
                    "Dilansir The Verge, sebelumnya trailer dari Among US VR sendiri ditayangkan di Game Awards 2021. Di versi VR ini, pemain nantinya akan bisa merasakan secara langsung menjadi karakter yang dimainkan dalam tampilan 3D. Bukan 2D seperti game aslinya.\n" +
                    "\n" +
                    "Namun, permainan tersebut bakal tetap mempertahankan mekanik utama dari gim multiplayer aslinya, yang dikembangkan oleh Innersloth. \n" +
                    "\n" +
                    "Dalam trailer singkatnya, ditampilkan bahwa pemain akan bermain dalam tampilan first person, untuk melakukan tugas-tugasnya selama match berlangsung.\n" +
                    "\n" +
                    "Di video tersebut, diperlihatkan bahwa pemain yang tengah mengerjakan tugasnya tiba-tiba diserang oleh pemain atau kru lain yang berwarna merah, yang kemungkinan adalah seorang \"impostor.\"\n" +
                    "\n" +
                    "Innersloth, dalam laman resminya, juga mengatakan bahwa versi VR ini akan berbeda dan tidak kompatibel dengan versi aslinya, sehingga pemain di VR hanya akan bisa melawan pemain VR lainnya.\n" +
                    "\n" +
                    "Belum diketahui tanggal rilis resmi untuk versi VR dari Among Us ini. Adaptasi ini sendiri merupakan bagian dari kemitraan dengan firma konsultan Robot Teddy. \n" +
                    "\n" +
                    "Mengutip Engadget, Among Us VR versi beta sendiri beberapa waktu lalu telah membuka pendaftaran beta, sebelumnya direncanakan rilis di akhir tahun 2022.\n" +
                    "\n" +
                    "Versi asli dari Among Us diluncurkan untuk platform PC dan seluler di iOS dan Android, pada 2018, disusul untuk Nintendo Switch di penghujung 2020.\n" +
                    "\n" +
                    "Versi non-VR juga dirilis di Xbox dan PlayStation pada Desember 2021.\n" +
                    "\n" +
                    "Game Among Us terinspirasi dari permainan deduksi sosial seperti Mafia atau Werewolf, di mana sekelompok pemain harus menebak identitas dari ancaman berbahaya yang bersembunyi di tengah-tengah mereka.\n" +
                    "\n" +
                    "Ubisoft sebelumnya juga sempat meluncurkan game serupa untuk platform VR yaitu Werewolves Within di 2016."
    };

    private static final String[] titleGameUnder17 = {
            "YGG SEA Gandeng Universitas untuk Edukasi Game Play to Earn ke Mahasiswa   ",
            "Gantikan Origin, EA Umumkan Kehadiran Aplikasi Baru untuk PC",
            "Turnamen Esports PUBG Mobile Community Series Segera Digelar",
            "Spesifikasi Coral Island, Game Simulasi Terbaru Sudah Early Access"
    };

    private static final String[] authorGameUnder17 = {
            "Iskandar",
            "Agustinus Mario Damar",
            "Yuslianson",
            "Natasa Kumalasah Putri"
    };

    private static final String[] contentGameUnder17 = {
            "Liputan6.com, Jakarta - Yield Guild Games Southeast Asia (YGG SEA), sub-decentralized autonomous organizations (sub-DAO) milik startup game blockchain asal Filipina 'Yield Guild Games', yang berfokus di kawasan Asia Tenggara mengklaim serius melakukan edukasi kepada berbagai kalangan untuk mengenalkan game play to earn (P2E).\n" +
                    "\n" +
                    "Salah satu strategi yang mereka lakukan adalah dengan menggandeng sejumlah universitas di Indonesia. Game P2E sendiri adalah jenis permainan yang memungkinkan penggunanya untuk bermain game sekaligus menghasilkan pendapatan dalam bentuk kripto.\n" +
                    "\n" +
                    "Misalnya, kamu bisa mendapatkan dan menjual skin tertentu. Jika skin-nya langka, kamu bisa menjual atau menukarnya dengan harga tinggi dalam bentuk kripto, lalu dikonversi ke mata uang asli.\n" +
                    "\n" +
                    "Co Founder dan Country Manager YGG SEA di Indonesia, Irene Umar, mengatakan kemitraan ini adalah bentuk dukungan YGG SEA untuk memberikan edukasi kepada stakeholder dan mahasiswa agar bisa merasakan keuntungan dari game play to earn.\n" +
                    "\n" +
                    "Kerja sama ini juga dilakukan untuk meluruskan kesalahpahaman soal kripto dan game yang masih memiliki sentimen negatif di tengah kondisi market yang berubah-ubah.\n" +
                    "\n" +
                    "“Game play to earn bukan hanya soal bermain dan senang-senang, banyak hal yang bisa didapatkan. Dengan kemitraan ini kami berharap anak muda tidak tertinggal lagi seperti esports saat masa awal. Sejauh ini kami juga telah bermitra dengan kampus seperti President University dan Unika Soegijapranata,” kata Irene melalui ketarangannya, Senin (10/10/2022).\n" +
                    "\n" +
                    "Dalam kerja sama ini YGG SEA juga membuka peluang dari berbagai jurusan untuk terlibat, tidak terbatas pada jurusan teknologi, asalkan memiliki minat untuk belajar dan ketertarikan dalam game secara umum.\n" +
                    "\n" +
                    "“Kami menerima universitas dengan senang hati, namun tetap ada persyaratan yang harus dipenuhi, selain secara prodi kami juga membuka kerja sama dengan unit kegiatan mahasiswa yang berfokus pada blockchain atau game,” ucap Irene menambahkan.\n" +
                    "\n" +
                    "Dalam kerja sama ini YGG SEA akan mencoba meningkatkan skill bagi para mahasiswa dengan membuka kesempatan bagi mereka yang ingin menjadi scholar hingga internship di guild game.\n" +
                    "\n" +
                    "Dengan kesempatan ini YGG SEA berharap para mahasiswa bisa menjadi pendorong untuk meningkatkan adopsi di dunia Web 3.0 yang kini sedang ramai dibicarakan, dan disebut-sebut akan jadi peluang karir yang menjanjikan di masa depan.\n" +
                    "\n" +
                    "“Kami ingin sumber daya manusia, utamanya anak muda bisa memiliki skill yang bagus di blockchain. Di sini kami akan mengenalkan mereka lewat game yang menyenangkan dan memberikan akses agar mereka bisa paham,” pungkas Irene.\n" +
                    "\n" +
                    "Sementara itu, YGG SEA diketahui telah memiliki lebih dari 15.000 scholarship yang tersebar di Indonesia, Malaysia, Vietnam, dan Thailand.\n" +
                    "\n" +
                    "Guild game ini juga memiliki lebih dari 50 game play to earn, menjadikannya sebagai guild game dengan pilihan game yang diklaim terbanyak di dunia.",
            "Liputan6.com, Jakarta - EA mengumumkan kehadiran platform baru untuk pemain game besutannya di PC. Apabila sebelumnya para pemain mengenal Origin, kini perusahaan memperkenalkan aplikasi yang diberi nama EA App.\n" +
                    "\n" +
                    "Dalam blog-nya, EA menyebut kehadiran aplikasi ini menjawab umpan balik dan respons yang diberikan para pemain mengenai platform Origin. Karenanya, platform EA App ini diklaim memberikan pengalaman yang lebih cepat, lebih andal, dan lebih mulus.\n" +
                    "\n" +
                    "\"Hari ini, kami dengan senang hati mengumumkan EA App secara resmi meninggalkan fase open beta dan akan segera menggantikan Origin sebagai platform PC utama kami,\" tutur EA dalam blog perusahaan.\n" +
                    "\n" +
                    "Sebagai bagian dari peralihan ini, seperti dikutip dari The Verge, Minggu (9/10/2022), perusahaan akan mengundang para pemain game PC untuk berganti ke platform EA App. Nantinya, seluruh data yang ada di Origin, seperti game, konten, termasuk game yang sudah pernah diinstal akan ikut dipindahkan ke EA App.\n" +
                    "\n" +
                    "Tidak hanya konten, EA memastikan data lain seperti daftar teman juga akan ikut berpindah. Pemain yang tertarik menggunakan aplikasi ini juga tidak perlu menunggu undangan, karena EA App bisa diunduh lewat situs resmi EA.\n" +
                    "\n" +
                    "Kendati demikian, untuk saat ini, EA App hanya ditujukan untuk pemain yang memakai platform PC Windows. Para pemain yang menggunakan perangkat macOS masih akan memakai Origin untuk mengakses koleksi game mereka.\n" +
                    "\n" +
                    "Sebagai informasi, kehadiran EA App sendiri sudah diketahui sejak sekitar dua tahun lalu. Ketika itu, EA memang mengumumkan akan mengganti platform Origin dengan aplikasi baru.\n" +
                    "\n" +
                    "Di sisi lain, Electronics Arts (EA) meluncurkan sistem anti-cheat tingkat kernel baru mereka untuk game-game PC. EA AntiCheat (EAAC), dijadwalkan debut pada musim gugur ini di FIFA 23.\n" +
                    "\n" +
                    "Mengutip laman resmi EA, FIFA 23 juga nantinya akan memiliki fitur cross-play. Di sini, selain melindungi pemain PC, anti-cheat juga melindungi pemain konsol yang bertanding dengan lawan di PC, sehingga terlindungi dari cheater PC.\n" +
                    "\n" +
                    "Sistem anti-cheat ini merupakan sistem khusus yang dikembangkan sendiri oleh pengembang EA. Perusahaan merancang sistem ini untuk melindungi game-game mereka dari gangguan dan kecurangan.\n" +
                    "\n" +
                    "EA menambahkan, mereka tidak akan menambahkan anti-cheat ke setiap game-nya, melainkan menerapkannya berdasarkan kasus per kasus. Elise Murphy, Senior Director, Game Security and Anti-Cheat, EA mengatakan, pembuat cheat di PC semakin berpindah ke kernel.\n" +
                    "\n" +
                    "Menurut Murphy, seperti dikutip dari The Verge, Senin (19/9/2022), mereka pun dinilai perlu memiliki perlindungan mode kernel untuk memastikan permainan yang adil dan menangani pembuat cheat PC di ranah yang sama.\n" +
                    "\n" +
                    "\"Penting bagi kami untuk memastikan bahwa anti-cheat kernel yang disertakan dalam game kami bertindak dengan fokus yang kuat pada privasi dan keamanan gamer kami pengguna PC,\" kata Murphy.\n" +
                    "\n" +
                    "EA mengatakan, perlindungan tingkat kernel sangat penting untuk game kompetitif seperti FIFA 23.\n" +
                    "\n" +
                    "Menurut EA, cheat yang beroperasi di ruang kernel, sehingga game yang berjalan dalam mode pengguna biasa tidak dapat mendeteksi sedang terjadi gangguan atau kecurangan.\n" +
                    "\n" +
                    "Murphy mengatakan, dalam beberapa tahun terakhir, ada peningkatan besar soal cheat dan teknik cheat yang beroperasi dalam mode kernel.\n" +
                    "\n" +
                    "\"Jadi satu-satunya cara yang dapat diandalkan untuk mendeteksi dan memblokir ini adalah dengan mengoperasikan anti-cheat kami di sana juga,\" imbuhnya.\n" +
                    "\n" +
                    "Sistem anti-cheat EA akan berjalan di level kernel dan hanya berjalan saat game dengan perlindungan EAAC sedang dijalankan. Perusahaan menambahkan, proses anti-cheat akan ditutup setelah game selesai.\n" +
                    "\n" +
                    "\"EAAC tidak mengumpulkan informasi apa pun tentang riwayat penelusuran Anda, aplikasi yang tidak terhubung ke game EA, atau apa pun yang tidak terkait langsung dengan perlindungan anti-cheat,\" tegas Murphy. \n" +
                    "\n" +
                    "Sebelumnya, EA juga mengumumkan bahwa The Sims 4 akan menjadi game gratis atau free-to-play mulai bulan Oktober 2022.\n" +
                    "\n" +
                    "\"The Sims 4 akan GRATIS untuk diunduh di PC/Mac dan konsol pada 18 Oktober,\" tulis akun Twitter resmi The Sims 4, seperti dikutip Jumat (16/9/2022).\n" +
                    "\n" +
                    "Sementara itu, pemain yang sudah memiliki base game The Sims 4 sebelum ia menjadi game gratis, punya kesempatan untuk mengklaim Desert Luxe Kit secara gratis mulai tanggal 14 September sampai tanggal 17 Oktober 2022.\n" +
                    "\n" +
                    "Untuk mengklaim konten tambahan ini, pemain cukup login ke dalam game dan mengklaim konten tersebut melalui main menu.\n" +
                    "\n" +
                    "Melalui pengumuman di laman resminya, Electronics Arts (EA), mengatakan bahwa mereka juga akan terus mengembangkan dan merilis packs, kits, dan Sims Delivery Express di masa mendatang.\n" +
                    "\n" +
                    "\"Dengan The Sims 4 akan menjadi gratis, tim kami lebih berdedikasi daripada sebelumnya untuk mengembangkan pengalaman baru dan berarti The Sims 4 untuk pemain kami,\" kata EA.\n" +
                    "\n" +
                    "Perlu diingat, yang akan digratiskan oleh EA adalah base game atau game dasar dari The Sims 4. Untuk berbagai Downloadable Content (DLC) atau Expansion Pack, tetap tersedia terpisah dan membutuhkan pemain untuk mengeluarkan uangnya.",
            "Liputan6.com, Jakarta - PUBG Mobile menjadi salah satu gim battle royale yang populer di dunia, dengan 400 juta pemain aktif secara global dan terus meningkat sebesar 486 persen per Januari 2022.\n" +
                    "\n" +
                    "Dengan jumlah pemain baru PUBG Mobile meningkat secara pesat sebesar 537 persen, wajar bilamana Ultra Voucher menggelar turnamen esports PUBG Mobile.\n" +
                    "\n" +
                    "Bertajuk PUBG Mobile Community Series, Ultra Voucher menginisiasi turnamen ini untuk mendukung tren esports di Indonesia dan agar dapat bersaing dengan negara lainnya di kancah internasional.\n" +
                    "\n" +
                    "\"PUBG Mobile Community Series diharapkan menjadi wadah dalam mengasah keahlian para atlet esport di Indonesia,\" kata Riky Boy Permata selaku Direktur Ultra Voucher dalam keterangannya, Jumat (13/10/2022).\n" +
                    "\n" +
                    "Selain itu, kompetisi ini juga dapat menjadi ajang pemanasan PUBG Mobile Global Championship Tournament yang akan berlangsung pada tahun 2023 mendatang di Indonesia.\n" +
                    "\n" +
                    "“Kami melihat perkembangan dari segmen gaming ini merupakan peluang bagus untuk terus dikembangkan terutama di Indonesia,\" ujarnya.\n" +
                    "\n" +
                    "Adapun pendaftaran PUBG Mobile Community Series telah dibuka sejak awal Oktober 2022, dan bisa diikuti oleh siapa saja dengan usia minimal 17 tahun.\n" +
                    "\n" +
                    "Bagi gamer dan tim yang ingin ikutan turnamen ini, mereka dapat melakukan pendaftaran hanya melalui aplikasi Ultra Voucher yang tersedia di Apple App Store dan Google Play Store.\n" +
                    "\n" +
                    "Ultra Voucher menyebutkan, turnamen esports ini tidak akan dipungut biaya apapun alias gratis dan dapatkan kesempatan untuk memenangkan total hadiah hingga Rp 10 juta.\n" +
                    "\n" +
                    "Melalui segmen gaming, Ultra Voucher berharap dapat menyediakan berbagai macam kebutuhan pembelian dan pembayaran secara digital melalui aplikasi mobile.\n" +
                    "\n" +
                    "“Saat ini, user kami dapat melakukan pembelian untuk Nintendo eShop, Gocash, Roblox, World of Tanks, World of Warships, Steam, Google Play, FIFA, PlayStation Store, dan tentunya PUBG Mobile,\" jelas Riky.\n" +
                    "\n" +
                    "Pastinya, Ultra Voucher akan terus menambah list partner dalam segmen gaming untuk terus memberikan kemudahan kepada pengguna kami dalam menikmati pengalaman bermain game.\n" +
                    "\n" +
                    "Di sisi lain, PUBG Mobile baru-baru ini memperkenalkan sistem anti-cheat baru mereka yang bernama Fog of War, di mana teknologi ini diklaim sukses memangkas jumlah cheater atau pemain curang di game itu.\n" +
                    "\n" +
                    "Menurut Krafton, sistem anti-cheat Fog of War berhasil memberantas separuh jumlah cheater yang memainkan versi mobile dari PUBG: Battlegrounds itu.\n" +
                    "\n" +
                    "Krafton mengatakan, Fog of War adalah \"yang pertama dari jenisnya di game seluler\" dan bekerja dengan membatasi \"informasi game yang diterima pemain\" saat menggunakan x-ray vision atau wall hacks.\n" +
                    "\n" +
                    "Dikutip dari Gamesradar, Selasa (27/9/2022), saat diterapkan secara terbatas hingga saat ini, lobi yang menggunakan sistem anti-cheat menunjukkan cheat x-ray vision berkurang hingga lebih dari 50 persen.\n" +
                    "\n" +
                    "\"Fog of War adalah sistem anti-cheat canggih yang membatasi informasi game yang diterima pemain, mengurangi kemampuan mereka untuk melihat pemain di luar bidang pandang mereka atau menembus dinding dan benda,\" kata Krafton.\n" +
                    "\n" +
                    "Krafton menjelaskan, sistem Fog of War memindah semua bangunan dan medan di map besar PUBG Mobile. Melalui perhitungan internal, sistem lalu menentukan apa yang seharusnya dapat dilihat pemain.\n" +
                    "\n" +
                    "\"Terakhir, hanya informasi spesifik yang dikirim dari server kembali ke pemain. Informasi yang tidak terlihat tidak akan dikirim, menghentikan cheater penglihatan x-ray,\" kata Krafton.\n" +
                    "\n" +
                    "Krafton pun mengungkapkan bakal menggulirkan sistem anti-cheat baru mereka secara bertahap, ke semua mode di PUBG Mobile.\n" +
                    "\n" +
                    "Perusahaan pun menegaskan mereka sama sekali tidak menerima kecurangan dalam PUBG Mobile, sehingga hal ini jadi langkah lain untuk menghentikan pemain menggunakan teknologi yang curang dan tidak adil.\n" +
                    "\n" +
                    "\"Tidak ada yang lebih penting bagi PUBG Mobile selain memastikan pemain memiliki pengalaman yang aman, menyenangkan, dan adil,\" pungkas Krafton.",
            "Liputan6.com, Bandung - Coral Island menjadi gim simulasi terbaru yang dirilis di steam game dengan meluncurkan early access untuk para penggunanya di Steam. Meskipun belum lengkap, beberapa fitur dan konten dalam early access ini sangat menarik untuk dimainkan.\n" +
                    "\n" +
                    "Fiturnya mulai dari beternak, menyelam, memancing, hingga menangkap serangga. Adapun pemain dapat bertani tanaman berdasarkan musimnya yaitu Spring, Summer, Fall, dan Winter.\n" +
                    "\n" +
                    "Pengembang gim tersebut juga berharap agar para pemain early access untuk bisa memberikan masukan-masukan terkait fitur dan gim tersebut agar bisa dimaksimalkan ketika perilisan lengkapnya.\n" +
                    "\n" +
                    "\"Kami ingin mendengar dari Anda! Baik itu feedback tentang fitur atau konten yang ada, ide baru, atau sekedar mengobrol dengan kami. Server Discord kami adalah tempat terbaik untuk terhubung (kami menyediakan pembaruan harian di sana!), tetapi kami juga sering mengunjungi forum Steam dan Twitter,\" tulis keterangan Stairway Games.\n" +
                    "\n" +
                    "Adapun dalam Steam diberitahu kan beberapa fitur dan konten yang akan bisa dimainkan dalam early access adalah seperti berikut:\n" +
                    "\n" +
                    "1. Memperkenalkan diri Anda ke dunia tersebut melalui pencarian alur cerita.\n" +
                    "\n" +
                    "2. Pertanian, peternakan, kerajinan, dan bangun persahabatan melalui sistem hubungan yang komprehensif.\n" +
                    "\n" +
                    "3. Menangkap ikan, serangga, dan mahluk laut bawah laut.\n" +
                    "\n" +
                    "4. Bertemu dengan lebih dari 70 karakter unik dan sebagian besarnya dapat Anda jadikan teman.\n" +
                    "\n" +
                    "5. Tambang di poros bumi dan air di gua.\n" +
                    "\n" +
                    "6. Menyumbangkan barang-barang ke museum.\n" +
                    "\n" +
                    "7. Mendekorasi atau menyesuaikan pemain, rumah, hingga pertanian.\n" +
                    "\n" +
                    "8. Dan masih banyak lagi.\n" +
                    "\n" +
                    "Sedangkan, versi full-nya dirilis ada beberapa konten dan fitur menarik yang dapat dimainkan nantinya seperti berikut:\n" +
                    "\n" +
                    "1. Alur cerita yang telah selesai untuk Coral Three, Pufferfish, dan narasi lainnya yang belum terungkap." +
                    "\n" +
                    "2. Interaksi lengkap dari NPC (peristiwa hati, dialog dinamis)." +
                    "\n" +
                    "3. Pernikahan, kemampuan untuk mempunyai anak dan anak-anak yang tumbuh dewasa." +
                    "\n" +
                    "4. Pakaian NPC untuk berbagai musim yaitu musim semi, musim panas, musim gugur, musim dingin." +
                    "\n" +
                    "5. Pakaian NPC untuk berenang dan festival." +
                    "\n" +
                    "6. Mendesain eksterior rumah." +
                    "\n" +
                    "7. Akan hadir sebanyak 9  festival." +
                    "\n" +
                    "8. Akses menyelam dalam kedalaman 30 m dan 40 m." +
                    "\n" +
                    "9. Akses ke poros angin dan api di gua." +
                    "\n" +
                    "10. 1 bioma baru untuk dibuka dan dijelajahi." +
                    "\n" +
                    "11. NPC dan Kerajaan Merfolk." +
                    "\n" +
                    "12. Hingga kabarnya nanti bisa dimainkan secara multiplayer dan masih banyak lagi."
    };

    //sepakbola
    private static final String[] titleFootball = {
            "Performa Chelsea Fantastis, Graham Potter Masih Tak Luput dari Kritikan",
            "David De Gea Sentil Penyerang MU Usai Kalahkan Omonia",
            "Pengakuan Xavi: Barcelona Tidak Pantas Lolos ke 16 Besar Liga Champions!",
            "Kylian Mbappe si Bos Kecil PSG: Bertahan Demi Uang, Pamer Ego, dan Sekarang Ingin Pergi?"
    };

    private static final String[] authorFootball = {
            "Ari Prayoga",
            "Serafin Unus Pasi",
            "Asad Arifin",
            "Richard Andreas"
    };

    private static final String[] contentFootball = {
            "Bola.net - Penampilan impresif Chelsea belakangan ini rupanya tak membuat sang manajer anyar, Graham Potter aman dari kritikan. Potter kini mendapat kritik tajam dari Michael Ballack.\n" +
                    "\n" +
                    "Sejak ditunjuk menggantikan Thomas Tuchel, Potter sejauh ini sudah memimpin Chelsea dalam lima pertandingan. Hasilnya luar biasa, The Blues meraih empat kemenangan dari satu hasil imbang.\n" +
                    "\n" +
                    "Sejak ditunjuk menggantikan Thomas Tuchel, Potter sejauh ini sudah memimpin Chelsea dalam lima pertandingan. Hasilnya luar biasa, The Blues meraih empat kemenangan dari satu hasil imbang.\n" +
                    "\n" +
                    "Terlepas dari hasil fantastis tersebut, Potter tetap dikritik terkait Kai Havertz. Ballack menilai Potter memainkan Havertz tak sesuai dengan posisi yang seharusnya.\n" +
                    "\n" +
                    "“Kai telah membuktikan - bahkan sebelumnya bersama Chelsea - bahwa dia bisa mengisi peran striker dengan baik,\" ujar Ballack kepada Bild.\n" +
                    "\n" +
                    "“Sayang sekali, karena saya melihatnya dalam sistem yang ideal untuknya di belakang striker. Di sana dia bisa memanfaatkan kualitasnya dengan lebih baik,\" imbuhnya.\n" +
                    "\n" +
                    "Ballack menilai bahwa keputusan untuk memberikan peran striker kepada Havertz adalah keputusan yang kurang tepat.\n" +
                    "\n" +
                    "“Itu berarti Havertz mungkin tidak akan bersinar sebanyak yang dia lakukan di belakang pemain top,\" tutur Ballack.\n" +
                    "\n" +
                    "\"Anda harus tahu itu dan itu harus dikomunikasikan oleh pelatih bahwa dia akan membantu dalam serangan.\"",
            "Bola.net - Kiper Manchester United, David De Gea memberikan kritikan kepada para penyerang Manchester United. Ia menilai lini serang Setan Merah seharusnya bisa lebih tajam dan tidak buang-buang peluang.\n" +
                    "\n" +
                    "Kritikan ini disampaikan De Gea setelah pertandingan melawan Omonia Nicosia pada dini hari tadi. Pada laga itu, United memang keluar sebagai pemenang dengan skor 1-0.\n" +
                    "\n" +
                    "Di laga itu, United membuat total 34 tembakan, di mana 12 tembakan mereka tepat sasaran. Namun dari 12 tembakan itu, Setan Merah hanya mampu membuat satu gol saja.\n" +
                    "\n" +
                    "De Gea menilai MU tidak boleh buang-buang peluang seperti itu. \"Saya rasa kami harus lebih tajam dalam memanfaatkan peluang yang kami dapatkan,\" buka De Gea kepada MUTV.\n" +
                    "\n" +
                    "De Gea sendiri lega timnya bisa meraih kemenangan di laga ini. Ia menyebut timnya menunjukkan mental baja dan tidak menyerah meski peluang-peluang mereka tidak kunjung berbuah gol.\n" +
                    "\n" +
                    "\"Kami seharusnya bisa mencetak lebih banyak gol. Kami bisa mengakhiri laga ini dengan skor 3 atau 4-0, namun kami terus menyia-nyiakan peluang kami,\" sambung De Gea.\n" +
                    "\n" +
                    "\"Namun untungnya kami tidak menyerah begitu saja. Kami terus berjuang hingga akhir dan kami akhirnya bisa membuat gol.\"\n" +
                    "\n" +
                    "Pada kesempatan ini De Gea memberikan pujian kepada Scott McTominay.\n" +
                    "\n" +
                    "Ia menyebut tanpa kehadiran sang gelandang, Manchester United akan kehilangan poin melawan Omonia.\n" +
                    "\n" +
                    "\"Scott membuat gol yang luar biasa hari ini. Gol itu membuat kami memenangkan tiga poin di hari ini,\" imbuhnya.",
            "Bola.net - Xavi mengakui Barcelona tidak pantas lolos ke babak 16 Besar Liga Champions 2022/2023. Salah satu alasannya adalah mereka gagal menang pada duel melawan Inter Milan di kandang sendiri.\n" +
                    "\n" +
                    "Barcelona menjamu Inter pada matchday keempat Grup C Liga Champions 2022/2023, Kamis (13/10/2022) malam WIB. Pada duel yang dimainkan di Camp Nou itu, Barcelona harus puas dengan skor 3-3.\n" +
                    "\n" +
                    "Tambahan satu poin membuat Barcelona tertahan di posisi ketiga klasemen Grup C dengan empat poin. Barcelona tertinggal tiga poin dan kalah head to head dari Inter Milan yang berada di posisi kedua klasemen.\n" +
                    "\n" +
                    "Bayern Munchen sudah pasti lolos ke babak 16 Besar. Inter akan lolos jika menang lawan Viktoria Plzen pada matchday ke-5. Lantas, bagaimana Barcelona? Simak di bawah ini ya Bolaneters.\n" +
                    "\n" +
                    "Di atas kertas, Barcelona masih punya peluang lolos ke babak 16 Besar. Xavi akan memperjuangkan peluang tersebut. Akan tetapi, Xavi juga tidak menampik bahwa timnya tidak layak lolos jika melihat performanya.\n" +
                    "\n" +
                    "\"Kami mencoba melawan Inter Milan dengan karakter, tetapi jika Anda tidak bisa mengalahkan Inter Milan di kandang, Anda tidak pantas untuk lolos di Liga Champions,\" ucap Xavi.\n" +
                    "\n" +
                    "Menurut Xavi, ada beberapa alasan yang membuat Barcelona hanya bermain imbang melawan Inter. Salah satunya adalah terlalu banyak kesalahan yang membuat Inter mampu mencetak gol.\n" +
                    "\n" +
                    "\"Pada babak kedua, kami membuat terlalu banyak kesalahan. Dimulai dari salah satu gol pertama mereka yang membuat kepala kami tertunduk. Ada kesalahan pada gol kedua juga,\" tegasnya.\n" +
                    "\n" +
                    "Performa Barcelona di Liga Champions amat kontras dengan performa di La Liga. Saat ini, Barcelona berada di puncak klasemen La Liga dengan 22 poin. Barcelona belum pernah kalah dari delapan laga yang dimainkan.\n" +
                    "\n" +
                    "Di La Liga, Barcelona juga mencetak 20 gol dan baru kebobolan satu kali. Catatan ini sangat kontras jika dibanding dengan yang terjadi di Liga Champions.\n" +
                    "\n" +
                    "\"Ini pukulan berat bagi kami, kata yang tepat adalah kejam. Kami harus fokus di liga, di mana kami ingin tetap berada di puncak,\" ucap Xavi.",
            "Bola.net - Gosip miring soal Kylian Mbappe sepertinya tidak pernah benar-benar reda. Teranyar, disebutkan bahwa Mbappe tidak bahagia dan ingin meninggalkan PSG.\n" +
                    "\n" +
                    "Kabar ini muncul ke permukaan pada Selasa (11/10/2022) lalu. Sepertinya Mbappe masih kesal dengan pertandingan PSG vs Reims akhir pekan lalu yang berakhir dengan skor 1-1.\n" +
                    "\n" +
                    "Usai laga tersebut, Mbappe mengutarakan ketidaksukaannya di media sosial. Dia terang-terangan mengkritik taktik Christophe Galtier untuk lini serang PSG.\n" +
                    "\n" +
                    "Gosip kepergian Mbappe ini jelas mengejutkan. Pasalnya, baru beberapa bulan lalu isu transfer Mbappe jadi salah satu sajian utama di bursa transfer. Real Madrid berusaha merekrutnya.\n" +
                    "\n" +
                    "Namun, setelah polemik panjang, Mbappe memutuskan bertahan dan meneken kontrak baru di PSG. Dia menunjukkan komitmen untuk tim Prancis tersebut dan memilih menolak Madrid.\n" +
                    "\n" +
                    "Kabarnya, ada klausul-klausul khusus dalam kontrak baru Mbappe tersebut, inilah yang jadi potensi masalah. Disebutkan bahwa PSG memberikan privilese ekstra untuk Mbappe, termasuk soal membangun skuad.\n" +
                    "\n" +
                    "Masalahnya, setelah beberapa bulan berjalan, Mbappe sepertinya tidak mendapatkan kewenangan ekstra yang dijanjikan. Dia mulai frustrasi dengan situasi dalam tim, karena itulah muncul gosip bakal hengkang.\n" +
                    "\n" +
                    "Situasi Mbappe semakin parah seiring dengan berjalannya musim. Dia dianggap sebagai pemain yang terlalu egois, semaunya sendiri, dan sok ikut mengatur gaya main dan taktik tim.\n" +
                    "\n" +
                    "Singkatnya, gosip miring yang menerpa Mbappe terus memburuk seiring musim berjalan. Dia memulai musim ini dengan isu kontrak istimewa. Lalu ditambah dengan gosip bahwa Mbappe ingin pihak klub melepas Neymar.\n" +
                    "\n" +
                    "Belum sempat gosip itu reda, Mbappe membuatnya lebih buruk dengan sikapnya di lapangan. Dia tampak egois, semaunya sendiri, dan memaksa rekan-rekan untuk meladeninya.\n" +
                    "\n" +
                    "Puncaknya, Mbappe mengkritik taktik pelatih secara terang-terangan di media sosial. Sikap Mbappe yang satu ini mungkin sudah kelewat batas bagi pihak klub.\n" +
                    "\n" +
                    "Gosip kepergian Mbappe yang terbaru menyebut bahwa dia bakal mencoba meninggalkan klub pada Januari 2023 nanti. Namun, pihak PSG dengan cepat meredam gosip tersebut.\n" +
                    "\n" +
                    "Luis Campos selaku sporting director menegaskan bahwa: \"Saya ingin membantah dengan tegas, dia [Mbappe] tidak bicara dengan saya atau presiden klub soal keinginan pergi pada Januari nanti.\"\n" +
                    "\n" +
                    "\"Pertanyaan itu tidak pernah muncul dan kami tidak pernah membicarakannya. Memang ada rumor setiap hari dan kita tidak bisa terus membicarakannya. Namun, kabar kali ini terbilang serius,\" tutupnya.\n"
    };

    private static final String[] titleFootballUnder17 = {
            "Jadi Pahlawan Kemenangan MU, Erik Ten Hag Sanjung Habis Scott McTominay",
            "Lewandowski: Benzema Favorit Menang Ballon d'Or, jika Tak Dibatalkan",
            "Arsenal dalam 12 Laga: Anti Raih Hasil Imbang!",
            "Begini Cara Agar Romelu Lukaku Bisa Sukses di Chelsea Setelah Kembali dari Inter Milan"
    };

    private static final String[] authorFootballUnder17 = {
            "Serafin Unus Pasi",
            "Aga Deta",
            "Asad Arifin",
            "Aga Deta"
    };

    private static final String[] contentFootballUnder17 = {
            "Bola.net - Manajer Manchester United, Erik Ten Hag memberikan pujian besar kepada Scott McTominay. Ia menilai sang gelandang benar-benar berjasa atas kemenangan Setan Merah melawan Omonia Nicosia.\n"
                    + "\n" +
                    "Dini hari tadi, Manchester United memainkan pertandingan keempat grup E Liga Europa 2022/23. Di laga ini, McTominay dicadangkan oleh Erik Ten Hag, di mana sang manajer memainkan Casemiro dan Fred di lini tengah MU.\n"
                    + "\n" +
                    "Ten Hag menyebut bahwa ia memang sengaja mencadangkan McTominay di laga ini. Ia menilai sang geladnang butuh waktu istirahat setelah terus menerus bermain di timnya.\n"
                    + "\n" +
                    "Namun Ten Hag senang karena pemain timnas Skotlandia itu mampu menjadi pembeda bagi timnya ketika mereka membutuhkannya.\n"
                    + "\n" +
                    "\"Dia bermain dengan sangat baik di tim kami. Adanya Casemiro membuat kami bisa memberinya waktu istirahat, namun ia masuk sebagai pemain pengganti dan melakukan pekerjaan yang fantastis,\" lanjut Ten Hag.",
            "Bola.net - Striker Barcelona Robert Lewandowski menyebut penyerang Real Madrid Karim Benzema sebagai calon kuat peraih Ballon d'Or 2022.\n"
                    + "\n" +
                    "Benzema menjalani musim 2021-22 dengan penampilan yang sangat luar biasa. Benzema tampil tajam dengan mencetak 44 gol dalam 46 penampilan di berbagai kompetisi.\n"
                    + "\n" +
                    "Striker Prancis tersebut membawa Real Madrid meraih gelar Liga Champions dan La Liga. Benzema juga menjadi pencetak gol terbanyak di kedua kompetisi tersebut.\n"
                    + "\n" +
                    "Lewandowski menyebut Benzema sebagai favorit kuat memenangi Ballon d'Or 2022. Namun, Lewandowski juga turut menyindir penghargaan prestisius tersebut.\n"
                    + "\n" +
                    "\"Dia mungkin salah satu favorit untuk memenangkan Ballon d'Or,\" kata Lewandowski kepada Movistar Plus.\n"
                    + "\n" +
                    "\"Tentu saja jika mereka tidak membatalkannya, maka mungkin dia akan memenangkan Ballon d'Or ini, ya.\"",
            "Bola.net - Arsenal melanjutkan performa apiknya pada musim 2022/2023 saat berjumpa Bodo/Glimt. Pada matchday ke-4 Grup A Liga Europa 2022/2023 itu, The Gunners menang dengan skor 1-0.\n"
                    + "\n" +
                    "Bermain di Stadion Aspmyra, Kamis (14/10/2022) malam WIB, Arsenal mendapat perlawanan sengit dari tuan rumah. Laga berjalan cukup berimbang tetapi Arsenal menang berkat gol dari Bukayo Saka.\n"
                    + "\n" +
                    "Hasil ini membawa Arsenal berada di puncak klasemen Grup A dengan sembilan poin. Arsenal belum lolos ke babak gugur, akan tetapi peluang mereka sangat besar. Arsenal masih punya tiga laga tersisa, termasuk laga tunda lawan PSV.\n"
                    + "\n" +
                    "Di Liga Europa, Arsenal harus menjadi juara grup jika ingin lolos langsung ke babak 16 Besar. Sementara, jika menjadi runner-up, Arsenal akan memainkan babak play-off dan berjumpa peringkat ketiga fase grup Liga Champions.\n"
                    + "\n" +
                    "Termasuk laga melawan Bodo/Glimt, Arsenal telah memainkan 12 laga pada musim 2022/2023. Sejauh ini, hasil yang didapat pasukan Mikel Arteta cukup bagus. Arsenal punya catatan kemenangan yang fantastis.\n" +
                    "\n" +
                    "Arsenal meraih 11 kemenangan dari 12 laga yang dimainkan. The Gunners hanya sekali gagal menang yakni ketika kalah dari Manchester United dengan skor 3-1 di Old Trafford. Jadi, dari 12 laga yang dimainkan, Arsenal tidak pernah bermain imbang.\n" +
                    "\n" +
                    "Catatan statistik Arsenal juga cukup bagus. Pada 12 laga yang dimainkan, Gabriel Jesus dan kolega mampu mencetak 29 gol. Artinya, rata-rata mereka mencetak lebih dari dua gol laga.\n" +
                    "\n" +
                    "Arsenal juga dalam performa bagus di lini belakang. Arsenal baru kebobolan 11 kali dari 12 laga yang dimainkan. Mereka mencatatkan lima laga tanpa kebobolan alias cleansheet.\n" +
                    "\n" +
                    "Arsenal memang telah disusun dengan matang. Musim lalu, ketika kondisi tim sulit, mereka tidak begitu saja mendepak Mikel Arteta. Arsenal telah menyusun rencana yang sangat jelas dengan Edu dan Arteta sebagai kunci.\n" +
                    "\n" +
                    "Lalu, setiap bursa transfer dibuka, mereka memperbaiki skuad secara bertahap. Hasilnya, musim ini Arsenal punya kedalaman skuad yang bagus dan itu dibentuk secara kolektif.\n" +
                    "\n" +
                    "Gabriel Jesus memang memainkan peran penting di lini depan. Namun, ada Martinelli, Saka, hingga Odegaard yang meringankan bebannya. Granit Xhaka, Ben Whites, hingga William Saliba juga bermain sangat bagus pada periode ini.\n" +
                    "\n" +
                    "Sumber: Squawka",
            "Bola.net - Mantan pemain Liverpool Glen Johnson menjelaskan bagaimana agar Romelu Lukaku bisa sukses di Chelsea saat kembali dari masa peminjamannya di Inter Milan.\n" +
                    "\n" +
                    "Di tahun 2021 kemarin, Chelsea membuat keputusan besar. Mereka menebus Romelu Lukaku dari Inter Milan dengan harga yang sangat mahal.\n" +
                    "\n" +
                    "Namun, striker asal Belgia tersebut gagal bersinar bersama Chelsea. Dia hanya mencetak delapan gol pada ajang Premier League 2021/22.\n" +
                    "\n" +
                    "Baru semusim di Chelsea, Lukaku memutuskan cabut. Pada musim ini, Lukaku memutuskan untuk kembali ke Inter dengan status pemain pinjaman.\n" +
                    "\n" +
                    "Sang striker sendiri masa peminjamannya hanya satu musim. Alhasil Lukaku harus kembali ke Chelsea pada musim depan.\n" +
                    "\n" +
                    "Menurut laporan, Graham Potter ingin bekerja sama dengan Lukaku pada musim depan. Namun, Glen Johnson menilai tidak mudah bagi Lukaku untuk membangkitkan kariernya di Stamford Bridge.\n" +
                    "\n" +
                    "“Sangat sulit untuk melihat bagaimana dia bisa menyelamatkan kariernya di Chelsea saat ini,\" kata Johnson kepada Bettingodds.\n" +
                    "\n" +
                    "\"Dia jelas pemain yang bagus tetapi kiprahnya baru-baru ini di klub itu mengerikan, seperti yang kita semua tahu.\"\n" +
                    "\n" +
                    "Johnson menilai Lukaku masih bisa menunjukkan performa terbaiknya di Chelsea. Dia pun memberitahu caranya.\n" +
                    "\n" +
                    "\"Saya pikir dia bisa sukses jika dia bisa kembali melakukan yang terbaik dan berhenti bergerak ke sayap dan mencoba menggiring bola melewati semua orang. Itu bukan permainannya,\" lanjutnya.\n" +
                    "\n" +
                    "\"Jika Anda adalah manajernya, maka Anda ingin dia tetap di tengah dan tidak bergerak karena dia bukan pesepakbola yang bisa masuk ke celah, membuat orang-orang berputar dan membawa orang lain bermain.\n" +
                    "\n" +
                    "\"Dia hanya pemain yang bisa mencetak gol. Jika dia tetap pada apa yang dia kuasai maka dia bisa sukses di Stamford Bridge.”",
    };
//getter untuk setiap kategori
//    static ArrayList<Berita> getListDataMovies() {
//        ArrayList<Berita> list = new ArrayList<>();
//        for (int position = 0; position < titleMovie.length; position++) {
//            Berita berita = new Berita();
//            berita.setJudul(titleMovie[position]);
////            berita.setAuthor(authorMovie[position]);
//            berita.setIsi(contentMovie[position]);
//            list.add(berita);
//        }
//        return list;
//    }
//
//    static ArrayList<Berita> getListDataMoviesUnder17() {
//        ArrayList<Berita> list = new ArrayList<>();
//        for (int position = 0; position < titleMovieUnder17.length; position++) {
//            Berita berita = new Berita();
//            berita.setJudul(titleMovieUnder17[position]);
////            berita.setAuthor(authorMovieUnder17[position]);
//            berita.setIsi(contentMovieUnder17[position]);
//            list.add(berita);
//        }
//        return list;
//    }
//
//    static ArrayList<Berita> getListDataGame() {
//        ArrayList<Berita> list = new ArrayList<>();
//        for (int position = 0; position < titleGame.length; position++) {
//            Berita berita = new Berita();
//            berita.setJudul(titleGame[position]);
////            berita.setAuthor(authorGame[position]);
//            berita.setIsi(contentGame[position]);
//            list.add(berita);
//        }
//        return list;
//    }
//
//    static ArrayList<Berita> getListDataGameUnder17() {
//        ArrayList<Berita> list = new ArrayList<>();
//        for (int position = 0; position < titleGameUnder17.length; position++) {
//            Berita berita = new Berita();
//            berita.setJudul(titleGameUnder17[position]);
////            berita.setAuthor(authorGameUnder17[position]);
//            berita.setIsi(contentGameUnder17[position]);
//            list.add(berita);
//        }
//        return list;
//    }
//
//    static ArrayList<Berita> getListDataFootball() {
//        ArrayList<Berita> list = new ArrayList<>();
//        for (int position = 0; position < titleFootball.length; position++) {
//            Berita berita = new Berita();
//            berita.setJudul(titleFootball[position]);
////            berita.setAuthor(authorFootball[position]);
//            berita.setIsi(contentFootball[position]);
//            list.add(berita);
//        }
//        return list;
//    }
//
//    static ArrayList<Berita> getListDataFootballUnder17() {
//        ArrayList<Berita> list = new ArrayList<>();
//        for (int position = 0; position < titleFootballUnder17.length; position++) {
//            Berita berita = new Berita();
//            berita.setJudul(titleFootballUnder17[position]);
////            berita.setAuthor(authorFootballUnder17[position]);
//            berita.setIsi(contentFootballUnder17[position]);
//            list.add(berita);
//        }
//        return list;
//    }
}
