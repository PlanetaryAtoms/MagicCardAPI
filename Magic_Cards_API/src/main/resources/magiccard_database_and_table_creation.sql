CREATE DATABASE  IF NOT EXISTS `magic_cards_registry`;
USE `magic_cards_registry`;
--
-- 
--
DROP TABLE IF EXISTS `magic_card`;
CREATE TABLE `magic_card` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `magic_card_name` varchar(45) DEFAULT NULL,
  `magic_card_type` varchar(20) DEFAULT NULL,
  `magic_card_description` varchar(500) DEFAULT NULL,
  `magic_card_color` varchar(10) DEFAULT NULL,
  `magic_card_rarity` varchar(15) DEFAULT NULL,
  `magic_card_price` varchar(5) DEFAULT NULL,
  `magic_card_level` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `magic_card` VALUES 
(1,'Air Elemental', 'Creature-Elemental', 
'Flying - These spirits of the air winsome and wild, and cannot be truly contained. Only marginally intelligent, they often substitute whimsy for strategy, delighting  in mischief and mayhem.',
 'Blue', 'Uncommon', '0.28', '8')