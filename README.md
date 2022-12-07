
# Domotic DSL

[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://github.com/add-le/ftp-server/blob/master/LICENSE)
[![Language Java](https://img.shields.io/badge/Language-java-blue)](https://www.java.com/fr/)

A DSL project for a domotic environment that create Java runtime code.

## Features

- Create a Java code from the DSL
- Used by the SIDO simulator
- Manage and control the house automotion
- Can be easily developed by code neophyte


## Installation

First step is to download the SIDO simulator from the core folder:

```bash
  cp sido.jar src/* .
  java -jar sido.jar
```

The second step is to run the lex and cup files:

```bash
  jflex base_lex2.lex
  cup base_cup.cup
```

And finally run the generated file with the SIDO simulator:

```bash
  cd generated
  java -ri sido.jar CMaisonUser.java HabitatSpecific.java
```
## Usage

Use the SIDO simulator to learn how this DSL generated code manage the home automotion.\
Create the DSL code with the embedded editor or use the custom cup snippet.


## Authors

- [@add-le](https://github.com/add-le)
- [@dan](#)
- [@ubo](https://nouveau.univ-brest.fr/)
## License

[GPL v3](https://github.com/add-le/domotic-dsl/blob/master/LICENCE)

