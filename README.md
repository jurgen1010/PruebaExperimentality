### PROYECTO DE PRUEBAS AUTOMATIZADAS CLOTHESSTORE ###
Este proyecto va a contener la automatización de pruebas de la aplicación : https://jagoqui-clothesstore-latam.netlify.app/#/home

### INSTALACION ###
Para la descarga del repositorio se debe de seguir los siguientes pasos: En la consola de git ejecutar el siguiente comando:

git clone https://github.com/jurgen1010/PruebaExperimentality.git
Luego de descargar el repositorio abrir el código como proyecto Gradle en la herramienta Intellij o eclipse, la que sea de su preferencia, en lo personal recomiendo Intellij

### Comando para la Ejecución ###
---
Para la ejecución de la automatización se puede utilizar el siguiente comando para la ejecución de un runner en especial:

gradlew.bat clean test --tests

Ejemplo:

gradlew.bat clean test --tests co.experimentality.runners.AgregarArticuloCestaCompras aggregate -i

### PRE-REQUISITOS ###
Estos son los programas y/o características que se deben tener instaladas localmente, para el proceso de ejecución de pruebas automatizadas bajo el patrón screenplay. Nota: La automatización que se va a realizar en este proyecto será de escritorio debido que el desarrollo es Ompremise por medio de la herramienta DataStage

DataStage 11.5 

JAVA 1.8 

JDK 1.8.0_131 

ECLIPSE OXIGEN  , ECLIPSE 2020-03  o INTELLIJ IDEA 

IDEs para manejar los proyectos
CUCUMBER 

Cucumber es una herramienta de software que admite el desarrollo basado en el comportamiento, básicamente convierte los features escritos en Gherkin en código de pruebas automatizadas
GRADLE 4.9 Ó SUPERIORES 

Herramienta para la automatización de la compilación del código que ejecuta las pruebas
GIT 2.16 

Herramienta para el control de versiones del código
JUNIT 

JUnit es un conjunto de bibliotecas que son utilizadas en programación para hacer pruebas unitarias de aplicaciones Java

### Patrón de diseño 🔲

Screenplay Es un modelo centrado en el usuario, que lo ayuda a cambiar el enfoque de las pruebas de aceptación automatizadas de interacciones de bajo nivel con el sistema, es lo que quieren lograr con su interacción y su sistema y como exactamente lo van hace. Se utiliza esta práctica porque es muy organizada, entendible y amigable con los principios SOLID, además de esto integra el negocio con el código y es mucho más fácil de entender y su implementación con DevOps tiene mucha simpatía.
