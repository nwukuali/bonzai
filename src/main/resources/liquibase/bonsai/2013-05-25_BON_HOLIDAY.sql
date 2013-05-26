DROP TABLE IF EXISTS `BON_HOLIDAY_T`;
CREATE TABLE `BON_HOLIDAY_T` (
  `ID` bigint(19) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) NULL,
  `DATE` datetime NULL,
  `TYPE` varchar(10) NULL,
  `DESCR` varchar(1000) NULL,
  PRIMARY KEY (`ID`)
)