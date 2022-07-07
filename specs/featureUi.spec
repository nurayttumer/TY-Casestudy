Specification Heading
=====================

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
Scenario 1-1 Success Login
----------------
* Kullanıcı "https://www.trendyol.com/" sitesini ziyaret eder
* Giriş yap butonuna tıklanır.
* Email alanına "tnttestautomation@gmail.com", şifre alanına "tnt123123" yazılır.
* Email ve password girildikten sonra giriş yap butonuna tıklanır.
* Başarılı şekilde giriş yapıldığı görülür.

Scenario 1-2 Wrong Mail Case
-----------------
* Kullanıcı "https://www.trendyol.com/" sitesini ziyaret eder
* Giriş yap butonuna tıklanır.
* Email alanına "ytnttestautomation@gmail.com", şifre alanına "tnt123123" yazılır.
* Email ve password girildikten sonra giriş yap butonuna tıklanır.
* "Hatalı" Uyarı mesajı çıktığı görülür.

Scenario 1-3 Wrong Password Case
-----------------
* Kullanıcı "https://www.trendyol.com/" sitesini ziyaret eder
* Giriş yap butonuna tıklanır.
* Email alanına "tnttestautomation@gmail.com", şifre alanına "ytnt123123" yazılır.
* Email ve password girildikten sonra giriş yap butonuna tıklanır.
* "Hatalı" Uyarı mesajı çıktığı görülür.

Scenario 1-4 Invalid Mail Case
-----------------
* Kullanıcı "https://www.trendyol.com/" sitesini ziyaret eder
* Giriş yap butonuna tıklanır.
* Email alanına "ytnttestautomation", şifre alanına "tnt123123" yazılır.
* Email ve password girildikten sonra giriş yap butonuna tıklanır.
* "Geçersiz Mail" Uyarı mesajı çıktığı görülür.

Scenario 1-5 Invalid Password Case
-----------------
* Kullanıcı "https://www.trendyol.com/" sitesini ziyaret eder
* Giriş yap butonuna tıklanır.
* Email alanına "tnttestautomation@gmail.com", şifre alanına "" yazılır.
* Email ve password girildikten sonra giriş yap butonuna tıklanır.
* "Geçersiz Şifre" Uyarı mesajı çıktığı görülür.

Scenario 1-6 Case Of Password Seeing Event
-----------------------------
* Kullanıcı "https://www.trendyol.com/" sitesini ziyaret eder
* Giriş yap butonuna tıklanır.
* Email alanına "tnttestautomation@gmail.com", şifre alanına "tnt123123" yazılır.
* Şifrenin gizli olduğu kontrol edilir.
* Göze tıklanır.
* Şifrenin görünür olduğu kontrol edilir.

Scenario 2-1 Filtering Control
--------------------------------
* Kullanıcı "https://www.trendyol.com/" sitesini ziyaret eder
* Giriş yap butonuna tıklanır.
* Email alanına "tnttestautomation@gmail.com", şifre alanına "tnt123123" yazılır.
* Email ve password girildikten sonra giriş yap butonuna tıklanır.
* Başarılı şekilde giriş yapıldığı görülür.
* Search alanına "Oyuncu Bilgisayarı" yazılır.
* Filtreleme de Marka alanında Monster seçilir
* "Monster" ürünlerinin geldiği görülür.
* Filtreleme de fiyat Filtresinde min "3000" max "10000" seçilir.
* İstenilen bir ürün sepete atılır
* Sepete tıklanır.
* "Ürün Detaydan" eklenen ürünün sepette eklendiği kontrol edilir.
* Sepetteki ürün silinir.

Scenario 2-2 Favorite Control
--------------------------------
* Kullanıcı "https://www.trendyol.com/" sitesini ziyaret eder
* Giriş yap butonuna tıklanır.
* Email alanına "tnttestautomation@gmail.com", şifre alanına "tnt123123" yazılır.
* Email ve password girildikten sonra giriş yap butonuna tıklanır.
* Başarılı şekilde giriş yapıldığı görülür.
* Search alanına "Gömlek" yazılır.
* İstenilen bir ürün favorilere eklenir.
* Favorilere tıklanır.
* "Ürün Detaydan" favorilere eklenen ürünün eklendiği kontrol edilir.
* Favorilerdeki ürün sepete eklenir.
* Sepete tıklanır.
* "Favorilerden" eklenen ürünün sepette eklendiği kontrol edilir.
* Sepetteki ürün silinir.
* Favorilere tıklanır.
* Favorilerdeki ürün silinir.

Scenario 3-1 Checking the Accuracy of Product and Product Images
----------------------------------------------------------------
* Kullanıcı "https://www.trendyol.com/" sitesini ziyaret eder
* Componentlerde ki ürünlerin varlığı ve fotoğraflarının kırık olmadığı doğrulanır.
