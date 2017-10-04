-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1:3306
-- Время создания: Окт 04 2017 г., 18:09
-- Версия сервера: 5.7.19
-- Версия PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `test_db`
--

-- --------------------------------------------------------

--
-- Структура таблицы `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
CREATE TABLE IF NOT EXISTS `suppliers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_reg` date DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(120) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(64) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `phone` (`phone`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `suppliers`
--

INSERT INTO `suppliers` (`id`, `date_reg`, `name`, `address`, `phone`, `email`) VALUES
(1, '2017-10-03', 'могилевский', 'могилев', '+375222', 'mog@mail.ru'),
(4, '2017-08-02', 'чаусский', 'чаусы', NULL, 'chaus@mail.ru'),
(3, '2017-09-27', 'кличевский', 'кличев,12', NULL, 'klich@tut.by'),
(5, '2017-08-11', 'бобруйский', 'бобруйск', NULL, 'bobr@mail.ru'),
(6, '2017-08-13', 'чериковский', 'чериков,3', NULL, 'cherik@yandex.ru'),
(7, '2017-09-13', 'кричевский', 'кричев,8', NULL, 'krich@yandex.ru'),
(11, '2017-09-28', 'belynichskiy', 'belynichi,4', '802434', 'belynich@tut.by');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
