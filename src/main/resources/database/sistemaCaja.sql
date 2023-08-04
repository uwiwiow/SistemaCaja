-- Table structure for table `alumno`
CREATE TABLE IF NOT EXISTS `alumno` (
  `noControl` INT NOT NULL,
  `nombre` VARCHAR(25) DEFAULT NULL,
  `apeP` VARCHAR(25) DEFAULT NULL,
  `apeM` VARCHAR(25) DEFAULT NULL,
  PRIMARY KEY (`noControl`)
);

-- Table structure for table `prorroga`
CREATE TABLE IF NOT EXISTS `prorroga` (
  `idProrroga` INT AUTO_INCREMENT NOT NULL,
  `semestrePorPagar` VARCHAR(8) DEFAULT NULL,
  `fechaPedido` DATE DEFAULT NULL,
  `fechaLiq` DATE DEFAULT NULL,
  `totalPorPagar` INT DEFAULT NULL,
  `totalPagado` INT DEFAULT NULL,
  `restoPorPagar` INT DEFAULT NULL,
  `noControl` INT NOT NULL,
  `concepto` VARCHAR(80) DEFAULT NULL,
  PRIMARY KEY (`idProrroga`),
  FOREIGN KEY (`noControl`) REFERENCES `alumno` (`noControl`)
);

-- Table structure for table `pago`
CREATE TABLE IF NOT EXISTS `pago` (
  `idPago` INT NOT NULL,
  `abonoPago` INT DEFAULT NULL,
  `numeroPago` INT DEFAULT NULL,
  `fechaPago` DATE DEFAULT NULL,
  `idProrroga` INT NOT NULL,
  PRIMARY KEY (`idPago`),
  FOREIGN KEY (`idProrroga`) REFERENCES `prorroga` (`idProrroga`)
);