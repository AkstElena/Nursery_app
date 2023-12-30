### ЗАДАНИЕ

1. Используя команду cat в терминале операционной системы Linux, создать два файла: Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).
   ![cкрин1](/Linux_scrin/1.1.png)
   ![cкрин2](/Linux_scrin/1.2.png)

2. Создать директорию, переместить файл туда.
   ![cкрин3](/Linux_scrin/2.png)

3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория
   ![cкрин4](/Linux_scrin/3.1.png)
   ![cкрин5](/Linux_scrin/3.2.png)
   ![cкрин6](/Linux_scrin/3.3.png)
   ![cкрин7](/Linux_scrin/3.4.png)

4. Установить и удалить deb-пакет с помощью dpkg.
   ![cкрин8](/Linux_scrin/4.png)

5. Выложить историю команд в терминале ubuntu:

````cat > Pets
cat > PackAnimals
cat Pets PackAnimals > NewFile
cat NewFile
mv NewFile HumanFriends
cat HumanFriends

mkdir ControlWork
mv HumanFriends ControlWork/
cd ControlWork/

sudo wget -c https://dev.mysql.com/get/mysql-apt-config_0.8.29-1_all.deb
sudo dpkg -i mysql-apt-config_0.8.29-1_all.deb
sudo apt-get update
sudo apt-get install mysql-server

sudo dpkg -i ./Загрузки/Yandex.deb
sudo dpkg -r yandex-browser-beta```
````
