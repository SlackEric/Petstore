DROP TABLE IF EXISTS `test`.`users`;

CREATE TABLE `test`.`users` (
  `id` INT NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `firstName` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  `password` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NULL,
  `userStatus` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);


INSERT INTO `test`.`users` (`id`, `username`, `firstName`, `lastName`, `email`, `password`, `phone`, `userStatus`) VALUES ('123', 'John123', 'John', 'Smith', 'john.smith@gmail.com', 'ExtY897Uit', '0415567819', '2');
INSERT INTO `test`.`users` (`id`, `username`, `firstName`, `lastName`, `email`, `password`, `phone`, `userStatus`) VALUES ('234', 'Jack234', 'Jack', 'Richardson', 'jack.richardson@gmail.com', 'nBtY896RT', '0434590678', '3');
